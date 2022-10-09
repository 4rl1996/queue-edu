package com.gmail._4rl1996.queueedu.producer;


import com.gmail._4rl1996.queueedu.message.TestMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class Producer {

    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 1000)
    void publishMessage() {
        jmsTemplate.convertAndSend(new TestMessage());
    }
}
