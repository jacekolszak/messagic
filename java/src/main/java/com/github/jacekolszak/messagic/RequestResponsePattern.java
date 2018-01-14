package com.github.jacekolszak.messagic;

import java.util.concurrent.CompletableFuture;

public class RequestResponsePattern {

    public RequestResponsePattern(MessageChannel channel) {

    }

    public CompletableFuture<byte[]> request(byte[] message) {
        return null;
    }

    public MessageReceived requestReceived(byte[] message) {
        return null;
    }

    public class MessageReceived {

        public void respondWith(byte[] message) {
        }
    }
}
