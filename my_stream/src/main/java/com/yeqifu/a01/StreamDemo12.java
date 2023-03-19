package com.yeqifu.a01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: yeqifu
 * @date: 2023/3/19 21:21
 */
public class StreamDemo12 {
    public static void main(String[] args) {
        /**
         * collect(Collector collector)     收集流中的数据，放到Map中
         * 注意点：如果我们要收集到Map集合中，键不能重复，否则会报错
         */
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "特朗普-男-60", "拜登-男-80", "拜登-男-80", "黑莉-女-55", "马斯克-男-48", "美国-女-250");
        // 收集到Map集合中
        // 谁作为键，谁作为值
        // 我要把所有的男性收集起来
        // 键：姓名     值：年龄
        Map<String, Integer> mapTwo = arrayList.stream().filter(ele -> "男".equals(ele.split("-")[1]))
                /**
                 * toMap()：参数一表示键的生成规则，参数二表示值的生成规则
                 * 参数一：
                 *      Function泛型一：表示流中每一个数据的类型
                 *      Function泛型二：表示Map集合中键的数据类型
                 *      方法apply形参：依次表示流里面的每一个数据
                 *             方法体：已经生成的键
                 * 参数二：
                 *      Function泛型一：表示流中每一个数据的类型
                 *      Function泛型二：表示Map集合中值的数据类型
                 *       方法apply形参：依次表示流里面的每一个数据
                 *             方法体：已经生成的值
                 */
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }, (ele1, ele2) -> ele2));
        System.out.println(mapTwo);
        System.out.println("==========================================");
        Map<String, String> map = arrayList.stream()
                .filter(ele -> "男".equals(ele.split("-")[1]))
                .collect(Collectors.toMap(ele -> ele.split("-")[0], ele -> ele.split("-")[2], (ele1, ele2) -> ele2));
        System.out.println(map);
    }
}
