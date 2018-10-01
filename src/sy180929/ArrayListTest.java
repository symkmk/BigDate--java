package sy180929;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest
{

	public static void main(String[] args)
	{
		ArrayList arrayList=new ArrayList();
		arrayList.add("fdf");
		arrayList.add(1332);
		arrayList.add("发个言");
		
		arrayList.remove(1332);
		System.out.println(arrayList);
		//LinkedList<E>

	}

}
