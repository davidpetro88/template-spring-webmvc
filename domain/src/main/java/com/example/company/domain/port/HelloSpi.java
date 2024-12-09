package com.example.company.domain.port;

import java.util.List;

public interface HelloSpi {
    List<String> helloWorld();
    String helloWorld(String message);
}
