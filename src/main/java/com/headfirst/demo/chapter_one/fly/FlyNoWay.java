package com.headfirst.demo.chapter_one.fly;

public class FlyNoWay implements Flybehavior {
    @Override
    public boolean fly() {
        System.out.println("I can't fly");
        return false;
    }
}
