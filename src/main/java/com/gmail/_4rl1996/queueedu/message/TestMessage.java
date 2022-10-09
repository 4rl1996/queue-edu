package com.gmail._4rl1996.queueedu.message;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class TestMessage implements Serializable {

    private static int messageCounter = 0;

    private String message;

    private Instant creationTime;

    public TestMessage() {
        this.message = new StringBuilder().append("The number of message is")
                .append(" ")
                .append(++messageCounter)
                .toString();
        creationTime = Instant.now();
    }

    @Override
    public String toString() {
        return new StringBuilder().append(message)
                .append(". ")
                .append("Message was created at ")
                .append(creationTime.toString())
                .toString();
    }
}
