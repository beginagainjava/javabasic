package java08_abstract.quiz;

public class Taxi implements Fare {

	private int resultFee;

	@Override
	public void calc(int distance) {
		// 요금 = 거리 x 비용 x 2

		resultFee = distance * Fare.FEE * 2;
		System.out.println(distance + "m를 운행했을 때 요금은 " 
				+ resultFee + "원입니다");
	}

}
