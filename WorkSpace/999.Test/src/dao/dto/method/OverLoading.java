package dao.dto.method;

public class OverLoading {
	// �޼ҵ��� �̸��� ����, Ÿ�԰� �Ķ������ ������ �ٸ��� �ؼ� ����� �� �ְ� �� ��

	void method() {

	}

	void method(int x) {
		System.out.println(x);
	}

	void method(int x, int y) {
		System.out.println(x + y);
	}

	void method(String str) {
		System.out.println(str);
	}

	void method(boolean bData) {
		System.out.println(bData);
	}

	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.method();
		ol.method(7);
		ol.method(1, 1);
		ol.method("hello");
		ol.method(true);
	}
}