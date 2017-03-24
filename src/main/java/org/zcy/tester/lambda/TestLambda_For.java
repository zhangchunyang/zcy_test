package org.zcy.tester.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 专业测试lambda
 * Created by 春哥 on 16/9/8.
 */
public class TestLambda_For {

    public static void main(String args[]) {

        //传统方式
        System.out.println("=====old way====");
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        for(int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }

        for(String name : friends) {
            System.out.println(name);
        }

        System.out.println("=====new way====");
        //new way
        friends.forEach(new Consumer<String>() {
            public void accept(final String name) {
                System.out.println(name);
            }
        });

//        friends.forEach((final String name) -> System.out.println(name));
//
//        friends.forEach((name) -> System.out.println(name));
//
//        friends.forEach(name -> System.out.println(name));
//
//        friends.forEach(System.out::println);
    }
}
