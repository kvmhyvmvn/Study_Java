package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
		// int �̻��� ���� ���� �� �ִ� ������ ������Ÿ���� ����
		
		long l1;
		long l2 = 1234567890123456789L; // ���� + longŸ���̶�� �����ڰ� �ִ�.(�ڿ� 'L' �ٿ�����)
		System.out.println(l2);
		
		// �Ǽ��� ������ Ÿ��: float, double
		// �Ǽ����� �Ҽ����� �ִ� ���� ǥ���ϱ� ���� ����
		// float�� long�� ���������� ������ F�� �ٿ���߸���.
		float f1;
		f1 = 0.12345F;
		float f2 = 1.23456F;
		
		double d1;
		d1 = 3.1456789;
		double d2= 2.34567;
		// �ڿ� �����ڰ� �ٴ� long, float ���ϴ�?
		// ��ǥ�� : int, double
	}

}