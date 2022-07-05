package algorithmization.subPrograms;

public class Ex3 {
    private static double etArea(int a) {
        return (Math.sqrt(3) * a * a) / 4;
    }

    private static double ehArea(int a){
        return etArea(a) * 6;
    }

    public static void main(String[] args) {
        System.out.println(ehArea(4));
    }
}
