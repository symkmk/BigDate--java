package sy180920;

class Sample {
	public static void main(String[] args) {
		Base base= new Child();
		int a=base.age;
		System.out.println(a);
		base.methodB();
	}
}

class Base {
	public int age=1;
	public void method(){
		System.out.print ("Base method");
	}
	public void methodB(){
		System.out.print ("Base2 methodB");
	}
}

class Child extends Base{	
	public int age=2;
	public void methodB(){
		System.out.print ("Child methodB");
	}
}
