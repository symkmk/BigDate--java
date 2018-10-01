package sy180922;

import sy180922.OuterClass.StaticClassIn;

public class Test
{
	public static void main(String[] args)
	{
		StaticClassIn staticClassIn = new OuterClass.StaticClassIn();
		System.out.println(StaticClassIn.i);
		staticClassIn.sshow();
		staticClassIn.sshow2();
		System.out.println(staticClassIn.p);
		
	}

}
