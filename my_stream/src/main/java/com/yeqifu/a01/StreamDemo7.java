package com.yeqifu.a01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author: yeqifu
 * @date: 2023/3/19 20:09
 */
public class StreamDemo7 {
    public static void main(String[] args) {
        /**
         * distinct     元素去重，依赖hashCode()和equals()方法
         * concat       合并a和b两个流为一个流
         */
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "特朗普", "特朗普", "特朗普", "特朗普", "拜登", "桑德斯", "马斯克", "美国党争", "美国历史");

        arrayList.stream().distinct().forEach(ele -> System.out.println(ele));
        System.out.println("==========================================");
        ArrayList<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2, "奥巴马", "小布什", "老布什");

        Stream.concat(arrayList.stream(), arrayList2.stream()).forEach(ele -> System.out.println(ele));
    }
}
