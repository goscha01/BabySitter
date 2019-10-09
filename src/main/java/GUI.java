package main.java;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
    public   void   guiBuilder() {

        //Builds a frame
        JFrame frame = new JFrame("Babysitter Earning ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLocation(430, 100);

        //Builds a  panel
        JPanel panel = new JPanel();
        frame.add(panel);

        //Puts a label for a start time
        JLabel startlbl = new JLabel("Select a start time");
        panel.add(startlbl);

        //Builds a dropbox with time values for the start time
        final JComboBox startcb = new JComboBox(TimeFrame.TIME_SPAN_STR);
        panel.add(startcb);

        //Puts a label for a finish  time
        JLabel finishlbl = new JLabel("Select a finish time");
        panel.add(finishlbl);

        //Builds a dropbox with time values for the finish time
        final JComboBox finishcb = new JComboBox(TimeFrame.TIME_SPAN_STR);
        panel.add(finishcb);

        //Puts a label for a family
        JLabel familylbl = new JLabel("Select a Family");
        panel.add(familylbl);

        //Puts radio buts for a family choise

        final JRadioButton familyrb1 = new JRadioButton ("Family 1");
        familyrb1.setVisible(true);
        final JRadioButton familyrb2 = new JRadioButton ("Family 2");
        familyrb2.setVisible(true);
        JRadioButton familyrb3 = new JRadioButton ("Family 3");
        familyrb3.setVisible(true);
        panel.add(familyrb1);
        panel.add(familyrb2);
        panel.add(familyrb3);

        //Groups radio buttons to be able to clear them
        final ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(familyrb1);
        buttonGroup.add(familyrb2);
        buttonGroup.add(familyrb3);

        //Puts the calculate button
        JButton btn = new JButton("Calculate");
        panel.add(btn);

        frame.setVisible(true);

        //The action after clicking the calculate button
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Assigned chosen values to variables
                String start = (String) startcb.getSelectedItem();
                String finish = (String) finishcb.getSelectedItem();
                Family family = new Family();

                //Family choice
                if (familyrb1.isSelected()){
                    family.earlyRate = 15;
                    family.betweenRate = 0;
                    family.lateRate = 20;
                    family.earlyRateLimit = "11PM";
                    family.lateRateLimit = "11PM";
                }
                else if (familyrb2.isSelected()) {
                    family.earlyRate = 12;
                    family.betweenRate = 8;
                    family.lateRate = 16;
                    family.earlyRateLimit = "10PM";
                    family.lateRateLimit = "12AM";
                }
                else {
                    family.earlyRate = 21;
                    family.betweenRate = 0;
                    family.lateRate = 15;
                    family.earlyRateLimit = "9PM";
                    family.lateRateLimit = "9PM";
                }

                BabySitter babySitter = new BabySitter();
                int result = babySitter.totalEarning(start, finish, family);


                //Result message
                JOptionPane.showMessageDialog(null,
                        "your nightly charge is $"+ result +" .",
                        "Result",
                        JOptionPane.OK_OPTION);

                //Cleans the radio buttons
                buttonGroup.clearSelection();

            }
        });

    }



}
