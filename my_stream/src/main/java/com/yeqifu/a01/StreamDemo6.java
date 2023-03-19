package com.yeqifu.a01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 * @author: yeqifu
 * @date: 2023/3/19 19:43
 */
public class StreamDemo6 {
    public static void main(String[] args) {
        /**
         * filter   过滤
         */
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "特朗普", "拜登", "桑德斯", "马斯克", "美国党争", "美国历史");

        // filter 过滤：把“美”开头的留下，其余数据过滤不要
        arrayList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                // 如果返回值为true，表示当前数据留下
                // 如果返回值为false，表示当前数据舍弃不要
                if (s.startsWith("美", 0)) {
                    return true;
                } else {
                    return false;
                }
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("==========================================");
        arrayList.stream().filter(s -> s.startsWith("美", 0)).forEach(s -> System.out.println(s));
        System.out.println("==========================================");

        /**
         * limit    获取前几个元素
         * skip     跳过前几个元素
         */
        arrayList.stream().limit(3).forEach(ele -> System.out.println(ele));
        System.out.println("==========================================");
        arrayList.stream().skip(3).forEach(ele -> System.out.println(ele));
        System.out.println("==========================================");

        // 获得 “桑德斯”，“马斯克”和“美国党争”
        arrayList.stream().skip(2).limit(3).forEach(ele -> System.out.println(ele));
    }
}
