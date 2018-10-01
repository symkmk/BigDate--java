package sy180922;


//java.util.LinkedList;

public class OuterClass
{
	public  void staticshow()
	{
		StaticClassIn staticClassIn = new StaticClassIn();
		staticClassIn.snameString="dd";
		System.out.println(staticClassIn.snameString);
	}
	public static  void staticshows()
	{
		StaticClassIn staticClassIn = new StaticClassIn();
		staticClassIn.snameString="dd";
		System.out.println(staticClassIn.snameString);
	}
	public static class StaticClassIn
	{
		public static int i=1;
		private static int ps;
		private String snameString;
		private int age;
		public  int p=4;
		public StaticClassIn(String snameString, int age)
		{
			super();
			this.snameString = snameString;
			this.age = age;
		}
		public StaticClassIn()
		{
			super();
		}
		public void sshow()
		{
			System.out.println("静态内部类的show");
		}
		
		public static void sshow2()
		{
			System.out.println("静态内部类静态show");
		}
		
	}
	private String nameString;
	private int age;
	private static String sssString;
	
	public OuterClass()
	{
		super();
	}

	public OuterClass(String nameString, int age)
	{
		super();
		this.nameString = nameString;
		this.age = age;
		
	}

	public  void Outshow()
	{
		System.out.println("外部类show");
		InClass inClass = new InClass("ddd");
		inClass.ishow();
		inClass.inameString="sss";
		
	}
	public static void Outstaticshow()
	{
		OuterClass outerClass=new OuterClass();
		InClass inClass = outerClass.new InClass("kkk");
		inClass.inameString="ssdf";
		inClass.ishow();
	}
	class InClass
	{
		private String inameString;

		public InClass()
		{
			super();
		}

		public InClass(String inameString)
		{
			super();
			this.inameString = inameString;
		}
		public void ishow()
		{
			System.out.println("i am inshow");
			System.out.println(nameString);
			
		}
	}
	
	Student student=new Student(12,"sy")
	{
		
	};
	Student p=new Student(){
		
	};
	public static void main(String[] args)
	{
		OuterClass outerClass=new OuterClass("gg",12);
		InClass inClass = outerClass.new InClass("kkk");
		inClass.ishow();
		outerClass.staticshow();
		staticshows();
		outerClass.jubu();
	}
	
	public void jubu()
	{
		//LinkedList
		String name="hfghf";
		int age=12;
		class InClassjubu
		{
			private String jname="ju";
			public void jshow()
			{
				System.out.println(sssString);
				System.out.println(nameString);
			}
		}
		InClassjubu inClassjubu = new InClassjubu();
		System.out.println(inClassjubu.jname);
		System.out.println(name);
		//jshow();
	}
	
}
