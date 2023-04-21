package com.example.eurekaclientpractice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/third-service")
public class EurekaClientController {

        @Value("${server.port}")
        private String port;

        @GetMapping("/check")
        public String check() {
            return String.format("First Service on PORT %s", port);
        }
}
