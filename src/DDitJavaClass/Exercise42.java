package DDitJavaClass;

import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 입력하세요( 1 ~ 12 ) : ");
        int a = scanner.nextInt();
        int b = 5;
        int c = 8;
        int d = 11;

        if (a < 2) {
            System.out.println(a + "월은 겨울입니다.");
        } else if (a<=b) {
            System.out.println(a + "월은 봄입니다.");
        }else if (a<=c) {
            System.out.println(a + "월은 여름입니다.");
        } else if (a<=d) {
            System.out.println(a + "월은 가을입니다.");
        } else if (a==12) {
            System.out.println(a + "월은 겨울입니다.");
        } else
            System.out.println(a + "월은 잘못된 입력입니다.");
    }
}
