package java05_array.array2D;

public class ArrayQuiz_02 {
	public static void main(String[] args) {
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		//----------------------------------------------------
		
		//Q1.
		System.out.println("- - - ���� 1�� - - -");
		int[] invert_arr = new int[arr.length];
		
		//arr�� ������ �ε������� �Ųٷ� �����ϱ�
		for(int i=0; i<invert_arr.length; i++) {
			invert_arr[i] = arr[invert_arr.length-1-i];
		}
		
		//��ü ���
		for(int i=0; i<invert_arr.length; i++) {
			System.out.print(invert_arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		
		
		
		//Q2.
		System.out.println("- - - ���� 2�� - - -");
		int evenSum = 0; //¦���ε����� ��
		int oddSum = 0; //Ȧ���ε����� ��
		
		int diff; //����
		
		//¦���ε��� ��, Ȧ���ε��� �� ���ϱ�
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) { //¦�� �ε���
				evenSum += arr[i];
			} else if(i%2!=0) { //Ȧ�� �ε���
				oddSum += arr[i];
			}
		}
		
		//���� ���ϱ�
		diff = evenSum - oddSum;
		
		
		//���
		System.out.println("¦���ε�����-Ȧ���ε����� : " + diff);
		System.out.println("--------------------");
		
		
		
		
		//Q3.
		System.out.println("- - - ���� 3�� - - -");
		int[] rank_arr = new int[arr.length];

		//rank �迭�� ��� ���� 1�� �ʱ�ȭ
		for(int i=0; i<rank_arr.length; i++) {
			rank_arr[i] = 1;
		}
		
		//�ϳ��� �ε���(����)�� �ٸ� ��� �ε��� ��ҿ� ���Ѵ�
		//���� �ε��������� ū ���ڰ� ������ rank�� 1 ������Ų��
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					rank_arr[i]++;
				}
			}
		}
		
		//��ü ���
		for(int i=0; i<rank_arr.length; i++) {
			System.out.print(rank_arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------");

		
		
		
		//Q4.
		System.out.println("- - - ���� 4�� - - -");
		int[] over_arr = new int[10]; //�ߺ���
		int[] ret_arr = new int[10]; //�ߺ��� �ƴ� ��
		
		//i��° ��Ҹ� �������� �ٸ� ��� ��ҿ� ��
		for(int i=0; i<arr.length; i++) {
			
			//i��° ����� �ߺ����� �ִ��� ���� �����ϴ� ����
			boolean isOverlap = false;
			
			//�ߺ����� ã���� true�� ����
			for(int j=0; j<arr.length; j++) {
				if( arr[i] == arr[j] && i!=j ) {
					isOverlap = true;
					break;
				}
			}

			//�̹� �ߺ������� �� ������ �Ǵ�
			boolean isExist = false;
			for(int k=0; k<over_arr.length; k++) {
				isExist = false;
				if(over_arr[k] == arr[i]) {
					isExist = true;
					break;
				}
			}
			
			//�̹� �ߺ������� �Ǵܵ� ���� ��� �ǳʶٱ�
			if( isExist ) {
				continue;
			}
			
			if(isOverlap) { //�ߺ����� ������
				over_arr[i] = arr[i];
			} else { //�ߺ����� ������
				ret_arr[i] = arr[i];
			}
		}

		//����
		for(int m=0; m<over_arr.length-1; m++) {
			for(int n=0; n<over_arr.length-1-m; n++) {
				if(over_arr[n] > over_arr[n+1]) {
					//����
					int tmp = over_arr[n];
					over_arr[n] = over_arr[n+1];
					over_arr[n+1] = tmp;
				}
			}
		}
		
		//����
		for(int m=0; m<ret_arr.length-1; m++) {
			for(int n=0; n<ret_arr.length-1-m; n++) {
				if(ret_arr[n] > ret_arr[n+1]) {
					//����
					int tmp = ret_arr[n];
					ret_arr[n] = ret_arr[n+1];
					ret_arr[n+1] = tmp;
				}
			}
		}
		
		//�ߺ��� ��ü ���
		for(int i=0; i<over_arr.length; i++) {
			if(over_arr[i]!=0) { //0�� ������� ����
				System.out.print(over_arr[i] + " ");
			}
		}
		System.out.println();
		
		//�ߺ��� ���� �� ��ü ���
		for(int i=0; i<ret_arr.length; i++) {
			if(ret_arr[i]!=0) { //0�� ������� ����
				System.out.print(ret_arr[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("--------------------");

	}
}
















