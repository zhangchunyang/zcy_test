import com.google.common.collect.Lists;
import org.junit.Assert;

import java.util.List;

/**
 * Created by 春哥 on 17/1/20.
 */
public class Tsss {

    public static void main(String args[]) {
        List<Human> humans = Lists.newArrayList(new Human("Sarah", 10), new Human("Jack", 12));
        humans.sort((Human h1, Human h2) -> h2.getAge().compareTo(h1.getAge()));
        System.out.println(humans.get(0).getAge());
    }

    public static class Human {
        private String name;
        private Integer age;

        public Human() {
            super();
        }

        public Human(String name, Integer age) {
            super();
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
