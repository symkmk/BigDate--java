package sy180928;

public class PriheapTest
{

	public static void main(String[] args) throws Exception
	{
		PriorityQueue priorityQueue = new PriorityQueue();
		priorityQueue.enQueue(3);
		priorityQueue.enQueue(7);
		priorityQueue.enQueue(3);
		priorityQueue.enQueue(1);
		priorityQueue.enQueue(44);
		priorityQueue.enQueue(41);
		priorityQueue.enQueue(14);
		priorityQueue.enQueue(6);
		System.out.println();
		priorityQueue.show();
		System.out.println();
		System.out.println("出队"+priorityQueue.deQueue());
		priorityQueue.show();
		System.out.println();
		System.out.println("出队"+priorityQueue.deQueue());
		priorityQueue.show();
		System.out.println();
		System.out.println("出队"+priorityQueue.deQueue());
		priorityQueue.show();
		System.out.println();
		System.out.println("出队"+priorityQueue.deQueue());
		priorityQueue.show();
		System.out.println();
		System.out.println("出队"+priorityQueue.deQueue());
		priorityQueue.show();
		System.out.println();
		System.out.println("出队"+priorityQueue.deQueue());
		priorityQueue.show();
		System.out.println();
		System.out.println("出队"+priorityQueue.deQueue());
		priorityQueue.show();
		System.out.println();

	}

}
