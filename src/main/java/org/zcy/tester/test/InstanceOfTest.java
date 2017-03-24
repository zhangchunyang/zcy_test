package org.zcy.tester.test;

/**
 * Created by chunyang.zcy on 2015/8/28.
 */

interface A {
}

interface B extends A {
}

interface C extends A {
}

class BB implements B {

}

class CC implements C {

}

public class InstanceOfTest {

	public static void main(String[] args) {
		boolean  res;

		A bb = new BB();
		A cc = new CC();

		res = bb instanceof C;
		System.out.println("b2 instanceof A: " + res);

		res = cc instanceof B;
		System.out.println("b2 instanceof B: " + res);
	}
}
