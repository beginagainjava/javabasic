package java05_array;

public class Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڿ�
		String st = "Apple";
		
		//-----------------------
		
		String[] strArr; //���ڿ� �迭 ����
		strArr = new String[3]; //�迭 ����
		
		//�迭�� �� ����
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
		for(String s : strArr) {
			System.out.println(s);
		}
		System.out.println(strArr.length);
		System.out.println("------");

	
	}

}
