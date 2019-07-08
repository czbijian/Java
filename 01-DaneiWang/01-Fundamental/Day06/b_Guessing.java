import java.util.Scanner;
public class b_Guessing{
	public static void main(String[] args){
		char[] chs = generate();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true){
			System.out.println("猜吧:");
			String str = scan.next().toUpperCase();//获取用户输入的字符串并且转化为大写
			if(str.equals("EXIT")){
				System.out.println("下次再来吧");
				break;
			}
			char[] input = str.toCharArray();  //把字符串类型转换为字符数组
			int[] result = check(chs, input);
			if(result[0] == chs.length){  //猜对了
				int score = 100*chs.length - 10*count;
				System.out.println("恭喜你，猜对了，得分为:"+score);
				break;
			}else{
				count++;
				System.out.println("字符对个数："+result[1]+"，位置对个数"+result[0]);
			}
		}
		scan.close();
	}
	
	//去除随机数组里面重复的数字，并且重新生成重复的那个数字
	public static char[] removeDuplicates(int index, char[] arr){
		for(int i = 0; i < index; i++){
			if(arr[index] == arr[i]){
				arr[index] = (char)(Math.random()*26+65);
				arr = removeDuplicates(index, arr);
			}
		}
		return arr;
	}
	
	//随机生成字符数组
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
	
	//对比，随机字符数组与用户输入的字符数组
	public static int[] check(char[] chs, char[] input){
		int[] result = new int[2];  //对比结果
		for(int i = 0; i < chs.length; i++){
			for(int j = 0; j < input.length; j++){
				if(chs[i] == input[j]){
					result[1]++;  //字符对
					if(i == j){
						result[0]++;  //位置对
					}
					break;  //与input字符匹配后，input后字符不用比较
				}
			}
		}
		return result;
	}
}