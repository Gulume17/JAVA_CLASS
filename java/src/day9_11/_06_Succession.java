package day9_11;

class Animal {
	void eat() {
		System.out.println("밥을먹자 냠냠냠");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("멍멍멍!!!");
	}
	
	@Override
	void eat() {
		System.out.println("밥을먹자 멍멍멍~~~");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("냐아아아옹");
	}
	@Override
	void eat() {
		System.out.println("밥을먹자 냥냥냥~~~");
	}
}

public class _06_Succession {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		myDog.eat();
		
		Cat myCat = new Cat();
		myCat.eat();
		
	}

}
