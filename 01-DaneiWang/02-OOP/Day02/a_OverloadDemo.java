/*
 * 补充：
 * 1.同一个文件中可以包含多个类
 * 2.public修饰的类只能有一个
 * 3.public修饰的类必须与文件名相同
 * 
 * */
public class a_OverloadDemo {

	public static void main(String[] args) {
		Aoo o = new Aoo();
		o.sayHi();
		o.sayHi(25);
		o.sayHi("zhangshan");
		o.sayHi(25, "zhangsan");
		o.sayHi("zhangsan", 25);
	}

}

class Aoo{
	void sayHi() {
		
	}
	void sayHi(String name) {
		
	}
	void sayHi(int age) {
		
	}
	void sayHi(String name, int age){}
	void sayHi(int age, String name){}
	//int sayHi(){return 1;}//编译错误，与返回值类型无关
	
}