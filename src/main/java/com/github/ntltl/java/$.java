package com.github.ntltl.java;

import java.lang.reflect.Type;
import java.util.List;


class $ {

  public static void main(String... args) {

    Container<List<String>> container = new Container<List<String>>() {};

    Type t = container.getType();

    System.out.println(t.getTypeName());

  }

}