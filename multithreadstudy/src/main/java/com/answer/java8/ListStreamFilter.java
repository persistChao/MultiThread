package com.answer.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author answer
 * @description
 * @create 2018/3/6 14:50
 **/
public class ListStreamFilter {

    @Test
    public void testList() {
        String[] array1 = {"1" , "2" , "3" };
        String[] array2 = {"3" ,"4" ,"5"};
        List<String> list1 = Arrays.asList(array1);
        List<String> list2 = Arrays.asList(array2);
        //差及 list1-list2
        List<String> list3 = list1.stream().filter(item -> !list2.contains(item)).collect(Collectors.toList());
//        List<String> list3 = list2.stream().filter(item -> !list1.contains(item)).collect(Collectors.toList());
        list3.forEach(System.out::println);
    }
}
