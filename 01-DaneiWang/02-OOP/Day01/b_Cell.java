public class b_Cell{
	int row; //�к�
	int col;  //�к�
	void drop(){
		row++;
	}
	void moveLeft(int n){//����n��
		col -= n;
	}
	void moveRight(int n){//����n��
		col += n;
	}
	String getCellInfo(){  //��ȡ�кź��к�
		return row + "," + col;   //�������к�
	}
}