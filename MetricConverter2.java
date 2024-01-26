package objectorientedprogram;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MetricConverter2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    private JLabel unitLabelOriginal;
    private JLabel unitLabelConverted;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MetricConverter2 frame = new MetricConverter2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MetricConverter2() {
        setForeground(new Color(102, 102, 153));
        setBackground(new Color(139, 142, 182));
        setFont(new Font("Forte", Font.PLAIN, 18));
        setTitle("METRIC CONVERSION");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(220, 220, 220));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("ORIGINAL VALUE");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel.setBounds(44, 32, 129, 14);
        contentPane.add(lblNewLabel);

        unitLabelOriginal = new JLabel("Metric Unit");
        unitLabelOriginal.setFont(new Font("Arial", Font.PLAIN, 12));
        unitLabelOriginal.setBounds(276, 36, 89, 14);
        contentPane.add(unitLabelOriginal);

        JLabel lblNewLabel_1 = new JLabel("CONVERTED VALUE");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblNewLabel_1.setBounds(44, 83, 129, 14);
        contentPane.add(lblNewLabel_1);

        unitLabelConverted = new JLabel("Metric Unit");
        unitLabelConverted.setFont(new Font("Arial", Font.PLAIN, 12));
        unitLabelConverted.setBounds(276, 87, 63, 14);
        contentPane.add(unitLabelConverted);

        textField = new JTextField();
        textField.setBounds(183, 30, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(183, 81, 86, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JButton btnNewButton = new JButton("cm - m");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double originalValue = Double.parseDouble(textField.getText());
                double convertedValue = centimetersToMeters(originalValue);
                textField.setText(String.valueOf(originalValue));
                textField_1.setText(String.valueOf(convertedValue));
                unitLabelOriginal.setText("cm");
                unitLabelConverted.setText("m");
            }
        });
        btnNewButton.setBounds(44, 193, 89, 23);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("inch - cm");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double originalValue = Double.parseDouble(textField.getText());
                double convertedValue = inchesToCentimeters(originalValue);
                textField.setText(String.valueOf(originalValue));
                textField_1.setText(String.valueOf(convertedValue));
                unitLabelOriginal.setText("inch");
                unitLabelConverted.setText("cm");
            }
        });
        btnNewButton_1.setBounds(183, 193, 89, 23);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("m - ft ");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double originalValue = Double.parseDouble(textField.getText());
                double convertedValue = metersToFeet(originalValue);
                textField_1.setText(String.valueOf(convertedValue));
                unitLabelOriginal.setText("m");
                unitLabelConverted.setText("ft");
            }
        });
        btnNewButton_2.setBounds(315, 193, 89, 23);
        contentPane.add(btnNewButton_2);
    }

        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
    
    private static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    private static double centimetersToMeters(double centimeters) {
        return centimeters / 100.0;
    }

    private static double metersToFeet(double meters) {
        return meters * 3.281;
    }
}