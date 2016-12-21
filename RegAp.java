import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RegAp extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegAp frame = new RegAp();
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
	public RegAp() {
		setTitle("网上预约 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000,600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		final JPanel result = new JPanel();
		result.setBounds(117, 215, 772, 302);
		contentPane.add(result);
		result.setLayout(null);
		result.setVisible(false);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setVisible(false);
			}
		});
		comboBox.setFont(new Font("宋体", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"预约号","身份证号" }));
		comboBox.setBounds(289, 149, 98, 28);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.BOLD, 16));
		textField.setBounds(397, 145, 180, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(138, 36, 452, 117);
		result.add(scrollPane);

		final JTable table=new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("挂号缴费");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().toString()=="预约号")
				{
					int row = table.getSelectedRow();
					User user=UserSQL.getUserByAid(textField.getText());
					dispose();
					RegPaymentConfirm p=new RegPaymentConfirm(user);
					p.setVisible(true);
				}
				if(comboBox.getSelectedItem().toString()=="身份证号")
				{
					int row = table.getSelectedRow();
					User user=UserSQL.getUserByAid(table.getValueAt(row, 0).toString());
					dispose();
					RegPaymentConfirm p=new RegPaymentConfirm(user);
					p.setVisible(true);
				}
				
			}
		});
		btnNewButton_1.setBounds(318, 184, 98, 30);
		result.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("请选择：");
		lblNewLabel.setBounds(138, 0, 188, 30);
		result.add(lblNewLabel);
		
		
		JButton btnNewButton = new JButton("查  询");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText()==null)
					JOptionPane.showMessageDialog(null, "请输入预约号或身份证号！");
				if(comboBox.getSelectedItem().toString()=="身份证号")
				{
					result.setVisible(true);
					Object[][] r=null;
					r=UserSQL.getApResult(textField.getText());
					if(r.length==0)
						JOptionPane.showMessageDialog(null, "抱歉！未找到相关信息！");
					else{
			
						String[] heads={"预约号","姓名","性别","年龄","预约诊室","预约时间"};
						DefaultTableModel model=new DefaultTableModel();
						model.setDataVector(r, heads);
					    table.setModel(model);
					}
				}
				
				if(comboBox.getSelectedItem().toString()=="预约号")
				{
					int i=0;
					result.setVisible(true);
					Object[][] r=new Object[1][6];
					User u=UserSQL.getUserByAid(textField.getText());
					
					if(u==null)
						
					JOptionPane.showMessageDialog(null, "抱歉！未找到相关信息！");
					else{
					r[0][0]=u.getID();
					r[0][1]=u.getName();
					r[0][2]=u.getSex();
					r[0][3]=u.getAge();
					r[0][4]=u.getDeptid();
					r[0][5]=u.getAptime();
					table.setVisible(true);  
					String[] heads={"身份证号","姓名","性别","年龄","预约诊室","预约时间"};
					DefaultTableModel model=new DefaultTableModel();
					model.setDataVector(r, heads);
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				    table.setModel(model);
					}

				}
					
					
				
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(587, 146, 98, 36);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("查询预约");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.BOLD, 26));
		label.setBounds(358, 68, 248, 49);
		contentPane.add(label);
		
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
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_4 = new JMenu("收费管理");
		menuBar.add(mnNewMenu_4);
		
			
		
		menuBar.add(mnNewMenu);
		
		
	
		
		
		
	}
}
