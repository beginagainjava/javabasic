package java08_abstract.quiz;

public class Taxi implements Fare {

	private int resultFee;

	@Override
	public void calc(int distance) {
		// ��� = �Ÿ� x ��� x 2

		resultFee = distance * Fare.FEE * 2;
		System.out.println(distance + "m�� �������� �� ����� " 
				+ resultFee + "���Դϴ�");
	}

}
