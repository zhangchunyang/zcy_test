package org.zcy.tester.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * 专业测试lambda
 * Created by 春哥 on 16/9/8.
 */
public class TestLambda1 {

    public static void main(String args[]) {

        //传统方式
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));

        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
        for(BigDecimal price : prices) {
            if(price.compareTo(BigDecimal.valueOf(20)) > 0)
                totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
        }
        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);


        //新方式
//        totalOfDiscountedPrices = prices
//                .stream()
//                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
//                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//
        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
