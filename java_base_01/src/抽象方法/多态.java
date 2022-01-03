package 抽象方法;

public class 多态 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//多态
		Animal a = new Cat();
		Animal a2 = new Dog();
//		a.eat();
//		a.sleep();
//		a2.eat();
//		a2.sleep();
//		method(a);
//		method(a2);
//		向下转型(强转),a是cat类型,a是父类转成子类(向下转型(强转))
		Cat c = (Cat)a;
		c.play();
	}
	public static void method(Animal a){
		a.sleep();
	}
//	public static void method(Dog d){
//		d.sleep();
//	}
//	public static void method(Cat c){
//		c.sleep();
//	}
}
