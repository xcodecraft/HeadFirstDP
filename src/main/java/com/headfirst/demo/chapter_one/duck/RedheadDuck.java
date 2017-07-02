package com.headfirst.demo.chapter_one.duck;
import com.headfirst.demo.chapter_one.fly.FlyNoWay;
import com.headfirst.demo.chapter_one.fly.FlyWithWings;
import com.headfirst.demo.chapter_one.quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
            flyBehavior = new FlyNoWay();
            quackBehavior = new Quack();
        }
    public void display() {
        System.out.println("I'm a real Redhead duck");
    }

}
