/*
 * ���䣺
 * 1.ͬһ���ļ��п��԰��������
 * 2.public���ε���ֻ����һ��
 * 3.public���ε���������ļ�����ͬ
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
	//int sayHi(){return 1;}//��������뷵��ֵ�����޹�
	
}