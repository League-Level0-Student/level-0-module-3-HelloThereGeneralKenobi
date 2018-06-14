package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obey {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.miniaturize();
		rob.setSpeed(100);
		rob.penDown();
		String ans1 = JOptionPane.showInputDialog("What color do you want");
		if(ans1.equalsIgnoreCase("red")) {
				rob.setPenColor(255,0,0);
		}
		else if(ans1.equalsIgnoreCase("green")) {
			rob.setPenColor(0,255,0);
		}
		else if(ans1.equalsIgnoreCase("blue")) {
			rob.setPenColor(0,0,255);
		}
		String ans = JOptionPane.showInputDialog("What shape do you want to draw?");
		if(ans.equalsIgnoreCase("Square")) {
			drawSquare();
		}
		else if(ans.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		}
		else if(ans.equalsIgnoreCase("Circle")) {
			drawCircle();
		}
	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}

	public static void drawTriangle() {
		for (int a = 0; a < 3; a++) {
			rob.turn(120);
			rob.move(100);
		}
	}

	public static void drawCircle() {
		for (int b = 0; b < 120; b++) {
			rob.turn(3);
			rob.move(3);
		}
	}
}
