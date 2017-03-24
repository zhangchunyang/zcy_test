package org.zcy.tester.base;

import java.util.Calendar;
//
//import org.commonslang.*;
//import org.apache.commons.lang3.StringUtils;

//�ַ�������
public class StringTester {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//ʹ��������
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
//		�ж�ĳ�ַ����Ƿ�Ϊ�գ�Ϊ�յı�׼�� str==null �� str.length()==0
//		������ StringUtils �ж��Ƿ�Ϊ�յ�ʾ����
		//isEmpty
//		System.out.println(StringUtils.isEmpty(null)); // = true;
//		System.out.println(StringUtils.isEmpty("")); // = true;  empty - a zero-length string ("")
//		System.out.println(StringUtils.isEmpty(" ")); // = false;
//		System.out.println(StringUtils.isEmpty(" bob ")); // = false;
//		
//		//isBlank  �ж�ĳ�ַ����Ƿ�Ϊ�ջ򳤶�Ϊ0���ɿհ׷�(whitespace) ����
//		System.out.println(StringUtils.isBlank(null)); // = true;
//		System.out.println(StringUtils.isBlank("")); // = true;  empty - a zero-length string ("")
//		System.out.println(StringUtils.isBlank(" ")); // = true;
//		System.out.println(StringUtils.isBlank("/t /n /f /r")); // = true; //�����Ʊ�������з�����ҳ���ͻس���
//		System.out.println(StringUtils.isBlank("")); // = true;
//		System.out.println(StringUtils.isBlank("/b")); // = false "/b"Ϊ���ʱ߽��
//		
//		//trim  
//		//ȥ���ַ������˵Ŀ��Ʒ�(control characters, char <= 32) , �������Ϊ null �򷵻�null
//		System.out.println(StringUtils.trim("  ")); // = "" "/b"Ϊ���ʱ߽��
//		System.out.println(StringUtils.trim(" dd ")); // = dd "/b"Ϊ���ʱ߽��
//		
//		
//		//trimToNull(String str)
//		//ȥ���ַ������˵Ŀ��Ʒ�(control characters, char <= 32) ,�����Ϊ null ��""���򷵻� null
//		System.out.println(StringUtils.trimToNull(null)); // = null
//		System.out.println(StringUtils.trimToNull("")); // = null
//		System.out.println(StringUtils.trimToNull(" ")); // = null
//		System.out.println(StringUtils.trimToNull(" /b /t /n /f /r ")); // = null
//		
//		//trimToEmpty(String str)
//		//ȥ���ַ������˵Ŀ��Ʒ�(control characters, char <= 32) ,�����Ϊ null �� "" ���򷵻� ""
//		System.out.println(StringUtils.trimToNull(null)); // = ""
//		System.out.println(StringUtils.trimToNull("")); // = ""
//		System.out.println(StringUtils.trimToNull(" ")); // = ""
//		System.out.println(StringUtils.trimToNull(" /b /t /n /f /r ")); // = ""
//		System.out.println(StringUtils.trimToNull(" dd ")); // = "dd"
//		
//		//strip(String str)
//		//ȥ���ַ������˵Ŀհ׷�(whitespace) ���������Ϊ null �򷵻� null
//		System.out.println(StringUtils.strip(null)); // = null
//		System.out.println(StringUtils.strip("")); // = ""
//		System.out.println(StringUtils.strip(" ")); // = ""
//		System.out.println(StringUtils.strip(" /b /t /n /f /r ")); // = "/b"
//		System.out.println(StringUtils.strip(" dd ")); // = "dd"
//		
//		//stripToNull(String str)
//		//ȥ���ַ������˵Ŀհ׷�(whitespace) �������Ϊ null ��""���򷵻� null
//		System.out.println(StringUtils.strip(null)); // = null
//		System.out.println(StringUtils.strip("")); // = null
//		System.out.println(StringUtils.strip(" ")); // = null
//		System.out.println(StringUtils.strip(" /b /t /n /f /r ")); // = "/b"
//		System.out.println(StringUtils.strip(" dd ")); // = "dd"
//		
//		//stripToEmpty(String str)
//		//ȥ���ַ������˵Ŀհ׷�(whitespace) �������Ϊ null ��"" ���򷵻�""
//		System.out.println(StringUtils.trimToEmpty(null)); // = ""
//		System.out.println(StringUtils.trimToEmpty("")); // = ""
//		System.out.println(StringUtils.trimToEmpty(" ")); // = ""
//		System.out.println(StringUtils.trimToEmpty(" /b /t /n /f /r ")); // = "/b"
//		System.out.println(StringUtils.trimToEmpty(" dd ")); // = "dd"
		
