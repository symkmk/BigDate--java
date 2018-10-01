package sy180917;

import java.util.Arrays;

public class heap01
{

	public static void main(String[] args)
	{
		int[]arr=new int[]{13,5,2,4,54,2,5};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void sort(int[]arr)
	{
		for(int i=arr.length/2-1;i>=0;i--)
		{
			adjust(arr, i, arr.length);//为什么能用同一个方法调整堆
		}
		for(int j=arr.length-1;j>0;j--)
		{
			swap(arr, 0, j);
			adjust(arr, 0, j);
		}
	}
	public static void adjust(int[]arr,int i,int length)
	{
		int temp=arr[i];
		for(int k=2*i+1;k<length;k=2*k+1)
		{
			if(k+1<length && arr[k]<arr[k+1])
			{
				k++;
			}
			if(arr[k]>temp)
			{
				arr[i]=arr[k];
				i=k;
			}
			else {
				break;
			}
		}
		arr[i]=temp;
	}
	public static void swap(int[]arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
