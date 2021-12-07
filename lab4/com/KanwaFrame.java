package lab4.com;

import javax.swing.*;

public class KanwaFrame extends JFrame {
    public KanwaFrame(){

        Kanwa kanwaPanel= new Kanwa();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(400,300);
        this.setLocation(300,100);
        this.setVisible(true);
        this.setResizable(false);
        this.add(kanwaPanel);
    }
}
