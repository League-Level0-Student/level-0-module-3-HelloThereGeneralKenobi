package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("Are you happy?");
		if(ans.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever your're doing.");
		}
		else if(ans.equalsIgnoreCase("no")) {
			String ans1 = JOptionPane.showInputDialog("Do you want to be happy?");
			if(ans1.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep what doing whatever you're doing.");
			}
		}
		
		
	}
}
