package practiceCode.chapter07._13;

public class AnimalEx {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----------");

		// 변수와 자동 타입 변환
		Animal animal = null;

		// 자동 타입 변환
		animal = new Dog();
		// 재정의된 메서드 호출
		animal.sound();

		// 자동 타입 변환
		animal = new Cat();
		// 재정의된 메서드 호출
		animal.sound();
		System.out.println("----------");

		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
