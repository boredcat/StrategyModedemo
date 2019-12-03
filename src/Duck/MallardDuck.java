package Duck;

import BehaviorClass.FlyWithWings;
import BehaviorClass.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard duck");
    }
}
