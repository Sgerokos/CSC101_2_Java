package headShoulders;

public class headShoulders {

	// Call's a function and print's two line's
	public static void headShoulders() {
		System.out.println("Head, shoulders, knees and\n"
				+ "toes, knees and toes");
	}

	// Call's a function and print's two line's
	public static void eyesEars() {
		System.out.println("And eyes and ears and\n"
				+ "mouth and nose.");
	}

	// Call's a function and print's four line's
	public static void marchMarch() {
		System.out.println("March, march, march.\n"
				+ "Let us all march.\n"
				+ "March, march, march.\n"
				+ "Get your body charge!");
	}

	// Call's a function and print's three line's    
	public static void jumpJump() {
		System.out.println("Jump, jump, jump.\n"
				+ "Let's all jump.\n"
				+ "Jump, jump, jump.");
	}

	// Call's a function and print's one line
	public static void muscles() {
		System.out.println("Make your muscle pump!");
	}

	// Call's a function and print's three line's    
	public static void punchPunch() {
		System.out.println("Punch, punch, punch.\n"
				+ "Let's all punch.\n"
				+ "Punch, punch, punch.");
	}

	// Call's a function and print's one line  
	public static void hurtyMunch() {
		System.out.println("Have a hurty munch.");
	}

	public static void main(String[] args) {
		// The loop will call the function two time's
		for (int i = 0; i < 2; i++) {
			headShoulders();
		}

		// These function's will each be called once after the loop
		eyesEars();
		headShoulders();
		marchMarch();
		headShoulders();
		eyesEars();
		jumpJump();
		muscles();
		headShoulders();
		eyesEars();
		headShoulders();
		punchPunch();
		hurtyMunch();
	}
}
