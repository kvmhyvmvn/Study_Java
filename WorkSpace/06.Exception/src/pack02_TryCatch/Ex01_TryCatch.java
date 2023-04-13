package pack02_TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex01_TryCatch {
	public static void main(String[] args) {
		// try {
		// 예외(오류)가 발생할 가능성이 있는 코드(코드 자체는 정상);
		// a <- (코드가 비정상)
		// Integer.parseInt(sc.nextLine()); <- 사용자의 입력을 숫자로 바꾸는 기능
		// }catch(Exception e) {
		// 예외가 발생할 시 처리할 코드(대안코드)
		// }선택 finally {
		// 무조건 한번 실행되어야 하는 코드가 있다면 넣어줌
		// 데이터베이스의 연결을 해제하거나, 세션을 끊는다.
		// }

		// 정상코드이지만 실행 했을 때 오류가 발생하게 코딩해보기
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("오류가 발생함");
		}
		System.out.println("여기까지 실행이 되나요??");

		// [에러의 종류]
		// ① 하드웨어적인 에러: 치명적인 에러 ▶ 프로그램이 실행 안됨(그래픽카드, 메모리 등등의 물리적 오류)
		// ② 소프트웨어적인 에러: 가벼운 에러 ▶ 예외(Exception)
		// 	- Oracle 회사에서는 모든 예외들을 클래스로 만들어서 제공한다.
		// 	- 예) NullPointerException: null인 상태에서 기능 사용(참조ㄴ)

		// [예외의 종류]
		// ① 미확인 예외(실행 예외)
		// 	- 프로그램을 실행 해봐야만 예외가 발생하는지 알 수 있다.
		// 	- 프로그래머의 실수, 경험에 의해서 발생: 디버깅(오류 수정) 작업이 쉽다.(현실은 쉽지않음)

		// ② 확인 예외(일반 예외)
		// 	- 프로그램 작성 중(코딩)에 반드시 예외처리를 해줘야만 사용이 가능한 것들이 있음(파일 O)
		// 	- try {} catch {} 해주면 해결 완.

		try {
			FileInputStream fis = new FileInputStream("D:\\bc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("여기 오류남");
			e.printStackTrace();
		}
	}

}
