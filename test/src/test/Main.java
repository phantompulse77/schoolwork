package test;
import java.awt.image.*;
import java.awt.MouseInfo;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
	    String carPath = "C:\\Users\\cwalke1342\\Downloads\\economy.png";
	    try {
	      BufferedImage car = ImageIO.read(new File(carPath));
	      JLabel carLabel = new JLabel(new ImageIcon(carPath));
	      JPanel carPanel = new JPanel();
	      Point p = MouseInfo.getPointerInfo().getLocation();
	      carPanel.add(carLabel);
	      JFrame f = new JFrame();
	      f.setSize(new Dimension(1600, 900));
	      f.add(carPanel);
	      f.setVisible(true);
	      while(true) {
	    	  p = MouseInfo.getPointerInfo().getLocation();
	    	  carPanel.setLocation(p.x - 800, p.y - 200);
	      }
	      
	    } catch (IOException e) {
	      e.printStackTrace();
	    }

	  }

}
