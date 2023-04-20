package pack06_OOP3;

public class ProductMain {
	public static void main(String[] args) {
		
		ProductDTO dto1 = new ProductDTO(1, "컴퓨터", 10000, 5);
		ProductDTO dto2 = new ProductDTO(2, "노트북", 20000, 4);
		ProductDTO dto3 = new ProductDTO(3, "커피", 1500, 10);
		ProductDTO dto4 = new ProductDTO(4, "핸드폰", 30000, 7);
		ProductDTO dto5 = new ProductDTO(5, "키보드", 15000, 11);
		ProductDAO dao = new ProductDAO();
//		dao.display(dto1);
//		dao.display(dto2);
//		dao.display(dto3);
//		dao.display(dto4);
//		dao.display(dto5);

		ProductDTO[] dtoArr = new ProductDTO[5];
		// 처음보는 타입을 배열로 묶을 때 어려움이 있으면 해당하는 타입을 먼저 객체로 생성해보기
		// 생성한 객체를 배열의 임의의 인덱스에 넣어보기
		// 객체 생성시 사용한 생성자 또는 값을 배열의 인덱스에 넣게 수정
		dtoArr[0] = new ProductDTO(1, "컴퓨터", 10000, 5);
		dtoArr[1] = new ProductDTO(2, "노트북", 20000, 4);
		dtoArr[2] = new ProductDTO(3, "커피", 1500, 10);
		dtoArr[3] = new ProductDTO(4, "핸드폰", 30000, 7);
		dtoArr[4] = new ProductDTO(5, "키보드", 15000, 11);

		dao.display(dtoArr);

	}

}
