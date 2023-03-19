package com.yeqifu.a01;

import java.util.stream.Stream;

/**
 * @author: yeqifu
 * @date: 2023/3/19 15:58
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        // 一堆零散数据	public static <T> Stream<T> of(T... values)	Stream接口中的静态方法，前提条件是这堆零散数据必须是同种数据类型的
        Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.println(s));

        System.out.println("===========================================");

        Stream.of("特朗普", "桑德斯", "拜登", "马斯克").forEach(name -> System.out.println(name));

        System.out.println("===========================================");

        Stream.of(1, "张三").forEach(ele -> System.out.println(ele));
    }
}
