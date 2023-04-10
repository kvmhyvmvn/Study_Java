package pack02_Array;

public class Test01_ArraySum {
	public static void main(String[] args) {
		// 10개의 크기를 가진 String형 배열 sArr이 있다
		// sArr내부에는 문자열 1부터 각각의 인덱스에는 10까지 할당
		// sArr내부에 들어있는 문자열을 숫자로 바꿔서 누적합 출력

		String[] sArr = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += Integer.parseInt(sArr[i]);
		}
		System.out.println(sum);

	}
}
