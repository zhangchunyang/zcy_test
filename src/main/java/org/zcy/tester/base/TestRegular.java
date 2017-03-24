package org.zcy.tester.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//StringFilter
		System.out.println("StringFilter");
		String   str   =   "*adCVs*34_a _09_b5*[/435^*&�ǳ�()^$$&*).{}+.|.)%%*(*.�й�}34{45[]12.fd'*&999���������ĵ��ַ���{}��������������������";      
        System.out.println(str);      
        System.out.println(StringFilter(str));
        
        //checkMathes
        System.out.println("checkMathes");
        System.out.println(checkMathes("003553aa"));
        
        //checkStart
        System.out.println("checkStart");
        System.out.println(checkStart("Java.dd"));
        
        //split
        System.out.println("split");
        String[] strs = split("Java Hello World Java,Hello,,World|Sun");
        for (int i=0;i<strs.length;i++) { 
		    System.out.println(strs[i]); 
		}
        
        
//        �������滻���״γ����ַ� 
//        Pattern pattern = Pattern.compile("������ʽ"); 
//        Matcher matcher = pattern.matcher("������ʽ Hello World,������ʽ Hello World"); 
//        //�滻��һ������������� 
//        System.out.println(matcher.replaceFirst("Java")); 
//
//        �������滻��ȫ���� 
//        Pattern pattern = Pattern.compile("������ʽ"); 
//        Matcher matcher = pattern.matcher("������ʽ Hello World,������ʽ Hello World"); 
//        //�滻��һ������������� 
//        System.out.println(matcher.replaceAll("Java")); 
//
//
//        �������滻���û��ַ� 
//        Pattern pattern = Pattern.compile("������ʽ"); 
//        Matcher matcher = pattern.matcher("������ʽ Hello World,������ʽ Hello World "); 
//        StringBuffer sbr = new StringBuffer(); 
//        while (matcher.find()) { 
//            matcher.appendReplacement(sbr, "Java"); 
//        } 
//        matcher.appendTail(sbr); 
//        System.out.println(sbr.toString()); 
//
//        ����֤�Ƿ�Ϊ�����ַ 
//
//        String str="ceponline@yahoo.com.cn"; 
//        Pattern pattern = Pattern.compile("[//w//.//-]+@([//w//-]+//.)+[//w//-]+",Pattern.CASE_INSENSITIVE); 
//        Matcher matcher = pattern.matcher(str); 
//        System.out.println(matcher.matches()); 
//
//        ��ȥ��html��� 
//        Pattern pattern = Pattern.compile("<.+?>", Pattern.DOTALL); 
//        Matcher matcher = pattern.matcher("<a href=/"index.html/">��ҳ</a>"); 
//        String string = matcher.replaceAll(""); 
//        System.out.println(string); 
//
//        ������html�ж�Ӧ�����ַ� 
//        Pattern pattern = Pattern.compile("href=/"(.+?)/""); 
//        Matcher matcher = pattern.matcher("<a href=/"index.html/">��ҳ</a>"); 
//        if(matcher.find()) 
//        System.out.println(matcher.group(1)); 
//        } 
//
//        ����ȡhttp://��ַ 
//        //��ȡurl 
//        Pattern pattern = Pattern.compile("(http://|https://){1}[//w//.//-/:]+"); 
//        Matcher matcher = pattern.matcher("dsdsds<http://dsds//gfgffdfd>fdf"); 
//        StringBuffer buffer = new StringBuffer(); 
//        while(matcher.find()){              
//            buffer.append(matcher.group());        
//            buffer.append("/r/n");              
//        System.out.println(buffer.toString()); 
//        } 
//                
//        ���滻ָ��{}������ 
//
//        String str = "JavaĿǰ�ķ�չʷ����{0}��-{1}��"; 
//        String[][] object={new String[]{"//{0//}","1995"},new String[]{"//{1//}","2007"}}; 
//        System.out.println(replace(str,object)); 
//
//        public static String replace(final String sourceString,Object[] object) { 
//                    String temp=sourceString;    
//                    for(int i=0;i<object.length;i++){ 
//                              String[] result=(String[])object[i]; 
//                       Pattern    pattern = Pattern.compile(result[0]); 
//                       Matcher matcher = pattern.matcher(temp); 
//                       temp=matcher.replaceAll(result[1]); 
//                    } 
//                    return temp; 
//        } 
//
//
//        ��������������ѯָ��Ŀ¼���ļ� 
//
//        //���ڻ����ļ��б� 
//                private ArrayList files = new ArrayList(); 
//                //���ڳ����ļ�·�� 
//                private String _path; 
//                //���ڳ���δ�ϲ�������ʽ 
//                private String _regexp; 
//                
//                class MyFileFilter implements FileFilter { 
//
//                    /** 
//                       * ƥ���ļ���� 
//                       */ 
//                    public boolean accept(File file) { 
//                        try { 
//                          Pattern pattern = Pattern.compile(_regexp); 
//                          Matcher match = pattern.matcher(file.getName());                
//                          return match.matches(); 
//                        } catch (Exception e) { 
//                          return true; 
//                        } 
//                    } 
//                    } 
//                
//                /** 
//                * ���������� 
//                * @param inputs 
//                */ 
//                FilesAnalyze (String path,String regexp){ 
//                    getFileName(path,regexp); 
//                } 
//                
//                /** 
//                * �����ļ������files 
//                * @param input 
//                */ 
//                private void getFileName(String path,String regexp) { 
//                    //Ŀ¼ 
//                      _path=path; 
//                      _regexp=regexp; 
//                    File directory = new File(_path); 
//                    File[] filesFile = directory.listFiles(new MyFileFilter()); 
//                    if (filesFile == null) return; 
//                    for (int j = 0; j < filesFile.length; j++) { 
//                        files.add(filesFile[j]); 
//                    } 
//                    return; 
//                    } 
//            
//                /** 
//                 * ��ʾ�����Ϣ 
//                 * @param out 
//                 */ 
//                public void print (PrintStream out) { 
//                    Iterator elements = files.iterator(); 
//                    while (elements.hasNext()) { 
//                        File file=(File) elements.next(); 
//                            out.println(file.getPath());    
//                    } 
//                } 
//
//                public static void output(String path,String regexp) { 
//
//                    FilesAnalyze fileGroup1 = new FilesAnalyze(path,regexp); 
//                    fileGroup1.print(System.out); 
//                } 
//            
//                public static void main (String[] args) { 
//                    output("C://","[A-z|.]*"); 
//                } 
	}

	/**
	 * ֻ������Ļ������
	 * ������������ַ�
	 * @param str
	 * @return
	 */
	public static String StringFilter(String str) {
		// ֻ������ĸ������
//		String regEx = "[^a-zA-Z0-9]";
		// �������������ַ�
		String regEx = "[`~!@#$%^&*()+=|{}':;',//[//].<>/?~��@#��%����&*��������+|{}������������������������]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("").trim();
	}
	
	/**
	 * ����Ƿ���ֻ�����ֺ��ַ�
	 * @param valString
	 * @return
	 */
	public static boolean checkMathes(String valString){
		return Pattern.matches("[\\da-zA-Z]+", valString);
	}
	
	/**
	 * ����Ƿ����� Java.��ͷ���ַ�
	 * @param valString
	 * @return
	 */
	public static boolean checkStart(String valString){
		Pattern pattern = Pattern.compile("^Java.*"); 
		Matcher matcher = pattern.matcher(valString); 
		boolean b= matcher.matches(); 
		//����������ʱ��������true�����򷵻�false 
		return b;
	}
	
	public static String[] split(String string){
		Pattern pattern = Pattern.compile("[, |]+"); 
		String[] strs = pattern.split(string); 
		return strs;
	}
	
}

