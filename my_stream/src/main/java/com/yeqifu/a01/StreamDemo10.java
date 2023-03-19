package com.yeqifu.a01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

/**
 * @author: yeqifu
 * @date: 2023/3/19 20:50
 */
public class StreamDemo10 {
    public static void main(String[] args) {
        // toArray()                        收集流中的数据，放到数组中
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "特朗普", "拜登", "桑德斯", "马斯克", "美国党争", "美国历史");

        Object[] array = arrayList.stream().toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("==========================================");

        // IntFunction的泛型：具体类型的数组
        // apply的形参：流中数据的个数，要和数据的长度保持一致
        // apply的返回值：具体类型的数组
        // 方法体：创建数组

        // toArray方法的参数的作用：负责创建一个指定类型的数组
        // toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
        // toArray方法的返回值：是一个装着流里面所有数据的数组
        String[] arrays = arrayList.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arrays));
        System.out.println("==========================================");

        String[] strings = arrayList.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(strings));
    }
}
