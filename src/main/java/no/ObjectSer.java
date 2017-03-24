package no;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;

class Student implements Serializable {

	private long serialVersionUID = -3349721437807003306L;

	int id;

	String name;// 姓名

	int age;// 年龄

	String department; // 系别

	public Student() {

	}

	public Student(int id, String name, int age, String department) {

		this.id = id;

		this.name = name;

		this.age = age;

		this.department = department;

	}

}

public class ObjectSer {

	public static void main(String args[]) throws IOException,
			ClassNotFoundException {

//		Student stu = new Student(981036, "LiuMing", 18, "CSD");
//
//		FileOutputStream fo = new FileOutputStream("C:\\Users\\chunyang.zcy\\Desktop\\data.ser");
//
//		ObjectOutputStream so = new ObjectOutputStream(fo);
//
//		try {
//
//			so.writeObject(stu);
//
//			so.close();
//
//		} catch (IOException e) {
//			System.out.println(e);
//		}

		Student stu = new Student();

		FileInputStream fi = new FileInputStream("C:\\Users\\chunyang.zcy\\Desktop\\data.ser");

		ObjectInputStream si = new ObjectInputStream(fi);

		try {

			stu = (Student) si.readObject();

			si.close();

		} catch (IOException e)

		{
			System.out.println(e);
		}

		System.out.println("Student Info:");

		System.out.println("ID:" + stu.id);

		System.out.println("Name:" + stu.name);

		System.out.println("Age:" + stu.age);

		System.out.println("Dep:" + stu.department);

	}

}