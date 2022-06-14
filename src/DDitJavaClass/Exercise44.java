package DDitJavaClass;

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[가위 바위 보 게임]");
        System.out.println("철수 : ");
        String cs = scanner.next();
        System.out.println("영희 : ");
        String yh = scanner.next();

        if (cs.equals(yh)){
            System.out.println("결과 : 무승부");
        } else if (cs.equals("가위") && yh.equals("바위")) {
            System.out.println("결과 : 영희 승리!");
        } else if (cs.equals("가위") && yh.equals("보")) {
            System.out.println("결과 : 철수 승리!");
        } else if (cs.equals("바위") && yh.equals("가위")) {
            System.out.println("결과 : 철수 승리!");
        } else if (cs.equals("바위") && yh.equals("보")) {
            System.out.println("결과 : 영희 승리!");
        } else if (cs.equals("보") && yh.equals("바위")) {
            System.out.println("결과 : 철수 승리!");
        } else if (cs.equals("보") && yh.equals("가위")){
            System.out.println("결과 : 영희 승리!");
        scanner.close();
        }
    }
}
