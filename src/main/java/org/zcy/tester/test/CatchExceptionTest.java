package org.zcy.tester.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 春哥 on 16/12/12.
 */
public class CatchExceptionTest {

    private static Logger logger = LoggerFactory.getLogger(CatchExceptionTest.class);

    public static void process() {

        int i =  0;
        try {

            try {
                i = i+1-1;
                System.out.println(5/i);
            } catch (Exception e) {
                logger.error("catch exception by 1", e);
                throw e;
            }
        } catch (Exception e) {
            logger.error("catch exception by 2", e);
        }
    }

    public static void main(String args[]) {
//        process();
        System.out.println("333".equals(null));
    }
}