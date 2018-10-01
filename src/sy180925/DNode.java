package sy180925;

//双向链表“节点” 泛型
//前驱
//后继
//存储类型的值

public class DNode<T>
{
	public T value;
	public DNode prev;
	public DNode next;
	public DNode(T value, DNode prev, DNode next)
	{
		
		this.value = value;
		this.prev = prev;
		this.next = next;
	}
	
	
}