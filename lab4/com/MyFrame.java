package lab4.com;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        MyPanel myPanel= new MyPanel();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(1000,700);
        this.setLocation(300,100);
        this.setVisible(true);
        this.setResizable(false);
        this.add(myPanel);
    }

}
