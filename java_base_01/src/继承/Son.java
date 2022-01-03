package 继承;


public class Son extends Father{
	public Son(){
//		代表调用父类的空参构造
//		super();
//		调用父类的构造
		super("李四",18);
		System.out.println("son构造初始化");
	}
	public void hello(){
		System.out.println("Hello");
//		super代表父类对象
		super.play();
		//调用父类的show方法
		super.show();
	}
	public void show(){
		//方法的重写
		//1.完全改造父类升级
		//2.在原有父类的基础上升级
		super.show();
		System.out.println("子类的show方法");
	}
}
