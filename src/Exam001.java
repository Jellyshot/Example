import java.util.*;
public class Exam001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("01.평균점수 구하기");
		System.out.println((80+75+55)/3);
		
		System.out.println("02.홀짝판별");
		if(13%2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		System.out.println("03.주민번호 나누기");
		String idno = "881120-1068234"; 
		System.out.println(idno.substring(0,6));
		System.out.println(idno.substring(7, 14));
		
		System.out.println("주민번호로 성별 확인하기");
		if(idno.charAt(7) == '1') {
			System.out.println("남성 입니다");
		}else {
			System.out.println("여성 입니다.");
		} 
		
		// 왜 여자로 나오지?
		// 자바에서 큰따옴표 "는 String, 작은따옴표 '는 char type을 나타낸다.
		
		System.out.println("05. 문자열 변경");
		String a = "a:b:c:d";
		System.out.println(a.replace(":", "#"));
		
		System.out.println("06. 리스트를 문자열로 변환");
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
