package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AverageCalculatorGUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AverageCalculatorGUI window = new AverageCalculatorGUI();
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
	public AverageCalculatorGUI() {
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
		
		JLabel label1 = new JLabel("Average Calculator");
		label1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label1.setBounds(138, 21, 189, 22);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Test 1");
		label2.setBounds(44, 74, 46, 14);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Test 2");
		label3.setBounds(44, 107, 46, 14);
		frame.getContentPane().add(label3);
		
		JLabel label4 = new JLabel("Test 3");
		label4.setBounds(44, 142, 46, 14);
		frame.getContentPane().add(label4);
		
		JLabel label5 = new JLabel("Test 4");
		label5.setBounds(44, 176, 46, 14);
		frame.getContentPane().add(label5);
		
		JLabel label6 = new JLabel("Average");
		label6.setBounds(44, 213, 46, 14);
		frame.getContentPane().add(label6);
		
		textField1 = new JTextField();
		textField1.setBounds(122, 71, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(122, 104, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(122, 142, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(122, 183, 86, 20);
		frame.getContentPane().add(textField4);
		textField4.setColumns(10);
		
		textField5 = new JTextField();
		textField5.setBounds(122, 213, 86, 20);
		frame.getContentPane().add(textField5);
		textField5.setColumns(10);
		
		JButton button1 = new JButton("Average");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// start
				
				// variables
				int test1 = 0;
				int test2 = 0;
				int test3 = 0;
				int test4 = 0;
				int average = 0;
				
				// input
				test1 = Integer.parseInt(textField1.getText());
				test2 = Integer.parseInt(textField2.getText());
				test3 = Integer.parseInt(textField3.getText());
				test4 = Integer.parseInt(textField4.getText());
				
				// processing
				average = (test1 + test2 + test3 + test4) / 4;
				
				// output
				textField5.setText(Integer.toString(average));
				
				
				
				// end
			}
		});
		button1.setBounds(279, 133, 89, 23);
		frame.getContentPane().add(button1);
	}
}
