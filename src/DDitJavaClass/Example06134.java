package DDitJavaClass;

import java.util.Scanner;

public class Example06134 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0; //잔고, 잔액
        Scanner scanner = new Scanner(System.in);

        while (run) {    // 반복문 사용 아래내용 계속 출력.
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------------------");
            System.out.println("선택> ");
            int menu = scanner.nextInt();

            switch (menu){
                case 1:  // 잔고 더하기 스캐너 입력값
                    System.out.print("예금액: ");
                    balance += scanner.nextInt(); // nextline 사용시에는 인티저 펄스인트 사용해서 인트로 바꿔줘야됨.
                    break;
                case 2:  // 잔고 마이너스 스캐너 입력값
                    System.out.print("출금액: ");
                    balance -= scanner.nextInt();
                    break;
                case 3:  // 위 계산 후 잔액 결과
                    System.out.print("잔고 :");
                    System.out.print(balance);
                    break;
                case 4:  // false 통한 종료
                    run = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
