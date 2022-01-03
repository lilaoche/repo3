package 多态;

public class 接口 {
	public static void main(String[] args) {
		// 接口
		Phone p = new Phone();
		p.work();
		p.install();
		p.work2();
		p.install2();
		//接口不能被初始化成一个对象,所以下面这句话是错误的
//		USBInterface usb = new USBInterface();
	}
}
