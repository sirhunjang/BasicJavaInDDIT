package DDitJavaClass;

import java.util.Random;

public class RandomNumExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnum = random.nextInt(3) + 1;
        switch (randomnum){
            case 1:
                System.out.println("당첨입니다.");
                break;
            case 2:
                System.out.println("낙첨입니다.");
                break;
            default:
                System.out.println("낙첨입니다.");
        }

    }
}
