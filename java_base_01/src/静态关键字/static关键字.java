package ¾²Ì¬¹Ø¼ü×Ö;


public class static¹Ø¼ü×Ö {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//static¹Ø¼ü×Ö
		Teacher.age=30;
		Teacher.sleep();
		System.out.println(Teacher.age);
//		System.out.println(Teacher.name);
		System.out.println("====");
		Teacher teacher = new Teacher();
		teacher.name="µËÎ°";
		teacher.eat();
		System.out.println(teacher.name);
		System.out.println(teacher.age);
		teacher.sleep();
		

	}

}
