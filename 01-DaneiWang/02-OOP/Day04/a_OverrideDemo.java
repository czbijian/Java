public class a_OverrideDemo {

	public static void main(String[] args) {
		Aoo o1 = new Aoo();
		o1.show();  //父类show
		
		Boo o2 = new Boo();
		o2.show();  //子类show
		
		Aoo o3 = new Boo();
		o3.show();  //子类show
	}

}
class Aoo{
	void show() {
		System.out.println("父类show");
	}
}
class Boo extends Aoo{
	void show() {
		//super.show();  //调用父类的show方法
		System.out.println("子类show");
	}
}