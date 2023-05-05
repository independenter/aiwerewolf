package com.aiwolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class AiChatStart {

    public static void main(String[] args) {
        SpringApplication.run(AiChatStart.class, args);
    }


    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Hello, world!");
    }

}
