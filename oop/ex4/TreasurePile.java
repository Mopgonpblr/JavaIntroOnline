package oop.ex4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class TreasurePile {
    private final Collection<Treasure> treasures;

    public TreasurePile(String path) {
        this.treasures = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(path));
            String s;
            while ((s = in.readLine()) != null) {
                String[] req = s.split("\\|");
                Treasure newTreasure = new Treasure();
                newTreasure.setName(req[0]);
                newTreasure.setPrice(Integer.parseInt(req[1]));
                this.treasures.add(newTreasure);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Can't read file");
        }
    }

    public void show() {
        for (Treasure treasure : this.treasures)
            System.out.println(treasure);
    }

    public Treasure pickMostExpensive() {
        Treasure exp = new Treasure();
        for (Treasure treasure : this.treasures)
            if (treasure.getPrice() > exp.getPrice())
                exp = treasure;
        return exp;
    }

    public Collection<Treasure> pick(int sum) {
        Collection<Treasure> pile = new ArrayList<>();

        for (Treasure tr : this.treasures)
            if (tr.getPrice() <= sum) {
                pile.add(tr);
                sum -= tr.getPrice();
            }
        return pile;
    }

}
