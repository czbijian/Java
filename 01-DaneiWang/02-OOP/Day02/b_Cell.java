public class b_Cell{
	int row; //�к�
	int col;  //�к�
	b_Cell(int row, int col){
		this.row = row;
		this.col = col;
	}
	b_Cell(int n){
		this(n, n);
	}
	b_Cell(){
		this(0, 0);
	}
	
	void drop(){  //����һ��
		row++;
	}
	void drop(int n){  //����N��
		row += n;
	}
	void moveLeft(int n){//����n��
		col -= n;
	}
	void moveLeft(){  //����һ��
		col--;
	}
	void moveRight(){  //����һ��
		col++;
	}
	void moveRight(int n){//����n��
		col += n;
	}
	String getCellInfo(){  //��ȡ�кź��к�
		return row + "," + col;   //�������к�
	}
}