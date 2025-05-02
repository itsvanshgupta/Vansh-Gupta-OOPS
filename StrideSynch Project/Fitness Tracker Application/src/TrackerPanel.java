import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TrackerPanel extends JPanel {
    private JTextField stepsField, waterField, sleepField;
    private JTextField stepsGoalField, waterGoalField, sleepGoalField;
    private JProgressBar stepsBar, waterBar, sleepBar;
    private JTextArea resultArea;
    private final String[] tips = {
            "Stay consistent and results will follow!",
            "Hydration is key to energy! 💧",
            "Aim for 7-8 hours of sleep daily 🛏️",
            "A 30-min walk boosts mood & heart health ❤️",
            "Small progress is still progress. 👣",
            "Healthy habits = a healthy life!"
    };

    public TrackerPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(245, 250, 255));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel inputPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        inputPanel.setBackground(getBackground());

        stepsField = new JTextField();
        waterField = new JTextField();
        sleepField = new JTextField();

        stepsGoalField = new JTextField("10000");
        waterGoalField = new JTextField("2000");
        sleepGoalField = new JTextField("8");

        inputPanel.add(label("🚶 Steps walked:"));
        inputPanel.add(stepsField);

        inputPanel.add(label("🎯 Steps goal:"));
        inputPanel.add(stepsGoalField);

        inputPanel.add(label("💧 Water (ml):"));
        inputPanel.add(waterField);

        inputPanel.add(label("🎯 Water goal:"));
        inputPanel.add(waterGoalField);

        inputPanel.add(label("🛏️ Sleep (hrs):"));
        inputPanel.add(sleepField);

        inputPanel.add(label("🎯 Sleep goal:"));
        inputPanel.add(sleepGoalField);

        JButton trackButton = new JButton("Track My Day!");
        trackButton.setFont(new Font("Arial", Font.BOLD, 14));
        trackButton.setBackground(new Color(70, 130, 180));
        trackButton.setForeground(Color.WHITE);
        trackButton.addActionListener(e -> calculateProgress());

        stepsBar = new JProgressBar(0, 100);
        waterBar = new JProgressBar(0, 100);
        sleepBar = new JProgressBar(0, 100);

        stepsBar.setStringPainted(true);
        waterBar.setStringPainted(true);
        sleepBar.setStringPainted(true);

        JPanel progressPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        progressPanel.setBackground(getBackground());
        progressPanel.setBorder(BorderFactory.createTitledBorder("📊 Progress"));

        progressPanel.add(labeledBar("Steps", stepsBar));
        progressPanel.add(labeledBar("Water", waterBar));
        progressPanel.add(labeledBar("Sleep", sleepBar));

        resultArea = new JTextArea(4, 20);
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
        resultArea.setBorder(BorderFactory.createTitledBorder("🧠 Today's Tip"));

        JScrollPane resultScroll = new JScrollPane(resultArea);

        add(inputPanel, BorderLayout.NORTH);
        add(trackButton, BorderLayout.CENTER);
        add(progressPanel, BorderLayout.SOUTH);
        add(resultScroll, BorderLayout.SOUTH);

        // Layer panels nicely
        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.setBackground(getBackground());
        centerPanel.add(trackButton, BorderLayout.NORTH);
        centerPanel.add(progressPanel, BorderLayout.CENTER);
        centerPanel.add(resultScroll, BorderLayout.SOUTH);

        add(inputPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
    }

    private JLabel label(String text) {
        JLabel l = new JLabel(text);
        l.setFont(new Font("SansSerif", Font.BOLD, 14));
        return l;
    }

    private JPanel labeledBar(String name, JProgressBar bar) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(getBackground());
        panel.add(new JLabel(name), BorderLayout.WEST);
        panel.add(bar, BorderLayout.CENTER);
        return panel;
    }

    private void calculateProgress() {
        try {
            int steps = Integer.parseInt(stepsField.getText().trim());
            int stepsGoal = Integer.parseInt(stepsGoalField.getText().trim());

            int water = Integer.parseInt(waterField.getText().trim());
            int waterGoal = Integer.parseInt(waterGoalField.getText().trim());

            double sleep = Double.parseDouble(sleepField.getText().trim());
            double sleepGoal = Double.parseDouble(sleepGoalField.getText().trim());

            stepsBar.setValue(Math.min(100, (int) ((steps * 100.0) / stepsGoal)));
            waterBar.setValue(Math.min(100, (int) ((water * 100.0) / waterGoal)));
            sleepBar.setValue(Math.min(100, (int) ((sleep * 100.0) / sleepGoal)));

            resultArea.setText(randomTip());

        } catch (NumberFormatException e) {
            resultArea.setText("⚠️ Please fill in all fields with valid numbers.");
        }
    }

    private String randomTip() {
        Random rand = new Random();
        return tips[rand.nextInt(tips.length)];
    }
}
