import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.InputMethodListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.InputMethodEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class AdminPersonel {

	private JFrame frame;
	private JTextField newpwd2;
	private JTextField pwdc2;
    private String docid;
    private JTextField docname1;
    private JTextField docage1;
    private JTextField docpwd1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPersonel window = new AdminPersonel();
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
	public AdminPersonel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setLocation(0, 40);
		panel_1.setSize(1000, 500);
		frame.getContentPane().add(panel_1,BorderLayout.CENTER);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 540, 1000, 60);
		frame.getContentPane().add(panel_2,BorderLayout.SOUTH);
		panel_2.setLayout(null);
		
		JLabel lblCopyright = new JLabel("CopyRight");
		lblCopyright.setForeground(Color.WHITE);
		lblCopyright.setBounds(920, 0, 60, 30);
		panel_2.add(lblCopyright);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(0, 0, 1000, 40);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("人员管理");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//刷新页面（重绘Panel）
				panel_1.removeAll();
				panel_1.repaint();
				JPanel panel = new JPanel();
				panel.setBackground(SystemColor.window);
				panel.setBounds(160, 25, 800, 450);
				panel_1.add(panel);
				//账号管理
				JButton btnNewButton_3 = new JButton("医生账号");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//医生账号管理
					}
				});
				btnNewButton_3.setBounds(15, 25, 98, 26);
				panel_1.add(btnNewButton_3);
				
				JButton btnNewButton_4 = new JButton("药师账号");
				btnNewButton_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//药师账号管理
					}
				});
				btnNewButton_4.setBounds(15, 63, 98, 26);
				panel_1.add(btnNewButton_4);
				
				JButton btnNewButton_5 = new JButton("挂号收费");
				btnNewButton_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//药师账号管理
					}
				});
				btnNewButton_5.setBounds(15, 101, 98, 26);
				panel_1.add(btnNewButton_5);
			}
		});
		btnNewButton.setBounds(10, 5, 100, 25);
		btnNewButton.setBackground(SystemColor.menu);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("药库管理");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//刷新页面（重绘Panel）
				panel_1.removeAll();
				panel_1.repaint();
				//药库管理
				
			}
		});
		btnNewButton_1.setBounds(230, 5, 100, 25);
		btnNewButton_1.setBackground(SystemColor.menu);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("收费项目管理");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//刷新页面（重绘Panel）
				panel_1.removeAll();
				panel_1.repaint();
				//收费信息
			}
		});
		btnNewButton_2.setBounds(340, 5, 125, 25);
		btnNewButton_2.setBackground(SystemColor.menu);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("科室管理");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//刷新页面（重绘Panel）
				panel_1.removeAll();
				panel_1.repaint();
			}
		});
		btnNewButton_5.setBackground(SystemColor.menu);
		btnNewButton_5.setBounds(120, 5, 100, 25);
		panel_3.add(btnNewButton_5);
		
		
		panel_1.removeAll();
		panel_1.repaint();
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		panel.setBounds(160, 25, 800, 450);
		panel_1.add(panel);
		panel.setLayout(null);
		
		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(24, 10, 384, 430);
		panel.add(panel_4);
		panel_4.setLayout(null);
	
				
		final JComboBox comboBox = new JComboBox();
		ArrayList<String> list = new ArrayList<String>();
		ResultSet rs=SQL.executeQuery("select * from Dept");
		try {
			while(rs.next()){
			  list.add(rs.getString("id")+" "+rs.getString("name"));
			  }
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SQL.close();
		String[] s=new String[list.size()];
	
		for(int i=0;i<list.size();i++)
			s[i]=(String)list.get(i);
		comboBox.setModel(new DefaultComboBoxModel(s/*new String[] {"药品名"})*/));
		comboBox.setBounds(99, 18, 170, 25);
		panel_4.add(comboBox);
		comboBox.setFont(new Font("宋体", Font.PLAIN, 16));
		
		
				
		
		JLabel lblNewLabel = new JLabel("选择科室：");
		lblNewLabel.setBounds(10, 10, 85, 40);
		panel_4.add(lblNewLabel);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		
		

		final JPanel show = new JPanel();
		show.setBounds(10, 70, 364, 350);
		panel_4.add(show);
		show.setBorder(null);
		show.setBackground(new Color(255, 255, 255));
		show.setLayout(null);
		show.setVisible(false);
		
		
		
		final JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(418, 10, 354, 418);
		panel_5.setVisible(false);
		panel.add(panel_5);
		
		final JPanel addnewdoc = new JPanel();
		addnewdoc.setBackground(new Color(255, 255, 255));
		addnewdoc.setBounds(10, 31, 310, 387);
		panel_5.add(addnewdoc);
		addnewdoc.setVisible(false);
		addnewdoc.setLayout(null);
		
		
		JLabel lblNewLabel_4 = new JLabel("添加新账号");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(106, 10, 119, 28);
		addnewdoc.add(lblNewLabel_4);
		
		JLabel docname = new JLabel("姓名");
		docname.setFont(new Font("宋体", Font.PLAIN, 16));
		docname.setBounds(71, 80, 60, 28);
		addnewdoc.add(docname);
		
		docname1 = new JTextField();
		docname1.setFont(new Font("宋体", Font.PLAIN, 16));
		docname1.setBounds(118, 84, 131, 21);
		addnewdoc.add(docname1);
		docname1.setColumns(10);
		
		docage1 = new JTextField();
		docage1.setFont(new Font("宋体", Font.PLAIN, 16));
		docage1.setColumns(10);
		docage1.setBounds(118, 153, 131, 21);
		addnewdoc.add(docage1);
		
		JLabel label = new JLabel("年龄");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(71, 149, 60, 28);
		addnewdoc.add(label);
		
		JLabel sex = new JLabel("性别");
		sex.setFont(new Font("宋体", Font.PLAIN, 16));
		sex.setBounds(71, 114, 60, 28);
		addnewdoc.add(sex);
		
		JLabel label_2 = new JLabel("所属科室");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		label_2.setBounds(38, 219, 97, 28);
		addnewdoc.add(label_2);
		
		docpwd1 = new JTextField();
		docpwd1.setFont(new Font("宋体", Font.PLAIN, 16));
		docpwd1.setColumns(10);
		docpwd1.setBounds(118, 188, 131, 21);
		addnewdoc.add(docpwd1);
		
		JLabel label_1 = new JLabel("初始密码");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(38, 184, 97, 28);
		addnewdoc.add(label_1);
		
		final JComboBox docsex1 = new JComboBox();
		docsex1.setFont(new Font("宋体", Font.PLAIN, 16));
		docsex1.setModel(new DefaultComboBoxModel(new String[] { "男", "女"}));
		docsex1.setBounds(118, 118, 131, 25);
		addnewdoc.add(docsex1);
		
		final JComboBox comboBox_1 = new JComboBox();
		ArrayList<String> list1 = new ArrayList<String>();
		ResultSet rs1=SQL.executeQuery("select * from Dept");
		try {
			while(rs1.next()){
			  list1.add(rs1.getString("id")+" "+rs1.getString("name"));
			  }
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SQL.close();
		String[] s1=new String[list1.size()];
		for(int i=0;i<list1.size();i++)
			s1[i]=(String)list1.get(i);
		comboBox_1.setModel(new DefaultComboBoxModel(s1/*new String[] {"药品名"})*/));
		comboBox_1.setBounds(118, 224, 131, 21);
		addnewdoc.add(comboBox_1);
		
		
		
		final JPanel pwdpanel = new JPanel();
		
		
		JButton addc = new JButton("添 加");
		addc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String deptid= comboBox_1.getSelectedItem().toString().substring(0, 5);
				String name=docname1.getText();
				String sex=docsex1.getSelectedItem().toString();
				String age=docage1.getText();
				String pwd=docpwd1.getText();
				if(deptid.equals("")||name.equals("")||sex.equals("")||age.equals("")||pwd.toString().equals(""))
				{
					JOptionPane.showMessageDialog(null, "请填写所有带 * 的必填项目！");
					return;
				}
				
				
				
				else{
				String mysql="select * from Doctor where deptid='"+deptid+"'";
				ResultSet docidrs=SQL.executeQuery(mysql);
				int count=0;

					try {
						while(docidrs.next())
						  count++;
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			   
				SQL.close();
				String id=null;
				
				if(Integer.parseInt(deptid.substring(3,5))<10)
					id="0"+String.valueOf(Integer.parseInt(deptid.substring(3,5))*1000+count+1);
				if(Integer.parseInt(deptid.substring(3,5))>=10&&Integer.parseInt(deptid.substring(3,5))<100)
					id=String.valueOf(Integer.parseInt(deptid.substring(3,5))*1000+count+1);
				
				
				String ISQL="insert into Doctor(id,pwd,name,sex,age,deptid,state,mnum,dnum,mincome,dincome) values('"+id+"','"+pwd+"','"+name+"','"+sex+"','"+age+"','"+deptid+"',0,0,0,0,0)";
				
				if(SQL.executeUpdate(ISQL)!=-1){
					JOptionPane.showMessageDialog(null, "添加成功,医生ID:"+id);
					panel_5.setVisible(true);
					pwdpanel.setVisible(false);
					addnewdoc.setVisible(true);
					
					
					}
				else{
					JOptionPane.showMessageDialog(null, "数据库操作失败！");
					panel_5.setVisible(true);
					pwdpanel.setVisible(false);
					addnewdoc.setVisible(true);
					
				}
				SQL.close();
				}
				
			}
		});
		addc.setBounds(137, 291, 76, 23);
		addnewdoc.add(addc);
		
		JLabel lblNewLabel_5 = new JLabel("*");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(259, 88, 28, 15);
		addnewdoc.add(lblNewLabel_5);
		
		JLabel label_3 = new JLabel("*");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(259, 157, 28, 15);
		addnewdoc.add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("宋体", Font.PLAIN, 16));
		label_4.setBounds(259, 122, 28, 15);
		addnewdoc.add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("宋体", Font.PLAIN, 16));
		label_5.setBounds(259, 192, 28, 15);
		addnewdoc.add(label_5);
		
		JLabel label_6 = new JLabel("*");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("宋体", Font.PLAIN, 16));
		label_6.setBounds(259, 227, 28, 15);
		addnewdoc.add(label_6);
		
		
	
		
		
		pwdpanel.setBackground(new Color(255, 255, 255));
		pwdpanel.setBounds(0, 75, 310, 206);
		panel_5.add(pwdpanel);
		pwdpanel.setVisible(false);
		pwdpanel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 53, 54, 15);
		pwdpanel.add(lblNewLabel_3);
		
		final JPasswordField newpwd2_1 = new JPasswordField();  
		newpwd2_1.setBounds(116, 68, 154, 21);
		pwdpanel.add(newpwd2_1);
		newpwd2_1.setColumns(10);
		
		JLabel newpwd_1 = new JLabel("新密码");
		newpwd_1.setBounds(53, 71, 54, 15);
		pwdpanel.add(newpwd_1);
		
		JLabel pwdc1 = new JLabel("确认新密码");
		pwdc1.setHorizontalAlignment(SwingConstants.RIGHT);
		pwdc1.setBounds(-14, 102, 104, 15);
		pwdpanel.add(pwdc1);
		
		final JPasswordField pwdc2_1 = new JPasswordField();
		pwdc2_1.setColumns(10);
		pwdc2_1.setBounds(116, 99, 154, 21);
		pwdpanel.add(pwdc2_1);
		
		JButton btnNewButton_6 = new JButton("确认修改");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] p1=newpwd2_1.getPassword();
				char[] p2=pwdc2_1.getPassword();
				if( new String(p1).equals("")&&new String(p2).equals(""))
					JOptionPane.showMessageDialog(null, "输入不能为空！");
				else{
				if( !(new String(p1)).equals((new String(p2))))
					JOptionPane.showMessageDialog(null, "两次输入的密码不相同！");
				else{
					String newpwd=new String(p1);
					String sql="update Doctor set pwd='"+newpwd+"' where id='"+docid+"'";
					if(SQL.executeUpdate(sql)==-1)
						JOptionPane.showMessageDialog(null, "暂时无法修改数据库！");
					else
						JOptionPane.showMessageDialog(null, "修改成功！");
					pwdpanel.setVisible(false);
					docid=null;
				}}
				
			};
		});
		btnNewButton_6.setBounds(116, 146, 93, 23);
		pwdpanel.add(btnNewButton_6);
		
		JLabel lblNewLabel_2 = new JLabel("修改密码");
		lblNewLabel_2.setBounds(116, 10, 84, 28);
		pwdpanel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
	
		 final JScrollPane scrollPane=new JScrollPane();
		 final JTable table=new JTable();
		
		JButton select = new JButton("选择");
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 show.setVisible(true);
				 panel_5.setVisible(false);
				JLabel lblNewLabel_1 = new JLabel("请选择：");
				lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
				lblNewLabel_1.setBounds(10, 10, 84, 15);
				show.add(lblNewLabel_1);
				
				JButton addbtn = new JButton("添加新账号");
				addbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						panel_5.setVisible(true);
						pwdpanel.setVisible(false);
						addnewdoc.setVisible(true);
						docname1.setText("");
						docage1.setText("");
						docpwd1.setText("");
						docsex1.setSelectedIndex(0);
						docsex1.setSelectedIndex(0);
						
					}
					});

				addbtn.setBounds(251, 7, 103, 23);
				show.add(addbtn);
		       
				
		        
				
		
				
				
				
		  
				scrollPane.setBounds(10, 40, 344, 267);
				scrollPane.setViewportBorder(null);
				show.add(scrollPane);
				
				
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				String[] heads={"ID","姓名","性别","年龄"};
				Object[][] r=Doctor.getDocInfo(comboBox.getSelectedItem().toString().substring(0, 5));
				DefaultTableModel model=new DefaultTableModel();
				model.setDataVector(r, heads);
			    table.setModel(model);
				scrollPane.setViewportView(table);
				
				
				JButton pwdbtn = new JButton("修改密码");
				pwdbtn.setBounds(55, 325, 96, 23);
				pwdbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
						if(table.getSelectedRow()!=-1)
						{
							addnewdoc.setVisible(false);
							int row=table.getSelectedRow();
							docid=table.getValueAt(row, 0).toString();
						panel_5.setVisible(true);
						pwdpanel.setVisible(true);
						}
						
						
						
						
					}
				});
				pwdbtn.setBounds(55, 325, 96, 23);
				show.add(pwdbtn);
				
				JButton deletebtn = new JButton("删除账号");
				deletebtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_5.setVisible(false);
						pwdpanel.setVisible(false);
						addnewdoc.setVisible(false);
						int row=table.getSelectedRow();
						docid=table.getValueAt(row, 0).toString();
						int check=JOptionPane.showConfirmDialog(null, "此操作会删除该医生的全部信息，您确定要删除？");
						if(check==JOptionPane.OK_OPTION)
						{
							String sql="delete from Doctor where id='"+docid+"'";
							if(SQL.executeUpdate(sql)==-1)
								JOptionPane.showMessageDialog(null, "暂时无法修改数据库！");
							else
								JOptionPane.showMessageDialog(null, "删除成功！");
						}		
						
					}
				});
				deletebtn.setBounds(213, 325, 96, 23);
				show.add(deletebtn);
				show.setVisible(true);
				
			}
		});
		select.setBounds(290, 20, 70, 23);
		panel_4.add(select);
		
	
		
		
		
		
		
		
		
		
	
		
		
	
	
        
		
		
		
		
		
		
		
		
		
		
		
			
		//账号管理
		JButton btnNewButton_3 = new JButton("医生账号");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//医生账号管理
			}
		});
		btnNewButton_3.setBounds(15, 25, 98, 26);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("药师账号");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//药师账号管理
			}
		});
		btnNewButton_4.setBounds(15, 63, 98, 26);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_51 = new JButton("挂号收费");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//药师账号管理
			}
		});
		btnNewButton_51.setBounds(15, 101, 98, 26);
		panel_1.add(btnNewButton_51);
		
	}
}
