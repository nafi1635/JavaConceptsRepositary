import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.MemoryImageSource;

public class graphics{
  public static void main(String[] argv) throws Exception {

    int[] pixels = new int[16 * 16];
    Image image = Toolkit.getDefaultToolkit().createImage(
        new MemoryImageSource(16, 16, pixels, 0, 16));
    Cursor transparentCursor = Toolkit.getDefaultToolkit().createCustomCursor(
        image, new Point(0, 0), "invisibleCursor");
  }
}