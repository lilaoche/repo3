package 多态;

public class Phone implements USBInterface,USBInterface2{
	//Phone实现了一个接口
	//重写
	public void install() {
		System.out.println("install");		
	}
	//重写
	public void work() {
		System.out.println("work");		
	}
	public void install2() {
		System.out.println("install2");
		
	}
	public void work2() {
		System.out.println("work2");			
	}
}
