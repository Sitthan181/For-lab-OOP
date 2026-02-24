package lab12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener {
    private JFrame frame;
    private JTextArea textArea;
    private JTextField textField;
    private JPanel buttonPanel;
    private JButton btnSubmit, btnReset;

    public ChatDemo() {
        frame = new JFrame("ChatDemo");
        textArea = new JTextArea(20, 45);
        textArea.setEditable(false);
        
        textField = new JTextField(45);
        
        btnSubmit = new JButton("Submit");
        btnReset = new JButton("Reset");
        
        buttonPanel = new JPanel();
        buttonPanel.add(btnSubmit);
        buttonPanel.add(btnReset);
        
        btnSubmit.addActionListener(this);
        btnReset.addActionListener(this);
        frame.addWindowListener(this);
        
        frame.setLayout(new BorderLayout());
        frame.add(textArea, BorderLayout.NORTH);
        frame.add(textField, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        loadHistory();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String timestamp = dtf.format(LocalDateTime.now());
            textArea.append(timestamp + " : " + textField.getText() + "\n");
            textField.setText("");
        } else if (e.getSource() == btnReset) {
            textArea.setText("");
        }
    }

    private void loadHistory() {
        File f = new File("ChatDemo.dat");
        if (f.exists()) {
            try (FileReader fr = new FileReader(f);
                 BufferedReader br = new BufferedReader(fr)) {
                String line;
                while ((line = br.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveHistory() {
        try (FileWriter fw = new FileWriter("ChatDemo.dat");
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(textArea.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Wind_Listener methods
    public void windowClosing(WindowEvent e) { saveHistory(); }
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}