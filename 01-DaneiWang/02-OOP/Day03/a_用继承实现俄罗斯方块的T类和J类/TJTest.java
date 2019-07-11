//T类和J类的测试类
public class TJTest {

	public static void main(String[] args) {
		Tetromino o1 = new T(2,5);//向上造型
		printWall(o1);//先造型后传值
		
		J o2 = new J(2,5);
		printWall(o2);//传值的同时自动造型
		
		
	}
	
	//打墙+打T型
	public static void printWall(Tetromino t) {
		Cell[] cells = t.cells;//获取T型的cells并存储在cells引用中。
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 10; j++) {
				boolean flag = false;//假设打-
				for(int k = 0; k < cells.length; k++) {
					if(i == cells[k].row && j==cells[k].col) {
						flag = true;
						break;
					}
				}
				if(flag) {
					System.out.print("* ");
				}else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}
	
	//打墙+打T型
/*	public static void printWall(T t) {
		Cell[] cells = t.cells;//获取T型的cells并存储在cells引用中。
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 10; j++) {
				if(   i==cells[0].row && j==cells[0].col
					||i==cells[1].row && j==cells[1].col
					||i==cells[2].row && j==cells[2].col
					||i==cells[3].row && j==cells[3].col
						) {
					System.out.print("* ");
				}else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}*/

}
