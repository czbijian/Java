//���������ʾ
public class a_operDemo{
	public static void main(String[] args){
		/*
		* 1.�����������+��-��*��/��%�� ++�� --
		* 1)%:ȡģ/ȡ�࣬����Ϊ0��Ϊ����
		* 2)++/--������1/�Լ�1�������ڱ���ǰҲ���ڱ�����
		*	2.1)����ʹ��ʱ����ǰ�ֺ��޲��
		*   2.2)��ʹ��ʱ����ǰ�ں�������
		*		a++��ֵΪa
		*		++a��ֵΪa+1
		*/
		System.out.println(5%2);     	//1,��2��1
		System.out.println(8%2);		//0����4��0
		System.out.println(2%8);		//2����0��2
		System.out.println(8.456%2);	//0.4559999999999995 ֻ���˽�
		
		int a=5,b=5;
		int c = a++;
		int d = ++b;
		System.out.println(a);  //6
		System.out.println(b);  //6
		System.out.println(c);  //5
		System.out.println(d);  //6
	}
}