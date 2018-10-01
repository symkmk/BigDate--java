package sy180926;

public class test
{
	public static void main1(String[] args)
	{
		String str1 = new String("ab")+ new String("cd");    
		System.out.println(str1.intern() == str1); //true
		System.out.println(str1 == "abcd"); //true
	}
	
	public static void main2(String[] args)
	{
		String str2="abcd";
		String str1 = new String("ab")+ new String("cd");    
		System.out.println(str1.intern() == str1); //false
		System.out.println(str1 == "abcd"); //false
	}
	public static void main3(String[] args)
	{
		String s = new String("1");
		//s.intern();
		String s2 = "1";
		System.out.println(s == s2);//false
		 
		String s3 = new String("1") + new String("1");
		s3.intern();
		String s4 = "11";
		System.out.println(s3 == s4);//true
	}
	public static void main4(String[] args)
	{
		//String str2="abcd";
		String str1 = new String("ab")+ new String("cd");    
		System.out.println(str1 == str1); //true
		System.out.println(str1 == "abcd"); //false
	}
	
	/**
	 * 还有这个用""声明的两个变量就是true
	 * 用new String()就是false
	 * 是不是因为""是在常量池创建的对象而new是在堆创建的对象？
	 * 在常量池创建的对象在用""创建的时候就是同一个地址？
	 */
	public static void main5(String[] args)
	{
		String str1="abcd";
		//String str2="abcd";
		String str2=new String("abcd");
		String str3 = new String("ab")+ new String("cd");    
		System.out.println(str1 == str2); //true
		System.out.println(str1 == "abcd"); //true
		System.out.println(str2 == "abcd"); //true
		System.out.println(str2 == str3); //true
		System.out.println(str3 == "abcd"); //true
	}
	public static void main(String[] args)
	{
		String str1="abcd";
		//String str2="abcd";
		String str2=new String("abcd");
		String str3 = new String("ab")+ new String("cd");    
		String str4=new String("abcd");
		System.out.println(str1.intern() == str2.intern()); //true
		System.out.println(str1 == "abcd"); //true
		System.out.println(str2 == "abcd"); //true
		System.out.println(str2.intern() == str3); //true
		System.out.println(str3.intern() == "abcd"); //true
		System.out.println(str4.intern()==str3); //true

	}
}
