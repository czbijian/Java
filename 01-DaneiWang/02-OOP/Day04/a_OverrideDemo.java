public class a_OverrideDemo {

	public static void main(String[] args) {
		Aoo o1 = new Aoo();
		o1.show();  //����show
		
		Boo o2 = new Boo();
		o2.show();  //����show
		
		Aoo o3 = new Boo();
		o3.show();  //����show
	}

}
class Aoo{
	void show() {
		System.out.println("����show");
	}
}
class Boo extends Aoo{
	void show() {
		//super.show();  //���ø����show����
		System.out.println("����show");
	}
}