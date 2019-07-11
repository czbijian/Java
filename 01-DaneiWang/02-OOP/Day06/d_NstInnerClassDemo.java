public class d_NstInnerClassDemo {

	public static void main(String[] args) {
		//1.创建了inter2的一个子类，没有名字
		//2.为该子类创建了一个对象，叫o1
		//3.大括号中的为子类的类体。
		Inter2 o1 = new Inter2() {
			
		};
		final int num = 5;
		Inter3 o3 = new Inter3() {
			public void show() {
				System.out.println("showshow");
				System.out.println(num);
			}
		};
		o3.show();
	}

}

interface Inter3{
	public void show();
}

interface Inter2{
	
}
