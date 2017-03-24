package org.zcy.tester.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 专业测试lambda
 * Created by 春哥 on 16/9/8.
 */
public class TestLambda {

    public static void main(String args[]) {

        List<String> cities = Arrays.asList("Chicago", "Hnagzhou", "Nanjing", "Beijing");

        //传统方式
        boolean found = false;
        for(String city : cities) {
            if(city.equals("Chicago")) {
                found = true;
                break;
            }
        }
        System.out.println("Found chicago with for:" + found);

        System.out.println("Found chicago with contains():" + cities.contains("Chicago"));


//        cities.forEach(city->{
//            city = city.toUpperCase();
//            System.out.println(city);
//        });


    }
}
