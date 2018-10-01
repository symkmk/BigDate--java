package sy180921;

/**
 * @author suyuan
 *2. 封装 Student 类  , 是 Person 子类 , 有 className 属性 , 有 id 属性 ， 
id 为自动分配 , 一旦确定不能更改   ， 重写自我介绍方法
 */
public class Student extends Person
{
	public Student()
	{
		super();
		id=count++;
	}
	private String className;
	private final  int id;
	private static int  count=2018001;
	
	public String getClassName()
	{
		return className;
	}
	public void setClassName(String className)
	{
		this.className = className;
	}
	public int getId()
	{
		return id;
	}
	public void Show()
	{
		System.out.println("我是学生");
	}

}
