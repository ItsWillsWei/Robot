import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class test {

	public static void main(String[] args) throws Exception{
		Robot robot = new Robot();
		//Excel
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(20);
		robot.keyPress(KeyEvent.VK_C);
		Thread.sleep(20);
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(20);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		/*
		/*
		robot.mouseMove(770, 1060);
		Thread.sleep(100);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseMove(500,170);
		
		
		
		Thread.sleep(100);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		}
		*/

}
}