import java.util.Scanner;
public class c_ScannerDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = scan.nextInt();
		System.out.println("请输入单价：");
		double price = scan.nextDouble();
		
		System.out.println(age);
		System.out.println(price);
	}	
}