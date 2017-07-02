package com.headfirst.demo.chapter_one.duck;

import com.headfirst.demo.chapter_one.fly.FlyNoWay;
import com.headfirst.demo.chapter_one.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
