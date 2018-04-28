import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You are walking down a road alone.");
		int der = JOptionPane.showOptionDialog(null, "What's your gender?", "Lonliness", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Female", "Male" }, null);
		if (der==1) {
			int man = JOptionPane.showOptionDialog(null, "You see a man.", "Lonliness", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Ignore", "Socialize" }, null);
			int wom = JOptionPane.showOptionDialog(null, "You see a woman.", "Lonliness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Ignore", "Socialize" }, null);
			if (man==0&&wom==0) {
				JOptionPane.showMessageDialog(null, "You will be forever alone.");
			}
			else if (man==0&&wom==1) {
				JOptionPane.showMessageDialog(null, "You are happily married.");
			}
			else if (man==1&&wom==0) {
				JOptionPane.showMessageDialog(null, "You have a friend.");
			}
			else if (man==1&&wom==1) {
				JOptionPane.showMessageDialog(null, "You will never be alone again.");
			}
		}
		if (der==0) {
			int man = JOptionPane.showOptionDialog(null, "You see a man.", "Lonliness", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Ignore", "Socialize" }, null);
			int wom = JOptionPane.showOptionDialog(null, "You see a woman.", "Lonliness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Ignore", "Socialize" }, null);
			if (man==0&&wom==0) {
				JOptionPane.showMessageDialog(null, "You will be forever alone.");
			}
			else if (man==1&&wom==0) {
				JOptionPane.showMessageDialog(null, "You are happily married.");
			}
			else if (man==0&&wom==1) {
				JOptionPane.showMessageDialog(null, "You have a friend.");
			}
			else if (man==1&&wom==1) {
				JOptionPane.showMessageDialog(null, "You will never be alone again.");
			}
		}
	}
}
