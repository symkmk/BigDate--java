package sy180921;

/**
 * @author suyuan
 *1. 封装 Person 类 , 有 name  age  sex  属性 , 有 吃饭 睡觉 能力  有自我介绍方法
 */
public class Person
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public boolean isSex()
	{
		return sex;
	}
	public void setSex(boolean sex)
	{
		this.sex = sex;
	}
	private int age;
	private boolean sex;
	
	public void Eat()
	{
		
	}
	
	public void Sleep()
	{
		
	}
	
	public void Show()
	{
		System.out.println("我是人类");
	}
	
}
