package com.github.jacekolszak.messagic;

import java.util.function.Consumer;

/**
 * Abstraction of channel where messages are being sent in two directions between running parties.
 */
public interface MessageChannel {

    /**
     * Exceeding the maximum size either during pushing messages or receiving them will close the
     * channel and report error
     */
    void setBinaryMessageMaximumSize(int bytes);

    void setTextMessageMaximumSize(int characters);

    /**
     * If consumer throw exception then channel is closed with special error
     */
    void setBinaryMessageConsumer(Consumer<byte[]> consumer);

    /**
     * If consumer throw exception then channel is closed with special error
     */
    void setTextMessageConsumer(Consumer<String> consumer);

    /**
     * FatalError is returned when other party thrown exception during message consumption or that party was unreachable (down, had networks problems etc.).
     * In such channel case channel should be recreated.
     */
    void setErrorConsumer(Consumer<FatalError> consumer);

    void open();

    void close();

    void pushText(String message);

    void pushBinary(byte[] message);

}
