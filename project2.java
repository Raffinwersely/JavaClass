import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class project2 {
        Frame f = new Frame("Details");
        TextField t6 = new TextField();
        t6.setBounds(1, 30, 1370, 1000);
        f.add(t6);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        t6.add(l1);
        t6.add(l2);
        t6.add(l3);
        t6.add(l4);
        t6.add(l5);
        t6.add(l6);
        t6.add(l7);
        t6.add(t1);
        t6.add(t2);
        t6.add(t3);
        t6.add(t4);
        t6.add(t5);
        t6.add(c);
        t6.add(TextArea);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

