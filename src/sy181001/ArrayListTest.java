package sy181001;

import java.util.ArrayList;

public class ArrayListTest
{

	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add("6");
		list.add("568");
		list.add("堆顶");
		list.add("dg");
		System.out.println(list);
		
		//String[] arr=(String[])list.toArray(new String[list.size()]);
		String[] arr=(String[])list.toArray(new String[0]);
		//String[] arr=(String[])list.toArray();//由于.toArray()返回一个Object对象，所以不支持转成比他小的对象
		//Object[] arr = list.toArray();
		for (String string : arr)
		{
			System.out.println(string);
		}

	}

}
