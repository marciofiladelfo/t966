package com.example.base;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseApplication {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("run-2");
            }
        };

        Runnable runnable1 = () -> System.out.println("run-3");
    }
}

class Runnable966 implements Runnable{
    public void run() {
        System.out.println("run-1");
    }
}