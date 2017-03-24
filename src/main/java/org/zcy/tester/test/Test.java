package org.zcy.tester.test;

/**
 * Created by chunyang.zcy on 2015/8/6.
 */
public class Test {

	public static void main(String[] args) {

			String dd = "104159";
			System.out.println(Math.abs(dd.hashCode()) % 1024);
//		Person person = new Boy();
//		Boy boy = (Boy) person;
//		boy.eat();
//		//：当Boy实例化后将引用地址返回传给person，这时person引用实际指向的是Boy，所以将person转换成Boy能成功。
//
//
//		Person p = new Girl();
//		Boy b = (Boy)p;
//		b.eat();
//		//当Girl实例化后将引用地址返回传给p，这时p引用实际指向的是Girl，将p转换成Boy也就是说将Girl转换成Boy，肯定不能成功。

		Person person = new Boy();
		Boy b = (Boy) getChangedPerson(person);
//		Boy b = (Boy) person;
		System.out.println(b.ss);

	}

	static class Person {
		public void eat() {
			System.out.println("The people were eating");
		}
	}

	static class Boy extends Person {
		public int ss = 5;
		public void eat() {
			System.out.println("The boy were eating");
		}
	}

	static class Girl extends Person {
		public void eat() {
			System.out.println("The girl were eating");
		}
	}

	private static Person getChangedPerson(Person person) {
		Boy b = (Boy) person;
		b.ss = 55555;
		return person;
	}
}
