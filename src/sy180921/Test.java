package sy180921;

/**
 * @author suyuan
 *测试 :    在同一个文件中完成  类均定义在一个java 文件总    测试类为 公开类 
1. 封装 Person 类 , 有 name  age  sex  属性 , 有 吃饭 睡觉 能力  有自我介绍方法

2. 封装 Student 类  , 是 Person 子类 , 有 className 属性 , 有 id 属性 ， 
id 为自动分配 , 一旦确定不能更改   ， 重写自我介绍方法

3. 封装 Teacher 类 , 是 Person 子类    重写自我介绍方法

4. 编写测试类  ,   定义一个可以让 Person Teacher Student 自我介绍的方法  使用多态实现

5. 简述 static 作用 
静态修饰符，可以修饰变量、方法、类、代码块
优先加载，静态代码块只执行一次
依附于类不依赖于对象
在内存中永久存在，程序终止才回收

6. 简述 final 作用
修饰符，修饰方法、变量、类
代表不可变的变量，修饰类代表此类不可继承，方法不可重写

7. 谈谈你对 组合 的理解 
组合可以节省代码量相当于把多个功能组合在了一起，
要是多个地方都要这个功能能避免复制粘贴，
相当于表里的外键。
 */
public class Test
{
	//4. 编写测试类  ,   定义一个可以让 Person Teacher Student 自我介绍的方法 
	//使用多态实现
	public static void main(String[] args)
	{
		Show show = new Show();
		show.show(new Person());
		show.show(new Student());
		show.show(new Teacher());
	}
}
