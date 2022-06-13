package DDitJavaClass;

public class Example06133 {
    public static void main(String[] args) {
        for (int a = 1; a <5; a++) {
            for (int b = 4; b <= a; b--) {
            if (a < b){
                System.out.print("");
            } else
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}