package com.gmail._4rl1996.queueedu.config;

import com.gmail._4rl1996.queueedu.config.properties.ApplicationProperties;
import com.rabbitmq.jms.admin.RMQConnectionFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

@EnableJms
@Configuration
@RequiredArgsConstructor
public class ConnectionFactoryConfig {

    private final ApplicationProperties applicationProperties;

    @Bean
    public ConnectionFactory connectionFactory() {

        RMQConnectionFactory connectionFactory = new RMQConnectionFactory();
        connectionFactory.setUsername(applicationProperties.getUsername());
        connectionFactory.setPassword(applicationProperties.getPassword());
        connectionFactory.setVirtualHost(applicationProperties.getVirtualHost());
        connectionFactory.setHost(applicationProperties.getHost());
        connectionFactory.setPort(applicationProperties.getPort());
        return connectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate(ConnectionFactory connectionFactory) {

        JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
        jmsTemplate.setDefaultDestinationName(applicationProperties.getQueueName());
        return jmsTemplate;
    }
}
