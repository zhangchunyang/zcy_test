package org.zcy.tester.test;

/**
 * Created by chunyang.zcy on 2015/8/21.
 */
public class NullTest {

	public static void main(String args[]) {
		String b = null;
		Person p = new Person(
				"1",
				String.valueOf(b.equals("b")),
				"3");


	}

	static class Person {
		public Person() {

		}
		public Person(String a, String b, String c) {

		}
		public void eat() {
			System.out.println("The people were eating");
		}
	}

	static class Boy extends Person {
		public int ss = 5;
		public Boy() {

		}
		public void eat() {
			System.out.println("The boy were eating");
		}
	}
}
