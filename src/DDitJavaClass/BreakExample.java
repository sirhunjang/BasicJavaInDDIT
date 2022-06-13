package DDitJavaClass;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {
            Random random = new Random();
            int rdnum = random.nextInt(6) + 1;
            System.out.println(rdnum);
            if(rdnum == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
