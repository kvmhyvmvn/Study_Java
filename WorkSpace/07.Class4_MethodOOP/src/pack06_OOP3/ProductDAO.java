package pack06_OOP3;

public class ProductDAO {
	void display(ProductDTO dto) {
		System.out.print("번호: " + dto.getNum() + ", ");
		System.out.print("이름: " + dto.getName() + ", ");
		System.out.print("가격: " + dto.getPrice() + ", ");
		System.out.println("수량: " + dto.getCnt());

	}
	public void display(ProductDTO[] dtoArr) {
		for(int i=0; i<dtoArr.length; i++) {
			System.out.println(dtoArr[i].getNum());
		}
	}

}
