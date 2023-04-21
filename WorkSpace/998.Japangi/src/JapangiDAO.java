import java.util.Scanner;

public class JapangiDAO {

	public Scanner sc() {
		return new Scanner(System.in);
	}

	public void display(JapangiDTO[] dtoArr) {
		for (int i = 0; i < dtoArr.length; i++) {
			System.out.println(dtoArr[i].getNum() + ". " + dtoArr[i].getDrink() + " " + "금액: " + dtoArr[i].getPrice()
					+ " " + "수량: " + dtoArr[i].getCnt());
		}
	}

	public int inputCoin(JapangiDTO dto) {
		sc();
		System.out.println();
		System.out.println("돈을 넣어주세요.");
		while (true) {
			try {
				dto.setUserMoney(Integer.parseInt(sc().nextLine()));
				if (dto.getUserMoney() < 0 || dto.getUserMoney() % 10 != 0) {
					System.out.println("돈을 다시 넣어주세요.");
				} else {
					System.out.println(dto.getUserMoney() + "원을 넣었습니다.");
					System.out.println("현재잔액: " + dto.getUserMoney());
					break;
				}
			} catch (Exception e) {
				System.out.println("입력 오류, 돈을 넣어주세요.");
			}
		}
		return dto.getUserMoney();
	}

	public void selectDrink(JapangiDTO dto, JapangiDTO[] dtoArr) {
		int userSelect; // 유저가 고른 음료 번호
		int selectMoney; // 돈을 더 넣을지말지 결정
		System.out.println();
		System.out.println("음료수를 골라주세요." + "\n");
		display(dtoArr);

		userSelect = Integer.parseInt(sc().nextLine());
		if (userSelect == dtoArr[userSelect - 1].getNum()) {
			System.out.println("콜라를 선택하셨습니다.");
			while (true) {
				if (dto.getUserMoney() < dtoArr[userSelect - 1].getPrice()) { // 돈 부족
					System.out.println("잔액이 부족합니다(현재 잔액: " + dto.getUserMoney() + "원)");
					System.out.println("돈을 더 넣으시겠습니까?");
					System.out.println("1.O 2.X");
					selectMoney = Integer.parseInt(sc().nextLine());
					if (selectMoney == 1) {
						System.out.println("\n" + "추가금액을 넣어주세요");
						dto.setInputMoney(Integer.parseInt(sc().nextLine()));
						System.out.println("\n" + "현재잔액: " + dto.getUserMoney() + "원");
						System.out.println("음료수를 다시 골라주세요" + "\n");
						display(dtoArr);
						userSelect = Integer.parseInt(sc().nextLine());
						break;
					} else if (selectMoney == 2) {
						System.out.println("잔돈을 반환합니다");
						System.out.println("잔돈: " + dto.getUserMoney());
						break;
					} else {
						System.out.println("\n" + "1 또는 2 를 눌러주세요");
					}
				} else if (dtoArr[userSelect - 1].getCnt() == 0) {
					System.out.println("재고가 떨어졌어요\n다른메뉴를 골라주세요.");
					userSelect = Integer.parseInt(sc().nextLine());
				}
				break;
			}
			dtoArr[userSelect - 1].setCnt(dtoArr[userSelect - 1].getCnt() - 1);
			// 사용자금액 -= 음료 값
			System.out.println(dto.getUserMoney());
			
		} else if (userSelect == dtoArr[userSelect - 1].getNum()) {
			System.out.println("사이다를 선택하셨습니다.");
			while (true) {
				if (dto.getUserMoney() < dtoArr[userSelect - 1].getPrice()) { // 돈 부족
					System.out.println("잔액이 부족합니다(현재 잔액: " + dto.getUserMoney() + "원)");
					System.out.println("돈을 더 넣으시겠습니까?");
					System.out.println("1.O 2.X");
					selectMoney = Integer.parseInt(sc().nextLine());
					if (selectMoney == 1) {
						System.out.println("\n" + "추가금액을 넣어주세요");
						dto.setInputMoney(Integer.parseInt(sc().nextLine()));
						System.out.println("\n" + "현재잔액: " + dto.getUserMoney() + "원");
						System.out.println("음료수를 다시 골라주세요" + "\n");
						display(dtoArr);
						userSelect = Integer.parseInt(sc().nextLine());
						break;
					} else if (selectMoney == 2) {
						System.out.println("잔돈을 반환합니다");
						System.out.println("잔돈: " + dto.getUserMoney());
						break;
					} else {
						System.out.println("\n" + "1 또는 2 를 눌러주세요");
					}
				} else if (dtoArr[userSelect - 1].getCnt() == 0) {
					System.out.println("재고가 떨어졌어요\n다른메뉴를 골라주세요.");
					userSelect = Integer.parseInt(sc().nextLine());
				}
				break;
			}
			dtoArr[userSelect - 1].setCnt(dtoArr[userSelect - 1].getCnt() - 1);
			// 사용자금액 -= 음료 값
			System.out.println(dto.getUserMoney());
			
		} else if (userSelect == dtoArr[userSelect - 1].getNum()) {
			System.out.println("환타를 선택하셨습니다.");
			while (true) {
				if (dto.getUserMoney() < dtoArr[userSelect - 1].getPrice()) { // 돈 부족
					System.out.println("잔액이 부족합니다(현재 잔액: " + dto.getUserMoney() + "원)");
					System.out.println("돈을 더 넣으시겠습니까?");
					System.out.println("1.O 2.X");
					selectMoney = Integer.parseInt(sc().nextLine());
					if (selectMoney == 1) {
						System.out.println("\n" + "추가금액을 넣어주세요");
						dto.setInputMoney(Integer.parseInt(sc().nextLine()));
						System.out.println("\n" + "현재잔액: " + dto.getUserMoney() + "원");
						System.out.println("음료수를 다시 골라주세요" + "\n");
						display(dtoArr);
						userSelect = Integer.parseInt(sc().nextLine());
						break;
					} else if (selectMoney == 2) {
						System.out.println("잔돈을 반환합니다");
						System.out.println("잔돈: " + dto.getUserMoney());
						break;
					} else {
						System.out.println("\n" + "1 또는 2 를 눌러주세요");
					}
				} else if (dtoArr[userSelect - 1].getCnt() == 0) {
					System.out.println("재고가 떨어졌어요\n다른메뉴를 골라주세요.");
					userSelect = Integer.parseInt(sc().nextLine());
				}
				break;
			}
			dtoArr[userSelect - 1].setCnt(dtoArr[userSelect - 1].getCnt() - 1);
			// 사용자금액 -= 음료 값
			System.out.println(dto.getUserMoney());
		}

	}

}
