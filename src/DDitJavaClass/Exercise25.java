package DDitJavaClass;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("500원짜리 동전의 갯수 : ");
        int strNum1 = scanner.nextInt();
        System.out.println("100원짜리 동전의 갯수 : ");
        int strNum2 = scanner.nextInt();
        System.out.println("50원짜리 동전의 갯수 : ");
        int strNum3 = scanner.nextInt();
        System.out.println("10원짜리 동전의 갯수 : ");
        int strNum4 = scanner.nextInt();
        int total = (500 * strNum1) + (100 * strNum2) + (50 * strNum3) + (10 * strNum4);
        System.out.println("저금통 안의 동전의 총 액수 : " + total);




    }
}
