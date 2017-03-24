package org.zcy.tester;

import com.google.common.collect.Sets;
import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by 春哥 on 16/10/8.
 */
public class Test {

    abstract class animal {
        public void say() {
            System.out.println("animal say");
        }

        public abstract void sayI();
    }

    class PeopleA extends animal {

        @Override
        public void sayI() {
            System.out.printf("PeopleA say hi");
        }
    }

    class PeopleB extends animal {

        @Override
        public void sayI() {
            System.out.printf("PeopleB say hi");
        }
    }

    public Test() {
//        Set<String> ss = Sets.newHashSet();
//        ss.add(new String("aa"));
//        ss.add(new String("bb"));
//        ss.add(new String("cc"));
//        System.out.println(ss);
//
//        Set<animal> ff = Sets.newHashSet();
//        ff.add(new PeopleA());
//        ff.add(new PeopleB());
//        System.out.println(ff.size());

        String ss = StringUtils.join(Arrays.asList(1L,2L, 3L), ",");
        System.out.println(ss);
    }

    public static void main(String args[]) {
        Pattern switchPattern = Pattern.compile("\\d{4}00");
        System.out.println(switchPattern.matcher("311300").matches());
    }
}
