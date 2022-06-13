package DDitJavaClass;

import java.util.Random;

public class Example0613 {
    public static void main(String[] args) {
        int sum = 0;                            // sum은 0이다
        for (int a=1; a<=100; a++) {            // 인트 a는 1이고 100보다 작거나 같고 증가형임
            if (a%3==0){                        // a나머지3은 0이다 (3의배수 구하기)
                sum+=a;                         // sum +=

                System.out.println(sum);
            }

        }

    }
}
