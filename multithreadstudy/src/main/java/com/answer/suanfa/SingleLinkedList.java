package com.answer.suanfa;


/**
 * 单链表
 * Created by chao on 2018/8/23.
 */
public class SingleLinkedList {
    private int size;
    private Node head;

    public SingleLinkedList(int size, Node head) {
        this.head = null;
        this.size = 0;
    }

    //链表的每个节点类
    private class Node {
        private Object data;//每个节点的数据
        private Node next;//每个节点指向下一个节点的连接

        public Node(Object data) {
            this.data = data;
        }
    }

    //表头添加元素
    public Object addHead(Object obj) {

        Node newNode = new Node(obj);
        if (size == 0) {
            head = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        return obj;
    }

    //在表头删除元素
    public Object delteHead() {
        Object object = head.data;
        head = head.next;
        size--;
        return object;
    }

    //删除指定的元素，删除成功返回true
    public boolean delete(Object object) {
        if (size == 0) {
            return false;
        }
        Node current = head;
        Node previos = head;

        while (current.data != object) {
            if (current.next == null) {
                return false;
            } else {
                previos = current;
                current = current.next;
            }
        }
        //如果删除的节点是第一个节点
        if (current == head) {
            head = current.next;
            size--;
        } else {//删除的节点不是第一个节点
            previos.next = current.next;
            size--;
        }
        return true;
    }

}
