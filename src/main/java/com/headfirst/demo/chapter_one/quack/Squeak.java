package com.headfirst.demo.chapter_one.quack;

import com.headfirst.demo.chapter_one.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public boolean quack() {
        System.out.println("Squeak");
        return true;
    }
}
