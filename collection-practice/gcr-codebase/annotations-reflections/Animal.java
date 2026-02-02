
public class Animal {
	void makeSound() {
		System.out.println("Animal makes a Sound");
	}

	class Dog extends Animal {
		@Override
		void makeSound() {
			System.out.println("Dog barks");
		}
	}

	public static void main(String[] args) {
		Dog dog = new Animal().new Dog();
		dog.makeSound(); // Output: Dog barks
	}
}