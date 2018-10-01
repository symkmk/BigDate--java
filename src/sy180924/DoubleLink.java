package sy180924;

//表头
//节点个数
//构造双向链表
//链表表头 为空不存数据
//表头的前驱后继都是自己
//没有节点，空的

	//返回节点数目
	
	//判断链表是否为空
	
	//获取index位置的节点
	
		//二分正着找
		//指针下移，依次遍历
		//表头的前一个就是最后一个
		
		//比如 index=7，mCount=10
		//就是从10-7-1=2（下标从0）
		//就是找 10  9  的前面那个
		
	//获取index位置节点的值
	//获取第一个位置的节点值
	//获取最后一个位置的节点值
	
	//前插
	
			//跟自己串起来
			
		//比如我要插在第二个数的前面 index=2
		
		//新来一个节点，在这个下标前面
		//这句话指的是这个新来的是inode的前驱是新来的前驱，inode是新来的后继
		
		//inode的前一个的后继是这个新来的
	
		//inode.next=tnode;这不对
		//改正如下
		//inode的前一个是这个新来的
	//插入第一个位置
	
	// 将节点追加到链表的末尾
	//删除
	//删除第一个
	//删除最后一个
	
//======================================
//表头
//节点个数
//构造双向链表
//链表表头 为空不存数据
//表头的前驱后继都是自己
//没有节点，空的
public class DoubleLink<T>
{
	private DNode<T> mhead;
	private int mCount;
	public DoubleLink()
	{
		mhead=new DNode<T>(null,null,null);
		mhead.prev=mhead.next=mhead;
		mCount=0;
	}
	public DNode<T> getNode(int index)
	{
		if(index<0||index>=mCount)
			throw new IndexOutOfBoundsException();
		if(index<=mCount/2)
		{
			DNode<T> node=mhead.next;
			for(int i=0;i<index;i++)
				 node=node.next;
			return node;
		}
		DNode<T> node=mhead.prev;
		for(int j=0;j<mCount-index-1;j++)
			node=node.prev;
		return node;
	}
	public T get(int index)
	{
		return getNode(index).value;
	}
	public void insert(int index,T t)
	{
		if(index==0)
		{
			DNode<T> node = new DNode<T>(t,mhead,mhead.next);
			mhead.next.prev=node;
			mhead.next=node;
			mCount++;
			return;
		}
		DNode<T> inode=getNode(index);
		DNode<T> tnode = new DNode<T>(t,inode.prev,inode);
		inode.prev.next=tnode;
		inode.prev=tnode;
		mCount++;
		return;
	}
	public void insertFirst(T t)
	{
		insert(0, t);
	}
	public void appendLast(T t)
	{
		DNode<T> node=new DNode<T>(t, mhead.prev, mhead);
		mhead.prev.next=node;
		mhead.prev=node;
		mCount++;
	}
	public void del(int index)
	{
		DNode<T> node=getNode(index);
		node.prev.next=node.next;
		node.next.prev=node.prev;
		mCount--;
	}
	public boolean isEmpty()
	{
		return mCount==0;
	}
	public int size()
	{
		return mCount;
	}
}

