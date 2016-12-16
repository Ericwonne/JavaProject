import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.DropMode;
import javax.swing.JTextArea;

public class Doctor_LoginedOn extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_7;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor_LoginedOn frame = new Doctor_LoginedOn();
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
	public Doctor_LoginedOn() {
		setBackground(SystemColor.textHighlight);
		setTitle("医护人员后台系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 640);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(14, 0, 417, 55);
		menuBar.setForeground(new Color(0, 255, 0));
		menuBar.setBackground(new Color(128, 128, 0));
		menuBar.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
		getContentPane().add(menuBar);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("就诊详情页");
		mntmNewMenuItem_1.setBackground(new Color(240, 230, 140));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				JOptionPane.showMessageDialog(mntmNewMenuItem_1,"sss");
				
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		menuBar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("就针队列");
		mntmNewMenuItem.setBackground(new Color(240, 230, 140));
		mntmNewMenuItem.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
		menuBar.add(mntmNewMenuItem);
		
		JButton btnNewButton = new JButton("注销");
		btnNewButton.setBounds(874, 19, 78, 33);
		btnNewButton.setBackground(new Color(192, 192, 192));
		getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 68, 277, 472);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("患者信息");
		label_1.setBounds(101, 13, 72, 18);
		label_1.setFont(new Font("幼圆", Font.BOLD, 15));
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("就诊号");
		label_2.setBounds(0, 48, 72, 18);
		panel.add(label_2);
		
		JLabel label_4 = new JLabel("性别");
		label_4.setBounds(0, 221, 72, 18);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("年龄");
		label_5.setBounds(0, 276, 72, 18);
		panel.add(label_5);
		
		JLabel label_8 = new JLabel("类型");
		label_8.setBounds(0, 386, 72, 18);
		panel.add(label_8);
		
		textField = new JTextField();
		textField.setBounds(0, 64, 263, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(0, 184, 263, 24);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(0, 236, 263, 24);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(0, 293, 263, 24);
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		JLabel label_9 = new JLabel("挂号科室");
		label_9.setBounds(0, 330, 72, 18);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("身份证号");
		label_10.setBounds(0, 110, 72, 18);
		panel.add(label_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(0, 405, 263, 24);
		textField_8.setColumns(10);
		panel.add(textField_8);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(0, 349, 263, 24);
		panel.add(textField_7);
		
		JLabel label_3 = new JLabel("姓名");
		label_3.setBounds(0, 163, 72, 18);
		panel.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 126, 263, 24);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(SystemColor.desktop);
		separator.setBackground(SystemColor.desktop);
		separator.setBounds(265, -19, 12, 474);
		panel.add(separator);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(578, 59, 404, 481);
		panel_5.setForeground(SystemColor.desktop);
		getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label_15 = new JLabel("添加药品");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("幼圆", Font.BOLD, 15));
		label_15.setBounds(0, 0, 106, 61);
		panel_5.add(label_15);
		
		textField_4 = new JTextField();
		textField_4.setBounds(100, 18, 177, 24);
		panel_5.add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("查询");
		button.setBackground(new Color(189, 183, 107));
		button.setBounds(291, 17, 72, 24);
		panel_5.add(button);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 55, 390, 432);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"药品名"}));
		comboBox.setBounds(14, 73, 177, 24);
		panel_6.add(comboBox);
		
		JLabel label_7 = new JLabel("添加药品");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("幼圆", Font.BOLD, 15));
		label_7.setBounds(0, 12, 106, 61);
		panel_6.add(label_7);
		
		JButton button_1 = new JButton("添加");
		button_1.setBackground(new Color(189, 183, 107));
		button_1.setBounds(273, 73, 72, 24);
		panel_6.add(button_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"数量"}));
		comboBox_1.setBounds(189, 73, 59, 24);
		panel_6.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setToolTipText("");
		textArea.setColumns(20);
		textArea.setFont(new Font("楷体", Font.PLAIN, 16));
		textArea.setEditable(false);
		textArea.setText("药品名1数量1,药品名2数量2,药品名3数量3,药品名4数量4，\r\n药品名5数量5");
		textArea.setBounds(14, 125, 369, 121);
		panel_6.add(textArea);
		
		JButton btnNewButton_1 = new JButton("确认开药");
		btnNewButton_1.setBounds(124, 272, 113, 27);
		panel_6.add(btnNewButton_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(SystemColor.desktop);
		separator_1.setBackground(SystemColor.desktop);
		separator_1.setBounds(0, 0, 12, 474);
		panel_5.add(separator_1);
		
		JLabel label = new JLabel("当前医生：");
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label.setBounds(14, 554, 105, 24);
		getContentPane().add(label);
		
		JLabel label_6 = new JLabel("李成立");
		label_6.setForeground(new Color(0, 0, 255));
		label_6.setFont(new Font("华文隶书", Font.PLAIN, 20));
		label_6.setBounds(115, 556, 180, 24);
		getContentPane().add(label_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(300, 68, 277, 472);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.ITALIC, 16));
		textArea_1.setText("病情描述......");
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(0, 0, 277, 113);
		panel_1.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setWrapStyleWord(true);
		textArea_2.setText("诊断分析......");
		textArea_2.setLineWrap(true);
		textArea_2.setFont(new Font("Monospaced", Font.ITALIC, 16));
		textArea_2.setBounds(0, 116, 277, 113);
		panel_1.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setWrapStyleWord(true);
		textArea_3.setText("处方......");
		textArea_3.setLineWrap(true);
		textArea_3.setFont(new Font("Monospaced", Font.ITALIC, 16));
		textArea_3.setBounds(0, 233, 277, 124);
		panel_1.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setWrapStyleWord(true);
		textArea_4.setText("收费项目......\r\n");
		textArea_4.setLineWrap(true);
		textArea_4.setFont(new Font("Monospaced", Font.ITALIC, 16));
		textArea_4.setBounds(0, 359, 277, 113);
		panel_1.add(textArea_4);
		
		JButton button_2 = new JButton("提交");
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(822, 548, 118, 40);
		getContentPane().add(button_2);
	}
}
