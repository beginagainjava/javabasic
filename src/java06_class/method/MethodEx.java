package java06_class.method;

import java.util.Arrays;

public class MethodEx {
	public static void main(String[] args) {
		
		Method_01 m01 = new Method_01();
		
		int sum = m01.add(44, 66);
		
		System.out.println(sum);
		
		Method_02 m02 = new Method_02();
		
		m02.method01();
		
		m02.method02(123);
		
		//�����ϴ� ������ - ��������, �����μ�, ����, �μ�
		//	argument
		
		System.out.println("��ȯ�� : " + m02.returnNum());
		
		System.out.println("���� ��� : " + m02.plus(10,20));
		
		Method_03 m03 = new Method_03();
		
		int[] arr = new int[5];
		arr[2] = 100;
		
		System.out.println(Arrays.toString(arr));
		System.out.println("------ �޼ҵ� �� ------");
		m03.arrayTest01(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("-----------------------"
				+ "");

		//main �޼ҵ��� ���� ����
		//---- �� ���� ----
		//stack �޸� ����
		int num = 50;
		System.out.println(num);
		System.out.println("------ �޼ҵ� �� ------");
		m03.arrayTest02(num);
		System.out.println(num);
	}

}
