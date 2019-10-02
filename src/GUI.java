import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
    public   void   guiBuilder() {

        JFrame frame = new JFrame("Babysitter Earning ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLocation(430, 100);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel startlbl = new JLabel("Select a start time");
        panel.add(startlbl);

        JComboBox startcb = new JComboBox(TimeFrame.TIME_SPAN_STR);
        panel.add(startcb);

        JLabel finishlbl = new JLabel("Select a finish time");
        panel.add(finishlbl);

        JComboBox finishcb = new JComboBox(TimeFrame.TIME_SPAN_STR);
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

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(familyrb1);
        buttonGroup.add(familyrb2);
        buttonGroup.add(familyrb3);

        JButton btn = new JButton("Calculate");
        panel.add(btn);

        frame.setVisible(true);

        ///////////////////////

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String start = (String) startcb.getSelectedItem();
                String finish = (String) finishcb.getSelectedItem();
                Family family = new Family();

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
                int result = babySitter.TotalEarning(start, finish, family);


                JOptionPane.showMessageDialog(null,
                        "your nightly charge is $"+ result +" .",
                        "Result",
                        JOptionPane.OK_OPTION);

                buttonGroup.clearSelection();

            }
        });

    }



}
