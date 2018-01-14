package com.github.jacekolszak.messagic.impl;

import com.github.jacekolszak.messagic.MessageChannel;

public class IpcTest {

    public static void main(String[] args) throws InterruptedException {
        // Jak to bedzie
        // Najpierw uruchom serwer - lokalny proces, lub zdalny proces (za pomocą HTTP np)
        // 1. Polacz sie z serwerem
        // 2. Wyslij wiadomosc
        // 3. Dostajemy blad od serwera.
        // 4. Zapisujemy blad i wysylamy do developerow
        // 5. Restartujemy klienta, ktory uruchomi serwer od nowa.
        Ipc ipc = new Ipc(System.in, System.out);
        MessageChannel channel = ipc.channel();
        channel.setTextMessageMaximumSize(256);
        channel.setBinaryMessageMaximumSize(4096);
        channel.setErrorConsumer(error -> {
                    // jak serwer stracil polaczenie to sie moze po prostu wylaczyc.
                    // jednak podczas developmentu dobrze robic failover nawet jak polecenie nie zostalo zrozumiane
                    if (error.isPeerNotReachable()) {
                        System.exit(0);
                    }
                }
        );
        channel.setTextMessageConsumer(msg -> {
            if (msg.equalsIgnoreCase("map")) {
                channel.pushText("Showing you the map");
            } else if (msg.equalsIgnoreCase("stop")) {
                channel.pushText("Game stopped");
            } else {
                channel.pushText("Dont know what to do");
            }
        });
        channel.setBinaryMessageConsumer(channel::pushBinary);
        channel.open();
        Thread.sleep(100000);
        channel.close();
    }
}
