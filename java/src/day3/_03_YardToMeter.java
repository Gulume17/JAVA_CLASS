package day3;

import java.util.Scanner;

public class _03_YardToMeter {

	public static void main(String[] args) {
		
		final double ONE_YARD = 0.9144; // 상수 선언
		
		System.out.print("야드 입력 : "); // 한줄 입력 받으려면 ln빼기
		Scanner YardIn = new Scanner(System.in);
		double yard = YardIn.nextDouble();
		YardIn.close();
		
		double meter = yard * ONE_YARD;
		System.out.println(yard + "yard는 " + meter + "meter 입니다.");
		

	}

}
