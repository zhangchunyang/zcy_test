package com.ge.chun.guava.multiset;

import com.google.common.collect.HashMultiset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 把重复的元素放入集合
 * Created by 春哥 on 16/11/4.
 */
public class MultisetTester {

    public static List<String> wordList = Arrays.asList("323", "dfsd", "ff", "the", "the");

    public static void oldWay() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String word : wordList){
            Integer count = map.get(word);
            map.put(word, (count == null) ? 1 : count + 1);
        }
        //count word “the”
        Integer count = map.get("the");
        System.out.println(count);
    }

    public static void newWay() {
        HashMultiset<String> multiSet = HashMultiset.create();
        multiSet.addAll(wordList);
        //count word “the”
        Integer count = multiSet.count("the");
        System.out.println(count);
    }

    public static void main(String args[]) {
        oldWay();
        newWay();
    }
}
