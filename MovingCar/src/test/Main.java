package test;
import java.awt.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends TimerTask {
	static String carPath = "C:\\Users\\cwalke1342\\Downloads\\economy.png";
	static JLabel carLabel = new JLabel(new ImageIcon(carPath));
    static JPanel carPanel = new JPanel();
    static int x = -800;
    static int y = 100;
	public void run() {
		x += 60;
		carPanel.setLocation(x, y);
	}

	public static void main(String[] args) {
	    
	      carPanel.add(carLabel);
	      JFrame f = new JFrame();
	      f.setSize(new Dimension(1600, 900));
	      f.add(carPanel);
	      f.setVisible(true);
	      
	      Timer timer = new Timer();
	      TimerTask task = new Main();
	         
	      timer.schedule(task, 0, 10);

	  }

}
