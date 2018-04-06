package com.lming.chc.personal.server.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "chc.personal.login")
public class ChcConfig {

    private boolean enabled;

    private String skipurl;

}
