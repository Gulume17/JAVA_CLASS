package day6;

public class _01_NestingFor {

	public static void main(String[] args) {
		/*
		  ***
		  ***
		  ***
		  ***
		  ***
		  
		 */
		
		for(int i = 0; i < 5; i++) { // 행
			for(int j = 0; j < 3; j++) { // 행 안에 요소 반복 (***)
				System.out.print("*");
			}
			System.out.println();
		}	
		
		// 0시 0분 부터 23시 59분까지 출력해보기
		
		System.out.println();
		
		
		for(int hour=0; hour <= 23; hour ++) {
			for(int min = 0; min <= 59; min ++){
//				System.out.println(hour + "시" +" "+ min + "분");
				System.out.printf("%d시 %d분 \n" , hour,min);
			}
			System.out.println();
		}
	}

}
