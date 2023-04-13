package pack02_TryCatch;

import java.util.Scanner;

public class Ex03_TryCatchOrder {
	public static void main(String[] args) {
		int data2 = 1;
		try {
			int data1 = 10;
			int result = data1/data2; //ArithmeticException
			Scanner sc = new Scanner(System.in);
			int data4 = Integer.parseInt(sc.nextLine()); 
		} catch (ArithmeticException e) { // 연산오류, 0으로 어떤 수를 나누려고 할 때 발생
			int data3 = 100;
			System.out.println("data2의 변수 (값: " + data2 + ")때문에 오류" + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException" + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException" + e.getMessage());
		}
	}
}
