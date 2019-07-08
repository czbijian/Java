public class b_CellTest2{
	public static void main(String[] args){
		b_Cell c1 = new b_Cell();
		b_Cell c2 = c1;
		c1.row = 2;
		c2.row = 5;
		System.out.println("c1.row="+c1.row);
		
		b_Cell c3 = null;
//		c3.row = 2;//NullPointerException
	}
}