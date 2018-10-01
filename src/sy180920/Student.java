package sy180920;

public class Student extends Person
{
	public Student()
	{
		super();
	}

	private boolean sex;

	public boolean isSex()
	{
		return sex;
	}

	public void setSex(boolean sex)
	{
		this.sex = sex;
	}

	public Student(String nameString, int age,boolean sex)
	{
		super(nameString,age);
		this.sex = sex;
	}
	
}
