package com.yeqifu.a01;

import java.util.ArrayList;

/**
 * @author: yeqifu
 * @date: 2023/3/19 14:54
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        /**
         * 创建集合添加元素，并完成以下需求：
         *      1.把所有以“张”开头的元素存储到新集合中
         *      2.把“张”开头的，长度为3的元素再存储到新集合中
         *      3.遍历并打印最终结果
         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张无忌");
        arrayList.add("周芷若");
        arrayList.add("赵敏");
        arrayList.add("张强");
        arrayList.add("张三丰");

        arrayList.stream().filter(name -> name.startsWith("张", 0)).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));

        // 把所有以“张”开头的元素存储到新集合中
        ArrayList<String> newList = new ArrayList<>();
        for (String s : arrayList) {
            if (s.startsWith("张", 0)) {
                newList.add(s);
            }
        }

        ArrayList<String> result = new ArrayList<>();
        for (String o : newList) {
            if (o.length() == 3) {
                result.add(o);
            }
        }

        for (String s : result) {
            System.out.println(s);
        }

    }
}
