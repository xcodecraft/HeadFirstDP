package com.headfirst.demo.chapter_one.duck;

import com.headfirst.demo.chapter_one.fly.FlyWithWings;
import com.headfirst.demo.chapter_one.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior   = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
