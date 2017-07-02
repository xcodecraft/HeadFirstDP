package com.headfirst.demo.chapter_one.duck;

import com.headfirst.demo.chapter_one.fly.Flybehavior;
import com.headfirst.demo.chapter_one.quack.QuackBehavior;

public abstract class Duck {
    Flybehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public boolean performFly() {
        return flyBehavior.fly();
    }
    public boolean beHit()
    {
        return false ;
    }

    public boolean performQuack() {
        return quackBehavior.quack();
    }

    public boolean swim() {
        System.out.println("All ducks float,even decoys!");
        return true;
    }

    public void setFlyBehavior(Flybehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}