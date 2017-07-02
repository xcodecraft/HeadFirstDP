package com.headfirst.demo.chapter_one;

import com.headfirst.demo.chapter_one.duck.Duck;
import com.headfirst.demo.chapter_one.duck.MallardDuck;
import com.headfirst.demo.chapter_one.duck.ModelDuck;
import com.headfirst.demo.chapter_one.duck.RedheadDuck;
import com.headfirst.demo.chapter_one.shot.Bullet ;
import com.headfirst.demo.chapter_one.fly.FlyRocketPowered;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.*;

public class DuckTest {
    private MallardDuck mallardDuck = new MallardDuck();
    private ModelDuck modelDuck = new ModelDuck();

    @Test
    public void testMallardDuck() {
        assertEquals(mallardDuck.swim(), true);
        assertEquals(mallardDuck.performFly(), true);
        assertEquals(mallardDuck.performQuack(), true);
    }

    @Test
    public void testModelDuck() {
        assertEquals(modelDuck.swim(), true);
        assertEquals(modelDuck.performFly(), false);
        assertEquals(modelDuck.performQuack(), true);

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        assertEquals(modelDuck.performFly(), true);
    }

    @Test
    public void testDuckGame() {
        ArrayList<Duck> ducks = new ArrayList<Duck>();
        setupPond(ducks);
        openPond(ducks);
        shotDuck(ducks,new Bullet());

    }
    void setupPond(ArrayList<Duck> pondDucks)
    {
        pondDucks.add(new MallardDuck());
        pondDucks.add(new MallardDuck());
        pondDucks.add(new RedheadDuck());
    }
    void openPond(ArrayList<Duck> ducks)
    {
        for (Duck d: ducks) {
            d.swim();
        }
    }
    void shotDuck(ArrayList<Duck> ducks, Bullet bullet)
    {
        shotA(ducks,bullet);
    }
    void shotA(ArrayList<Duck> ducks,Bullet bullet)
    {
        for (Duck d: ducks) {
            if (d.beHit()) {
                //被击中
            }
        }
    }
    void shotB(ArrayList<Duck> ducks,Bullet bullet)
    {
        for (Duck d: ducks) {
            if (d.beHit()) {
                //被击中
            }
            else {
                d.performFly();
                //d.fly();
            }
        }
    }
}
