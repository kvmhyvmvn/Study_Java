package pack03_Array2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("난이도를 입력하세요(1~10)");
		int level = Integer.parseInt(sc.nextLine());
		System.out.println("난이도: " + level);

		int[] array = new int[level];
		int rIndex = new Random().nextInt(level);
		array[rIndex] = 3;

		int userNum;
		System.out.println("숫자를 맞춰보세요!(난이도 이하의 숫자를 입력하세요.)");

		int count = 0;
		System.out.println("답을 입력하세요.");
		while (true) {
			count++;
			userNum = Integer.parseInt(sc.nextLine());
			if (userNum - 1 == rIndex) {
				System.out.println("정답");
				System.out.println("시도 횟수는 " + count + "번 입니다.");
				break;
			} else {
				System.out.println("오답");
			}
		}
	}
}
