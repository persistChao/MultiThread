package com.answer.tee;

/**
 * 二叉树接口
 * Created by chao on 2018/8/25.
 */
public interface Tree {
    //查找节点
    public Node find(Object o);

    //插入节点
    public boolean insert(Object key);

    //delete node
    public boolean delte(Object key);
}
