package pack06_MiniProj;

import java.util.Random;
import java.util.Scanner;

public class Test01_HighLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 사용자한테 입력받기 위한 스캐너
		int random = new Random().nextInt(100) + 1; // 랜덤한 수 체번
		// for문 이용해서 무한루프 만들기
//		for (int i = 0; i < 5; i++) {
//			i = 0; // 1. i가 증가해도 다시 0으로 숫자를 초기화해서 계속 반복하게 만든다
//		}
//		for (int i = 0; i < 1; i--) {
//			// i를 증가 X
//		}
		System.out.println("HighLow게임을 시작합니다.");
		int count = 0;
		for (;;) { // while(true)와 같은 방법
			count++;
			System.out.println("숫자를 입력해서 정답을 맞춰주세요");
			int userNum = Integer.parseInt(sc.nextLine());
			if (userNum == random) {
				System.out.println("정답입니다");
				System.out.println(count + "회 시도하셨습니다");
				break;
			} else if (userNum < random) {
				System.out.println("더 큰 수를 입력해주세요.");
			} else {
				System.out.println("더 작은 수를 입력해주세요.");
			}
		}
	}
}
