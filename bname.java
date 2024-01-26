package objectorientedprogram;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bname extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bname frame = new bname();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bname() {
		setAutoRequestFocus(false);
		setAlwaysOnTop(true);
		setForeground(new Color(102, 102, 153));
		setBackground(new Color(139, 142, 182));
		setFont(new Font("Forte", Font.PLAIN, 18));
		setTitle("METRIC CONVERSION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ORIGINAL VALUE");
		lblNewLabel.setBounds(44, 32, 129, 14);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CONVERTED VALUE ");
		lblNewLabel_1.setBounds(44, 83, 129, 14);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(231, 29, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(231, 80, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("cm - m");
		btnNewButton.setBounds(44, 193, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double originalValue = Double.parseDouble(textField.getText());
                double convertedValue = centimetersToMeters(originalValue);
                textField_1.setText(String.valueOf(convertedValue));
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("inch - cm");
		btnNewButton_1.setBounds(183, 193, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double originalValue = Double.parseDouble(textField.getText());
                double convertedValue = inchesToCentimeters(originalValue);
                textField_1.setText(String.valueOf(convertedValue));
            }
        });
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("m - ft ");
		btnNewButton_2.setBounds(315, 193, 89, 23);
		 btnNewButton_2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                double originalValue = Double.parseDouble(textField.getText());
	                double convertedValue = metersToFeet(originalValue);
	                textField_1.setText(String.valueOf(convertedValue));
	            }
	        });
		contentPane.add(btnNewButton_2);
		
    }

    
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