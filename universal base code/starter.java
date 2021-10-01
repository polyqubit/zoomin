import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {
	static Rectangle zTest;
	
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		zTest = new Rectangle(250,250,10,10);
		zTest.setColor(new Color(50,50,255));
		zTest.fill();
	}

	public void onMouseClick(double x, double y) {
		// enter code here
		zoom.zoom(zTest,1.1,x,y);
	}

	public void keyPress(String s) {
		// enter code here
		zoom.zoom(zTest,1.1,0,0);
	}
}
