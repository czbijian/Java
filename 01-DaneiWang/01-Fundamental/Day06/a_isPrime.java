public class a_isPrime{
	public static void main(String[] args){
		boolean flag = true;  //假设是质数
		int num = 9;
		//for(int i = 2; i < num ; i++){    
		//for(int i = 2; i < num/2 ; i++){    //第一次优化
		for(int i = 2; i <=Math.sqrt(num) ; i++){    //第二次优化
			if(num % i == 0){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println(num+"是质数");
		}else{
			System.out.println(num+"不是质数");
		}
	}
}