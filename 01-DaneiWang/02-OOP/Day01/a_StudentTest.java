public class a_StudentTest{
	public static void main(String[] args){
		//创建一个学生对象
		a_Student zs = new a_Student();
		//给成员变量赋值
		zs.name = "zhangsan";
		zs.age = 25;
		zs.address = "廊坊";
		//调用方法
		zs.Study();
		zs.sayHi();
		
		a_Student ls = new a_Student();
		ls.name = "lisi";
		ls.age = 26;
		ls.address = "黑龙江哈木斯";
		ls.Study();
		ls.sayHi();
		
		a_Student ww = new a_Student();
		ww.Study();
		ww.sayHi();
	}
}