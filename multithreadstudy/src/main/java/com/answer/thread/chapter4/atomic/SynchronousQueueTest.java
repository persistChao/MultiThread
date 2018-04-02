package com.answer.thread.chapter4.atomic;

import java.util.Random;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author answer
 * @description
 * @create 2018/4/2 11:56
 **/
public class SynchronousQueueTest {

    public static class Product extends Thread  {
        SynchronousQueue<Integer> queue;
        public Product(SynchronousQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                int rand = new Random().nextInt(1000);
                System.out.println("生产了一个产品：" + rand);
                System.out.println("等待3秒后送出去。。。");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    queue.put(rand);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(queue.isEmpty());
            }
        }
    }

    public static class Customer extends Thread {
        SynchronousQueue<Integer> queue;
        public Customer(SynchronousQueue<Integer> queue) {
            this.queue = queue;
        }
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("消费了一个产品：" + queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("-------------------------");
            }
        }
    }

    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        new Product(queue).start();
        new Customer(queue).start();
    }
}
