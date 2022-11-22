import java.util.Scanner;
 class RunAnimal{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		Bird bird = new Bird();
		Cat cat = new Cat();
		Dog dog = new Dog();
		System.out.print("Choose an animal. Press B for BIRD, C for CAT or D for DOG: ");
		String ui = sc.nextLine();
		if(ui.equalsIgnoreCase("B")){
			bird.eat();
			bird.sleep();
			bird.makeSound();
		}
		else if(ui.equalsIgnoreCase("C")){
			cat.eat();
			cat.sleep();
			cat.makeSound();
		}
		else if(ui.equalsIgnoreCase("D")){
			dog.eat();
			dog.sleep();
			dog.makeSound();
		}else{
			System.out.println("Invalid input");
		}
	}
}