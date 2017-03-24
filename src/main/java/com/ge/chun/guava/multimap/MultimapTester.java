package com.ge.chun.guava.multimap;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 一对多的数据结构
 * Created by 春哥 on 16/11/4.
 */
public class MultimapTester {

    public static List<Ticket> tickets;

    public static void init() {
        tickets = Lists.newArrayList();
        tickets.add(new Ticket("zcy", "111"));
        tickets.add(new Ticket("zcy", "222"));
        tickets.add(new Ticket("cyz", "333"));
    }

    public static void oldWay() {
        //Key is candidate name, its value is his voters
        HashMap<String, HashSet<String>> hMap = new HashMap<String, HashSet<String>>();
        for(Ticket ticket: tickets){
            HashSet<String> set = hMap.get(ticket.getCandidate());
            if(set == null){
                set = new HashSet<String>();
                hMap.put(ticket.getCandidate(), set);
            }
            set.add(ticket.getVoter());
        }
        System.out.println(hMap);
    }

    public static void newWay() {
        HashMultimap<String, String> map = HashMultimap.create();
        for(Ticket ticket: tickets){
            map.put(ticket.getCandidate(), ticket.getVoter());
        }
        System.out.println(map);
    }

    public static void main(String args[]) {
        init();
        oldWay();
        newWay();
    }
}
