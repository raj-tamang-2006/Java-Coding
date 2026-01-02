import java.awt.*;
import java.awt.event.*;
public class Awtframe{
	public Awtframe() {
		
		Frame f = new Frame("My first gui");
		
		Label l = new Label("this is fucking awt of java here");
		l.setBounds(50, 80, 300, 30);
		l.setBackground(Color.DARK_GRAY);
		l.setForeground(Color.yellow);
		Button b =  new Button("Click");
		b.setBounds(150, 120, 80, 30);
		b.setBackground(Color.DARK_GRAY);
		b.setForeground(Color.YELLOW);
		TextField text = new TextField();
		text.setBounds(30,50,150,30);
		text.setBackground(Color.DARK_GRAY);
		text.setForeground(Color.YELLOW);
		f.setLayout(null);
		f.add(text);
		f.add(l);
	
		f.add(b);
		f.setSize(400,300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing (WindowEvent e)
			{
				f.dispose();
			}
		});
		
		
	}
	public static void main(String[] args) {
        Awtframe obj = new Awtframe();
	}
}
