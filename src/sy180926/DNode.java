package sy180926;



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