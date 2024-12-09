package com.example.company.domain;

import com.example.company.domain.port.HelloApi;
import com.example.company.domain.port.HelloSpi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HelloService implements HelloApi {

    private final HelloSpi helloSpi;

    @Override
    public List<String> helloWorld() {
        return helloSpi.helloWorld();
    }

    @Override
    public String helloWorld(String message) {
        return helloSpi.helloWorld(message);
    }
}
