package test;

import java.util.concurrent.CountDownLatch;

public class OrderRearrangementTest {
    private static int a=0;
    private static int b=0;
    private static int x=0;
    private static int y=0;


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            a=0;
            b=0;
            x=0;
            y=0;
            CountDownLatch countDownLatch = new CountDownLatch(2);

            Thread one = new Thread(new Runnable() {
                @Override
                public void run() {
                    a=1;
                    x=b;
                    countDownLatch.countDown();
                }
            });

            Thread tow = new Thread(new Runnable() {
                @Override
                public void run() {
                    b=1;
                    y=a;
                    countDownLatch.countDown();
                }
            });

            one.start();
            tow.start();
            countDownLatch.await();
            if (x==0&&y==0){
                System.out.println("循环了"+i+"次结果："+(x+y));
            }
        }
    }


}
