package com.gmail._4rl1996.queueedu.message;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
@Data
public class TestMessage {

    private AtomicLong messageCounter = new AtomicLong(0);

    private static final String message = "The number of message is ";

    private String creationTime;

    @Override
    public String toString() {
        return message +
                messageCounter +
                ". " +
                "Message was created at " +
                creationTime;
    }
}
