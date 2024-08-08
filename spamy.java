import java.awt.Robot;
import java.awt.event.KeyEvent;

public class spamy {

    public static void main(String[] args) throws Exception {
        System.setProperty("java.awt.headless","false");
        Robot robot = new Robot();
        robot.setAutoDelay(100); // Set a delay between key presses (in milliseconds)

        
        Thread.sleep(9000);

        

        
        while (true) {
           

            robot.keyPress(17);
            Thread.sleep(25);
            robot.keyPress(86);
            robot.keyRelease(86);
            robot.keyRelease(17);
            Thread.sleep(17);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(10);
        }
    }
}
