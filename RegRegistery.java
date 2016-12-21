import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JMenu;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;


public class RegRegistery extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField phone;
	private JTextField address;
	private JTextField ID;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					RegRegistery frame = new RegRegistery();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public RegRegistery() {
		setTitle("挂号页面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("身份证号");
		lblNewLabel.setBounds(183, 150, 167, 37);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("性别");
		label.setBounds(183, 244, 167, 37);
		label.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("年龄");
		label_1.setBounds(183, 291, 167, 37);
		label_1.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("联系方式");
		label_2.setBounds(183, 339, 167, 37);
		label_2.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("常用住址");
		label_3.setBounds(183, 387, 167, 37);
		label_3.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("挂号科室");
		label_4.setBounds(183, 434, 167, 37);
		label_4.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_4);
		
		name = new JTextField();
		name.setBounds(289, 197, 440, 33);
		contentPane.add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setBounds(289, 296, 440, 33);
		age.setColumns(10);
		contentPane.add(age);
		
		phone = new JTextField();
		phone.setBounds(289, 344, 440, 33);
		phone.setColumns(10);
		contentPane.add(phone);
		
		address = new JTextField();
		address.setBounds(289, 386, 440, 33);
		address.setColumns(10);
		contentPane.add(address);
		
		final JComboBox sex = new JComboBox();
		sex.setBounds(289, 248, 440, 33);
		sex.setModel(new DefaultComboBoxModel(new String[] { "男", "女"}));
		contentPane.add(sex);
		
		final JComboBox dept = new JComboBox();
		dept.setBounds(289, 434, 440, 33);
		dept.setModel(new DefaultComboBoxModel(new String[] {"", "儿科", "妇科", "内科", "神经科", "耳鼻喉科"}));
		contentPane.add(dept);
		
		
		JButton btnNewButton = new JButton("确  认");
		btnNewButton.setBounds(443, 503, 120, 37);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String id1=ID.getText();
				String name1=name.getText();
				String sex1= sex.getSelectedItem().toString();
				String dept1 = dept.getSelectedItem().toString();
				String age1=age.getText();
				String address1=address.getText();
				String phone1=phone.getText();
				if(id1.equals("")||name1.equals("")||sex1.equals("")||dept1.equals("")||age1.toString().equals(""))
				{
					JOptionPane.showMessageDialog(null, "请填写所有带 * 的必填项目！");
					return;
				}
				User user=new User();
			    user.setID(id1);
			    user.setName(name1);
			    user.setSex(sex1);
			    user.setAge(Integer.parseInt(age1));
			    user.setAddress(address1);
			    user.setPhone(phone1);
			    user.setDeptid(dept1);
				RegPaymentConfirm page=new RegPaymentConfirm(user);
				page.setVisible(true);
				setVisible(false);				
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel label_5 = new JLabel("姓名");
		label_5.setBounds(183, 197, 167, 37);
		label_5.setFont(new Font("宋体", Font.PLAIN, 22));
		contentPane.add(label_5);
		
		ID = new JTextField();
		ID.setBounds(289, 150, 440, 33);
		ID.setColumns(10);
		contentPane.add(ID);
		
		JLabel lblNewLabel_1 = new JLabel("挂号信息填写");
		lblNewLabel_1.setBounds(183, 62, 602, 47);
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_6 = new JLabel("*");
		label_6.setBounds(739, 153, 64, 33);
		label_6.setFont(new Font("宋体", Font.PLAIN, 20));
		label_6.setForeground(Color.RED);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("必填");
		label_7.setBounds(739, 246, 64, -17);
		label_7.setForeground(Color.RED);
		contentPane.add(label_7);
		
		JLabel label_11 = new JLabel("*");
		label_11.setBounds(739, 199, 64, 33);
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("宋体", Font.PLAIN, 20));
		contentPane.add(label_11);
		
		JLabel label_8 = new JLabel("*");
		label_8.setBounds(739, 241, 64, 33);
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("宋体", Font.PLAIN, 20));
		contentPane.add(label_8);
		
		JLabel label_12 = new JLabel("*");
		label_12.setBounds(739, 432, 64, 33);
		label_12.setForeground(Color.RED);
		label_12.setFont(new Font("宋体", Font.PLAIN, 20));
		contentPane.add(label_12);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 984, 33);
		menuBar.setBackground(new Color(173, 216, 230));
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("退出登录");
		mnNewMenu.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent arg0) {
			}
			public void menuDeselected(MenuEvent arg0) {
			}
			public void menuSelected(MenuEvent arg0) {
				int check=JOptionPane.showConfirmDialog(null, "确认退出登录？");
				if(check==JOptionPane.OK_OPTION)
				{
					dispose();
					Login p=new Login();
					p.setVisible(true);
				}		
			}
		});
		
		JMenu mnNewMenu_3 = new JMenu("现场挂号");
		mnNewMenu_3.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}
			public void menuDeselected(MenuEvent e) {
			}
			public void menuSelected(MenuEvent e) {
				dispose();
				RegRegistery p=new RegRegistery();
				p.setVisible(true);
				}		
		});
		
		JMenu mnNewMenu_5 = new JMenu("首页");
		mnNewMenu_5.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent arg0) {
			}
			public void menuDeselected(MenuEvent arg0) {
			}
			public void menuSelected(MenuEvent arg0) {
				dispose();
				RegMainPage p=new RegMainPage();
				p.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_5);
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_2 = new JMenu("预约查询");
		mnNewMenu_2.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}
			public void menuDeselected(MenuEvent e) {
			}
			public void menuSelected(MenuEvent e) {
				dispose();
				RegAp p=new RegAp();
				p.setVisible(true);
			}
		});
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_4 = new JMenu("收费管理");
		menuBar.add(mnNewMenu_4);
		
			
		
		menuBar.add(mnNewMenu);
		
		
		JLabel label_10 = new JLabel("*");
		label_10.setBounds(739, 298, 10, 24);
		contentPane.add(label_10);
		label_10.setForeground(Color.RED);
		label_10.setFont(new Font("宋体", Font.PLAIN, 20));
	}
}
