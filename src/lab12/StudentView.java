package lab12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener {
    private JFrame frame;
    private JTextField txtID, txtName, txtMoney;
    private JButton btnDeposit, btnWithdraw;
    private Student student;

    public StudentView() {
        student = new Student();
        frame = new JFrame("Student Profile");
        txtID = new JTextField();
        txtName = new JTextField();
        txtMoney = new JTextField("0");
        txtMoney.setEditable(false);
        
        btnDeposit = new JButton("Deposit");
        btnWithdraw = new JButton("Withdraw");
        
        frame.setLayout(new GridLayout(4, 2));
        frame.add(new JLabel(" ID:")); frame.add(txtID);
        frame.add(new JLabel(" Name:")); frame.add(txtName);
        frame.add(new JLabel(" Money:")); frame.add(txtMoney);
        frame.add(btnDeposit); frame.add(btnWithdraw);
        
        btnDeposit.addActionListener(this);
        btnWithdraw.addActionListener(this);
        frame.addWindowListener(this);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        loadData();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int currentMoney = Integer.parseInt(txtMoney.getText());
        if (e.getSource() == btnDeposit) {
            currentMoney += 100;
        } else if (e.getSource() == btnWithdraw) {
            if (currentMoney >= 100) currentMoney -= 100;
        }
        txtMoney.setText(String.valueOf(currentMoney));
    }

    private void loadData() {
        File f = new File("StudentM.dat");
        if (f.exists()) {
            try (FileInputStream fis = new FileInputStream(f);
                 ObjectInputStream ois = new ObjectInputStream(fis)) {
                student = (Student) ois.readObject();
                txtID.setText(String.valueOf(student.getID()));
                txtName.setText(student.getName());
                txtMoney.setText(String.valueOf(student.getMoney()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void saveData() {
        try (FileOutputStream fos = new FileOutputStream("StudentM.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            student.setID(Integer.parseInt(txtID.getText().equals("") ? "0" : txtID.getText()));
            student.setName(txtName.getText());
            student.setMoney(Integer.parseInt(txtMoney.getText()));
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void windowClosing(WindowEvent e) { saveData(); }
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}