public class c_RefArrayDemo{
	public static void main(String args[]){
		/*	b_Cell[] b_Cells = new b_Cell[4];
		b_Cells[0] = new b_Cell(2,5);
		b_Cells[1] = new b_Cell(3,6);
		b_Cells[2] = new b_Cell(4,7);
		b_Cells[3] = new b_Cell(5,8);*/
		
		b_Cell[] Cells = new b_Cell[] {
			new b_Cell(2,5),
			new b_Cell(3,6),
			new b_Cell(4,7),
			new b_Cell(5,8)
		};
		
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[2];
		arr[1][0] = 100;
		
		int[][] arr2 = new int[3][4];
		for(int i = 0 ; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = 100;
				System.out.println(arr2[i][j] + " i:"+i +" j:" + j);
			}
		}
	}
}