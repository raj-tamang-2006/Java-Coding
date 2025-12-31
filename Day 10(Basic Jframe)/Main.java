import java.awt.*;
import javax.swing.*;
public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		// set title
		f.setTitle("First Jframe");
		
		// to close the frame when the the close button is pressed
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		// by default its hide - its doesnt close but hides
		// we can even do nothing which is kind of annoying
		f.setVisible(true); // this will make frame visible
		f.setSize(402,420); // this is to set Size
		//to resize the frame
		f.setResizable(false);
		//to set the image on the title
		ImageIcon i = new ImageIcon("Screenshot 2025-12-31 180423.png");
		f.setIconImage(i.getImage());		
		//to set the background
		f.getContentPane().setBackground(Color.gray);
		//f.getContentPane().setBackground(new Color(R,B,G));
	}
}
