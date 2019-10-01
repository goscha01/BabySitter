import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI {
    public   void guiBuilder() {


        JFrame frame = new JFrame("Babysitter Earning ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLocation(430, 100);


        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel startlbl = new JLabel("Select a start time");
        panel.add(startlbl);


        JComboBox startcb = new JComboBox();
        panel.add(startcb);

        JLabel finishlbl = new JLabel("Select a finish time");
        panel.add(finishlbl);

        JComboBox finishcb = new JComboBox();
        panel.add(finishcb);

        JLabel familylbl = new JLabel("Select a Family");
        panel.add(familylbl);

        JRadioButton familyrb1 = new JRadioButton ("Family 1");
        familyrb1.setVisible(true);
        JRadioButton familyrb2 = new JRadioButton ("Family 2");
        familyrb2.setVisible(true);
        JRadioButton familyrb3 = new JRadioButton ("Family 3");
        familyrb3.setVisible(true);
        panel.add(familyrb1);
        panel.add(familyrb2);
        panel.add(familyrb3);

        JButton btn = new JButton("Calculate");
        panel.add(btn);

        frame.setVisible(true);


    }

}
