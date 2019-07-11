public class Tetromino{
	Cell[] cells;  //格子数组
	Tetromino(){
		cells = new Cell[4];
	}
	void drop() {
		for(int i = 0; i < cells.length; i++) {
			cells[i].row++;
		}
	}
	
	void moveLeft() {
		for(int i = 0; i < cells.length; i++) {
			cells[i].col--;
		}
	}
	
	void moveRight() {
		for(int i = 0; i < cells.length; i++) {
			cells[i].col++;
		}	
	}
	
	void print() {//测试--输出每个格子的行列号
		for(int i = 0; i < cells.length; i++) {
			String str = cells[i].getCellInfo();
			System.out.println(str);
		}
	}
}