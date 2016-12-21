import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import java.awt.Color;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel label;
	private JTextField textField_1;

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
		setTitle("欢迎登陆医院管理系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(150, 78, 595, 382);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(141, 114, 232, 50);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		textField = new JTextField();
		textField.setBounds(249, 122, 208, 35);
		panel.add(textField);
		textField.setFont(new Font("宋体", Font.PLAIN, 20));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(249, 181, 208, 35);
		panel.add(textField_1);
		textField_1.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_1.setColumns(10);
		
		label = new JLabel("密码");
		label.setBounds(141, 173, 232, 50);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("宋体", Font.BOLD, 20));
		
		btnNewButton = new JButton("登   录");
		btnNewButton.setBounds(259, 303, 136, 40);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		
		JLabel label_1 = new JLabel("您的身份");
		label_1.setBackground(new Color(175, 238, 238));
		label_1.setBounds(141, 233, 232, 50);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("宋体", Font.BOLD, 20));
		panel.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(249, 241, 208, 35);
		comboBox.setFont(new Font("宋体", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "管理员", "收费挂号员","医生","药库管理员","院长"}));
		panel.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("欢迎进入管理系统");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 30));
		lblNewLabel_1.setBounds(198, 24, 335, 50);
		panel.add(lblNewLabel_1);
	}
}
