package 静态关键字;


public class 构造方法 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("lisi",17);
		System.out.println(s1.name+"==="+s1.age);
		System.out.println(s2.name+"==="+s2.age);
		
	}

}
