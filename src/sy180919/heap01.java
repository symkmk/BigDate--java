package sy180919;

import java.util.Arrays;

public class heap01
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
		//非叶子节点下标
		for(int i=arr.length/2-1;i>=0;i--)
		{
			//arr.length 因为Adjus中的第一个if中的判断条件childIndex+1<length而不是小于等于
			adjust(arr,i,arr.length);
		}
		for(int j=arr.length-1;j>0;j--)
		{
			swap(arr, 0, j);
			adjust(arr, 0, j);
		}
		
	}
	private static void adjust(int[] arr, int i, int j)
	{
		int temp=arr[i];
		for(int k=2*i+1;k<j;k=2*k+1)
		{
			if(k+1<j && arr[k]<arr[k+1])
			{
				k++;
			}
			 if(temp<arr[k])
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
