package lab4.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kanwa extends JPanel implements KeyListener, MouseListener {

    private int x =0;
    private int y =0;
    private char shape;

    public Kanwa() {

        Label label = new Label("Nacisnij o lub k");
        label.setFont((new Font("MV Boli", Font.ITALIC, 24)));
        label.setLocation(0,0);

        this.setSize(400,300);
        this.setBackground(Color.WHITE);
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.setFocusable(true);
        this.add(label);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        shape=e.getKeyChar();

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);
        drawRectangles(g2d);
    }
    private void drawRectangles(Graphics2D g2d) {

        if(!(x ==0 && y ==0)){
            if(shape =='k'){
                g2d.setColor(Color.RED);
                g2d.fillRect(x, y,90,90);
            }
            if(shape =='o'){
                g2d.setColor(Color.GREEN);
                g2d.fillOval(x, y,90,90);
            }
        }
        this.repaint();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        x=e.getX();
        y=e.getY();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
