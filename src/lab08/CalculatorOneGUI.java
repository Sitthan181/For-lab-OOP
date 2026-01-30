import javax.swing.*;
import java.awt.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JTextField txt, txt01, txtresult;
    private JButton btnAdd, btnSub, btnMul, btnDiv;
    private JPanel p;
    public CalculatorOneGUI() {
        fr = new JFrame("kurnkedlek");
        fr.setLayout(new GridLayout(4, 1));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnAdd = new JButton("+");
        btnSub = new JButton("-");
        btnMul = new JButton("*");
        btnDiv = new JButton("/");
        
        txt = new JTextField();
        txt01 = new JTextField();
        txtresult = new JTextField();
        
        p = new JPanel();
        p.setLayout(new FlowLayout());
        
        p.add(btnAdd);
        p.add(btnSub);
        p.add(btnMul);
        p.add(btnDiv);

        fr.add(txt);
        fr.add(txt01);
        fr.add(p);
        fr.add(txtresult);
        
        fr.pack();
        fr.setVisible(true);
        
    }
}
