package com.ge.chun.guava.bimap;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import sun.jvm.hotspot.utilities.BitMap;

import java.util.Map;

/**
 * 双向 Map
 * Created by 春哥 on 16/11/4.
 */
public class BiMapTester {

    public static Map<String, String> map;

    public static void init() {
        map = Maps.newHashMap();
        map.put("1", "22");
        map.put("2", "33");
        map.put("3", "44");
        map.put("4", "55");
    }

    public static void oldWay() {
        String any = "22";

        boolean isFind = false;
        for(Map.Entry<String, String> entry : map.entrySet()){
            if(entry.getValue().equals(any)){
                isFind = true;
            }
        }
        System.out.println(isFind);

    }

    public static void newWay() {
        String any = "22";
        BiMap<Integer,String> logfileMap = HashBiMap.create();
        logfileMap.put(1,"a.log");
        logfileMap.put(2,"b.log");
        logfileMap.put(3,"c.log");
//        logfileMap.put(4,"c.log"); // show IllegalArgumentException value already present: c.log

        System.out.println("logfileMap:"+logfileMap);
        BiMap<String,Integer> filelogMap = logfileMap.inverse();
        System.out.println("filelogMap:"+filelogMap);

    }

    public static void main(String args[]) {
        init();
        oldWay();
        newWay();
    }
}
