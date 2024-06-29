import java.awt.*;
import java.awt.event.*;

public class awt2 {
    public static void main(String[] arg)
    {
        Frame f = new Frame("Label");
        Label l1,l2,l3,l4,l5;
        l1 = new Label("Name:");
        l1.setBounds(20, 50, 100, 30);
        f.add(l1);
        l2 = new Label("Age:");
        l2.setBounds(20, 90, 100, 30);
        f.add(l2);
        l3 = new Label("Reg:");
        l3.setBounds(20, 130, 100, 30);
        f.add(l3);
        l4 = new Label("Course:");
        l4.setBounds(20, 170, 100, 30);
        f.add(l4);
        l5 = new Label("YearOfPassing:");
        l5.setBounds(20, 210, 100, 30);
        f.add(l5);

        TextField t1 = new TextField();
        t1.setBounds(120, 50, 200, 30);
        TextField t2 = new TextField();
        t2.setBounds(120, 90, 200, 30);
        TextField t3 = new TextField();
        t3.setBounds(120, 130, 200, 30);
        TextField t4 = new TextField();
        t4.setBounds(120, 170, 200, 30);
        TextField t5 = new TextField();
        t5.setBounds(120, 210, 200, 30);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }

}
