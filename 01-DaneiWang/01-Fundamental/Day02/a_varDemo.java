public class a_varDemo{
	public static void main(String[] args){
		//1.变量的声明
		//int a; //声明一个整型变量,名为a
		//int b,c,d; //声明三个整型变量，名为b,c,d
		
		//2.变量的命名
		int a1, a_6$, _$;
		//int a*b     //编译错误，名称中除了_、$不能出现其他符号
		//int 1a      //编译错误，不能以数字开头
		int m = 250;
		//System.out.println(M); //编译错误，严格区分大小写
		//int class;  //编译错误，不能使用关键字
		int f ;       //正确，但不建议
		int 年龄;	  //正确，但不建议
		int nianLing; //正确，但不建议
		int age; 	  //建议“见名知意”
		int score, myScore, myJavaScore; //建议“驼峰命名法”
		
		//3.变量的初始化：第一次赋值
		//int a = 250; 	//声明的同时初始化，声明整型变量a并赋值为250
		//int b; 			//声明整型变量b
		//b = 250; 		//先声明后初始化，给变量b赋值为250
		
		//4.变量的使用
		//1)必须与数据类型匹配
		//2)对变量的使用就是对它所存的那个数的使用
		//3)变量在使用之前必须声明并初始化
		int a = 5;     //声明整型变量a并赋值为5
		int b = a+10;  //取出a的值5，加10后，再赋值给变量b
		a = a+5;       //取出a的值5，加10后，再赋值给a
		System.out.println(a);     //输出a的值15
		System.out.println("a");  //原样输出
		
	}	
}
