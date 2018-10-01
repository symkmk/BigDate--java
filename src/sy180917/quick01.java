package sy180917;

import java.util.Arrays;

public class quick01
{
	public static void main(String[] args)
	{
		int[]arr=new int[]{3,5,2,4,54,2,5};
		System.out.println(Arrays.toString(arr));
		//sort(arr,0,arr.length-1);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void sort(int[]arr,int low,int high)
	{
		if(low<high)
		{
			int lt=low;
			int gt=high;
			int i=low+1;
			int temp=arr[low];
			while (i<=gt)
			{
				if(arr[i]<temp)
				{
					swap(arr, i, lt);
					i++;
					lt++;
				}
				else if(arr[i]>temp)
				{
					swap(arr, i, gt);
					gt--;
				}
				else {
					i++;
				}
				
			}
			sort(arr, low, lt-1);
			sort(arr, gt+1, high);
		}
	}
	
	public static void swap(int[]arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
