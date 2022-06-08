import java.util.*;

public class Exam002 {
	
//	1. enum 으로 쓰일 메뉴들을 선언해 주고
		enum Coffeetype {
			AMERICANO,
			ICE_AMERICANO,
			CAFE_LATTE
		};
//	2. 호출하면 값을 출력할 printCoffeeprice 함수를 만든다.
		static void printCoffeeprice(Coffeetype type) {
//		2.1 키와 값이 들어가야 하니까 HashMap으로 가방을 만들어 주고 데이터를 입력
			HashMap<Coffeetype, Integer> map = new HashMap<>();
			map.put(Coffeetype.AMERICANO, 3000);
			map.put(Coffeetype.ICE_AMERICANO, 4000);
			map.put(Coffeetype.CAFE_LATTE, 5000);
			
			int price = map.get(type);
//		2.2 파라미터 type의 값을 받아 지정된 형식으로 출력하게끔 함
			System.out.println(String.format(type+"의 가격은 %d원 입니다.", price));
		}
		
//		3. 테스트
		public static void main(String[] args) {
			printCoffeeprice(Coffeetype.AMERICANO);
		}
		
	
}
