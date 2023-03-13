package oop.ex5.beans;

import oop.ex5.beans.packages.Box;
import oop.ex5.beans.packages.Pack;
import oop.ex5.beans.packages.Packages;
import oop.ex5.beans.sweets.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;

public class Present {
    private final Collection<Sweet> sweets = new ArrayList<>();
    private Package aPackage;

    public Present() {
        this.aPackage = new Pack();
    }

    public Present(Package aPackage) {
        this.aPackage = aPackage;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setPackage(int i) {
        try {
            Packages aPackage = Packages.values()[i - 1];


            switch (aPackage) {
                case BOX:
                    this.aPackage = new Box();
                    break;
                case PACK:
                    this.aPackage = new Pack();
                    break;
                default:
                    System.out.println("Error! No such package available");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No such package available");
        }
    }

    public void addSweets(Sweets sweets) {
        switch (sweets) {
            case CANDY:
                this.sweets.add(new Candy());
                break;
            case CHOCOLATE:
                this.sweets.add(new Chocolate());
                break;
            case COOKIE:
                this.sweets.add(new Cookie());
                break;
            case MARSHMALLOW:
                this.sweets.add(new Marshmallow());
                break;
            default:
                System.out.println("Error! No such sweets available");
                break;
        }
    }

    public Collection<Sweet> getSweets() {
        return this.sweets;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Package: ").append(this.getaPackage()).append("\n");
        sb.append("Sweets: ");
        for (Sweet sweet : sweets)
            sb.append(sweet).append("\n");
        return sb.toString();
    }
}
