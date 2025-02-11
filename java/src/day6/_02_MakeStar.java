package day6;

public class _02_MakeStar {

	public static void main(String[] args) {
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				}
			System.out.println();

		}
		
		System.out.println();
		

		for(int a = 0; a < 7; a++) { // 행
			for(int b = 0; b <= 7 - a; b++) { // * 앞에 공백 작성 / 7-a : (현재 층에 공백이 몇개 필요한가?)
				System.out.print(" ");
			}
				for(int c = 0; c < (a*2)+1; c++) { // (a*2)+1 : 해당 층에서 출력할 별의 개수를 결정
					System.out.print("*");
				}
				System.out.println();
		}
			
			}
	}


