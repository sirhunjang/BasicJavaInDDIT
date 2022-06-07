package DDitJavaClass;

import java.util.Scanner;

public class Study22060702 {
    public static void main(String[] args) {
        int Kor = 80;
        int Eng = 85;
        int Mat = 70;
        int Totalsum = Kor + Eng + Mat;
        System.out.println("총점: " + Totalsum);
        int TotalAvg = Totalsum/3;
        System.out.println("평균: " + TotalAvg);
        int Hour;
        int Min;
        Hour = 430/80;
        Min = 430%80;
        System.out.println(Hour + "시간");
        System.out.println(Min + "분");
    }
}
