package lab13;
import java.awt.*;
import javax.swing.*;

public class MyTimer extends JLabel implements Runnable {
    private int totalSeconds = 0;
    public MyTimer() {
        this.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.setHorizontalAlignment(JLabel.CENTER);
    }

    @Override
    public void run() {
        try {
            while (true) {
                int hour = totalSeconds / 3600;
                int min = (totalSeconds % 3600) / 60;
                int sec = totalSeconds % 60;

                this.setText(String.format("%02d:%02d:%02d", hour, min, sec));
                
                Thread.sleep(1000);
                totalSeconds++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Timer"); //made frame+name it
        MyTimer timer = new MyTimer();
        Thread t = new Thread(timer);
        t.start();

        frame.add(timer);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}