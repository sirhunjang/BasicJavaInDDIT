package DDitJavaClass;

import java.util.Random;

public class DiceRandom {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            int a = random.nextInt(6) + 1;    // 랜덤 주사위 1
            int b = random.nextInt(6) + 1;    // 랜덤 주사위 2
            System.out.println(a + "," + b);        // 중간 문자열을 통해 분리
            if (a + b == 5) {                       // if문으로 a+b가 5가되면 멈추도록 밑에 break 해줌.
                break;
            }
        }
    }
}