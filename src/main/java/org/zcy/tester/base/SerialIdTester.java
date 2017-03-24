package org.zcy.tester.base;

import lombok.Data;

import java.io.*;

public class SerialIdTester {

    private static File file = new File("/Users/zhangchunyang/Source/tools-mine/java/zcytester/student.txt");;

    public static void main(String[] args) {
//        write();
        read();
    }

    public static void write() {
        Student st = new Student();
        st.setName("Tom");
        st.setYear(2L);
        st.setGpa(1.1F);
        st.setSex("M");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //Student对象序列化过程
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st);
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {

        try {
            //Student对象反序列化过程
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student st1 = (Student) ois.readObject();
            System.out.println("name = " + st1.getName());
            System.out.println("sex = " + st1.getSex());
            System.out.println("year = " + st1.getYear());
            System.out.println("gpa = " + st1.getGpa());
            ois.close();
            fis.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


@Data
class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String sex;
    private Long year;
    private float gpa;
}
