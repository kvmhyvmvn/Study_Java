package pack04.extend;

public class ChangeTypeMain {
	public static void main(String[] args) {
		// CellPhone => DmpPhone => SmartPhone
		// CellPhone은 부모클래스이기 때문에 자식클래스의 일부가 그대로 존재함
		//  자식 클래스를 부모 클래스에 담게 되면 그 기능을 그대로 사용이 가능하다
		// CellPhone cp = new DmbPhone(1, "색상", "모델");
		// CellPhone cp2 = new SmartPhone(1, "색상", "모델", 5);
		// cp2.powerOn(); // ?: 자식 클래스에서 재정의 된 메소드가 호출 됨
		CellPhone[] cpArr = new CellPhone[2];
		cpArr[0] = new DmbPhone(1, "색상", "모델");
		cpArr[1] = new SmartPhone(1, "색상", "모델", 5);
		
		DmbPhone dp = new SmartPhone(1, null, null, 0);
		
		for(int i=0; i<cpArr.length; i++) {
			cpArr[i].powerOn();
		}
		// 변수 타입변환 중에 자동과 강제가 있었음. 무슨 차이가 있을까?
		// ex) int <=> double
		int intNum = 10;
		double dNum = 3.14;
		dNum = intNum; // 자동
		intNum = (int)dNum; // 강제
		
		SmartPhone sp = (SmartPhone) new DmbPhone(1, null, null); // 자식 = 부모: 강제로 캐스팅을 해줘야한다.
		sp.powerOn(); // 오류남
	}
}
