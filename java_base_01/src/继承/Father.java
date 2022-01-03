package 继承;


public class Father extends GrandFather{
	public String name;
	private int age;
	public Father(){
		System.out.println("Father构造初始化");
	}
	public Father(String name,int age){
		System.out.println("Father类有参构造");
		this.name = name;
		this.age = age;
	}
	public void show(){
		System.out.println("父类输出的show方法");
	}
	public void print(){
		System.out.println("print");
	}

}
