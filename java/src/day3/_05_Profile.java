package day3;

import java.util.Scanner;

public class _05_Profile {

	public static void main(String[] args) {
		/*
		 * 1. 이름 -> next()
		 * 2. 주소 -> nextLine
		 * 3. 나이
		 * 4. 키
		 * 당신의 이름은 *** 입니다.
		 * 당신의 주소는 *** 입니다.
		 * 당신의 나이는 *살 입니다.
		 * 당신의 키는 *cm입니다. (소수점 1자리까지 포함)
		 * 출력은 printf 사용
		 */
	
	    String name,address;
	    int age;
	    double height;
	    
	    System.out.print("이름, 주소, 아니, 키(소수점 1자리 포함) 공백으로 구분하여 입력 : ");
	    Scanner profile = new Scanner(System.in);
	    
	    name = profile.next(); // next는 공백 nextLine은 엔터를 기준으로 입력된다. ex) ** (공백) 입니다 -> next (**) / nextLine (** 입니다 (엔터)) 출력
	    address = profile.next();
	    age = profile.nextInt();
	    height = profile.nextDouble();
	    profile.close();
	    
	    System.out.printf("당신의 이름은 %s 입니다.",name);
	    System.out.printf("당신의 주소는 %s 입니다.",address);
	    System.out.printf("당신의 나이는 %d 입니다.",age);
	    System.out.printf("당신의 키는 %f 입니다.",height);
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
