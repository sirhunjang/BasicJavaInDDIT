package DDitJavaClass;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean c = true;
        int b = new Random().nextInt(100) + 1;
        while (c) {
            System.out.println("1 부터 100 사이의 정수 중 하나를 선택하세요: ");
            int a = scanner.nextInt();
            if (a > b) {
                System.out.println("정답은 더 작은 수입니다.");
            }if (a < b) {
                System.out.println("정답은 더 큰 수입니다.");
            }if (a==b){
              break;

            }
        }System.out.println("정답입니다.게임을 종료합니다.");
    }
}