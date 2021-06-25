package Work3;

import java.util.Random;

public class Work3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;

        // javaでのint型の計算は、int型で帰ってくる
        // よって10で割ったときの小数点以下は切り捨てられ、二桁目の数字が求められる
        // しかしこの計算方法が通用するのは100以下の整数だけになる
        System.out.println("作成された乱数:" + num);
        System.out.println("二桁目の数字は" + (num / 10));

    }

}
