package com.answer.java8;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author answer
 * @description
 * @create 2018/3/13 14:18
 **/
public class TestMap {
    @Test
    public  void testMap() {
        Map<String , Object> map = new HashMap<>();
        for (int i = 0 ;i< 10 ; i++) {
            map.put("key" + i , "value"+i);
        }
        System.out.println("-------------方式一 使用Entry可以去到key和value--------------");
        for (Map.Entry<String , Object> entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
        System.out.println("--------------方式二 直接根据Key遍历可以去到key和value 通过键找值遍历（效率低）-------------");
        for (String key : map.keySet()) {
            System.out.println("key:" + key + " value:" + map.get(key));
        }
        System.out.println("--------------方式三 根据iterator遍历可以去到key和value-------------");
        Iterator<Map.Entry<String , Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String , Object> entry = iterator.next();
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue() );
        }
        System.out.println("--------------方式四 直接根据key或value获取key和value值，不能获取key-------------");
        for (String key : map.keySet()) {
            System.out.println("key = " + key);
        }
        for (Object value : map.values()) {
            System.out.println("Value = " + value);
        }
    }

    @Test
    public void testIntegerEquals() {
        Integer a = 1;
        Integer b = 1;
        System.out.println(a.equals(b) + "/" + (a.intValue()==b.intValue()));
    }
}
