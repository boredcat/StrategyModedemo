package BehaviorClass;

import BehaviorInterface.FlyBehavior;

public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I 'm fly with rocket!");
    }
}
