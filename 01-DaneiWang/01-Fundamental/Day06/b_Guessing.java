import java.util.Scanner;
public class b_Guessing{
	public static void main(String[] args){
		char[] chs = generate();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true){
			System.out.println("�°�:");
			String str = scan.next().toUpperCase();//��ȡ�û�������ַ�������ת��Ϊ��д
			if(str.equals("EXIT")){
				System.out.println("�´�������");
				break;
			}
			char[] input = str.toCharArray();  //���ַ�������ת��Ϊ�ַ�����
			int[] result = check(chs, input);
			if(result[0] == chs.length){  //�¶���
				int score = 100*chs.length - 10*count;
				System.out.println("��ϲ�㣬�¶��ˣ��÷�Ϊ:"+score);
				break;
			}else{
				count++;
				System.out.println("�ַ��Ը�����"+result[1]+"��λ�öԸ���"+result[0]);
			}
		}
		scan.close();
	}
	
	//ȥ��������������ظ������֣��������������ظ����Ǹ�����
	public static char[] removeDuplicates(int index, char[] arr){
		for(int i = 0; i < index; i++){
			if(arr[index] == arr[i]){
				arr[index] = (char)(Math.random()*26+65);
				arr = removeDuplicates(index, arr);
			}
		}
		return arr;
	}
	
	//��������ַ�����
	public static char[] generate(){
		char[] chs = new char[5];
		for(int i = 0; i < 5; i++){
			int num = (int)(Math.random()*26)+65;
			chs[i] = (char)num;
			if(i != 0){
				chs = removeDuplicates(i, chs);
			}
			System.out.print(chs[i]+" ");
		}
		return chs;
	}
	
	//�Աȣ�����ַ��������û�������ַ�����
	public static int[] check(char[] chs, char[] input){
		int[] result = new int[2];  //�ԱȽ��
		for(int i = 0; i < chs.length; i++){
			for(int j = 0; j < input.length; j++){
				if(chs[i] == input[j]){
					result[1]++;  //�ַ���
					if(i == j){
						result[0]++;  //λ�ö�
					}
					break;  //��input�ַ�ƥ���input���ַ����ñȽ�
				}
			}
		}
		return result;
	}
}