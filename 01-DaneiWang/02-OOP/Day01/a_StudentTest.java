public class a_StudentTest{
	public static void main(String[] args){
		//����һ��ѧ������
		a_Student zs = new a_Student();
		//����Ա������ֵ
		zs.name = "zhangsan";
		zs.age = 25;
		zs.address = "�ȷ�";
		//���÷���
		zs.Study();
		zs.sayHi();
		
		a_Student ls = new a_Student();
		ls.name = "lisi";
		ls.age = 26;
		ls.address = "��������ľ˹";
		ls.Study();
		ls.sayHi();
		
		a_Student ww = new a_Student();
		ww.Study();
		ww.sayHi();
	}
}