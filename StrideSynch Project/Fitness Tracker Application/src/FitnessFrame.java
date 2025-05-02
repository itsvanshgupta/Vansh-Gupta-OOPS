import javax.swing.*;
import java.awt.*;

public class FitnessFrame extends JFrame {

    public FitnessFrame() {
        setTitle("💪 Creative Fitness Tracker");
        setSize(400, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        add(new TrackerPanel(), BorderLayout.CENTER);

        setVisible(true);
    }
}
