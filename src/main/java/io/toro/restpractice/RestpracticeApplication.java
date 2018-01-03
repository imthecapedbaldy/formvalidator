package io.toro.restpractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import io.toro.restpractice.hello.storage.StorageProperties;
import io.toro.restpractice.hello.storage.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class RestpracticeApplication {

    public static void main( String[] args ) throws Exception {
        SpringApplication.run( RestpracticeApplication.class );
    }

    @Bean
    CommandLineRunner init( StorageService storageService ) {
        return ( args ) -> {
            storageService.deleteAll();
            storageService.init();
        };

    }
}
