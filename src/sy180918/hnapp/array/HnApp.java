package sy180918.hnapp.array;

import java.util.Arrays;
import java.util.Scanner;

public class HnApp {
	static Scanner sc = new Scanner(System.in); // 成员变量  提高作用域
	
	static int[] users = new int[2]; // 存储 用户名
	static int[] pswds = new int[2]; // 存储密码
	static int count; // 默认是 0 记录真实的用户个数
	
	static boolean userState ;// 默认是 false 用来记录登录状态
	static int userName ; // 当前登录用户的用户名
	
	
	public static void main(String[] args) {
		test: while(true){
				mainHtml();
				int next = sc.nextInt();
				switch (next) {
					case 1:	zhuce();break;
					case 2:	logon(); break;
					case 3:	setPswd();break;
					case 4:	System.out.println("退出");break test;
					default:
						System.out.println("非法字符");break;
				}
			}
		
	}
	
	
	/**
	 * 修改密码
	 */
	private static void setPswd() {
		if(!userState){
			System.out.println("请先登录 之后再来改密码");
			return ;
		}
		
		int i = 0;
		for( ; i < count ; i++){
			if(userName == users[i])
				break;
			
		}
		
		
		System.out.println("请输入新密码");
		int newPswd = sc.nextInt();
		
		pswds[i] = newPswd;
		System.out.println("密码修改成功 你已下线 请重新登录");
		userName = 0;
		userState = false;
		
	}


	/**
	 * 登录方法
	 */
	private static void logon() {
		if(userState){
			System.out.println("不能重复登录");
			return ;
		}
		
		System.out.println("欢迎来到登录页面");
		System.out.println("请输入登录的用户名");
		int user = sc.nextInt();
		System.out.println("请输入登录的密码");
		int pswd = sc.nextInt();
		
		
		// 判断用户在不在
		boolean flag = selectUser(user);
		
		if(flag){// 此时有用户
			
			// 判断密码是否对应  
			
			// 1. 找到 在数组中  user 的索引
			int i = 0;
			for( ; i < count ; i++){
				if(users[i] == user)
					break;
			}
			
			if( pswds[i] == pswd){
				System.out.println("欢迎登录");
				userState = true; // 修改登录状态
				userName = user;
			}else{
				System.out.println("密码错误");
			}
			
		}else{// 此时没有该用户
			System.out.println("用户 "+user+" 不存在");
		}
	}


	/**
	 * 注册的方法
	 */
	private static void zhuce() {
		// 键盘录入 用户
		System.out.println("欢迎来到注册页面");
		System.out.println("请输入注册的用户名");
		int user = sc.nextInt();
		System.out.println("请输入注册的密码");
		int pswd = sc.nextInt();
		
		
		// 查看用户是否已经存在
		boolean flag = selectUser(user);
		if(flag){
			System.out.println("用户 "+user+" 已经存在 , 请更换其他用户");
			return ;
		}
		
		
		// 增加存储介质的 容量
		if( count == users.length ){
			System.out.println("正在扩容");
			int oldLength = users.length ;
			int newLength = oldLength + (oldLength>>1);
			System.out.println(oldLength+"->"+newLength);
			users = Arrays.copyOf(users, newLength); // 1.5 倍扩容
			pswds = Arrays.copyOf(pswds, newLength);
			System.out.println(Arrays.toString(users));
		}
		
		
		// 写入 存储介质
		users[count] = user;
		pswds[count] = pswd;
		count++;
		System.out.println("用户 "+user+" 注册成功");
		System.out.println(Arrays.toString(users));
	}
	
	
	/**
	 * 查看 存储介质中  是否有指定的 user
	 * @return 规定 : 有该用户返回 true 
	 */
	public static boolean selectUser(int user){
		// 查看用户是否已经存在
		for(int i = 0 ; i < count ; i++){
			if(users[i] == user)
				return true;
		}	
		return false;
	}
	
	
	/**
	 * 主菜单页面
	 */
	public static void mainHtml(){
		System.out.println("=====欢迎来到    HnApp 后台系统========");
		System.out.println("=================================");
		System.out.println("----请按照提示进行操作----");
		
		System.out.println("输入1 : 注册用户");
		System.out.println("输入2 : 登录用户");
		System.out.println("输入3 : 修改密码");
		System.out.println("输入4 : 退出系统\n\n\n");
	}
}
