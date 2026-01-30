import javax.swing.*;
import java.awt.*;

public class MDIFromGUI extends JFrame {

    private JDesktopPane desktopPane;

    public MDIFromGUI() {
        setTitle("SubMenuItem Demo");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // DesktopPane
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.BLACK);
        add(desktopPane);

        //MenuBar
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        JMenu menuView = new JMenu("View");

        // SubMenu
        JMenu subNew = new JMenu("New");
        JMenuItem miWindow = new JMenuItem("Window");
        JMenuItem miMessage = new JMenuItem("Message");

        subNew.add(miWindow);
        subNew.add(miMessage);

        JMenuItem miOpen = new JMenuItem("Open");
        JMenuItem miSave = new JMenuItem("Save");
        JMenuItem miExit = new JMenuItem("Exit");

        menuFile.add(subNew);
        menuFile.add(miOpen);
        menuFile.add(miSave);
        menuFile.addSeparator();
        menuFile.add(miExit);

        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuView);

        setJMenuBar(menuBar);

        // Frames
        createInternalFrame("Application 01", 50, 250);
        createInternalFrame("Application 02", 250, 100);
        createInternalFrame("Application 03", 450, 200);

        setVisible(true);
    }

    private void createInternalFrame(String title, int x, int y) {
        JInternalFrame frame = new JInternalFrame(
                title, true, true, true, true
        );
        frame.setSize(200, 120);
        frame.setLocation(x, y);
        frame.setVisible(true);

        desktopPane.add(frame);
    }
}