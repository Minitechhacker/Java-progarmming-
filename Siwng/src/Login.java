import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblLoginPage.setBounds(158, 43, 168, 54);
		contentPane.add(lblLoginPage);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		lblUsername.setBounds(12, 101, 146, 54);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		textField.setBounds(12, 148, 241, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblPassword.setBounds(12, 212, 156, 41);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
		textField_1.setBounds(12, 263, 241, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 29));
		btnSubmit.setBounds(19, 344, 139, 41);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 29));
		btnBack.setBounds(229, 344, 139, 40);
		contentPane.add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBounds(356, 89, 336, 196);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername_1 = new JLabel("username");
		lblUsername_1.setBounds(27, 52, 87, 16);
		panel.add(lblUsername_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(27, 78, 116, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPassword_1 = new JLabel("password");
		lblPassword_1.setBounds(27, 114, 56, 16);
		panel.add(lblPassword_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(27, 140, 116, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSubmit_1 = new JButton("submit");
		btnSubmit_1.setBounds(186, 93, 97, 25);
		panel.add(btnSubmit_1);
		
	/*	btnSubmit.setActionCommand("submit");
        btnBack.setActionCommand("back");
        
        btnSubmit.addActionListener(new ButtonClickListener());
	    btnBack.addActionListener(new ButtonClickListener());
	    
	    controlpanel.add(btnSubmit);*/
	}
}
