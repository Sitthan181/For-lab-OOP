package lab13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PoringConstructor extends JFrame implements ActionListener {
    private JButton btnAdd;
    private int poringCount = 0;

    public PoringConstructor() {
        this.setTitle("Poring Constructor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnAdd = new JButton("Add");
        btnAdd.addActionListener(this);
        
        this.add(btnAdd, BorderLayout.CENTER);
        this.setSize(200, 100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            poringCount++;
            new Poring(poringCount);
        }
    }
}