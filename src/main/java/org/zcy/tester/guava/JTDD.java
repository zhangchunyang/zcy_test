package org.zcy.tester.guava;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by chunyang.zcy on 2015/9/7.
 */
public class JTDD {

	public static void main(String args[]) throws Exception {
//		List<String> ss = new ArrayList<String>();
//		ss.add("333");
//		ss.add("333");
//		ss.add("343");
//		ss.add("353");
//		ss.add("363");
//		String ff = "";
//		for(String ff : ss) {
//			System.out.println(ff);
//		}
//		System.out.println("-----");
//		System.out.println(ff);

		try {
//			System.out.println(System.currentTimeMillis());
//			System.out.println(new Date(1449818339395L));

			test f = new test();
			f.setFf("ff");
			System.out.println(f.getFf().equals("ff"));
			System.out.println("ff".equals(f.getFf()));


		} catch (Exception e) {
			throw e;
		}

	}
}

class  test {
	private String ff;

	public String getFf() {
		return ff;
	}

	public void setFf(String ff) {
		this.ff = ff;
	}
}
