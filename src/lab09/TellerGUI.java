
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TellerGUI implements ActionListener {
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JLabel lb1, lb2;
    private JTextField txt1, txt2;
    private JButton btn1, btn2, btn3;
    private Account account;

    public TellerGUI() {
        account = new Account(6000, "Sitthan");
        fr = new JFrame("Teller GUI - " + account.getName());
        
        lb1 = new JLabel("Balance");
        txt1 = new JTextField(Double.toString(account.getBalance()));
        txt1.setEditable(false);
        p1 = new JPanel(new GridLayout(1, 2));
        p1.add(lb1);
        p1.add(txt1);

        lb2 = new JLabel("Amount");
        txt2 = new JTextField();
        p2 = new JPanel(new GridLayout(1, 2));
        p2.add(lb2);
        p2.add(txt2);

        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        p3 = new JPanel(new FlowLayout());
        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);
        
        // Add action listener
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        p4 = new JPanel(); 

        fr.setLayout(new GridLayout(4, 1));
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        double amount = Double.parseDouble(txt2.getText());
     
        if (source.equals(btn1)) {
            account.deposit(amount);
            txt1.setText(String.valueOf(account.getBalance()));
        }
        else if (source.equals(btn2)) {
            account.withdraw(amount);
            txt1.setText(String.valueOf(account.getBalance()));
        }
        else if (source.equals(btn3)) {
            System.exit(0);
        }
    }
}