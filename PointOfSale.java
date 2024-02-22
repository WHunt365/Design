package pointofsal;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class PointOfSale extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTable table;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PointOfSale frame = new PointOfSale();
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
    public PointOfSale() {
    	setBackground(new Color(175, 238, 238));
        setTitle("Point Of Sale");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 835, 536);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 6, 79));
        contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(400, 270, 96, 19);
        textField.setFont(new Font("Calisto MT", Font.BOLD, 13));
        textField.setBackground(new Color(240, 248, 255));
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(400, 295, 96, 19);
        textField_1.setFont(new Font("Calisto MT", Font.BOLD, 13));
        textField_1.setBackground(new Color(240, 248, 255));
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setBounds(400, 320, 96, 19);
        textField_2.setFont(new Font("Calisto MT", Font.BOLD, 13));
        textField_2.setBackground(new Color(240, 248, 255));
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setBounds(400, 345, 96, 19);
        textField_3.setFont(new Font("Calisto MT", Font.BOLD, 13));
        textField_3.setBackground(new Color(240, 248, 255));
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setBounds(410, 390, 96, 19);
        textField_4.setFont(new Font("Calisto MT", Font.BOLD, 15));
        textField_4.setEditable(false);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(680, 390, 96, 19);
        textField_5.setFont(new Font("SansSerif", Font.PLAIN, 16));
        textField_5.setEditable(false);
        contentPane.add(textField_5);
        textField_5.setColumns(10);
        
        textField_6 = new JTextField();
        textField_6.setFont(new Font("SansSerif", Font.PLAIN, 17));
        textField_6.setBounds(150, 415, 96, 19);
        contentPane.add(textField_6);
        textField_6.setColumns(10);
        
        textField_7 = new JTextField();
        textField_7.setFont(new Font("SansSerif", Font.PLAIN, 17));
        textField_7.setEditable(false);
        textField_7.setBounds(150, 443, 96, 19);
        contentPane.add(textField_7);
        textField_7.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Barcode");
        lblNewLabel.setBounds(300, 270, 82, 13);
        lblNewLabel.setForeground(new Color(0, 191, 255));
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Item Name");
        lblNewLabel_1.setBounds(300, 295, 96, 13);
        lblNewLabel_1.setForeground(new Color(0, 191, 255));
        lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Item Price");
        lblNewLabel_2.setBounds(300, 320, 96, 13);
        lblNewLabel_2.setForeground(new Color(0, 191, 255));
        lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Quantity");
        lblNewLabel_3.setBounds(300, 345, 96, 13);
        lblNewLabel_3.setForeground(new Color(0, 191, 255));
        lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Sub Total");
        lblNewLabel_4.setBounds(320, 390, 96, 13);
        lblNewLabel_4.setForeground(new Color(0, 191, 255));
        lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Grand Total");
        lblNewLabel_5.setBounds(565, 390, 106, 13);
        lblNewLabel_5.setForeground(new Color(0, 255, 255));
        lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 18));
        contentPane.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Point Of Sale");
        lblNewLabel_6.setForeground(new Color(0, 255, 255));
        lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 23));
        lblNewLabel_6.setBounds(340, 0, 153, 35);
        contentPane.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("Amount Given");
        lblNewLabel_7.setForeground(new Color(0, 255, 255));
        lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 17));
        lblNewLabel_7.setBounds(32, 418, 116, 13);
        contentPane.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("Change");
        lblNewLabel_8.setForeground(new Color(0, 255, 255));
        lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 17));
        lblNewLabel_8.setBounds(35, 443, 62, 13);
        contentPane.add(lblNewLabel_8);
        
        JButton btnNewButton = new JButton("ADD");
        btnNewButton.setBounds(600, 440, 85, 21);
        btnNewButton.setForeground(new Color(0, 0, 139));
        btnNewButton.setBackground(Color.LIGHT_GRAY);
        btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("PRINT");
        btnNewButton_1.setBounds(700, 440, 85, 21);
        btnNewButton_1.setBackground(Color.LIGHT_GRAY);
        btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        btnNewButton_1.setForeground(new Color(0, 0, 139));
        contentPane.add(btnNewButton_1);
        
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        textArea.setEditable(false);
        textArea.setBounds(35, 45, 250, 350);
        contentPane.add(textArea);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(300, 45, 487, 207);
        contentPane.add(scrollPane);
        
        table = new JTable();
        table.setBackground(new Color(0, 255, 255));
        table.setBorder(new CompoundBorder());
        scrollPane.setViewportView(table);
        table.setColumnSelectionAllowed(true);
        table.setCellSelectionEnabled(true);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Barcode", "ITEM NAME", "PRICE", "QUANTITY", "TOTAL"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		String.class, Object.class, Float.class, Object.class, Object.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        });
        table.getColumnModel().getColumn(0).setPreferredWidth(105);
        table.getColumnModel().getColumn(0).setMinWidth(25);
        table.getColumnModel().getColumn(1).setPreferredWidth(115);
        table.getColumnModel().getColumn(1).setMinWidth(25);
        table.getColumnModel().getColumn(2).setPreferredWidth(105);
        table.getColumnModel().getColumn(3).setPreferredWidth(105);
        table.getColumnModel().getColumn(4).setPreferredWidth(105);
        
     
        textField_4.setText("0.00");
        textField_5.setText("0.00");

        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String barcode = textField.getText();
                String itemName = textField_1.getText();
                float itemPrice = Float.parseFloat(textField_2.getText());
                int quantity = Integer.parseInt(textField_3.getText());

                
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");

                
                float subtotal = itemPrice * quantity;

                
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(new Object[]{barcode, itemName, itemPrice, quantity, subtotal});

                
                float currentSubtotal = Float.parseFloat(textField_4.getText());
                currentSubtotal += subtotal;
                textField_4.setText(String.valueOf(currentSubtotal));

                
                float currentGrandTotal = Float.parseFloat(textField_5.getText());
                currentGrandTotal += subtotal;
                textField_5.setText(String.valueOf(currentGrandTotal));
            }
        });

        
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder receipt = new StringBuilder();
                receipt.append("------ Receipt ------\n");
                receipt.append(String.format("%-5s %-5s %-6s %-10s %-10s\n", "Barcode", "Item", "Price", "Quantity", "Total"));

                
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                float totalAmount = 0;
                for (int i = 0; i < model.getRowCount(); i++) {
                    String barcode = model.getValueAt(i, 0).toString();
                    String itemName = model.getValueAt(i, 1).toString();
                    String price = model.getValueAt(i, 2).toString();
                    String quantity = model.getValueAt(i, 3).toString();
                    String total = model.getValueAt(i, 4).toString();
                    receipt.append(String.format("%-5s %-5s %-6s %-10s %-10s\n", barcode, itemName, price, quantity, total));
                    totalAmount += Float.parseFloat(total);
                }

                receipt.append("---------------------\n");
                receipt.append("Subtotal: ₱" + textField_4.getText() + "\n");
                receipt.append("Grand Total: ₱" + textField_5.getText() + "\n");
                float amountGiven = Float.parseFloat(textField_6.getText());
                float change = amountGiven - totalAmount;
                textField_7.setText(String.format("%.2f", change));
                receipt.append("Amount Given: ₱" + textField_6.getText() + "\n");
                receipt.append("Change: ₱" + textField_7.getText() + "\n");
                
                textField_4.setText("0.00");
                textField_5.setText("0.00");
                textField_6.setText("");
                
                
                textArea.setText(receipt.toString());
            }
        });
     }
  }


