package com.headfirst.demo.chapter_one.fly;

public class FlyWithWings implements Flybehavior {
    @Override
    public boolean fly() {
        System.out.println("I'm flying!!");
        return true;
    }
}
