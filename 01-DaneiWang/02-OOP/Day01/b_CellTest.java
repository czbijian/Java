public class b_CellTest{
	public static void main(String[] args){
	/*	b_Cell c = new b_Cell();  //�������Ӷ���
		c.row = 2;  //���ʳ�Ա����
		c.col = 5;  
		c.drop();
		c.moveLeft(3);
		String str = c.getCellInfo();
		System.out.println(str);*/
		
		b_Cell c = new b_Cell();
		c.row = 2;
		c.col = 5;
		System.out.println("ԭʼλ�ã�");
		printWall(c);
		
		c.drop();
		System.out.println("�����");
		printWall(c);
		
		c.moveLeft(3);
		System.out.println("���ƺ�");
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
			System.out.println();//����
		}
	}
}