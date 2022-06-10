package DDitJavaClass;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();
        int result = Math.abs(num1 / num2);
        int result2 = Math.abs(num1 % num2);
        System.out.println("큰 수를 작은 수로 나눈 몫은 " + result + "이고, 나머지는" + result2 + "이다.");
        scanner.close();

    }

}
