package com.headfirst.demo.chapter_one;

import com.headfirst.demo.chapter_one.duck.Duck;
import com.headfirst.demo.chapter_one.duck.MallardDuck;
import com.headfirst.demo.chapter_one.duck.RedheadDuck;
import com.headfirst.demo.chapter_one.duck.ModelDuck;
import com.headfirst.demo.chapter_one.fly.FlyRocketPowered;
import java.util.ArrayList ;

public class MinDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
