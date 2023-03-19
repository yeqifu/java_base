package com.yeqifu.a01;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author: yeqifu
 * @date: 2023/3/19 15:50
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        // 数组	public static <T> Stream<T> stream(T[] array)	Arrays工具类中的静态方法
        int[] arrays = {1, 2, 3, 4, 5, 6};
        Arrays.stream(arrays).forEach(ele -> System.out.println(ele));

        System.out.println("======================================================");

        String[] stringArrays = {"特朗普", "拜登", "桑德斯", "马斯克"};
        Arrays.stream(stringArrays).forEach(ele -> System.out.println(ele));

        System.out.println("======================================================");
        /**
         * 注意：
         *      Stream接口中静态方法of的细节，方法的形参是一个可变参数，可传递一堆零散的数据，也可以传递数组
         *      但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素放到Stream当中
         */
        Stream.of(arrays).forEach(ele -> System.out.println(ele));

        System.out.println("======================================================");

        Stream.of(stringArrays).forEach(ele -> System.out.println(ele));
    }
}
