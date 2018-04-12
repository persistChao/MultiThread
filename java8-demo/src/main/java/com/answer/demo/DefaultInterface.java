package com.answer.demo;

/**
 * @Author: answer
 * @Description:
 * @Date Create in 17:25 2017/12/6
 * @Modified by:
 */
public interface DefaultInterface {
    default void println() {
        System.out.println("这是此接口默认的方法");
    }

    static void blowHorn() {
        System.out.println("这是一个接口中的静态方法");
    }

    default void testDefaultNumber() {

    }

    static void hh() {
        System.out.println(2);
    }
}
