package sy180926;


public class DoubleLink<T>
{
	private DNode<T> mhead;
	private int mCount;
	public DoubleLink()
	{
		mhead=new DNode<T>(null, null, null);
		mhead.prev=mhead.next=mhead;
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
		for(int i=0;i<mCount-index-1;i++)
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
		DNode<T> node=getNode(index);
		DNode<T>newnode=new DNode<T>(t, node.prev, node);
		node.prev.next=newnode;
		node.prev=newnode;
		mCount++;
		return;
		
	}
	public void insertFirst(T t)
	{
		insert(0, t);
	}
	public void appendLast(T t)
	{
		DNode<T>node=new DNode<T>(t, mhead.prev, mhead);
		mhead.prev.next=node;
		mhead.prev=node;
		mCount++;
	}
	public void del(int index)
	{
		DNode<T>node=getNode(index);
		node.next.prev=node.prev;
		node.prev.next=node.next;
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

