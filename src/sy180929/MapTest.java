package sy180929;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest
{

	public static void main(String[] args)
	{
		Map map=new HashMap();
		map.put(34, "sy");
		map.put("hj",66);
		map.put("合法的", 12);
		map.put("dfs的", "发的");
		map.put("f堆顶", "j");
		System.out.println(map);

		//遍历方式1
		Set keySet = map.keySet();
		Iterator iterator = keySet.iterator();
		while(iterator.hasNext())
		{
			Object key=iterator.next();
			Object value=map.get(key);
			System.out.println(key+"->"+value);
					
		}
		System.out.println("----------------------");
		//2
		Set entrySet = map.entrySet();
		Iterator iterator2 = entrySet.iterator();
		while(iterator2.hasNext())
		{
			Entry next = (Entry)iterator2.next();
			Object key=next.getKey();
			Object value = next.getValue();
			System.out.println(key+"->"+value);
		}
		System.out.println("----------------------");
		//3
		Set keySet2 = map.keySet();
		Collection values = map.values();
		Iterator iterator3 = keySet2.iterator();
		Iterator iterator4 = values.iterator();
		while(iterator3.hasNext())
		{
			Object key = iterator3.next();
			Object value = iterator4.next();
			System.out.println(key+"->"+value);
		}
	}

}
