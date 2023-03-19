package com.yeqifu.a01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: yeqifu
 * @date: 2023/3/19 15:37
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        // 双列集合	无	无法直接使用stream流，需要通过keySet()或者entrySet()先转换成单列集合再使用stream流

        // 创建双列集合
        HashMap<String, Integer> hashMap = new HashMap<>(16);
        hashMap.put("特朗普", 66);
        hashMap.put("拜登", 83);
        hashMap.put("桑德斯", 62);
        hashMap.put("马斯克", 48);
        // 将双列集合转换成单列集合：通过keySet的形式
        Set<String> keySet = hashMap.keySet();
        keySet.stream().forEach(name -> System.out.println(name + "--->" + hashMap.get(name)));

        System.out.println("===================================================");

        // 将双列集合转换成单列集合：通过entrySet的形式
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        entrySet.stream().forEach(s -> System.out.println(s));

    }
}
