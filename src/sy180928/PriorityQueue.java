package sy180928;

import java.util.Arrays;

/**
 * 优先队列
 *
 */
public class PriorityQueue
{
	private int[] array;
	//size是指向下一次插入的位置，就是元素个数
	private int size;
	public PriorityQueue()
	{
		array=new int[32];
	}
	
	/**
	 * 入队 从最后插入 所以上浮
	 * @param key 入队元素
	 */
	public void enQueue(int key)
	{
		//队列长度超出范围，扩容
		if(size>=array.length)
			resize();
		array[size++]=key;
		upAdjust();
	}

	/**
	 * 出队  第一个删除，把最后一个元素顶替到第一个
	 */
	public int deQueue() throws Exception
	{
		if(size<=0)
			throw new Exception("队列空");
		//获取堆顶元素
		int head=array[0];
		//最后一个元素移动到堆顶
		array[0]=array[--size];
		downAdjust();
		return head;
	}
	
	/**
	 * 上浮调整
	 */
	public void upAdjust()
	{
		//c=2p+1  c=2p+2
		int childIndex=size-1;
		int parentIndex=(childIndex-1)/2;//父节点下标 = （子节点下标-1）/2
		//temp保存插入的叶子节点值，用于最后的赋值
		int temp=array[childIndex];
		while(childIndex>0 && temp>array[parentIndex])
		{
			//无需真正的交换，单向赋值即可
			array[childIndex]=array[parentIndex];
			childIndex=parentIndex;
			parentIndex=(parentIndex-1)/2;
		}
		array[childIndex]=temp;
	}
	/**
	 * 下沉调整
	 */
	public void downAdjust ()
	{
		//temp保存父节点，用于最后的赋值
		int parentIndex=0;
		int temp=array[parentIndex];
		int childIndex=1;
		while(childIndex<size)//没有比到最后
		{
			//如果有右孩子，且右孩子大于左孩子，则定位到右孩子
			if(childIndex+1<size && array[childIndex+1]>array[childIndex])
				childIndex++;
			//如果父节点大于任何一个孩子的值，直接跳出
			if(temp>=array[childIndex])
				break;
			//无需真正的交换，单向赋值即可
			array[parentIndex]=array[childIndex];
			parentIndex=childIndex;
			childIndex=2*childIndex+1;
		}
		array[parentIndex]=temp;
	}
	public void resize()
	{
		int newSize=this.size*2;
		this.array=Arrays.copyOf(this.array, newSize);
		
	}
	
	public void show()
	{
		for (int i : array)
		{
			System.out.print(i+"  ");
		}
	}

}
