package 继承;


public class 继承 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 继承
		Son s = new Son();
		s.name="李四";
		s.show();
		System.out.println(s.name);
//		下面这个定义是错误的,因为子类不能继承父类的private类
//		类和类只能单继承,多层继承
//		一个类如果不继承任何类,自动继承Object类,Object是1所有类的祖宗
//		先初始化父类再初始化子类
//		s.age=18;
	}

}
