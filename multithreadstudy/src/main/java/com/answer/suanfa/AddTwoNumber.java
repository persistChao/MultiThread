package com.answer.suanfa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个数组 一个目标值 使得 数组中两个数相加等于目标值，返回数组下标
 * 如 int[] {3,4,7,14,13,11,5,0} 7 target 10
 * 返回[2,0]
 * @author answer
 * @version 1.0
 * @date 2021/2/4 6:41 下午
 */
public class AddTwoNumber {


    public static int[] twoSum(int[] array , int target ) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] resturn  = new int[2];
        for (int i =0 ; i < array.length;i++) {
            int firstNumber = target - array[i];
            if (map.containsKey(firstNumber)){
                resturn[0] = i;
                resturn[1] = map.get(firstNumber);
                return resturn;
            }else {
                map.put(array[i],i);
            }
        }

        return resturn;
    }

    public static void main(String[] args) {
        int[] numbers = {3,4,7,14,13,11,5,0};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(numbers, target)));

    }
}
