package haymon.OO.composition;

import haymon.entities.Car;
import haymon.myMethods.My;

public class OneToOne {
    public static void main(String[] args) {

        Car c1 = new Car();
        My.print(c1.isTurnOn());

        c1.turnOn();

        My.print(c1.isTurnOn());
        My.print(c1.getEngine().spins());

        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();

        My.print(c1.getEngine().spins());

        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();

        My.print(c1.getEngine().spins());

        c1.turnOff();
        My.print(c1.isTurnOn());
        My.print(c1.getEngine().spins());
    }
}
