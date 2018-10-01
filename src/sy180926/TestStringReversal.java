package sy180926;

public class TestStringReversal
{
	public static void main(String[] args)
	{
		  GeneralArrayStack<Character> stack = new GeneralArrayStack(Character.class);
		    String str = "how are you";
		    char[] cha = str.toCharArray();
		    for(char c : cha){
		        stack.push(c);
		    }
		    while(!stack.isEmpty()){
		        System.out.print(stack.pop());
		    }

	}
}
