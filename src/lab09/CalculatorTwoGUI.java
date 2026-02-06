import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class CalculatorTwoGUI implements ActionListener {
    private JFrame fr;
    private JTextField txt;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton bPlus, bMinus, bMul, bDiv, bEqual, bClear;
    private JPanel p;
    private double num1, num2, result;
    private String operator;
    public CalculatorTwoGUI(){
        fr = new JFrame("kurnkedlekbut9grid");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
                
        txt = new JTextField();
        p = new JPanel();
        p.setLayout(new GridLayout(4, 1));
        //b lai tam lamdab up -> down
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bPlus = new JButton("+");
        
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        bMinus = new JButton("-");
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        bMul = new JButton("x");
        
        b0 = new JButton("0");
        bClear = new JButton("C");
        bEqual = new JButton("=");
        bDiv = new JButton("/");
        
        //tam hai button kod dai
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bEqual.addActionListener(this);
        bClear.addActionListener(this);
        
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bPlus);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bMinus);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bMul);
        p.add(b0);
        p.add(bClear);
        p.add(bEqual);
        p.add(bDiv);

        fr.add(txt, BorderLayout.NORTH);
        fr.add(p, BorderLayout.CENTER);
        
        fr.pack();
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();

        if (command.matches("[0-9]")) {
            txt.setText(txt.getText() + command);
        } else if (command.equals("C")) {
            txt.setText("");
            num1 = 0;
            operator = "";
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(txt.getText());
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("x")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                if (num2 != 0) {
                    result = num1 / num2;
                }
            }
            txt.setText(String.valueOf(result));
        } else {
            num1 = Double.parseDouble(txt.getText());
            operator = command;
            txt.setText("");
        }
    }
}
