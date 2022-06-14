package DDitJavaClass;

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        System.out.println("프로그래밍 기초 : ");
        int program = scanner.nextInt();
        System.out.println("데이터베이스 : ");
        int data = scanner.nextInt();
        System.out.println("화면 구현 : ");
        int display = scanner.nextInt();
        System.out.println("애플리케이션 구현: ");
        int app = scanner.nextInt();
        System.out.println("머신러닝 : ");
        int machine = scanner.nextInt();
        int total = (program + data) + (display + app) + machine;
        System.out.println("총점 : " + total);
        double average = total / 5.0;
        System.out.println("평균 : " + average);
        if (average < 60) {
            System.out.println("학점 : F");
        } else if (average < 70) {
            System.out.println("학점 : D");
        } else if (average < 80) {
            System.out.println("학점 : C");
        } else if (average < 90) {
            System.out.println("학점 : B");
        } else if (average >= 90) {
            System.out.println("학점 : A");
        }
    }
}