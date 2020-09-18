package java03_scanner;

public class FormattedDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double avg = 12345.67890;
		
//		��� 1.
//		System.out.printf(); �� ����Ѵ�
		
		System.out.printf("%.2f", avg);
		System.out.printf("%5d", 777);
		
		// %.2f ���Ĺ���
		// f : floationg point number ( �ε��Ҽ���, �Ǽ� )
		// .2 : �ڸ���, �Ҽ������� 2��°������ ���
		
		// %5d ���Ĺ���
		// d : decimal number ( 10���� ���� )
		// 5 : �ڸ���, 5ĭ�� Ȯ���ϰ� ���
		
		
//		���2.
//		Math.round(����) : ������ �Ҽ������ϸ� �ݿø����ִ� �޼ҵ�(���)
		
		double avg2 = 34.56778899;
		double result = Math.round(avg2*100);
		
		System.out.println();
		System.out.println(result/100.0);
		// avg2 : 34.56778899
		// avg2 * 100 : 3456.778899
		// Math.round(avg2*100) : 3457.0
		// Math.round(avg2*100)/(double)100 : 34.57

	}

}
