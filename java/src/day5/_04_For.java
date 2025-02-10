package day5;

public class _04_For {

	public static void main(String[] args) {
		/*
		 * for(초기값; 조건식; 증가/감소식){
		 * 		반복실행문
		 * }
		 */

		int i;
		for(i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		// 1. 3의 배수의 합계
		// 2. 3의 배수가 몇개인지
	
		int n;
		int total = 0; 
		int count = 0;
		
		for(n = 3; n <= 100; n += 3) {
			if(i % 2 !=0) { // 2의 배수만 빼는 코드
			System.out.println(n + " ");
			total += n;
			count ++;
			}
		}
		System.out.println("1~100 사이의 3의 배수의 합은" + total + "입니다.");
		System.out.println("1~100 사이의 3의 배수의 개수는" + count + "입니다.");
		
		
	}

}
