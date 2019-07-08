public class b_ArrayDemo{
	public static void main(String[] args){
		int[] arr = new int[10];
		int[] arr1 = {1,4,5,7};
		int[] arr2 = new int[] {1,4,5,7};
		int[] arr3 ;
		arr3 = new int[] {1,4,5,7};
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		System.out.println(arr[2]);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i*100;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]"+"="+arr[i]);
		}
		
		int[] larr = new int[4];
		int[] larr1 = {1,3,5,7};
		int[] larr2 = new int[] {1,3,5,7};
		larr[0] = 100;
		larr[1] = 200;
		System.out.println(larr[larr.length-1]);
		System.out.println("arr³¤¶ÈÎª£º"+larr.length);
	}
}