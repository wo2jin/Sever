class Car{
	int gasolineGauge;
}

class HybridCar extends Car{
	int electoricGuage;
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ�:"+gasolineGauge);
		System.out.println("�ܿ� ���ⷮ:"+electoricGuage);
		System.out.println("�ܿ� ���ͷ�:"+waterGauge);
		
	}
}

public class Quiz14_1 {

	public static void main(String[] args) {



	}

}
