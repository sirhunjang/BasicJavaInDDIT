package DDitJavaClass;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수도입니까?(수도: 1, 수도아님: 0)");
        int a = scanner.nextInt();
        System.out.println("총 인구는?(단위: 만)");
        int b = scanner.nextInt();
        System.out.println("연소득이 1억 이상인 인구는?(단위: 만)");
        int c = scanner.nextInt();
        if ((a==1) && (b>=100) || (c>=50)){
            System.out.println("이 도시는 메트로폴리스 입니다.");
        }else
            System.out.println("이 도시는 메트로폴리스가 아닙니다");




    }
}
