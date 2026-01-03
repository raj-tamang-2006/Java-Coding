import java.awt.*;
import java.awt.event.*;

public class AWT{
    AWT() {
        Frame f = new Frame("GUI HERE");

        // Name
        Label name = new Label("Name: ");
        name.setBounds(150, 100, 80, 30);
        TextField t = new TextField();
        t.setBounds(250, 100, 100, 30);

        // Age
        Label age = new Label("Age: ");
        age.setBounds(150, 200, 80, 30);
        TextField t1 = new TextField();
        t1.setBounds(250, 200, 100, 30);

        // Submit Button
        Button b = new Button("Submit");
        b.setBounds(250, 300, 80, 30);

        // Add components
        f.add(name);
        f.add(t);
        f.add(age);
        f.add(t1);
        f.add(b);

        // Frame settings
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        // Window close
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // **Button click event**
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = t.getText();
                String userAge = t1.getText();
                // Show info in a dialog
                Dialog d = new Dialog(f, "User Info", true);
                d.setLayout(new FlowLayout());
                Label l = new Label("Name: " + userName + ", Age: " + userAge);
                d.add(l);
                Button ok = new Button("OK");
                ok.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        d.setVisible(false); // close dialog
                    }
                });
                d.add(ok);
                d.setSize(300, 150);
                d.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new AWT();
    }
}
