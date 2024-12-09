package com.example.company.infrastructure;

import com.example.company.domain.port.HelloSpi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloSpiImpl implements HelloSpi {

    @Override
    public List<String> helloWorld() {
        return List.of("Hello", "World");
    }

    @Override
    public String helloWorld(String message) {
        return message;
    }
}
