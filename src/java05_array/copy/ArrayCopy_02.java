package java05_array.copy;

public class ArrayCopy_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,30};
		int[] arr2;
		
		//	1. ����� ���� Ȯ��(����) - Destination
		arr2 = new int[arr1.length];
		
		//	2. ������ ����	(for�� �̿��ϱ�)
	
		System.out.println("------ ������ ���� �� ------");
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		System.out.println("------ ������ ���� �� ------");
		
		arr1[1] = 777;
	
		for(int i = 0; i < arr1.length; i++) {
			System.out.println( arr1[i] + " : " + arr2[i]);
		}
		
		//	1. ����� ���� Ȯ��(����) - Destination
		arr2 = new int[arr1.length];
		
		//	2. ������ ����	(System Ŭ������ �迭 ���� �޼ҵ�(���) ���)
//				System.arraycopy(src, srcIdx, dest, destIdx, length)
//				src : ���� �迭
//				srcIdx : ���� �迭���� ���簡 ���۵� �ε���
//				dest : �纻 �迭
//				destIdx : �纻 �迭���� ���簡 ���۵� �ε���
//				length : ���簡 �� ����� ����
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		System.out.println("------ ������ ���� �� ------");
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		System.out.println("------ ������ ���� �� ------");
		
		arr1[1] = 555;
	
		for(int i = 0; i < arr1.length; i++) {
			System.out.println( arr1[i] + " : " + arr2[i]);
		}

	}

}
