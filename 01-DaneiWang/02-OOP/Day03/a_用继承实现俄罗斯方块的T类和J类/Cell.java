//������
public class Cell {
	int row;//�к�
	int col;//�к�
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
	void drop() {//����һ��
		row++;
	}
	void drop(int n) {//����N��
		row+=n;
	}
	void moveLeft(int n) {//����n��
		col-=n;
	}
	void moveLeft() {//����һ��
		col--;
	}
	void moveRight(int n) {//����n��
		col+=n;
	}
	void moveRight() {//����һ��
		col++;
	}
	String getCellInfo() {//��ȡ�кź��к�
		return row+","+col;//�������к�
	}
}
