package org.zcy.tester.base;

import java.util.Calendar;
//
//import org.commonslang.*;
//import org.apache.commons.lang3.StringUtils;

//字符串操作
public class StringTester {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//使用日历类
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
//		判断某字符串是否为空，为空的标准是 str==null 或 str.length()==0
//		下面是 StringUtils 判断是否为空的示例：
		//isEmpty
//		System.out.println(StringUtils.isEmpty(null)); // = true;
//		System.out.println(StringUtils.isEmpty("")); // = true;  empty - a zero-length string ("")
//		System.out.println(StringUtils.isEmpty(" ")); // = false;
//		System.out.println(StringUtils.isEmpty(" bob ")); // = false;
//		
//		//isBlank  判断某字符串是否为空或长度为0或由空白符(whitespace) 构成
//		System.out.println(StringUtils.isBlank(null)); // = true;
//		System.out.println(StringUtils.isBlank("")); // = true;  empty - a zero-length string ("")
//		System.out.println(StringUtils.isBlank(" ")); // = true;
//		System.out.println(StringUtils.isBlank("/t /n /f /r")); // = true; //对于制表符、换行符、换页符和回车符
//		System.out.println(StringUtils.isBlank("")); // = true;
//		System.out.println(StringUtils.isBlank("/b")); // = false "/b"为单词边界符
//		
//		//trim  
//		//去掉字符串两端的控制符(control characters, char <= 32) , 如果输入为 null 则返回null
//		System.out.println(StringUtils.trim("  ")); // = "" "/b"为单词边界符
//		System.out.println(StringUtils.trim(" dd ")); // = dd "/b"为单词边界符
//		
//		
//		//trimToNull(String str)
//		//去掉字符串两端的控制符(control characters, char <= 32) ,如果变为 null 或""，则返回 null
//		System.out.println(StringUtils.trimToNull(null)); // = null
//		System.out.println(StringUtils.trimToNull("")); // = null
//		System.out.println(StringUtils.trimToNull(" ")); // = null
//		System.out.println(StringUtils.trimToNull(" /b /t /n /f /r ")); // = null
//		
//		//trimToEmpty(String str)
//		//去掉字符串两端的控制符(control characters, char <= 32) ,如果变为 null 或 "" ，则返回 ""
//		System.out.println(StringUtils.trimToNull(null)); // = ""
//		System.out.println(StringUtils.trimToNull("")); // = ""
//		System.out.println(StringUtils.trimToNull(" ")); // = ""
//		System.out.println(StringUtils.trimToNull(" /b /t /n /f /r ")); // = ""
//		System.out.println(StringUtils.trimToNull(" dd ")); // = "dd"
//		
//		//strip(String str)
//		//去掉字符串两端的空白符(whitespace) ，如果输入为 null 则返回 null
//		System.out.println(StringUtils.strip(null)); // = null
//		System.out.println(StringUtils.strip("")); // = ""
//		System.out.println(StringUtils.strip(" ")); // = ""
//		System.out.println(StringUtils.strip(" /b /t /n /f /r ")); // = "/b"
//		System.out.println(StringUtils.strip(" dd ")); // = "dd"
//		
//		//stripToNull(String str)
//		//去掉字符串两端的空白符(whitespace) ，如果变为 null 或""，则返回 null
//		System.out.println(StringUtils.strip(null)); // = null
//		System.out.println(StringUtils.strip("")); // = null
//		System.out.println(StringUtils.strip(" ")); // = null
//		System.out.println(StringUtils.strip(" /b /t /n /f /r ")); // = "/b"
//		System.out.println(StringUtils.strip(" dd ")); // = "dd"
//		
//		//stripToEmpty(String str)
//		//去掉字符串两端的空白符(whitespace) ，如果变为 null 或"" ，则返回""
//		System.out.println(StringUtils.trimToEmpty(null)); // = ""
//		System.out.println(StringUtils.trimToEmpty("")); // = ""
//		System.out.println(StringUtils.trimToEmpty(" ")); // = ""
//		System.out.println(StringUtils.trimToEmpty(" /b /t /n /f /r ")); // = "/b"
//		System.out.println(StringUtils.trimToEmpty(" dd ")); // = "dd"
		
		//strip(String str, String stripChars)
		//去掉 str 两端的在 stripChars 中的字符。 如果 str 为 null 或等于"" ，则返回它本身；
		//如果 stripChars 为 null 或"" ，则返回 strip(String str) 。
		
		//stripStart(String str, String stripChars)
		//和上面相似，去掉 str 前端的在 stripChars 中的字符。
		
		//stripEnd(String str, String stripChars)
		//和上面相似，去掉 str 末端的在 stripChars 中的字符。
		
