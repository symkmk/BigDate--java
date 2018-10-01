package sy180917;

import java.util.Arrays;

public class twosearch
{
	public static void main(String[] args)
	{
		int[]arr=new int[]{2,37,8,4,5,4,54,5};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int s=binarySearch(arr, 8);
		System.out.println(s);
		System.out.println(Arrays.toString(arr));

	}
	public static int binarySearch(int[]arr,int key)
	{
		int min=0;
		int max=arr.length-1;
		while(min<=max)
		{
			int mid=(min+max)/2;
			if(key>arr[mid])
			{
				min=mid+1;
			}
			else if(key<arr[mid])
			{
				max=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
