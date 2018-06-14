
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.miniaturize();
		rob.setX(0);
		rob.penDown();
		rob.setSpeed(100);
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.
		for(int i = 0; i < 17; i++) {
			rob.penUp();
			rob.turn(90);
			rob.move(50);
			rob.turn(-90);
			rob.penDown();
			for(int a = 0; a < 5; a++) {
				rob.turn(144);
				rob.move(60);
			}
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
