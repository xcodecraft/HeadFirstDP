package com.headfirst.demo.chapter_one.fly;

public class FlyRocketPowered implements Flybehavior {
    @Override
    public boolean fly() {
        System.out.println("I'm flying with a rocket");
        return true;
    }
}
