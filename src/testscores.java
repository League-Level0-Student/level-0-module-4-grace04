import javax.swing.JOptionPane;

public class testscores {
	public static void main(String[] args) {
		String Ans = JOptionPane.showInputDialog("What did you get on the test?");
		int sc = Integer.parseInt(Ans);
		if (sc==100) {
			JOptionPane.showMessageDialog(null, "Nicely done.");
		}
		else if (sc<100&&sc>=90) {
			JOptionPane.showMessageDialog(null, "Good job.");
		}
		else if (sc<90&&sc>=80) {
			JOptionPane.showMessageDialog(null, "Nice try.");
		}
		else if (sc<80&&sc>=70) {
			JOptionPane.showMessageDialog(null, "Study more.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You failed.");
		}
	}
}
