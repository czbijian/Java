public class d_NstInnerClassDemo {

	public static void main(String[] args) {
		//1.������inter2��һ�����࣬û������
		//2.Ϊ�����ഴ����һ�����󣬽�o1
		//3.�������е�Ϊ��������塣
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
