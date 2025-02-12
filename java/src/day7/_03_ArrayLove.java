package day7;

public class _03_ArrayLove {

	public static void main(String[] args) {
		char[] charArr = {'1','L','O','2','V','3','E'};
		String love = "";
		
		//배열 접근 방법
		for (int i = 0; i < charArr.length; i++) {
			int word = charArr[i];
			if((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) { 
				// ASCII : 65 ~ 90 대문자 A ~ Z
				// ASCII : 97 ~ 122 소문자 a ~ z
				love += (char)word;
			}
		}
		System.out.println("단어 : " + love);
		
	}

}
