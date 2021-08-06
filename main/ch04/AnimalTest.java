package ch04;

class Animal { //다형성(polymorphism) 기초
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 움직입니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Dog extends Animal {

	@Override
	public void move() {
		System.out.println("개가 움직입니다.");
	}
	
	public void shakeTail() {
		System.out.println("개가 꼬리를 흔듭니다.");
	}
	
}

class Bird extends Animal {
	@Override
	public void move() {
		System.out.println("새가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("새가 날개를 피고 날아다닙니다.");
	}
}

public class AnimalTest{
	
	public static void main(String[] args) {
		Animal human = new Human();
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		moveAnimal(human); //사람이 움직입니다.
		moveAnimal(dog); //개가 움직입니다.
		moveAnimal(bird); //새가 하늘을 납니다.

	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
