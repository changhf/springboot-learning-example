package org.spring.changhf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    @Bean
    public String message() {
        return "message configuration";
    }
}
