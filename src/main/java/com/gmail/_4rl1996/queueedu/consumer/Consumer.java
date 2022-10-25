package com.gmail._4rl1996.queueedu.consumer;

import com.gmail._4rl1996.queueedu.message.TestMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class Consumer {

    @RabbitListener(queues = "${rabbit.properties.queueName}")
    public void onMessage(Message<TestMessage> message) {
        TestMessage payload = message.getPayload();
        System.out.println("\n\nMessage was received.\nMessageHeaders are:\n" +
                message.getHeaders() +
                "\nMessage Payload is:\n" +
                payload);
    }
}
