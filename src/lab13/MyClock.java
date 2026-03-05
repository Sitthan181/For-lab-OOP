package lab13;
import java.awt.*;
import java.util.Calendar;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable {
    public MyClock() {
        this.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.setHorizontalAlignment(JLabel.CENTER);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
                this.setText(String.format("%02d:%02d:%02d", hour, min, sec));
                
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}