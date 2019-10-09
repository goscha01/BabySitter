import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import javax.swing.*;




public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(BabySitterTest.class);

        for (Failure failure : result.getFailures()) {
            JOptionPane.showMessageDialog(null,
                    "One or more of Tests failed!",
                    "Tests result",
                    JOptionPane.WARNING_MESSAGE);
            System.out.println(failure.toString());
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null,
                "Tests where successful",
                "Tests result",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println(result.wasSuccessful());

    }
}  	