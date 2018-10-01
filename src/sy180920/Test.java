package sy180920;

public class Test
{

	public static void main(String[] args)
	{
		Player player=new Player();
		Erhu erhu = new Erhu();
		Violin violin = new Violin();
		player.show(new Piano());
		player.show(erhu);
		player.show(violin);

	}

}
