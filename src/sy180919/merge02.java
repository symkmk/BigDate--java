package sy180919;
import java.util.Arrays;

public class merge02
{

    public static void main(String []args)
    {
       int []arr = {9,8,7,6,5,4,3,2,1};
//        int[] arr=new int[100_000_000];
//        for(int i=0;i<arr.length;i++){//随机产生数据
//            arr[i]=(int)(Math.random()*1000+1);
//        }
        long startTime = System.currentTimeMillis();    //获取开始时间
        sort(arr);
        System.out.println(Arrays.toString(arr));
        long endTime = System.currentTimeMillis();    //获取结束时间

        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
    }
    public static void sort(int []arr)
    {
       int[]temp=new int[arr.length];//用空间换时间，需要一个辅助数组 不能减一不是下标
       sort(arr, 0, arr.length-1, temp);
    }
    private static void sort(int[] arr,int left,int right,int []temp)
    {
       if(left<right)//递归满足条件
       {
    	   int mid=(left+right)/2;//中间值
    	   sort(arr, left, mid, temp);//左边归并
    	   sort(arr, mid+1, right, temp);//右边归并
    	   merge(arr, left, mid, right, temp);//合并
       }
    }
    private static void merge(int[] arr,int left,int mid,int right,int[] temp)
    {
       int i=left;//左指针
       int j=mid+1;//右指针
       int t=0;//临时数组指针
       while(i<=mid && j<=right)//左右都没有归并完
       {
    	   if(arr[i]<=arr[j])//左边的小（从小到大）
    	   {
    		   temp[t++]=arr[i++];//放进数组
    	   }
    	   else
    	   {
    		   temp[t++]=arr[j++];
    	   }
       }
       while(i<=mid)// i 左边剩余元素放进数组
       {
    	   temp[t++]=arr[i++];
       }
       while(j<=right)//j
       {
    	   temp[t++]=arr[j++];
       }
       t=0;// 重0开始
       while(left<=right)//将临时数组元素拷贝到原数组中
       {
    	   arr[left++]=temp[t++];
       }
    }
}
