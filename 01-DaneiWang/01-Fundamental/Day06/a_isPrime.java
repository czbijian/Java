public class a_isPrime{
	public static void main(String[] args){
		boolean flag = true;  //����������
		int num = 9;
		//for(int i = 2; i < num ; i++){    
		//for(int i = 2; i < num/2 ; i++){    //��һ���Ż�
		for(int i = 2; i <=Math.sqrt(num) ; i++){    //�ڶ����Ż�
			if(num % i == 0){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println(num+"������");
		}else{
			System.out.println(num+"��������");
		}
	}
}