package com.github.ntltl.java;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ContainerTest {

    @Test
    void getType() {
        Container<List<String>> container = new Container<List<String>>() {};
        Type actualType = container.getType();

        assertEquals("java.util.List<java.lang.String>", actualType.getTypeName());
    }
}