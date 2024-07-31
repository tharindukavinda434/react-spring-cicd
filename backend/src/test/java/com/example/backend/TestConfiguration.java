package com.example.backend;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("test")
public class TestConfiguration {

    @Bean
    public DataSource dataSource() {
        return Mockito.mock(DataSource.class);
    }

    // Mock other beans as needed
}