		//stripAll(String[] strs)
		//对字符串数组中的每个字符串进行 strip(String str) ，然后返回。
		//如果 strs 为 null 或 strs 长度为0，则返回 strs 本身
		
		//stripAll(String[] strs, String stripChars)
		//对字符串数组中的每个字符串进行 strip(String str, String stripChars) ，然后返回。
		//如果 strs 为 null 或 strs 长度为0，则返回 strs 本身
		
		//equals(String str1, String str2)
		//比较两个字符串是否相等，如果两个均为空则也认为相等。
		
		//equalsIgnoreCase(String str1, String str2)
		//比较两个字符串是否相等，不区分大小写，如果两个均为空则也认为相等。
		
		//indexOf(String str, char searchChar)
		//返回字符 searchChar 在字符串 str 中第一次出现的位置。
		//如果 searchChar 没有在 str 中出现则返回-1，
		//如果 str 为 null 或 "" ，则也返回-1
		
		//indexOf(String str, char searchChar, int startPos)
		//返回字符 searchChar 从 startPos 开始在字符串 str 中第一次出现的位置。
		//如果从 startPos 开始 searchChar 没有在 str 中出现则返回-1，
		//如果 str 为 null 或 "" ，则也返回-1
		
		//indexOf(String str, String searchStr)
		//返回字符串 searchStr 在字符串 str 中第一次出现的位置。
		//如果 str 为 null 或 searchStr 为 null 则返回-1，
		//如果 searchStr 为 "" ,且 str 为不为 null ，则返回0，
		//如果 searchStr 不在 str 中，则返回-1
		
		//ordinalIndexOf(String str, String searchStr, int ordinal)
		//返回字符串 searchStr 在字符串 str 中第 ordinal 次出现的位置。
		//如果 str=null 或 searchStr=null 或 ordinal<=0 则返回-1  
		//举例(*代表任意字符串)：
		
//		System.out.println(StringUtils.ordinalIndexOf(null, *, *)); // = -1
//		System.out.println(StringUtils.ordinalIndexOf(*, null, *)); // = -1
//		System.out.println(StringUtils.ordinalIndexOf("", "", *)); // = 0
//		System.out.println(StringUtils.ordinalIndexOf("aabaabaa", "a", 1)); // = 0
//		System.out.println(StringUtils.ordinalIndexOf("aabaabaa", "ab", 1)); // = 1
//		System.out.println(StringUtils.ordinalIndexOf("aabaabaa", "", 1)); // = 0
		
		//indexOf(String str, String searchStr, int startPos)
		//返回字符串 searchStr 从 startPos 开始在字符串 str 中第一次出现的位置。
		//举例(*代表任意字符串)：
		
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
//		基本原理同18
//		24. public static int lastIndexOf(String str, char searchChar, int startPos)
//		基本原理同19
//		25. public static int lastIndexOf(String str, String searchStr)
//		基本原理同20
//		26. public static int lastIndexOf(String str, String searchStr, int startPos)
//		基本原理同22
//		另附：
//		String 的 split(String regex) 方法的用法
//		如果我们需要把某个字符串拆分为字符串数组，则通常用 split(String regex) 来实现。
//		例如：
//		Java代码 复制代码
//		1. String str = "aa,bb,cc,dd";
//		2. String[] strArray = str.split(",");
//		3. System.out.println(strArray.length);
//		4. for (int i = 0; i < strArray.length; i++) {
//		5. System.out.println(strArray[i]);
//		6. }
//		String str = "aa,bb,cc,dd"; String[] strArray = str.split(","); System.out.println(strArray.length); for (int i = 0; i < strArray.length; i++) { System.out.println(strArray[i]); }
//		 
//		结果为：
//		4
//		aa
//		bb
//		cc
//		dd
//		如果，
//		String str = "aa.bb.cc.dd";
//		String[] strArray = str.split(".");
//		则结果为：0
//		为什么结果不是我们所想的呢，原因是参数 String regex 是正则表达式 (regular expression) 而不是普通字符串，而 "." 在正则表达式中有特殊含义，表示匹配所有单个字符。如果要那样拆分，我们必须给 "." 进行转义，String[] strArray = str.split(".") 修改为 String[] strArray = str.split("//.") 即可。
				
				
	    // 删除空格  
//	    System.out.println(StringUtils.deleteWhitespace(" abc d "));  
//	    // 代替字符串中的字符  
//	    System.out.println(StringUtils.replaceChars("abc", 'a', 'b'));  
//	    // 只包含数字  
//	    System.out.println("是否是数字:" + StringUtils.isNumeric("12"));  
//	    // 只包含字母和汉字  
//	    System.out.println(StringUtils.isAlpha("abc#$"));  
//	    // 删除指定的字符  
//	    System.out.println(StringUtils.remove("abc", 'b'));  
//	    // 重复30次  
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
