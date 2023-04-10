package pack02_Array;

public class Ex02_Array {
	public static void main(String[] args) {
		// 1~10의 크기를 가진 int형 배열 만들고 10 ~ 100까지 값 할당하고 출력

		int[] numArray = new int[10]; // 0 ~ 9
//		numArray[0] = 10;
//		numArray[1] = 20;
//		numArray[2] = 30;
//		numArray[3] = 40;
//		numArray[4] = 50;
//		numArray[5] = 60;
//		numArray[6] = 70;
//		numArray[7] = 80;
//		numArray[8] = 90;
//		numArray[9] = 100;

		// 값 할당도 for문에서 해보자
		for (int i = 0; i < 10; i++) {
			numArray[i] += (i + 1) * 10;
			System.out.println("numArray[" + i + "]: " + numArray[i]);
		}

		// 현재 배열에는 10~100까지 수가 담겨있음.
		// => 배열의 누적합 구해보자
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < 10; i++) {
			sum += numArray[i];
			avg = (double) sum / 10;
		}
		System.out.println("누적 합: " + sum);
		System.out.println("평   균: " + avg);

	}

}
