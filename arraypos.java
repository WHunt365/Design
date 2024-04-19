package franceearray;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class arraypos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBarcode;
	private JTextField txtItem;
	private JTextField txtPrice;
	private JTextField txtQuantity;
	private JTextField txtSubtotal;
	private final String[] itemBarcodes = {"01","02","03","04"};
	private final String[] itemNames = {"back pack","sling bag","shoulder bag"," hand bag"};
	private final double[] itemPrices = {405,250,300,105};
	private double price;
	private int quantity;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arraypos frame = new arraypos();
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
	public arraypos() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 185, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("POINT OF SALES");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lblNewLabel.setBounds(148, 10, 118, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Barcode");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(48, 67, 50, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(242, 72, 45, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Item ");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(53, 116, 45, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quantity");
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(229, 117, 58, 28);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Subtotal");
		lblNewLabel_5.setFont(new Font("Sylfaen", Font.BOLD, 15));
		lblNewLabel_5.setBounds(130, 179, 69, 42);
		contentPane.add(lblNewLabel_5);
		
		txtBarcode = new JTextField();
		txtBarcode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                String enteredBarcode = txtBarcode.getText();
                int index = -1;
                for (int i = 0; i < itemBarcodes.length; i++) {
                    if (itemBarcodes[i].equals(enteredBarcode)) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    txtItem.setText(itemNames[index]);
                    txtPrice.setText(String.valueOf(itemPrices[index]));
                    txtQuantity.requestFocus();
                } else {
                    txtItem.setText("Product not found");
                    txtPrice.setText("");
                }
            }
			}
		});
		txtBarcode.setBounds(103, 67, 96, 22);
		contentPane.add(txtBarcode);
		txtBarcode.setColumns(10);
		
		txtItem = new JTextField();
		txtItem.setEditable(false);
		txtItem.setBounds(103, 116, 96, 23);
		contentPane.add(txtItem);
		txtItem.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setEditable(false);
		txtPrice.setBounds(292, 67, 96, 22);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtQuantity = new JTextField();
		txtQuantity.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 calculateSubtotal();
			}
		});
		txtQuantity.setBounds(292, 116, 96, 23);
		contentPane.add(txtQuantity);
		txtQuantity.setColumns(10);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setEditable(false);
		txtSubtotal.setBounds(203, 185, 69, 28);
		contentPane.add(txtSubtotal);
		txtSubtotal.setColumns(10);
	}
	  private void calculateSubtotal() {
	        try {
	            double price = Double.parseDouble(txtPrice.getText());
	            int quantity = Integer.parseInt(txtQuantity.getText());
	            double total = price * quantity;
	            txtSubtotal.setText(String.valueOf(total));
	        } catch (NumberFormatException e) {
	            txtSubtotal.setText("Invalid input");
	        }
	    }

	    public static void main1(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    arraypos frame = new arraypos();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
}
