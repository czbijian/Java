import java.util.Arrays;
public class c_MaxOfArray{
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		int max = arr[0];   //假设第一个元素为最大值
		System.out.print("该数组为:");
		for(int i = 1; i < arr.length; i++) {  //遍历剩余元素
			if(arr[i] > max){
				max = arr[i];
			}
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		System.out.println("最大值为:" + max);
		
		//扩容
		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length-1] = max; //将最大值赋值给最后一个元素后面的元素
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		//排序各种方法中，Arrays.sort()方法排序最快
		System.out.println("排序后的结果为:");
		arr = Arrays.copyOf(arr,arr.length - 1);
		Arrays.sort(arr); //对arr升序排序
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		//冒泡排序方法
		System.out.println("冒泡排序演示");
		int[] arr2 = new int[10];
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = (int)(Math.random()*100);
			System.out.println(arr2[i]);
		}
		int tmp;
		for(int i = 0; i < arr2.length-1; i++){
			for(int j = 0; j < arr2.length-1-i; j++){
				if(arr2[j] > arr2[j+1]){
					tmp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = tmp;
				}
			}
		}
		System.out.println("排序后的结果为:");
		for(int i = 0; i < arr2.length; i++){
			System.out.println(arr2[i]);
		}
	}
}