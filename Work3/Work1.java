package Work3;

import java.util.Random;

public class Work1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;

        System.out.println("作成された乱数:" + num);
        if (num % 2 == 1) {
            System.out.println("奇数です");
        } else {
            System.out.println("偶数です");
        }

    }

}
