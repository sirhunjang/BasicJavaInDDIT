package DDitJavaClass;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가로의 길이는?(단위:m): ");
        int strNum1 = scanner.nextInt();
        System.out.println("세로의 길이는?(단위:m): ");
        int strNum2 = scanner.nextInt();

        double width = 3.7;
        double height = 7.5;
        double area = width * height;
        double perimeter = (width + height) * 2;

        System.out.println("직사각형의 넓이 : " + area);
        System.out.println("직사각형의 넓이 : " + perimeter);

    }
}
