
package com.test;

public class MainTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                // 获得实例对象
                Singleton mSingleton = Singleton.getInstance();
                
                //打印出对象的内存地址
                System.out.println(mSingleton);
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                Singleton mSingleton = Singleton.getInstance();
                System.out.println(mSingleton);
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Singleton mSingleton = Singleton.getInstance();
                System.out.println(mSingleton);
            }
        }).start();
    }

}
