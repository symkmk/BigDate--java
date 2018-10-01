package sy180927;

public class stringTest
{

	public static void main6(String[] args)
	{
		long last=System.currentTimeMillis();
		String str="";
		for (int i = 0; i <10000; i++)
		{
			str=str+"f";
		}
		long now=System.currentTimeMillis();
		System.out.println(now-last);
	}
	public static void main7(String[] args)
	{
//		String string="ab";
//		String ss=string+"cd";
//		String s2="abcd";
//		System.out.println(ss.intern()==s2);
		String s3=new String("abcd");
		String s2="abcd";
		String str=s3.intern();
		//s3.intern();
		System.out.println(str==s2);
		System.out.println(s3=="abcd");
	}
	public static void mainab(String[] args)
	{
		String s3=new String("abcd");
		System.out.println(s3=="abcd");//false
		String str=s3.intern();
		System.out.println(str=="abcd");//true
		System.out.println(s3=="abcd");//false
	}
	public static void main(String[] args)
	{
		//String s2="abcd";
		char[] ch={'a','b','c','d'};
		//String s2="abcd";
		//String s3=new String("abcd");//这个常量池里已经有"abcd"了
		String s3=new String(ch);//这里只创建了一个对象，"abcd"不在常量池
		String str=s3.intern();
		System.out.println(str=="abcd");//true
		System.out.println(s3=="abcd");//false
		StringBuffer stringBuffer = new StringBuffer("abcdef");
		stringBuffer.reverse();
		System.out.println(stringBuffer);
	}
}
