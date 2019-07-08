public class b_Cell{
	int row; //行号
	int col;  //列号
	void drop(){
		row++;
	}
	void moveLeft(int n){//左移n格
		col -= n;
	}
	void moveRight(int n){//右移n格
		col += n;
	}
	String getCellInfo(){  //获取行号和列号
		return row + "," + col;   //返回行列号
	}
}