package com.answer.demo;

/**
 * @Author: answer
 * @Description:
 * @Date Create in 16:58 2017/12/6
 * @Modified by:
 */
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
