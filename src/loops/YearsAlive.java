package loops;

import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("How old are you?");
		int ans1 = Integer.parseInt(ans);
		for(int i = 0; i < ans1 + 1; i++) {
			int a = 2018 - ans1 + i;
			JOptionPane.showMessageDialog(null, " " + a + " ");
		}
	}
}