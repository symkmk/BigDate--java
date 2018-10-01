package sy180918;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author suyuan
 *
 */
public class hnapp_array01
{
	//全局变量
	static Scanner scanner=new Scanner(System.in);
	static int[] users=new int[2];
	static int[] pwds=new int[2];
	static int count;
	static boolean userState;
	static int userName;
	public static void main(String[] args)
	{
		
		//while反复执行，标签跳出循环
	test:	while(true)
		{
			mainHtml();
			int next=scanner.nextInt();
			
			switch (next)
			{
			case 1:register();break;
			case 2:login();break;
			case 3:setPwd();break;
			case 4:System.out.println("退出");
			
			break test;
			default:
				System.out.println("非法字符");
				break;
			}
		}
	}
	private static void setPwd()
	{
		if(!userState)
		{
			System.out.println("请先登录");
			return;
		}
		int i=0;
		for(;i<count;i++)
		{
			if(userName==users[i])
				break;
		}
		System.out.println("请输入新密码");
		int newPwd=scanner.nextInt();
		pwds[i]=newPwd;
		System.out.println("密码修改成功请重新登陆");
		userName=0;
		userState=false;
		
	}
	private static void login()
	{
		if(userState)
		{
			System.out.println("不能重复登陆");
			return;
		}
		System.out.println("====欢迎来到登陆页面====");
		System.out.println("请输入登陆用户名");
		int user=scanner.nextInt();
		System.out.println("请输入登陆的密码");
		int pwd=scanner.nextInt();
		//判断用户有没有
		boolean flag=selectUser(user);
		if(flag)
		{
			int i=0;
			for(;i<count;i++)
			{
				if(users[i]==user)
					break;
			}
			if(pwds[i]==pwd)
			{
				System.out.println("~~~~~~~~~~欢迎登陆~~~~~~~~~");
				userState=true;
				userName=user;//
			}
			else {
				System.out.println("密码错误");
			}
		}
		else {
			System.out.println("用户"+user+"不存在");
		}
		
	}

	/*
	 * 主菜单页面
	 */
	public static void mainHtml()
	{
		System.out.println("\n\n===欢迎来到 海牛后台系统===");
		System.out.println("==========================");
		System.out.println("---请按照提示进行操作---");
		System.out.println("输入1:注册用户");
		System.out.println("输入2:登陆用户用户");
		System.out.println("输入3:修改密码");
		System.out.println("输入4:退出系统\n");
	}
	/*
	 * 注册
	 */
	public static void register()
	{
		System.out.println("欢迎来到注册页面");
		System.out.println("请输入注册的用户名");
		int user=scanner.nextInt();
		System.out.println("请输入注册的密码");
		int pwd=scanner.nextInt();
		
		//查看用户是否已经存在
		boolean flag=selectUser(user);
		if(flag)
		{
			System.out.println("用户"+user+"已经存在，请换一个");
			return;
		}
		//增加存储介质容量
		if(count==users.length)
		{
			System.out.println("正在扩容");
			int oldLength=users.length;
			int newLength=oldLength+(oldLength>>1);
			System.out.println(oldLength+"->"+newLength);
			users=Arrays.copyOf(users, newLength);
			pwds=Arrays.copyOf(pwds, newLength);
		}
		//写入存储介质
		users[count]=user;
		pwds[count]=pwd;
		count++;
		System.out.println("用户"+user+"注册成功");
	}
	private static boolean selectUser(int user)
	{
		for(int i=0;i<count;i++)
		{
			if(users[i]==user)
				return true;
		}
		return false;
	}

}
