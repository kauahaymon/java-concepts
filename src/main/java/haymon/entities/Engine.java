package haymon.entities;

public class Engine {

    protected boolean turnOn = false;
    private double injectionFactor = 1.0;

    protected void setInjectionFactor(double injectionFactor) {
        this.injectionFactor = injectionFactor;
    }

    public double getInjectionFactor() {
        return injectionFactor;
    }

    public int spins() {
        if (!turnOn) return 0;
        return (int) Math.round(injectionFactor * 3000);
    }
}