		//strip(String str, String stripChars)
		//ȥ�� str ���˵��� stripChars �е��ַ��� ��� str Ϊ null �����"" ���򷵻�������
		//��� stripChars Ϊ null ��"" ���򷵻� strip(String str) ��
		
		//stripStart(String str, String stripChars)
		//���������ƣ�ȥ�� str ǰ�˵��� stripChars �е��ַ���
		
		//stripEnd(String str, String stripChars)
		//���������ƣ�ȥ�� str ĩ�˵��� stripChars �е��ַ���
		
		//stripAll(String[] strs)
		//���ַ��������е�ÿ���ַ������� strip(String str) ��Ȼ�󷵻ء�
		//��� strs Ϊ null �� strs ����Ϊ0���򷵻� strs ����
		
		//stripAll(String[] strs, String stripChars)
		//���ַ��������е�ÿ���ַ������� strip(String str, String stripChars) ��Ȼ�󷵻ء�
		//��� strs Ϊ null �� strs ����Ϊ0���򷵻� strs ����
		
		//equals(String str1, String str2)
		//�Ƚ������ַ����Ƿ���ȣ����������Ϊ����Ҳ��Ϊ��ȡ�
		
		//equalsIgnoreCase(String str1, String str2)
		//�Ƚ������ַ����Ƿ���ȣ������ִ�Сд�����������Ϊ����Ҳ��Ϊ��ȡ�
		
		//indexOf(String str, char searchChar)
		//�����ַ� searchChar ���ַ��� str �е�һ�γ��ֵ�λ�á�
		//��� searchChar û���� str �г����򷵻�-1��
		//��� str Ϊ null �� "" ����Ҳ����-1
		
		//indexOf(String str, char searchChar, int startPos)
		//�����ַ� searchChar �� startPos ��ʼ���ַ��� str �е�һ�γ��ֵ�λ�á�
		//����� startPos ��ʼ searchChar û���� str �г����򷵻�-1��
		//��� str Ϊ null �� "" ����Ҳ����-1
		
		//indexOf(String str, String searchStr)
		//�����ַ��� searchStr ���ַ��� str �е�һ�γ��ֵ�λ�á�
		//��� str Ϊ null �� searchStr Ϊ null �򷵻�-1��
		//��� searchStr Ϊ "" ,�� str Ϊ��Ϊ null ���򷵻�0��
		//��� searchStr ���� str �У��򷵻�-1
		
		//ordinalIndexOf(String str, String searchStr, int ordinal)
		//�����ַ��� searchStr ���ַ��� str �е� ordinal �γ��ֵ�λ�á�
		//��� str=null �� searchStr=null �� ordinal<=0 �򷵻�-1  
		//����(*���������ַ���)��
		
//		System.out.println(StringUtils.ordinalIndexOf(null, *, *)); // = -1
//		System.out.println(StringUtils.ordinalIndexOf(*, null, *)); // = -1
//		System.out.println(StringUtils.ordinalIndexOf("", "", *)); // = 0
//		System.out.println(StringUtils.ordinalIndexOf("aabaabaa", "a", 1)); // = 0
//		System.out.println(StringUtils.ordinalIndexOf("aabaabaa", "ab", 1)); // = 1
//		System.out.println(StringUtils.ordinalIndexOf("aabaabaa", "", 1)); // = 0
		
