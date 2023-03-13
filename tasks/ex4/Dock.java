package tasks.ex4;

//Создание потока путем реализации интерфейса RunnaЫe

class Dock implements Runnable {
    Thread dock;
    public Ship ship;

    // Создать новый поток.
    Dock(String name) {
        dock = new Thread(this, name);
        dock.start(); // запустить поток
    }

    // Начать выполнение нового потока
    public void run() {
        if (!ship.isLoaded)
            ship.load(true);
        else
            ship.unload(true);
    }
}