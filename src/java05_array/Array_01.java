package java05_array;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		
		int num;
		
		num = 123;
		
		//----------------
		// int�� �迭 ���� ����

		int[] arr;	// �迭 ���� ���� (������)
		arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60;	//ArrayIndexOutOfBoundsException : 5
		
		
		//�ݺ����� �̿��� �迭�� ����
		for(int i = 0; i < 5; i++) {	// i, 0~4, 5��
			arr[i] = (i+1) * 100;
		}

		
		//�ݺ����� �̿��� �迭�� ���
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
		
		
		//�迭�� �̸��� ����ϱ�
		System.out.println(arr); //[I@2a139a55 int�� �迭�� at �ּ� - ������, Reference
		
		
	}

}