		//indexOf(String str, String searchStr, int startPos)
		//�����ַ��� searchStr �� startPos ��ʼ���ַ��� str �е�һ�γ��ֵ�λ�á�
		//����(*���������ַ���)��
		
//		StringUtils.indexOf(null, *, *) = -1
//		StringUtils.indexOf(*, null, *) = -1
//		StringUtils.indexOf("", "", 0) = 0
//		StringUtils.indexOf("aabaabaa", "a", 0) = 0
//		StringUtils.indexOf("aabaabaa", "b", 0) = 2
//		StringUtils.indexOf("aabaabaa", "ab", 0) = 1
//		StringUtils.indexOf("aabaabaa", "b", 3) = 5
//		StringUtils.indexOf("aabaabaa", "b", 9) = -1
//		StringUtils.indexOf("aabaabaa", "b", -1) = 2
//		StringUtils.indexOf("aabaabaa", "", 2) = 2
//		StringUtils.indexOf("abc", "", 9) = 3
//		23. public static int lastIndexOf(String str, char searchChar)
//		����ԭ��ͬ18
//		24. public static int lastIndexOf(String str, char searchChar, int startPos)
//		����ԭ��ͬ19
//		25. public static int lastIndexOf(String str, String searchStr)
//		����ԭ��ͬ20
//		26. public static int lastIndexOf(String str, String searchStr, int startPos)
//		����ԭ��ͬ22
//		����
//		String �� split(String regex) �������÷�
//		���������Ҫ��ĳ���ַ������Ϊ�ַ������飬��ͨ���� split(String regex) ��ʵ�֡�
//		���磺
//		Java���� ���ƴ���
//		1. String str = "aa,bb,cc,dd";
//		2. String[] strArray = str.split(",");
//		3. System.out.println(strArray.length);
//		4. for (int i = 0; i < strArray.length; i++) {
//		5. System.out.println(strArray[i]);
//		6. }
//		String str = "aa,bb,cc,dd"; String[] strArray = str.split(","); System.out.println(strArray.length); for (int i = 0; i < strArray.length; i++) { System.out.println(strArray[i]); }
//		 
//		���Ϊ��
//		4
//		aa
//		bb
//		cc
//		dd
//		�����
//		String str = "aa.bb.cc.dd";
//		String[] strArray = str.split(".");
//		����Ϊ��0
//		Ϊʲô�����������������أ�ԭ���ǲ��� String regex ��������ʽ (regular expression) ��������ͨ�ַ������� "." ��������ʽ�������⺬�壬��ʾƥ�����е����ַ������Ҫ������֣����Ǳ���� "." ����ת�壬String[] strArray = str.split(".") �޸�Ϊ String[] strArray = str.split("//.") ���ɡ�
				
				
	    // ɾ���ո�  
//	    System.out.println(StringUtils.deleteWhitespace(" abc d "));  
//	    // �����ַ����е��ַ�  
//	    System.out.println(StringUtils.replaceChars("abc", 'a', 'b'));  
//	    // ֻ��������  
//	    System.out.println("�Ƿ�������:" + StringUtils.isNumeric("12"));  
//	    // ֻ������ĸ�ͺ���  
//	    System.out.println(StringUtils.isAlpha("abc#$"));  
//	    // ɾ��ָ�����ַ�  
//	    System.out.println(StringUtils.remove("abc", 'b'));  
//	    // �ظ�30��  
//	    System.out.println(StringUtils.repeat("=", 30)); 
		
		
//		whitespace - the characters defined by Character.isWhitespace(char)
//		trim - the characters <= 32 as in String.trim()
//		IsEmpty/IsBlank - checks if a String contains text
//		Trim/Strip - removes leading and trailing whitespace
//		Equals - compares two strings null-safe
//		startsWith - check if a String starts with a prefix null-safe
//		endsWith - check if a String ends with a suffix null-safe
//		IndexOf/LastIndexOf/Contains - null-safe index-of checks
//		IndexOfAny/LastIndexOfAny/IndexOfAnyBut/LastIndexOfAnyBut - index-of any of a set of Strings
//		ContainsOnly/ContainsNone/ContainsAny - does String contains only/none/any of these characters
//		Substring/Left/Right/Mid - null-safe substring extractions
//		SubstringBefore/SubstringAfter/SubstringBetween - substring extraction relative to other strings
//		Split/Join - splits a String into an array of substrings and vice versa
//		Remove/Delete - removes part of a String
//		Replace/Overlay - Searches a String and replaces one String with another
//		Chomp/Chop - removes the last part of a String
//		LeftPad/RightPad/Center/Repeat - pads a String
//		UpperCase/LowerCase/SwapCase/Capitalize/Uncapitalize - changes the case of a String
//		CountMatches - counts the number of occurrences of one String in another
//		IsAlpha/IsNumeric/IsWhitespace/IsAsciiPrintable - checks the characters in a String
//		DefaultString - protects against a null input String
//		Reverse/ReverseDelimited - reverses a String
//		Abbreviate - abbreviates a string using ellipsis
//		Difference - compares Strings and reports on their differences
//		LevenshteinDistance - the number of changes needed to change one String into another

	}
}
