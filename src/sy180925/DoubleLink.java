package sy180925;

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
		mhead=new DNode<T>(null, null, null);
		mhead.next=mhead.prev=mhead;
		mCount=0;
				
	}
	public DNode<T> getNode(int index)
	{
		if(index<0||index>=mCount)
			throw new IndexOutOfBoundsException();
		if(index<=mCount/2)
		{
			DNode<T>node=mhead.next;
			for(int i=0;i<index;i++)
				node=node.next;
			return node;
		}
		DNode<T>node=mhead.prev;
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
			DNode<T>node=new DNode<T>(t, mhead, mhead.next);
			mhead.next.prev=node;
			mhead.next=node;
			mCount++;
			return;
		}
		DNode<T>node=getNode(index);
//		DNode<T> newnode=new DNode<T>(t, node.prev, node);
//		node.prev.next=newnode;
//		node.prev=newnode;
		node.prev=node.prev.next=new DNode<T>(t, node.prev, node);
		mCount++;
		return;
		
	}
	public void insertFirst(T t)
	{
		insert(0, t);
	}
	public void appendLast(T t)
	{
		DNode<T> newnode=new DNode<T>(t, mhead.prev, mhead);
		mhead.prev.next=newnode;
		mhead.prev=newnode;
		mCount++;
	}
	public void del(int index)
	{
		DNode<T>node=getNode(index);
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

