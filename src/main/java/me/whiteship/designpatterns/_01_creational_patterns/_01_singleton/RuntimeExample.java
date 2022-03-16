package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import org.w3c.dom.ls.LSOutput;

public class RuntimeExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime == runtime2);
    }
}
