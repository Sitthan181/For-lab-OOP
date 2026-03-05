package lab13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Poring extends JFrame implements MouseListener {
    private JLabel label;
    private static int count = 0;
    public Poring(int currentCount) {
        this.setTitle("Berge " + currentCount);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ImageIcon icon = new ImageIcon("berge.jpg");
        label = new JLabel(String.valueOf(currentCount), icon, JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.addMouseListener(this);

        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e){
        this.dispose();
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}