package 抽象方法;

public class 抽象类 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//抽象类
		Dog d = new Dog();
		d.eat();
		d.sleep();
//		下密码错误,因为抽象类不能被初始化
//		Animal a = new Animal();
	}
}
