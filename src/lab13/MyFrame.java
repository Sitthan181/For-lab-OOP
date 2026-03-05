package lab13;
import javax.swing.*;
public class MyFrame extends JFrame {
    public MyFrame() {
        this.setTitle("My Clock");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
        
        this.add(clock);
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}