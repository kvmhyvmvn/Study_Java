package pack03_Array2;

import java.util.Arrays;

public class TestLast {
	public static void main(String[] args) {
		// 2차원 배열 만들기
		// 2차원 배열의 크기와 타입은 자유롭게
		// 2차원 배열에 구구단 2~9단의 답을 저장하고 2차원 배열을 통해 출력까지
		// 출력: {{2,4,6,8,...18},......{9,18,...81}};
		// *for문 사용*

		int[][] gugudan = new int[8][9];
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				gugudan[i - 2][j - 1] = i * j;
				System.out.print("[" + gugudan[i - 2][j - 1] + "]");
			}
			System.out.println();
		}
		System.out.println("===========================================================");
		// 1차원 배열이 2개가 있음
		// arrA = {1,2,3,4};
		// arrB = {4,5,6,8};
		// A B 내용 바꿔라
		int[] arrA = { 1, 2, 3, 4 };
		int[] arrB = { 4, 5, 6, 8 };
		int[] arrT = arrA;
		arrA = arrB;
		arrB = arrT;
		System.out.println("arrA: " + Arrays.toString(arrA) + "\n" + "arrB: " + Arrays.toString(arrB));
		System.out.println("===========================================================");

		// 심화) int[] arr = {3,4,5,6,7,8,9,1,2,5}
		// 해당내용 오름차순 또는 내림차순으로 정렬
		int[] arr = { 3, 4, 6, 7, 8, 9, 1, 2, 5 }; // 오름차순
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i]; // 바꿀 숫자를 갖고 있을 변수
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}

	}

}
