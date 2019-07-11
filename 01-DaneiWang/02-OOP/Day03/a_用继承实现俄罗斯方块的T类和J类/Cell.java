//格子类
public class Cell {
	int row;//行号
	int col;//列号
	Cell(int row, int col){
		this.row = row;
		this.col = col;
	}
	Cell(int n){
		this(n,n);
	}
	Cell(){
		this(0,0);
	}
	void drop() {//下落一格
		row++;
	}
	void drop(int n) {//下落N格
		row+=n;
	}
	void moveLeft(int n) {//左移n格
		col-=n;
	}
	void moveLeft() {//左移一格
		col--;
	}
	void moveRight(int n) {//右移n格
		col+=n;
	}
	void moveRight() {//右移一格
		col++;
	}
	String getCellInfo() {//获取行号和列号
		return row+","+col;//返回行列号
	}
}
