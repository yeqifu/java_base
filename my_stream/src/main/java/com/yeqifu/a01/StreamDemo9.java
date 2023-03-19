package com.yeqifu.a01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

/**
 * @author: yeqifu
 * @date: 2023/3/19 20:41
 */
public class StreamDemo9 {
    public static void main(String[] args) {
        /**
         * void forEach(Consumer action)    遍历
         * long count()                     统计
         */
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "特朗普", "拜登", "桑德斯", "马斯克", "美国党争", "美国历史");

        // void forEach(Consumer action)    遍历
        // Consumer的泛型：表示流中数据的类型
        // accept方法的形参s：依次表示流里面的每一个数据
        // 方法体：对每一个数据的处理操作（打印）
        arrayList.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("==========================================");

        arrayList.stream().forEach(ele -> System.out.println(ele));

        long count = arrayList.stream().count();
        System.out.println(count);
    }
}
