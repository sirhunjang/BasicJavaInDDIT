package DDitJavaClass;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("윤년인지를 확인할 연도를 입력하세요: ");
        int a = scanner.nextInt();
        if ((a % 400 == 0) && (a%4 ==0) || (a%100 !=0)) {
            System.out.println(a + "년도는 윤년입니다.");
        } else
            System.out.println(a + "년도는 윤년이 아닙니다.");
        }
    }
