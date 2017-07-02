package com.headfirst.demo.chapter_one.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public boolean quack() {
        System.out.println("<< Slience >>");
        return false;
    }
}
