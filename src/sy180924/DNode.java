package sy180924;

//双向链表“节点” 泛型
//前驱
//后继
//存储类型的值
//构造双向链表
public class DNode<T>
{
	public T value;
	public DNode prev;
	public DNode next;
	public DNode(T value, DNode prev, DNode next)
	{
		super();
		this.value = value;
		this.prev = prev;
		this.next = next;
	}
	
	
}