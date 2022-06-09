package DDitJavaClass;

public class Exercise22 {
    public static void main(String[] args) {
        double distance = 40e12;
        double speedKms = 300000;
        double speedKmh = speedKms * 60 * 60 * 24 * 365;

        System.out.println(distance/speedKmh);


    }
}
