package Work1;


public class Work4 {
    public static void main(String[] args) {
        // プログラム引数で受け取った要素はString型になる
        // 計算に使えるようにint型に変換している
        int args1 = Integer.parseInt(args[0]);
        int args2 = Integer.parseInt(args[1]);
        
        System.out.println("整数1:" + args1);
        System.out.println("整数2:" + args2);
        System.out.println("和:" + (args1 + args2));
        System.out.println("差:" + (args1 - args2));
        System.out.println("積:" + (args1 * args2));
        System.out.println("商:" + (args1 / args2));
    }

}
