package tasks.ex4;

public class ShipStack {
    Ship[] ships;
    int current;

    public ShipStack(){
        ships = new Ship[50];
        for (int i = 0; i < 50; i++){
            ships[i] = new Ship();
        }
        current = 49;
    }

    public Ship pop(){
        Ship ship = ships[current];
        current--;
        return ship;
    }

    public void insert(Ship ship){
        current++;
        ships[current] = ship;
    }
}
