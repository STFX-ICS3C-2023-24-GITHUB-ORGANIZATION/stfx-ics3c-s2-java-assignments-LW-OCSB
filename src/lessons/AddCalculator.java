package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCalculator {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalculator window = new AddCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel myLabel1 = new JLabel("Add Calculator");
		myLabel1.setFont(new Font("Tahoma", Font.BOLD, 18));
		myLabel1.setBounds(145, 38, 201, 24);
		frame.getContentPane().add(myLabel1);
		
		JLabel myLabel2 = new JLabel("First Number");
		myLabel2.setFont(new Font("Tahoma", Font.BOLD, 12));
		myLabel2.setBounds(62, 118, 78, 14);
		frame.getContentPane().add(myLabel2);
		
		JLabel myLabel3 = new JLabel("Second Number");
		myLabel3.setFont(new Font("Tahoma", Font.BOLD, 12));
		myLabel3.setBounds(62, 163, 101, 14);
		frame.getContentPane().add(myLabel3);
		
		JLabel myLabel4 = new JLabel("Sum");
		myLabel4.setFont(new Font("Tahoma", Font.BOLD, 12));
		myLabel4.setBounds(62, 212, 46, 14);
		frame.getContentPane().add(myLabel4);
		
		textField1 = new JTextField();
		textField1.setBounds(186, 116, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(186, 161, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(186, 210, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JButton button1 = new JButton("ADD");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code goes here
				
				// variables
				int num1 = 0;
				int num2 = 0;
				int answer = 0;
				
				// get input
				num1 = Integer.parseInt(textField1.getText());
				num2 = Integer.parseInt(textField2.getText());
				
				// processing
				answer = num1 + num2;
				
				// output
				textField3.setText(Integer.toString(answer));
				
				
			}
		});
		button1.setBounds(315, 160, 89, 23);
		frame.getContentPane().add(button1);
	}
}
