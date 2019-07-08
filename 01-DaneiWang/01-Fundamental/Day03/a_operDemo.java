//运算符的演示
public class a_operDemo{
	public static void main(String[] args){
		/*
		* 1.算术运算符：+、-、*、/、%、 ++、 --
		* 1)%:取模/取余，余数为0即为整除
		* 2)++/--：自增1/自减1，可以在变量前也可在变量后
		*	2.1)单独使用时，在前灾后无差别
		*   2.2)被使用时，在前在后有区别
		*		a++的值为a
		*		++a的值为a+1
		*/
		System.out.println(5%2);     	//1,商2余1
		System.out.println(8%2);		//0，商4余0
		System.out.println(2%8);		//2，商0余2
		System.out.println(8.456%2);	//0.4559999999999995 只做了解
		
		int a=5,b=5;
		int c = a++;
		int d = ++b;
		System.out.println(a);  //6
		System.out.println(b);  //6
		System.out.println(c);  //5
		System.out.println(d);  //6
	}
}