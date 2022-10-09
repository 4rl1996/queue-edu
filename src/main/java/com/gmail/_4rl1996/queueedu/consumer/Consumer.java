package com.gmail._4rl1996.queueedu.consumer;

import com.gmail._4rl1996.queueedu.message.TestMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class Consumer {

    @JmsListener(destination = "${rabbit.properties.queueName}")
    public void onMessage(Message<TestMessage> message) {
        System.out.println(new StringBuilder().append("\n\nMessage was received.\nMessageHeaders are:\n")
                .append(message.getHeaders())
                .append("\nMessage Payload is:\n")
                .append(message.getPayload()));
    }

}
