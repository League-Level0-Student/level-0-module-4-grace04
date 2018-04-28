import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String Ans = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for (int i=0;i<50;i++) {
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Clean", "Feed", "Play", "Hit" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task==0) {
				clean();
				System.out.println(happinessLevel);
			}
			else if (task==1) {
				feed();
				System.out.println(happinessLevel);
			}
			else if (task==2) {
				play();
				System.out.println(happinessLevel);
			}
			else if (task==3) {
				hit();
				System.out.println(happinessLevel);
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel>=10) {
				JOptionPane.showMessageDialog(null, "You love your pet!");
				System.exit(task);
			}
			else if (happinessLevel<=-20) {
				JOptionPane.showMessageDialog(null, "You hate your pet!");
				System.exit(task);
			}
			}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	static void clean() {
		happinessLevel++;
	}
	static void feed() {
		happinessLevel = happinessLevel+2;
	}
	static void play() {
		happinessLevel = happinessLevel+3;
	}
	static void hit() {
		happinessLevel = happinessLevel-10;
	}
}