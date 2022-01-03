package 静态关键字;

public class Student {
	String name;
	int age;
	public void study(){
		System.out.println("学生学习");
	}
	public Student(String name, int age) {
		//this关键字代表本类对象,调用成员属性,解决就近原则的问题
		this.name = name;
		this.age = age;
	}
	public Student() {
		// 无参构造
	}
	public void sleep(){
		System.out.println("学生睡觉");
	}

}
