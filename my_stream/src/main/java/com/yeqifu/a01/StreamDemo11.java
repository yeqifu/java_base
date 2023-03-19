package com.yeqifu.a01;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author: yeqifu
 * @date: 2023/3/19 21:06
 */
public class StreamDemo11 {
    public static void main(String[] args) {
        /**
         * collect(Collector collector)     收集流中的数据，放到集合中（List、Set、Map）
         */
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "特朗普-男-60", "拜登-男-80", "拜登-男-80", "黑莉-女-55", "马斯克-男-48", "美国-女-250");

        // 收集到List集合中
        // 需求：把所有男性收集起来
        List<String> list = arrayList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                String[] split = s.split("-");
                if (split[1].equals("男")) {
                    return true;
                } else {
                    return false;
                }
            }
        }).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("==========================================");
        List<String> collect = arrayList.stream().filter(ele -> "男".equals(ele.split("-")[1])).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("==========================================");
        // 收集到List集合中
        // 需求：把所有男性收集起来
        Set<String> collectForSet = arrayList.stream().filter(ele -> "男".equals(ele.split("-")[1])).collect(Collectors.toSet());
        System.out.println(collectForSet);
    }
}
