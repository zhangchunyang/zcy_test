package com.ge.chun.guava.immutable.collections;

import com.google.common.collect.ImmutableSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 春哥 on 16/11/4.
 */
public class ImmutableSetTester {

    public static void oldWay() {
        Set<String> set = new HashSet<String>(Arrays.asList(new String[]{"RED", "GREEN"}));
        Set<String> unmodifiableSet = Collections.unmodifiableSet(set); // show UnsupportedOperationException
    }

    public static void newWay() {
        //way 1
        ImmutableSet<String> immutableSet = ImmutableSet.of("RED", "GREEN");
        immutableSet.add("FF"); //show UnsupportedOperationException

        //way 2
        Set<String> set = new HashSet<String>(Arrays.asList(new String[]{"RED", "GREEN"}));
        immutableSet = ImmutableSet.copyOf(set);
        immutableSet.add("FF"); //show UnsupportedOperationException

        //way 3
        ImmutableSet.Builder<String> builder = ImmutableSet.builder();
        immutableSet = builder.add("RED").addAll(set).build();
        immutableSet.add("FF"); //show UnsupportedOperationException
    }


    public static void main(String args[]) {
        oldWay();
        newWay();
    }
}
