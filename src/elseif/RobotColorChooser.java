//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot owo = new Robot();
		while(1 == 1) {
		//1. Create a new Robot
		//3. Ask the user what color they would like the robot to draw
		String ans = JOptionPane.showInputDialog("What color do you want to draw with?");
		if(ans.equals("red")) {
			owo.setPenColor(255,0,0);	
		}
		else if (ans.equals("green")) {
			owo.setPenColor(0,255,0);	
		}
		else if (ans.equals("blue")) {
			owo.setPenColor(0,0,255);	
		}
		//5. Use an if/else statement to set the pen color that the user requested
		owo.penDown();
		owo.setPenWidth(10);
		owo.setSpeed(200);
        //6. If the user doesn’t enter anything, choose a random color
		for(int i = 1; i < 5; i++) {
		owo.move(50);
		owo.turn(90);
		}
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
