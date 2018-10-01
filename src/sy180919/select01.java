package sy180919;

import java.util.Arrays;

import sun.tools.jar.resources.jar;

public class select01
{
	public static void main(String[] args)
	{
		int[]arr=new int[]{2,37,8,4,5,4,54,5};
		System.out.println(Arrays.toString(arr));
		sort(arr);
	
		System.out.println(Arrays.toString(arr));

	}
	public static void sort(int[]arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int id=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[id])
				{
					id=j;
				}
			}
			if(id!=i)
			{
				swap(arr, i, id);
			}
		}
	}
	public static void swap(int[]arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
