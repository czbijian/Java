public class b_Hoo {
	public int a;		//任何类
	protected int b;	//本类、子类、同包类
	int c;				//本类、同包类
	private int d;		//本类
	
	void show() {
		a = 1;
		b = 2;
		c = 3; 
		d = 4;
	}
}

class Ioo{

	void show(){
		Hoo o = new Hoo();
		o.a = 1;
		o.b = 2;
		o.c = 3;
		//o.d = 4;//编译错误
	}

}