import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;


import javax.imageio.ImageIO;

/**
 * NOTE: COORDINATES ARE LOCAL TO MY SCREEN AND MAY NOT WORK FOR YOURS
 * @author Will
 *
 */
public class RobotTest {

	public static void main(String[] args) throws Exception {
		final double INTERVAL = 0.0001;
		final double INCREASE = 0.1916;
		Robot robot = new Robot();

		//System.out.println(KeyEvent.VK_0 + ('1' - '0'));
		Thread.sleep(1000);
		startFromWindow(robot);

		double time = 0;
		for (int second = 0; second <= 50; second++) {
			time = second * INCREASE;
			Thread.sleep(10);
			for (int bound = 0; bound < 3; bound++) {
				// BACKSPACE 5 times
				{
					robot.mouseMove(50, 820);
					Thread.sleep(100);
					robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					for (int i = 0; i < 7; i++) {
						Thread.sleep(100);
						robot.keyPress(KeyEvent.VK_BACK_SPACE);
					}
				}
				if (bound == 0) {
					time -= INTERVAL;
				} else
					time += INTERVAL;
				time = Math.round(time * 10000)/10000.0;

				// TYPE IN THE NUMBER
				String type = "" + time;
				while (type.length() > 0) {
					Thread.sleep(100);
					char c = type.charAt(0);
					if (Character.isDigit(c))
						robot.keyPress(KeyEvent.VK_0 + (c - '0'));
					else
						robot.keyPress(KeyEvent.VK_PERIOD);
					type = type.substring(1);
				}
				// DELAY
				// PRESS BOLTIFY
				robot.mouseMove(200, 820);
				// robot.mouseMove(1100, 210);
				Thread.sleep(50);
				robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				Thread.sleep(200);
				//COPY
				robot.keyPress(KeyEvent.VK_CONTROL);
				//Thread.sleep(20);
				robot.keyPress(KeyEvent.VK_C);
				Thread.sleep(50);
				robot.keyRelease(KeyEvent.VK_C);
				//Thread.sleep(20);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(20);
				
				//COPY INTO EXCEL
				//Move mouse
				robot.mouseMove(770, 1060);
				Thread.sleep(100);
				robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseMove(500, 170);
				Thread.sleep(100);
				robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				Thread.sleep(300);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				Thread.sleep(20);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(100);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(100);
				
				//Go bACK TO CHROMe
				robot.mouseMove(650, 1060);
				Thread.sleep(50);
				robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				
				// Press Okay
				robot.mouseMove(1100, 210);
				Thread.sleep(50);
				robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			}

		}

	}

	public static void startFromWindow(Robot robot) throws InterruptedException {
		robot.mouseMove(650, 1060);
		// robot.keyPress(InputEvent.BUTTON1_MASK);
		// robot.keyRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		robot.mouseMove(600, 40);
		Thread.sleep(100);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		robot.mouseMove(50, 820);
		Thread.sleep(100);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}
