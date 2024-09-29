package Tests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotOnFailureWatcher implements TestWatcher {

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
       // System.out.println("Test failed: " + context.getDisplayName() + " - " + cause.getMessage());
        try {
            takeScreenshot();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void takeScreenshot() throws AWTException, IOException {
        Robot robot = new Robot();
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage screenImage = robot.createScreenCapture(screenRect);
        String path = "C:\\Users\\carlos herrerra\\Desktop\\Inteid\\Virtual_Machine\\src\\test\\java\\Tests\\screenshots\\" + System.currentTimeMillis() + ".jpg";
        ImageIO.write(screenImage, "jpg", new File(path));
    }
}