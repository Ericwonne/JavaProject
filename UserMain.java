import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class UserMain {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UserMain window = new UserMain();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public UserMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(SystemColor.desktop);
		frame.getContentPane().setForeground(SystemColor.textHighlight);
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 615, 717);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("姓名");
		lblNewLabel.setBounds(44, 55, 112, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("性别");
		label.setBounds(44, 101, 112, 18);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("年龄");
		label_1.setBackground(SystemColor.activeCaption);
		label_1.setBounds(44, 147, 112, 18);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("联系方式");
		label_2.setBounds(44, 195, 112, 18);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("常用住址");
		label_3.setBounds(44, 244, 112, 18);
		frame.getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBounds(195, 55, 274, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 144, 274, 24);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(195, 192, 274, 24);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(195, 241, 274, 24);
		frame.getContentPane().add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "男", "女"}));
		comboBox.setBounds(195, 98, 274, 24);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("提交");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("Hello World");
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 15));
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(203, 550, 113, 27);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 303, 274, 24);
		frame.getContentPane().add(textField_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(195, 379, 274, 24);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(195, 453, 274, 24);
		frame.getContentPane().add(textField_6);
		
		JLabel label_4 = new JLabel("挂号医生");
		label_4.setBounds(44, 306, 112, 18);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("挂号科室");
		label_5.setBounds(44, 382, 112, 18);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("。。。");
		label_6.setBounds(44, 456, 112, 18);
		frame.getContentPane().add(label_6);
	}

}
