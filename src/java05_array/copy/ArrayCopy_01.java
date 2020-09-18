package java05_array.copy;

public class ArrayCopy_01 {
	public static void main(String[] args) {
		
		int num1 = 100;
		int num2;
		
		num2 = num1;
		
		System.out.println(num2 + " , " + num1);
		System.out.println("------ ������ ���� �� ------");
		
		int[] arr1 = {10,20,30};
		int[] arr2;
		
		arr2 = arr1; //����
		//���� ���� (shallow copy)
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println( arr1[i] + " : " + arr2[i]);
		}
		
		System.out.println("------ ������ ���� �� ------");
		
		arr1[1] = 777;
	
		for(int i = 0; i < arr1.length; i++) {
			System.out.println( arr1[i] + " : " + arr2[i]);
		}
		
	}

}
