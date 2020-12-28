package test_platform;

public class Animal {
		void eat() {
			System.out.println("Animals eats food");
		}
}
	class Dog extends Animal {
		void bark() {
			System.out.println("Dog barks...");
		}
	}
	class Puppy extends Dog{
		void weep() {
			System.out.println("puppy weeping for their mother");
		}



	public static void main(String[] args) {
		Puppy obj = new Puppy();
		obj.eat();
		obj.bark();

	}
	}

