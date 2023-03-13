package oop.ex5;

import oop.ex5.beans.Present;
import oop.ex5.beans.packages.Packages;
import oop.ex5.beans.sweets.Sweets;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Present present = new Present();
        while (true) {
            System.out.println("1. Choose a package");
            System.out.println("2. Add sweets");
            System.out.println("3. Show the present");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println(Arrays.toString(Packages.values()));
                    int j = scanner.nextInt();
                    present.setPackage(j);
                    break;
                case 2:
                    System.out.println(Arrays.toString(Sweets.values()));
                    int k = scanner.nextInt();
                    present.addSweets(Sweets.values()[k - 1]);
                    break;
                case 3:
                    System.out.println(present); break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
