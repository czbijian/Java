public class b_DataTypeDemo{
	public static void main(String[] args){
		//1.int:z整型，4个字节，-21个多亿到21个多亿
		int a1 = 250;  //250为整数直接量，默认为int型
		//int b = 1000000000;  //编译错误，100亿默认为int
		System.out.println(5/2);  //2,小数位被舍弃了
		System.out.println(2/5);  //0,小数位被舍弃了
		
		int c1 = 2147483647;  //int的最大值
		c1 = c1 + 1;  //在c本身基础之上增1
		System.out.println(c1);  //溢出为-2147483648
		
		//2.long：长整型，8个自己，很大很大很大
		long a2 = 250L;  //250L为长整型直接量
		//long b2 = 10000000000;  //编译错误，100亿默认为int
		long c2 = 10000000000L;  //正确
		
		long d2 = 1000000000*2*10L;
		System.out.println(d2);  //200亿
		long e2 = 1000000000*3*10L;
		System.out.println(e2);	 //溢出
		long f2 = 1000000000L*3*10;//建议若有可能溢出，将L写在第一个数字之后
		System.out.println(f2);	 //300亿
		
		//获取字1970。1.1零时到此时此刻的毫秒数
		long g = System.currentTimeMillis();
		System.out.println(g);
		
		//3.double：浮点型，8个自行，很大很大很大
		double a3 = 3.14159;   //3.14159为浮点型直接量，默认为double型
		float b3 = 3.141159f;  //3.14159F为float型直接量
		
		double c3 = 3.0;
		double d3 = 2.9;
		System.out.println(c3-d3);  //0.10000000000000009  存在舍入误差
		
		//4.char:字符型，2个字节
		char cc1 = '男';
		char cc2 = 'm';
		char cc3 = '5';
		char cc4 = ' ';
		//char cc5 = 女;  //编译错误，必须放在一堆单引号中
		//char cc6 = '';  //编译错误，必须有字符
		//char cc7 = '男性';  //编译错误，只能有一个字符
		char cc8 = 97;  //正确，数值必须在0到65525
		System.out.println(cc8);  //a,因为cc8的类型是char，所以会以对应字符形式输出
		
		System.out.println(2+2);  //4
		System.out.println('2'+'2');  //100,'2'的吗50
		
		char cc9 = '\\';
		System.out.println(cc9);  //\
		
		//5.bool，布尔型，1个字节，取值只有true和false
		boolean bb1 = true;
		boolean bb2 = false;
		//boolean bb3 = 250;  //错误，不兼容的类型，int无法转换为boolean 
		
		//基本类型间的转换
		int a6 = 5;
		long b6 = a6;  //自动类型转换（小到大）
		int c6 = (int)b6;  //强制类型转换（大到小）
		System.out.println(c6);  //强转有可能溢出，此处没有溢出 5
		
		long d6 = 5;  //自动类型转换
		double e6 = 5;  //自动类型转换
		System.out.println(e6);
		
		long f6 = 100000000000L;
		int g6 = (int)f6;
		System.out.println(g);  //强转有可能溢出，此处溢出 1562313981649
		
		double h = 25.987;
		int i = (int)h;
		System.out.println(i);  //强转有可能丢失精度，25
		
		byte b1 = 5;  //整数直接量可以直接赋值给byte，short，char
		byte b2 = 6;
		byte bb3 = (byte)(b1 + b2);  //编译错误，byte，short，char运算会先转换为int
		System.out.println(bb3);
	}	
}