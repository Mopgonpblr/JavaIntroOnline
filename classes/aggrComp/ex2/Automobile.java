package classes.aggrComp.ex2;

import java.util.Random;
import java.util.regex.Pattern;

public class Automobile {
    private String name;
    private Wheel[] wheels;
    private Wheel spareWheel;
    private Engine engine;
    private boolean wheelStatus;

    public Automobile(String name, int maxFuel, int milesPerGallon) {
        this.name = name;
        this.wheels = new Wheel[4];
        for (int i = 0; i < 4; i++)
            wheels[i] = new Wheel();
        this.wheelStatus = true;
        this.spareWheel = new Wheel();
        this.engine = new Engine(maxFuel, milesPerGallon);
    }

    public void drive(int distance) {
        while (engine.isOkay() && engine.getFuel() > 0 && wheelStatus && distance > 0) {
            System.out.println("Distance: " + distance);
            System.out.println("Fuel: " + engine.getFuel());
            distance--;
            engine.setFuel(engine.getFuel() - ((double) 1 / engine.getMilesPerGallon()));
            for (Wheel wheel : wheels)
                if (!wheel.isOkay()) {
                    wheelStatus = false;
                    break;
                }
            if (distance == 5 && spareWheel.isOkay()) {
                Random rand = new Random();
                this.wheels[rand.nextInt(4)].setOkay(false);
            }
        }
        if (distance == 0)
            System.out.println("Arrived successfully");

        if (engine.getFuel() <= 0) {
            System.out.println("Out of fuel");
        }
        if (!engine.isOkay())
            System.out.println("Engine break");
        if (!wheelStatus)
            System.out.println("A wheel should be changed");

    }

    public void fillTank(int fuel) {
        if (engine.getFuel() + fuel < engine.getMaxFuel())
            engine.setFuel(engine.getFuel() + fuel);
        else
            engine.setFuel(engine.getMaxFuel());
        System.out.println("The tank was filled");
    }

    public void changeWheel(Wheel wheel) {
        if (spareWheel.isOkay()) {
            wheel.setOkay(true);
            spareWheel.setOkay(false);
            wheelStatus = true;
            System.out.println("The wheel was changed");
        } else System.out.println("There's no spare wheel to change");
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void showMaker() {
        System.out.println(Pattern.compile("\\w+").split(name)[0]);
    }
}
