package sy180919;

import java.util.Arrays;

public class bullet01
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
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap(arr, j, j+1);
				}
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
