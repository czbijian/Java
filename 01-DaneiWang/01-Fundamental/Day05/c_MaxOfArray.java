import java.util.Arrays;
public class c_MaxOfArray{
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		int max = arr[0];   //�����һ��Ԫ��Ϊ���ֵ
		System.out.print("������Ϊ:");
		for(int i = 1; i < arr.length; i++) {  //����ʣ��Ԫ��
			if(arr[i] > max){
				max = arr[i];
			}
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		System.out.println("���ֵΪ:" + max);
		
		//����
		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length-1] = max; //�����ֵ��ֵ�����һ��Ԫ�غ����Ԫ��
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		//������ַ����У�Arrays.sort()�����������
		System.out.println("�����Ľ��Ϊ:");
		arr = Arrays.copyOf(arr,arr.length - 1);
		Arrays.sort(arr); //��arr��������
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		//ð�����򷽷�
		System.out.println("ð��������ʾ");
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
		System.out.println("�����Ľ��Ϊ:");
		for(int i = 0; i < arr2.length; i++){
			System.out.println(arr2[i]);
		}
	}
}