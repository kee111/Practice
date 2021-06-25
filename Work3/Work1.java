package Work3;

import java.util.Random;

public class Work1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;

        // 2で割った余りが1の場合は奇数になり、割り切れた場合は偶数になる
        System.out.println("作成された乱数:" + num);
        if (num % 2 == 1) {
            System.out.println("奇数です");
        } else {
            System.out.println("偶数です");
        }

    }

}
