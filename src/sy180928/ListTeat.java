package sy180928;

import java.util.ArrayList;
import java.util.List;

public class ListTeat
{

	public static void main(String[] args)
	{
		List list=new ArrayList();
		list.add("ddd");
		list.add(12);
		list.add("sfsf");
		list.add("125y");
		list.add("我的神啊");
		list.add("OK金风科技");
		System.out.println(list);
		Object i=list.remove(1);
		System.out.println(i);
		System.out.println(list);

	}

}
