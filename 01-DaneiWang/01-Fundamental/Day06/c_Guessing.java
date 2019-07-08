import java.util.Scanner;
public class c_Guessing {

	public static void main(String[] args) {
		char[] chs = generate();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.println("猜吧");
			String str = scan.next().toUpperCase();
			if(str.equals("EXIT")) {
				System.out.println("下次再来吧");
				break;
			}
			char[] input = str.toCharArray();
			int[] result = check(chs, input);
			if(result[0] == chs.length) {
				int score = 100*chs.length-10*count;
				System.out.println("猜对了，得分为"+score);
			}else {
				count++;
				System.out.println("字符对个数"+result[1]+"位置对个数:"+result[0]);
			}			
		}
		scan.close();
		
	}
	
	public static char[] generate() {
		char A[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean B[] = new boolean[A.length];
		for(int i = 0; i < A.length; i++) {
			B[i] = false;
		}
		char[] chs = new char[5];
		for(int i = 0; i < chs.length; i++) {
			int x = 0;
			do {
				x = (int)(Math.random()*26);
			}while(B[x] == true);
			chs[i] = A[x];
			B[x] = true;
			System.out.print(chs[i]+ " ");
		}
		return chs;
	}
	
	public static int[] check(char[] chs, char[] input) {
		int[] result = new int[2];
		for(int row=0; row < chs.length; row++) {
			for(int j=0; j < input.length; j++) {
				if(chs[row] == input[j]) {
					result[1]++;
					if(row == j) {
						result[0]++;
					}
					break;
				}
			}
		}
		return result;
	}

}
