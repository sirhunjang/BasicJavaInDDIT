package DDitJavaClass;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Radius = 4.0;
        double height = 11.0;
        double circumference = (Radius*Radius) * Math.PI;
        System.out.println("원기둥 밑변의 반지름을 입력하시오.(단위:cm): ");
        double a = scanner.nextDouble();
        System.out.println("원기둥의 높이를 입력하시오.(단위:cm): ");
        double b = scanner.nextDouble();
        System.out.println("원기둥 밑변의 넓이는 " + circumference + "cm²이고, " + "원기둥의 부피는 " + circumference * height + "cm²이다");
        scanner.close();
    }
}
