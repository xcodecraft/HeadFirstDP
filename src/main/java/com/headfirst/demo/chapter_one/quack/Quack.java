package com.headfirst.demo.chapter_one.quack;

public class Quack implements QuackBehavior {
    @Override
    public boolean quack() {
        System.out.println("Quack");
        return true;
    }
}
