package DDitJavaClass;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("삼각형 첫번째 변의 길이를 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.println("삼각형 두번째 변의 길이를 입력하세요 : ");
        int b = scanner.nextInt();
        System.out.println("삼각형 세번째 변의 길이를 입력하세요 : ");
        int c = scanner.nextInt();

        if (b + c < a) {
            System.out.println("삼각형을 만들 수 없습니다.");
        } else if (b > a + c) {
            System.out.println("삼각형을 만들 수 없습니다.");
        } else if (c > a + b) {
            System.out.println("삼각형을 만들 수 없습니다.");
        } else
            System.out.println("삼각형을 만들 수 있습니다.");

    }
}