import java.util.Scanner;

public class TestDog1 {
	static final int MAX = 10;
	static final String PROMPT = "---->";
	static final String SPACES = "     ";
	
	static final String options[] = {"Add new Dog", "Display details for a Dog",
			"Update details for a Dog", "List all Dogs", "Delete all Dogs",
			"Delete one Dog", "Quit"
	};
	
	static final int QUIT = options.length;
	
	static Dog1 pets[] = new Dog1[MAX];
	
	static int count = 0;
	
	static String title = "Dog Manager";
	
	static Menu myMenu = new Menu(title, options);
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
			myMenu.display();
			choice = myMenu.getChoice();
			if (choice !=  QUIT) {
				processChoice(choice);
			}
		}while(choice!=QUIT);
		System.out.println("\nGoodbye!");
		input.close();
	}
	
	private static void processChoice(int choice) {
		switch(choice) {
		case 1: addNewDog();
		break;
		case 2: System.out.println("");
		break;
		case 3: System.out.println("");
		break;
		case 4: listAllDogs();
		break;
		case 5: System.out.println("");
		break;
		case 6: System.out.println("");
		break;
		default: System.out.println("");
		}
		System.out.println();
	}
	
	public static void addNewDog() {
		if(count<MAX) {
			System.out.println("\nOK add new dog");
			Dog1 dg = new Dog1();
			System.out.println("Enter name");
			String name = input.nextLine();
			dg.setName(name);
			System.out.println("Set breed");
			String breed = input.nextLine();
			dg.setBreed(breed);
			System.out.println("Set age");
			int age = input.nextInt();
			dg.setAge(age);
			input.nextLine();
			System.out.print("Enter gender");
			String gen = input.nextLine();
			dg.setGender(gen.charAt(0));
			
			pets[count] = dg;
			count++;
		}else {
			System.out.println("No room");
		}
	}
	
	public static void listAllDogs() {
		System.out.println("\nOK list all dog");
		if(count == 0) {
			System.out.println("No dogs");
		}else {
			System.out.println("We have dogs");
			for(int i = 0; i < count; i++) {
				System.out.println((i+1) + pets[i].getName());
			}
		}
		System.out.println();
	}

}
