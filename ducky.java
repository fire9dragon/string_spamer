import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ducky {

    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        robot.setAutoDelay(100); // Set a delay between key presses (in milliseconds)

        // Sleep for 9 seconds (equivalent to your Python time.sleep(9))
        Thread.sleep(9000);

        // Function to simulate typing a string
        // String text = "Test String";
        // for (char c : text.toCharArray()) {
        //     if (c == ' ') {
        //         robot.keyPress(KeyEvent.VK_SPACE);
        //         robot.keyRelease(KeyEvent.VK_SPACE);
        //     } else {
        //         int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
        //         robot.keyPress(keyCode);
        //         robot.keyRelease(keyCode);
        //     }
        // }

        // // Press Enter
        // robot.keyPress(KeyEvent.VK_ENTER);
        // robot.keyRelease(KeyEvent.VK_ENTER);

        // Repeat indefinitely (equivalent to your Python while True loop)
        while (true) {
            // Simulate typing the same string and pressing Enter
            // for (char c : text.toCharArray()) {
            //     if (c == ' ') {
            //         robot.keyPress(KeyEvent.VK_SPACE);
            //         robot.keyRelease(KeyEvent.VK_SPACE);
            //     } else {
            //         int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            //         robot.keyPress(keyCode);
            //         robot.keyRelease(keyCode);
            //     }
            // }
            // robot.keyPress(KeyEvent.VK_ENTER);
            // robot.keyRelease(KeyEvent.VK_ENTER);

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
