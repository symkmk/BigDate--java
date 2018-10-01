package sy180917;

import java.util.Arrays;

public class bullet01
{

	public static void main(String[] args)
	{
		int[]arr=new int[]{2,37,8,4,5,4,54,5};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		int s=Arrays.binarySearch(arr, 8);
		System.out.println(s);
		System.out.println(Arrays.toString(arr));

	}
	public static void sort(int[]arr)
	{
		for (int i = 0; i < arr.length-1; i++)
		{
			boolean flag=true;
			for (int j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
				System.out.println(Arrays.toString(arr));
				if(flag)
				{
					break;
				}
			
		}
	}

}
