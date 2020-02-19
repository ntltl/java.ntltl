package com.github.ntltl;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ContainerTest {

    @Test
    void getType() {
        Container<List<Runrioter>> container = new Container<List<Runrioter>>() {};
        Type actualType = container.getType();

        assertEquals("java.util.List<com.github.ntltl.Runrioter>", actualType.getTypeName());
    }
}