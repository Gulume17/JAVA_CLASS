package day1;

public class _03_print {

	public static void main(String[] args) {
		System.out.println("apple");
		System.out.println("banana");
		System.out.println("orange");
		// 문자열을 출력하므로 큰따옴표 사용 : 두개 이상의 문자 출력
		
		System.out.println(""); 
		System.out.println("바나나"); 
		System.out.println(5);
		System.out.println(3.14);
		System.out.println("A"); 
		System.out.println('A');// 작은 따옴표는 하나의 문자만 출력이 가능하다.
		System.out.println('p');
		
		System.out.println("");
		
		System.out.println(3+5);
		System.out.println(3.9+5.72);
		System.out.println(3.9*5.72);
		System.out.println(10/3); // 정수 나눗셈의 결과는 몫을 나타낸다.
		System.out.println(10/3.0); // 피연산자중 실수가 하나라도 있으면 결과값은 실수로 출력된다. 
		
		System.out.println("");
		
		System.out.println("덧셈 결과는 : " + 3 + 5); // 상수값을 연결할 땐 + 를 사용함
		System.out.println("덧셈 결과는 : " + (3 + 5));
		System.out.println("뺄셈 결과는 : " + (3 - 5));
		System.out.println("곱셈 결과는 : " + (3 * 5) + "입니다."); // + : 연결 문자 - : 대시문자

	}

}
