package com.answer.array;

/**
 * Created by chao on 2018/8/24.
 */
public class MyArray {
    //定义一个数组
    private int[] intArray;
    //定义数组的实际有效长度
    private int elems;
    //定义数组的最大长度
    private int length;

    //默认构造一个长度为50的数组
    public MyArray() {
        elems = 0;
        length = 50;
        intArray = new int[length];
    }

    public MyArray(int length) {
        elems = 0;
        this.length = length;
        intArray = new int[length];
    }

    //获取数组有效长度
    public int getSize() {
        return elems;
    }

    //遍历显示元素
    public void display() {
        for (int i = 0; i < elems; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    /**
     * 添加元素
     * @param value,假设操作人是不会添加重复元素的，如果有重复元素对于后面的操作都会有影响。
     * @return添加成功返回true,添加的元素超过范围了返回false
     */
    public boolean add(int value) {
        if (elems == length) {
            return false;
        } else {
            intArray[elems] = value;
            elems++;
        }
        return true;
    }

    /**
     * 查找元素
     * 查找的元素如果存在则返回下标值，如果不存在，返回 -1
     * @param value
     * @return
     */
    public int searchValue(int value) {
        int i ;
        for (i = 0; i < elems ; i++) {
            if (intArray[i] == value) {
                break;
            }
        }
        if (i == elems) {
            return -1;
        }
        return i;
    }
}
