//��Ա�ڲ������ʾ
public class c_InnerClassDemo {

	public static void main(String[] args) {
		Mama m = new Mama();
//		Baby b = new Baby();//��������ڲ�����ⲻ�߱��ɼ���		
	}
}

class Mama{//�ⲿ��
	private String name;
	Baby createBaby(){
		return new Baby();
	}
	class Baby{//�ڲ���
		public void showMamaName() {
			System.out.println(name);
			System.out.println(Mama.this.name);
//			System.out.println(this.name);
		}
	}
}
