import java.util.*;
public class Exam001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("01.������� ���ϱ�");
		System.out.println((80+75+55)/3);
		
		System.out.println("02.Ȧ¦�Ǻ�");
		if(13%2 == 0) {
			System.out.println("¦���Դϴ�");
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
		
		System.out.println("03.�ֹι�ȣ ������");
		String idno = "881120-1068234"; 
		System.out.println(idno.substring(0,6));
		System.out.println(idno.substring(7, 14));
		
		System.out.println("�ֹι�ȣ�� ���� Ȯ���ϱ�");
		if(idno.charAt(7) == '1') {
			System.out.println("���� �Դϴ�");
		}else {
			System.out.println("���� �Դϴ�.");
		} 
		
		// �� ���ڷ� ������?
		// �ڹٿ��� ū����ǥ "�� String, ��������ǥ '�� char type�� ��Ÿ����.
		
		System.out.println("05. ���ڿ� ����");
		String a = "a:b:c:d";
		System.out.println(a.replace(":", "#"));
		
		System.out.println("06. ����Ʈ�� ���ڿ��� ��ȯ");
		ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life","is","too","short"));
		System.out.println(String.join(" ", myList));
		
		HashMap<String, Integer> grade = new HashMap<>();
		grade.put("A", 90);
		grade.put("B", 80);
		grade.put("C", 70);
		grade.remove("B");
		System.out.println(grade);
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
		HashSet<Integer> set = new HashSet<>(numbers);
		System.out.println(set);
		
			
	}

}
