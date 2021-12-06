package lab4.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MyPanel extends JPanel {
    JButton runnableButton= new JButton("RUN");
    JButton closeableButton= new JButton("CLOSE");
    private int runnableButtonX=300;
    private int buttonY=200;
    private int closeableButtonX=500;

    public MyPanel(){
        this.setFocusable(true);
        this.setSize(800,600);
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        runnableButton.setSize(100,50);
        runnableButton.setLocation(runnableButtonX,buttonY);
        runnableButton.setBackground(Color.CYAN);
        runnableButton.addMouseListener(new MouseAdapter() {
            private void newPosition(MouseEvent e, JButton runnableButton)
            {
                Random r= new Random();
                int x=r.nextInt(650);
                int y=r.nextInt(550);
                runnableButton.setLocation(x,y);



            }
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                this.newPosition(e,runnableButton);
            }

        });
        runnableButton.setVisible(true);
        closeableButton.setSize(100,50);
        closeableButton.setLocation(closeableButtonX,buttonY);
        closeableButton.setBackground(Color.CYAN);
        closeableButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                runnableButton.setLocation(runnableButtonX,buttonY);
            }
        });
        closeableButton.setVisible(true);
        this.add(runnableButton);
        this.add(closeableButton);
        this.setVisible(true);
    }

}
