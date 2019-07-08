public class b_CellTest{
	//格子类的测试类
	public static void main(String[] args){
		b_Cell c1 = new b_Cell();
		b_Cell c2 = new b_Cell(3);
		b_Cell c3 = new b_Cell(2,5);
		
		System.out.println("===================|");
		printWall(c1);
		System.out.println("===================|");
		printWall(c2);
		System.out.println("===================|");
		printWall(c3);
		System.out.println("===================|");
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