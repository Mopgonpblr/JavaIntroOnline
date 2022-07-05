package basics.cycles;

import java.math.BigInteger;

public class Ex4 {
    public static void main(String[] args) {
        BigInteger pr = BigInteger.ONE;
        for (int i = 1; i <= 200; pr = pr.multiply(BigInteger.valueOf((long) i * i++))) ;
        System.out.println("Product: "+pr);
    }
}
