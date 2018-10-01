package sy180927;

public class PriTest
{

	public static void main(String[] args)
	{
		PriorityQue priorityQue = new PriorityQue(3);
		priorityQue.insert(5);
		priorityQue.insert(3);
		priorityQue.insert(8);
		System.out.println(priorityQue.peekMin());
		priorityQue.PrintArrayStack();
		

	}

}
