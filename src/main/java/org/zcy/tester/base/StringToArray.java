package org.zcy.tester.base;

public class StringToArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] xtestStrings = {"a", "b", "c", "d"};
		System.out.println(stringArrayJoin(xtestStrings, ","));
	}
	
	public static String stringArrayJoin( String[] strArray, String separator ) {
	    StringBuffer strbuf = new StringBuffer();
	    for( int i = 0; i < strArray.length; i++ ) {
	        strbuf.append( separator ).append( strArray[i] );
	    }
	    return strbuf.deleteCharAt( 0 ).toString();
	}

}
