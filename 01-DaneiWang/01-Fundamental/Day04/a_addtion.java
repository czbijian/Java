import java.util.Scanner;
//����ӷ�������
public class a_addtion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int score = 0;  //�ܷ�
		for(int i = 1; i <= 10; i++){  //ѭ��10��
			int a = (int)(Math.random()*100);  //����a
			int b = (int)(Math.random()*100);  //����b
			int result = a + b;  //���
			System.out.println("("+i+")"+a+"+"+b+"=?");
			
			System.out.println("���");
			int answer = scan.nextInt();  //2.����
			
			if(answer == -1){
				break;
			}	
			if(answer == result){  //3.����
				System.out.println("�����");
				score += 10;  //���һ���10��
			}else{
				System.out.println("�����");
			}
		}
		System.out.println("�ܷ�Ϊ��"+score);
	}
}