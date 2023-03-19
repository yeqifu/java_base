package com.yeqifu.a01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * @author: yeqifu
 * @date: 2023/3/19 20:19
 */
public class StreamDemo8 {
    public static void main(String[] args) {
        /**
         * map      转换流中的数据类型
         */
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "特朗普-60", "拜登-80", "桑德斯-62", "马斯克-48");
        // 需求：只获取里面的年龄并进行打印
        // String --> int

        // 第一个参数：流中原本的数据类型
        // 第二个参数：要转换之后的类型
        // apply的形参s：依次表示流里面的每一个数据
        // 返回值：表示转换之后的数据
        // 当map方法执行完毕之后，流上的数据就变成了整数，所以在下面的forEach当中，s依次表示流里面的每一个数据，这个数据现在就是整数了
        arrayList.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] split = s.split("-");
                Integer age = Integer.parseInt(split[1]);
                return age;
            }
        }).forEach(ele -> System.out.println(ele));

        System.out.println("==========================================");
        arrayList.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(ele -> System.out.println(ele));
    }
}
