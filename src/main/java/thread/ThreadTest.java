package thread;

import java.math.BigInteger;

/**
 * Created by lihaixu on 17/12/2.
 * 纯无聊自己瞎写的
 */
public class ThreadTest {
//    public static void main(String[] args) {
//        ThreadDemo threadDemo = new ThreadDemo();
//        threadDemo.run();
//        System.out.println(threadDemo.getId());
//
//        RunnableDemo runnableDemo = new RunnableDemo();
//        Thread runnableThread = new Thread(runnableDemo);
//        runnableDemo.run();
//        System.out.print(runnableThread.getId());
//
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("哈哈哈");
//            }
//        });
//
//        thread.run();
//    }


    public void getBigIntegerRes(BigInteger num){

        BigInteger b = BigInteger.ONE;
        BigInteger s = BigInteger.ONE;
        //i.compareTo(num) <= 0   判断i 与num的大小
        // i< num 则结果等于-1
        // i> num 则结果等于1
        // 其他情况 结果为0
        for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i=i.add(b)) {
            s=s.multiply(i);
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        BigInteger sum = BigInteger.valueOf(2016);
        t.getBigIntegerRes(sum);

//        StringBuffer(线程安全)
//        StringBuilder(线程不安全)

    }



}
