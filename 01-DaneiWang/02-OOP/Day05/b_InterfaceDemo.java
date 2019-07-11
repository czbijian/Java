public class b_InterfaceDemo {

	public static void main(String[] args) {
//		Inter5 o1 = new Inter5();//编译错误，
		Inter6 o2 = new Eoo();//向上造型
		Inter5 o3 = new Eoo();//向上造型

	}

}



interface Inter5{
	void show() ;
}
interface Inter6 extends Inter5{
	void say();
}
class Eoo implements Inter6{
	public void say() {
		
	}
	public void show() {
		
	}
}


interface Inter3{
	void show();
}
interface Inter4{
	void say();
}
abstract class Doo{
	abstract void test();
}
class xoo extends Doo implements Inter3,Inter4{
	public void show() {
		
	}
	public void say() {
		
	}
	void test() {
		
	}
}


interface Inter2{
	void show();
	void say();
}

class Coo implements Inter2{
	public void show() {
		
	}
	public void say() {
		
	}
}

interface Inter1{
	public static final double PI = 3.14159;
	public abstract void show();//抽象方法
	
	int NUM = 250;//默认public static final
	void say();//默认public abstract
	
//	int count;//编译错误，常量必须声明同时初始化
//	void sayHi() {}//编译错误，接口中方法默认都是抽象方法
}
