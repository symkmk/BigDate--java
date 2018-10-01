package sy180920;

public class Person
{
	public Person()
	{
		super();
	}
	public String getNameString()
	{
		return nameString;
	}
	public void setNameString(String nameString)
	{
		this.nameString = nameString;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	private String nameString;
	private int age;
	public Person(String nameString, int age)
	{
		super();
		this.nameString = nameString;
		this.age = age;
	}
}
