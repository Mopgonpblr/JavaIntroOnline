package tasks.ex4;

public class ThreadCom {
    public static void main(String[] args) {
//        Ship[] ship = new Ship[50];
//        for (int i = 0; i < 50; i++){
//            ship[i] = new Ship(port);
//            System.out.println("Ship "+i+" "+ship[i]);
//        }
        ShipStack ss = new ShipStack();
        Dock dock1 = new Dock("Dock #1");
        Dock dock2 = new Dock("Dock #2");
        Dock dock3 = new Dock("Dock #3");

        try {
            dock1.ship = ss.pop();
            dock2.ship = ss.pop();
            dock3.ship = ss.pop();

            dock1.dock.join();
            dock2.dock.join();
            dock3.dock.join();
            while (ss.current != 0) {
                dock1.ship = ss.pop();
                dock2.ship = ss.pop();
                dock3.ship = ss.pop();
            }
        } catch (InterruptedException exc) {
            System.out.println("Пpepывaниe основного потока");
        }
    }
}