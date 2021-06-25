package Work3;

import java.util.Random;

public class Work2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;

        // 1桁目の数字は10で割った余りで求められる
        System.out.println("作成された乱数:" + num);
        System.out.println("1桁目の数字は" + (num % 10));
    }

}
