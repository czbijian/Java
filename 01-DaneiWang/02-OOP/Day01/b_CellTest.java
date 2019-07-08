public class b_CellTest{
	public static void main(String[] args){
	/*	b_Cell c = new b_Cell();  //创建格子对象
		c.row = 2;  //访问成员变量
		c.col = 5;  
		c.drop();
		c.moveLeft(3);
		String str = c.getCellInfo();
		System.out.println(str);*/
		
		b_Cell c = new b_Cell();
		c.row = 2;
		c.col = 5;
		System.out.println("原始位置：");
		printWall(c);
		
		c.drop();
		System.out.println("下落后：");
		printWall(c);
		
		c.moveLeft(3);
		System.out.println("左移后：");
		printWall(c);
	}
	public static void printWall(b_Cell cc) {
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 10; j++) {
				if(cc.row == i && cc.col == j) {
					System.out.print("* ");
				}else {
					System.out.print("- ");
				}
				
			}
			System.out.println();//换行
		}
	}
}