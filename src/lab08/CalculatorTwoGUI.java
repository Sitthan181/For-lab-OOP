import javax.swing.*;
import java.awt.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JTextField txt;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton bPlus, bMinus, bMul, bDiv, bEqual, bClear;
    private JPanel p;
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
}
