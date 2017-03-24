package org.zcy.tester.base;

class A { } 

class B extends A { }  

public class TestInstanceOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object oa = new A(); 
		Object ob = new B(); 

		System.out.println(oa instanceof A); //=> true
		System.out.println(oa instanceof B); //=> false 
		System.out.println(ob instanceof A); //=> true
		System.out.println(ob instanceof B); //=> true 

		System.out.println(oa.getClass().equals(A.class)); // => true 
		System.out.println(oa.getClass().equals(B.class)); // => false 
		System.out.println(ob.getClass().equals(A.class)); // => false // <===============HERE 
		System.out.println(ob.getClass().equals(B.class)); // => true  
	}

}
