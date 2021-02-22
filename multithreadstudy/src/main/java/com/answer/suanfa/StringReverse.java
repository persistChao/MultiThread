package com.answer.suanfa;


/**
 * 字符串翻转
 * @author answer
 * @version 1.0
 * @date 2021/2/4 3:34 下午
 */
public class StringReverse {


    /**
     * 暴力转换方法 时间复杂度O(m*n)7 空间复杂度 O(1)
     */
    public static class Method1{
        /**
         * 逐个后移最后替换 最后一个元素
         * @param s
         * @param n
         */
        public static void leftShiftOne(char[] s , int n) {
            char t = s[0];
            for (int i = 1; i < n; i++) {
                s[i-1] = s[i];

            }
            s[n-1] = t;
        }

        public static void leftRotateString(char[] str , int n ,int m) {
            while (m-->0) {
                leftShiftOne(str, n);
            }
            for (int i = 0; i < str.length ; i++) {
                System.out.print(str[i]);
            }
        }

        public static void main(String[] args) {
            String str = "abcdef";
            char[] s = str.toCharArray();
            leftRotateString(s, str.length(), 2);
        }
    }


    public static class Method2{
        public static void reverseString(char[] chars , int from ,int to) {
            while (from <to) {
                //定义t = 开始
                char t = chars[from];
                //charts from后一位=chars[to]
                chars[from++] = chars[to];
                chars[to--] = t;
            }
        }

        public static void leftRotateString(char[] s, int n, int m) {
            //如过左移大于n位 name和%n是等价的
            m %= n;
            reverseString(s,0,m-1);
            reverseString(s,m,n-1);
            reverseString(s,0,n-1);
        }

        public static void main(String[] args) {
            String str = "abcdefg";
            char[] s = str.toCharArray();
            leftRotateString(s,s.length, 3);
            for (int i = 0; i < s.length ; i++) {
                System.out.print(s[i]);
            }

        }
    }

    /**
     * 反转字符串
     */
    public static class Method3{
        public static void reverse1(String str ) {
            char[] chars = str.toCharArray();
            int len = str.length();
            for (int i = 0; i < len/2 ; i++) {
                char temp = chars[i];
                chars[i] =  chars[len-1-i];
                chars[len-1-i] = temp;
            }
            System.out.println(new String(chars));
        }

        public static String reverse2(String str) {
            char[] chars = str.toCharArray();
            return reverse2(str.substring(1)) + str.charAt(0);
        }

        public static void main(String[] args) {
//             reverse1("abcdef");

             reverse2("abcdefg");
        }
    }

}
