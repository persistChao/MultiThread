package com.answer.thread.chapter1and2;/**
 * @Author: suchao
 * @Description:
 * @Date Create in 10:08 2017/12/11
 * @Modified by:
 */

/**
 * @author Administrator
 * @description
 * @create 10:08
 **/
public class TestJoin {
    public volatile static int i = 0;
    public static class AddThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i<10000000;i++);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AddThread at = new AddThread();
        at.start();
        at.join();
        System.out.println(i);
    }
}
