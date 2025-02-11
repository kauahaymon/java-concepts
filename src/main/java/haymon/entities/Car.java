package haymon.entities;

public class Car {

    private Engine engine = new Engine();

    public Engine getEngine() {
        return engine;
    }

    public void turnOn() {
        engine.turnOn = true;
    }

    public void turnOff() {
        engine.turnOn = false;
    }

    public boolean isTurnOn() {
        return engine.turnOn;
    }

    public void accelerate() {
        if (engine.getInjectionFactor() < 2.6) {
            final double INCREMENT = 0.4;
            double actual = engine.getInjectionFactor();

            engine.setInjectionFactor(actual += INCREMENT);
        }

    }

    public void brake() {
        if (engine.getInjectionFactor() > 0.5) {
            final double DECREMENT = 0.4;
            double actual = engine.getInjectionFactor();

            engine.setInjectionFactor(actual -= DECREMENT);
        }
    }
}
