package tasks.ex4;

import java.util.Random;

public class Ship {
    int weight;
    int maxWeight;
    boolean isLoaded = false;
    Random rand = new Random();

    public Ship() {
        this.maxWeight = rand.nextInt(50) + 50;
        this.weight = rand.nextInt(maxWeight);
        isLoaded = weight > maxWeight / 2;
    }

     synchronized void load(boolean running) {
        /*
        if (!running) { // остановить часы
            state = "ticked";
            notify(); // уведомить ожидающие потоки
            return;
        }
         */
        System.out.println("Load. Max weight: " + maxWeight);
// ожидать секунды
        try {
            while (weight < maxWeight) {
                weight++;
                Port.weight--;
                System.out.println("Ship weight: " + weight);
                System.out.println("Port weight: " + Port.weight);
                Thread.sleep(1000);
            }
            System.out.println("Loaded");
        } catch (InterruptedException exc) {
            System.out.println("Bыпoлнeниe потока прервано");
        }
        /*
        state = "ticked"; // установить текущее состояние после такта "тик"
        notify(); // разрешить выполнение метода tock()
        try {
            while (!state.equals("tocked"))
                wait(); // ожидать завершения метода tock()
        } catch (InterruptedException exc) {
            System.out.println("Bыпoлнeниe потока прервано");
        }

         */
    }

    synchronized void unload(boolean running) {
        /*
        if (!running) { // остановить часы
            state = "ticked";
            notify(); // уведомить ожидающие потоки
            return;
        }
         */
        System.out.println("Unload. Weight: " + weight);
// ожидать секунды
        try {
            while (weight > 0) {
                weight--;
                Port.weight++;
                System.out.println("Ship weight: " + weight);
                System.out.println("Port weight: " + Port.weight);
                Thread.sleep(1000);
            }
            System.out.println("Unloaded");
        } catch (InterruptedException exc) {
            System.out.println("Bыпoлнeниe потока прервано");
        }
    }

    public String toString(){
        return "Weight: "+ this.weight + " Max weight: " + this.maxWeight;
    }
}
