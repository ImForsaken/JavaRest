package com.thanera.web.demo.controller;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> foo = new ArrayList<String>();

    public static void main(String[] args) {

        foo.add("foo1");
        foo.add("foo2");
        foo.add("foo3");

        // foo.forEach(System.out::println);
        foo.parallelStream().forEach(System.out::println);
    }
}
