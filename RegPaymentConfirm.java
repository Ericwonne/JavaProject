import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import java.sql.*;

public class RegPaymentConfirm extends JFrame {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PaymentConfirm frame = new PaymentConfirm();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public RegPaymentConfirm(User user) {
		setTitle("挂号收费确认界面");
		setFont(new Font("宋体", Font.BOLD, 26));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("挂号收费单");
		lblNewLabel.setBounds(-11, 60, 972, 31);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("挂号信息");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 12));
		lblNewLabel_1.setBounds(247, 89, 159, 37);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("缴费完成");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnNewButton.setBounds(319, 470, 110, 31);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("取消");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button.setBounds(501, 470, 111, 31);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(248, 122, 485, 143);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel ID = new JLabel("New label");
		ID.setBounds(26, 10, 314, 28);
		ID.setText("身份证号："+user.getID());
		panel.add(ID);
		
		JLabel name = new JLabel("New label");
		name.setBounds(26, 30, 314, 28);
		name.setText("姓名："+user.getName());
		panel.add(name);
		
		JLabel sex = new JLabel("New label");
		sex.setBounds(26, 49, 314, 28);
		sex.setText("性别："+user.getSex());
		panel.add(sex);
		
		JLabel age = new JLabel("New label");
		age.setBounds(26, 68, 314, 28);
		age.setText("年龄："+user.getAge());
		panel.add(age);
		
		JLabel dept = new JLabel("New label");
		dept.setBounds(26, 87, 314, 28);
		dept.setText("科室："+user.getDeptid());
		panel.add(dept);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(249, 299, 485, 137);
		contentPane.add(panel_1);
		
		JLabel chargeitemid = new JLabel("收费项目ID:10001");
		chargeitemid.setBounds(23, 10, 314, 28);
		panel_1.add(chargeitemid);
		
		JLabel label_1 = new JLabel("收费项目名称：普通挂号");
		label_1.setBounds(23, 33, 314, 28);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("执行单价：");
		label_2.setBounds(23, 55, 314, 28);
		String sql="select price from Chargeitem where id='10001'";
		try {
			ResultSet rs=SQL.executeQuery(sql);
			if(rs.next())
				label_2.setText(label_2.getText()+rs.getString("price")+"元");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败！");
		}		

		panel_1.add(label_2);
		
		JLabel sum = new JLabel("合计：");
		sum.setFont(new Font("宋体", Font.BOLD, 12));
		sum.setBounds(370, 106, 105, 28);
		String sql2="select price from Chargeitem where id='10001'";
		try {
			ResultSet rs=SQL.executeQuery(sql2);
			if(rs.next())
				sum.setText(sum.getText()+rs.getString("price")+" 元");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败！");
		}		
		panel_1.add(sum);
		
		JLabel label_4 = new JLabel("数量：×1");
		label_4.setBounds(21, 78, 314, 28);
		panel_1.add(label_4);
		
		JLabel label = new JLabel("收费详情");
		label.setBounds(249, 266, 159, 37);
		contentPane.add(label);
		label.setFont(new Font("宋体", Font.BOLD, 12));
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
			
				}		
		});
		
		JMenu mnNewMenu_5 = new JMenu("首页");
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
	}
}
