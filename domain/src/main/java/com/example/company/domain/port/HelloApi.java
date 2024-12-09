package com.example.company.domain.port;

import java.util.List;

public interface HelloApi {

    List<String> helloWorld();
    String helloWorld(String message);
}
