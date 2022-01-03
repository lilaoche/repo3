package 封装;

public class Phone {
	private String brand;
	private int price;
	public void setBrand(String brand){
		//这种封装方法提高了代码的可维护性
		//if语句提高了代码的安全性
		if (brand == "长城"){
			System.out.println("输入有误!");	
		}else{
			this.brand = brand;
		}
	}
	public String getBrand(){
		return this.brand;
	}
}
