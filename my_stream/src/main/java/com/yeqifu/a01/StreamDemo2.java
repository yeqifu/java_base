package com.yeqifu.a01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author: yeqifu
 * @date: 2023/3/19 15:30
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        // 单列集合	default Stream<E> stream()	Collection中的默认方法
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "特朗普", "拜登", "桑德斯", "马斯克", "美国党争");
        Stream<String> stream = arrayList.stream();
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                // s：依次表示流水线上的每一个数据
                System.out.println(s);
            }
        });

        System.out.println("==================================================");
        arrayList.stream().forEach(name -> System.out.println(name));
    }
}
