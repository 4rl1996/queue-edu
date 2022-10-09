package com.gmail._4rl1996.queueedu.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "rabbit.properties")
public class ApplicationProperties {
    private String host;
    private int port;
    private String username;
    private String password;
    private String virtualHost;
    private String queueName;
}
