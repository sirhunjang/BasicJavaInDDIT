package DDitJavaClass;

import java.util.Scanner;

public class ExampleChapterThree {
    public static void main(String[] args) {
        /*int pencils = 534;
        int students = 30;

        int pencilsPerStudent = 534/30;
        System.out.println(pencilsPerStudent);

        int pencilsLeft = (534%30);
        System.out.println(pencilsLeft);*/

  /*  int var1 = 5; // 실수 식으로 계산하면 원하는 계산값이 나옴.
    int var2 = 2;
    double var3 = var1 / var2;     // double var3 = (double) var1 / var2;
    int var4 = (int) (var3 * var2);// double var4 = (var3 * var2);
        System.out.println(var4); */

   /* int value = 356; //산술 연산자 (-) 이용 풀이 가능.
        System.out.println(value-56);*/

    /*double var1 = 10; // float 타입은 10f로 표현되서 double타입으로 바꿔주면 계산값이 맞게나온다.
    double var2 = var1 / 100;
    if(var2 == 0.1) {
        System.out.println("10%입니다.");
    } else {
        System.out.println("10%가 아닙니다.");
        }*/

  /*  int lengthTop = 5; // 사다리꼴 넓이 공식 : {(윗변) + (아랫변)} x (높이) /2
    int lengthBottom = 10; // double로 강제 타입변화를 통하여 소수점 뒷자리가 나올수 있도록 해줘야함.
    int height = 7;
    double area = (double) (lengthTop + lengthBottom) * height / 2;
        System.out.println(area);*/

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번재 수 : ");
        double noOne = scanner.nextDouble();
        System.out.println("두 번째 수 : ");
        double noTwo = scanner.nextDouble();
//      double noThree = noOne - noTwo - 1.88;
//      System.out.println(noThree);
        System.out.println("------------------");
        if (noTwo != 0.0) { // if 조건문으로 부정연산! 때문에 0.0만 아니면 실행이된다.
                            // 근데 값이 계속 달라짐 0이나 0.0넣으면 무한대로 나온다.
            System.out.println("결과 : " + (noOne/noTwo));
        } else {                    //  else 문으로
            System.out.println("결과 : 무한대 ");
        }
*/
/*    int var1 = 10;
    int var2 = 3;
    int var3 = 14;
    double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
        System.out.println("원의 넓이 : " + var4);*/

       /* Scanner scanner = new Scanner(System.in); // equals 사용하려 했으나 그냥 ==로 하니 됬다.

        System.out.println("아이디: ");
        String name = scanner.nextLine();

        System.out.println("패스워드: ");
        String strPassword = scanner.nextLine();
        int password = Integer.parseInt(strPassword);

        if(name.equals("java")) {
            if (password==12345){
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패");
            }
        } else {
            System.out.println("로그인 실패 : 아이디 존재하지 않음");
        }*/

 /*   int x = 10;
    int y = 5;
        System.out.println( (x>7) && (y<=5) );
        System.out.println(( x % 3 == 2) || ( y % 2 != 1)); */

  /*      int value = 0;
        value += 10;
        value -= 10;
        value *= 10;
        value /= 10;
        System.out.println(value);*/

/*      int score = 85; // 85가 90보다 작아서 참이였으나 !(논리부정 연산자)로 인해 "가"가 정답.
        String result = (!(score>90)) ? "가" : "나";
        System.out.println(result);*/
    }
}