/**
// ��б�� 
/t ��� ('/u0009') 
/n ���� ('/u000A') 
/r �س� ('/u000D') 
/d ���� �ȼ���[0-9] 
/D ������ �ȼ���[^0-9] 
/s �հ׷�� [/t/n/x0B/f/r] 
/S �ǿհ׷�� [^/t/n/x0B/f/r] 
/w �����ַ� [a-zA-Z_0-9] 
/W �ǵ����ַ� [^a-zA-Z_0-9] 
/f ��ҳ�� 
/e Escape 
/b һ�����ʵı߽� 
/B һ���ǵ��ʵı߽� 
/G ǰһ��ƥ��Ľ��� 

^Ϊ���ƿ�ͷ 
^java     ��������Ϊ��JavaΪ��ͷ�ַ� 
$Ϊ���ƽ�β 
java$     ��������Ϊ��javaΪ��β�ַ� 
. �������Ƴ�/n��������һ�������ַ� 
java..     ��������Ϊjava����������������ַ� 


�����ض�����������[]�� 
[a-z]     ����������Сдa to z��Χ��һ���ַ� 
[A-Z]     ���������ڴ�дA to Z��Χ��һ���ַ� 
[a-zA-Z] ����������Сдa to z���дA to Z��Χ��һ���ַ� 
[0-9]     ����������Сд0 to 9��Χ��һ���ַ� 
[0-9a-z] ����������Сд0 to 9��a to z��Χ��һ���ַ� 
[0-9[a-z]] ����������Сд0 to 9��a to z��Χ��һ���ַ�(����) 

[]�м���^����ٴ�����������[^]�� 
[^a-z]     ���������ڷ�Сдa to z��Χ��һ���ַ� 
[^A-Z]     ���������ڷǴ�дA to Z��Χ��һ���ַ� 
[^a-zA-Z] ���������ڷ�Сдa to z���дA to Z��Χ��һ���ַ� 
[^0-9]     ���������ڷ�Сд0 to 9��Χ��һ���ַ� 
[^0-9a-z] ���������ڷ�Сд0 to 9��a to z��Χ��һ���ַ� 
[^0-9[a-z]] ���������ڷ�Сд0 to 9��a to z��Χ��һ���ַ�(����) 

����������Ϊ�ض��ַ����0������ʱ������ʹ�á�*�� 
J*     0������J 
.*     0�����������ַ� 
J.*D     J��D֮��0�����������ַ� 

����������Ϊ�ض��ַ����1������ʱ������ʹ�á�+�� 
J+     1������J 
.+     1�����������ַ� 
J.+D     J��D֮��1�����������ַ� 

����������Ϊ�ض��ַ������0��1������ʱ������ʹ�á�?�� 
JA?     J����JA���� 

����Ϊ�������ָ�������ַ�{a}�� 
J{2}     JJ 
J{3}     JJJ 
����a�����ϣ����ҡ�{a,}�� 
J{3,}     JJJ,JJJJ,JJJJJ,???(3������J����) 
���ָ����ϣ�b�����¡�{a,b}�� 
J{3,5}     JJJ��JJJJ��JJJJJ 
����ȡһ��|�� 
J|A     J��A 
Java|Hello     Java��Hello 
 */