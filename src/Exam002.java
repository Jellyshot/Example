import java.util.*;

public class Exam002 {
	
//	1. enum ���� ���� �޴����� ������ �ְ�
		enum Coffeetype {
			AMERICANO,
			ICE_AMERICANO,
			CAFE_LATTE
		};
//	2. ȣ���ϸ� ���� ����� printCoffeeprice �Լ��� �����.
		static void printCoffeeprice(Coffeetype type) {
//		2.1 Ű�� ���� ���� �ϴϱ� HashMap���� ������ ����� �ְ� �����͸� �Է�
			HashMap<Coffeetype, Integer> map = new HashMap<>();
			map.put(Coffeetype.AMERICANO, 3000);
			map.put(Coffeetype.ICE_AMERICANO, 4000);
			map.put(Coffeetype.CAFE_LATTE, 5000);
			
			int price = map.get(type);
//		2.2 �Ķ���� type�� ���� �޾� ������ �������� ����ϰԲ� ��
			System.out.println(String.format(type+"�� ������ %d�� �Դϴ�.", price));
		}
		
//		3. �׽�Ʈ
		public static void main(String[] args) {
			printCoffeeprice(Coffeetype.AMERICANO);
		}
		
	
}
