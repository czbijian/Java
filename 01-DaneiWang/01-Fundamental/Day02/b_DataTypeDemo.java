public class b_DataTypeDemo{
	public static void main(String[] args){
		//1.int:z���ͣ�4���ֽڣ�-21�����ڵ�21������
		int a1 = 250;  //250Ϊ����ֱ������Ĭ��Ϊint��
		//int b = 1000000000;  //�������100��Ĭ��Ϊint
		System.out.println(5/2);  //2,С��λ��������
		System.out.println(2/5);  //0,С��λ��������
		
		int c1 = 2147483647;  //int�����ֵ
		c1 = c1 + 1;  //��c�������֮����1
		System.out.println(c1);  //���Ϊ-2147483648
		
		//2.long�������ͣ�8���Լ����ܴ�ܴ�ܴ�
		long a2 = 250L;  //250LΪ������ֱ����
		//long b2 = 10000000000;  //�������100��Ĭ��Ϊint
		long c2 = 10000000000L;  //��ȷ
		
		long d2 = 1000000000*2*10L;
		System.out.println(d2);  //200��
		long e2 = 1000000000*3*10L;
		System.out.println(e2);	 //���
		long f2 = 1000000000L*3*10;//�������п����������Lд�ڵ�һ������֮��
		System.out.println(f2);	 //300��
		
		//��ȡ��1970��1.1��ʱ����ʱ�˿̵ĺ�����
		long g = System.currentTimeMillis();
		System.out.println(g);
		
		//3.double�������ͣ�8�����У��ܴ�ܴ�ܴ�
		double a3 = 3.14159;   //3.14159Ϊ������ֱ������Ĭ��Ϊdouble��
		float b3 = 3.141159f;  //3.14159FΪfloat��ֱ����
		
		double c3 = 3.0;
		double d3 = 2.9;
		System.out.println(c3-d3);  //0.10000000000000009  �����������
		
		//4.char:�ַ��ͣ�2���ֽ�
		char cc1 = '��';
		char cc2 = 'm';
		char cc3 = '5';
		char cc4 = ' ';
		//char cc5 = Ů;  //������󣬱������һ�ѵ�������
		//char cc6 = '';  //������󣬱������ַ�
		//char cc7 = '����';  //�������ֻ����һ���ַ�
		char cc8 = 97;  //��ȷ����ֵ������0��65525
		System.out.println(cc8);  //a,��Ϊcc8��������char�����Ի��Զ�Ӧ�ַ���ʽ���
		
		System.out.println(2+2);  //4
		System.out.println('2'+'2');  //100,'2'����50
		
		char cc9 = '\\';
		System.out.println(cc9);  //\
		
		//5.bool�������ͣ�1���ֽڣ�ȡֵֻ��true��false
		boolean bb1 = true;
		boolean bb2 = false;
		//boolean bb3 = 250;  //���󣬲����ݵ����ͣ�int�޷�ת��Ϊboolean 
		
		//�������ͼ��ת��
		int a6 = 5;
		long b6 = a6;  //�Զ�����ת����С����
		int c6 = (int)b6;  //ǿ������ת������С��
		System.out.println(c6);  //ǿת�п���������˴�û����� 5
		
		long d6 = 5;  //�Զ�����ת��
		double e6 = 5;  //�Զ�����ת��
		System.out.println(e6);
		
		long f6 = 100000000000L;
		int g6 = (int)f6;
		System.out.println(g);  //ǿת�п���������˴���� 1562313981649
		
		double h = 25.987;
		int i = (int)h;
		System.out.println(i);  //ǿת�п��ܶ�ʧ���ȣ�25
		
		byte b1 = 5;  //����ֱ��������ֱ�Ӹ�ֵ��byte��short��char
		byte b2 = 6;
		byte bb3 = (byte)(b1 + b2);  //�������byte��short��char�������ת��Ϊint
		System.out.println(bb3);
	}	
}