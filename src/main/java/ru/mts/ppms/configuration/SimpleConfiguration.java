package ru.mts.ppms.configuration;

import feign.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfiguration {

    @Bean
    Client defaultClient() {
        return new Client.Default(null, null);
    }
}
