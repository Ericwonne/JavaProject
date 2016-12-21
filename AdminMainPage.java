import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
public class AdminMainPage extends JFrame{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AdminMainPage frame = new AdminMainPage();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			
			});
	    }
			
	public AdminMainPage() {
		// TODO Auto-generated method stub
	
		//region 初始化
		setTitle("管理");
		setBounds(100,100,1000,600);
		setResizable(false);
		setBackground(Color.GRAY);
		setVisible(true);
		getContentPane().setBackground(Color.gray);
		getContentPane().setLayout(null);
		//endregion
		
		//region Panel_1
		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setLocation(0, 40);
		panel_1.setSize(1000, 500);
		getContentPane().add(panel_1,BorderLayout.CENTER);
		panel_1.setLayout(null);
		//endregion
		
		//region Panel_2
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 540, 1000, 60);
		getContentPane().add(panel_2,BorderLayout.SOUTH);
		panel_2.setLayout(null);
		
		JLabel lblCopyright = new JLabel("CopyRight");
		lblCopyright.setForeground(Color.WHITE);
		lblCopyright.setBounds(912, 0, 88, 30);
		panel_2.add(lblCopyright);
		//endregion
		
		//region Panel_3
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(0, 0, 1000, 40);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		//endregion
		
		//region 首页
		JButton button_1 = new JButton("首页");
		button_1.setFont(new Font("宋体", Font.PLAIN, 20));
		button_1.setBackground(SystemColor.menu);
		button_1.setBounds(14, 4, 142, 30);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.removeAll();
				panel_1.repaint();
				
				//region 人员管理
				JButton peoplebtn = new JButton("人员管理");
				peoplebtn.setForeground(new Color(255, 255, 255));
				peoplebtn.setBackground(new Color(102, 204, 204));
				peoplebtn.setFont(new Font("宋体", Font.BOLD, 16));
				peoplebtn.setBounds(332, 134, 152, 55);
				panel_1.add(peoplebtn);
				//endregion
				
				//region 科室管理
					JButton deptbtn = new JButton("科室管理");
				deptbtn.setForeground(new Color(255, 255, 255));
				deptbtn.setBackground(new Color(153, 102, 153));
				deptbtn.setFont(new Font("宋体", Font.BOLD, 16));
				deptbtn.setBounds(510, 134, 152, 55);
				panel_1.add(deptbtn);
				//endregion
			
				//region 收费项目管理
				JButton itembtn = new JButton("收费项目管理");
				itembtn.setForeground(new Color(255, 255, 255));
				itembtn.setBackground(new Color(204, 204, 102));
				itembtn.setFont(new Font("宋体", Font.BOLD, 16));
				itembtn.setBounds(510, 246, 152, 55);
				panel_1.add(itembtn);
				//endregion
			
				//region 药库管理
				JButton pharbtn = new JButton("药库管理");
				pharbtn.setForeground(new Color(255, 255, 255));
				pharbtn.setBackground(new Color(0, 204, 102));
				pharbtn.setFont(new Font("宋体", Font.BOLD, 16));
				pharbtn.setBounds(332, 246, 152, 55);
				panel_1.add(pharbtn);
				//endregion
				
			}
		});
		//endregion
		
		//region 查看科室信息
		JButton btnNewButton = new JButton("查看科室信息");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent arg0) {
				
				//region 刷新页面（重绘Panel）
				panel_1.removeAll();
				panel_1.repaint();		
				
				JLabel lblNewLabel = new JLabel("选择科室：");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(0, 13, 130, 33);
				panel_1.add(lblNewLabel);				
				
				
				JComboBox dept = new JComboBox();
				dept.setBounds(146, 13, 433, 35);
				ArrayList<String> list = new ArrayList<String>();
				ResultSet rs=SQL.executeQuery("select id,name from Dept");
				try {
					while(rs.next()){
						
					  list.add(rs.getString("id")+"------------"+rs.getString("name"));
					  }
					}
					catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					SQL.close();
				String[] s=new String[list.size()+1];
				s[0]="请选择" ;
				for(int i=0;i<list.size();i++)
					s[i+1]=(String)list.get(i);
				dept.setModel(new DefaultComboBoxModel(s));
				panel_1.add(dept);
				
				final JPanel panel_4 = new JPanel();
				panel_4.setBounds(0, 48, 1000, 452);
				panel_4.setLayout(null);
				panel_1.add(panel_4);
				//endregion
				
				final JButton btnNewButton_1 = new JButton("查询");				
				//region 查询具体代码
				btnNewButton_1.setBounds(628, 16, 113, 27);
				btnNewButton_1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						
							
						//region 具体控件
						panel_4.removeAll();
						panel_4.repaint();						
						
						JPanel panel_info = new JPanel();
						panel_info.setBounds(489, 5, 504, 445);
						panel_4.add(panel_info);
						panel_info.setLayout(null);
						
						JLabel lblNewLabel_1 = new JLabel("当前科室：");
						lblNewLabel_1.setBounds(3, 36, 142, 37);
						panel_info.add(lblNewLabel_1);
						
						JLabel label = new JLabel("科室编号：");
						label.setBounds(2, 86, 142, 37);
						panel_info.add(label);
						
						JLabel label_1 = new JLabel("当月挂号总量：");
						label_1.setBounds(2, 136, 142, 37);
						panel_info.add(label_1);
						
						JLabel label_2 = new JLabel("当天挂号总量：");
						label_2.setBounds(3, 180, 142, 37);
						panel_info.add(label_2);
						
						JLabel label_3 = new JLabel("当月总收入：");
						label_3.setBounds(3, 230, 142, 37);
						panel_info.add(label_3);
						
						JLabel label_4 = new JLabel("当天总收入：");
						label_4.setBounds(3, 273, 142, 37);
						panel_info.add(label_4);
						
						JTextField textField = new JTextField();
						textField.setBounds(138, 42, 304, 24);
						panel_info.add(textField);
						textField.setColumns(10);
						
						JTextField textField_1 = new JTextField();
						textField_1.setColumns(10);
						textField_1.setBounds(138, 92, 304, 24);
						panel_info.add(textField_1);
						
						JTextField textField_2 = new JTextField();
						textField_2.setColumns(10);
						textField_2.setBounds(138, 142, 304, 24);
						panel_info.add(textField_2);
						
						JTextField textField_3 = new JTextField();
						textField_3.setColumns(10);
						textField_3.setBounds(138, 186, 304, 24);
						panel_info.add(textField_3);
						
						JTextField textField_4 = new JTextField();
						textField_4.setColumns(10);
						textField_4.setBounds(138, 236, 304, 24);
						panel_info.add(textField_4);
						
						JTextField textField_5 = new JTextField();
						textField_5.setColumns(10);
						textField_5.setBounds(138, 280, 304, 24);
						panel_info.add(textField_5);
						
						JTextArea txtrDiagram = new JTextArea();
						txtrDiagram.setLineWrap(true);
						txtrDiagram.setRows(10);
						txtrDiagram.setFont(new Font("Monospaced", Font.PLAIN, 28));
						txtrDiagram.setText("Pie Diagram Area ContentHolder");
						txtrDiagram.setBounds(57, 57, 350, 275);
						panel_4.add(txtrDiagram);
						//endregion
					
					
						
					}
				});
				
				panel_1.add(btnNewButton_1);
				//endregion
			
				JButton button_4 = new JButton("查看所有科室");
				//region 查看所有科室
					button_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panel_4.removeAll();
						panel_4.repaint();						
						//region
//						JPanel p=new JPanel();
//						p.setBounds(0, 0, 1000, 452);
//						p.setLayout(null);
//						p.setBackground(SystemColor.BLUE);
//						panel_4.add(p);
						//endregion
					}
				});
				button_4.setFont(new Font("幼圆", Font.PLAIN, 16));
				button_4.setBackground(new Color(240, 240, 240));
				button_4.setBounds(825, 13, 161, 30);
			
				panel_1.add(button_4);			
				//endregion
				
				
				// 暂时注释，后续添加【查看科室】功能				
//				JButton btnNewButton_3 = new JButton("查看医生情况");
//				btnNewButton_3.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						//医生账号管理
//					}
//				});
//				btnNewButton_3.setBounds(15, 25, 125, 25);
//				panel_1.add(btnNewButton_3);
//				
//				JButton btnNewButton_4 = new JButton("当前科室收入");
//				btnNewButton_4.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						//当前科室收入
//					}
//				});
//				btnNewButton_4.setBounds(15, 63, 125, 26);
//				panel_1.add(btnNewButton_4);
//				
//				JButton btnNewButton_5 = new JButton("当前科室排队人数");
//				btnNewButton_4.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						//当前科室排队人数
//					}
//				});
//				btnNewButton_5.setBounds(15, 101, 125, 26);
//				panel_1.add(btnNewButton_5);
			}
		});
		btnNewButton.setBounds(170, 4, 171, 30);
		btnNewButton.setBackground(SystemColor.menu);
		panel_3.add(btnNewButton);
		//endregion
		
		//region 查看医生
		JButton button = new JButton("查看医生");
		button.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e) {
				panel_1.removeAll();
				panel_1.repaint();
				
				JLabel lblNewLabel_doc = new JLabel("选择医生：");
				//region
				lblNewLabel_doc.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_doc.setBounds(0, 13, 130, 33);
				panel_1.add(lblNewLabel_doc);
				
				//region DOC_COMBOBOX
				JComboBox doc = new JComboBox();
				doc.setBounds(146, 13, 433, 33);
				ArrayList<String> list_doc = new ArrayList<String>();
				ResultSet rs=SQL.executeQuery("select id,name from Doctor");
				try {
					while(rs.next()){
						
					  list_doc.add(rs.getString("id")+"--------"+rs.getString("name"));
					  }
					}
					catch (Exception excp) {
						// TODO Auto-generated catch block
						excp.printStackTrace();
					}
					SQL.close();
				String[] s=new String[list_doc.size()+1];
				s[0]="请选择" ;
				for(int i=0;i<list_doc.size();i++)
					s[i+1]=(String)list_doc.get(i);
				doc.setModel(new DefaultComboBoxModel(s));
				panel_1.add(doc);
			//endregion
			
				//region
				final JPanel panel_4_doc = new JPanel();
				panel_4_doc.setBounds(0, 48, 1000, 452);
				panel_1.add(panel_4_doc);
				panel_4_doc.setLayout(null);
				
				final JPanel panel_info_doc = new JPanel();
				panel_info_doc.setBounds(489, 5, 504, 445);
				panel_4_doc.add(panel_info_doc);
				panel_info_doc.setVisible(false);
				panel_info_doc.setLayout(null);
				//endregion
				
				//region
				JLabel lblNewLabel_1 = new JLabel("医生ID：");
				lblNewLabel_1.setBounds(3, 36, 142, 37);
				panel_info_doc.add(lblNewLabel_1);
				
				JLabel label = new JLabel("所属科室：");
				label.setBounds(3, 129, 142, 37);
				panel_info_doc.add(label);
				
				JLabel label_1 = new JLabel("是否忙碌：");
				label_1.setBounds(3, 179, 142, 37);
				panel_info_doc.add(label_1);
				
				JLabel label_2 = new JLabel("当月已接诊人数：");
				label_2.setBounds(4, 223, 142, 37);
				panel_info_doc.add(label_2);
				
				JLabel label_3 = new JLabel("当月个人总收入：");
				label_3.setBounds(4, 319, 142, 37);
				panel_info_doc.add(label_3);
				
				JLabel label_4 = new JLabel("当天个人总收入：");
				label_4.setBounds(4, 362, 142, 37);
				panel_info_doc.add(label_4);
				
				JTextField textField = new JTextField();
				textField.setBounds(138, 42, 304, 24);
				panel_info_doc.add(textField);
				textField.setColumns(10);
				
				JTextField textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(139, 135, 304, 24);
				panel_info_doc.add(textField_1);
				
				JTextField textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(139, 185, 304, 24);
				panel_info_doc.add(textField_2);
				
				JTextField textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(139, 229, 304, 24);
				panel_info_doc.add(textField_3);
				
				JTextField textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(139, 325, 304, 24);
				panel_info_doc.add(textField_4);
				
				JTextField textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(139, 369, 304, 24);
				panel_info_doc.add(textField_5);
				
				JLabel label_5 = new JLabel("当天已接诊人数：");
				label_5.setBounds(4, 269, 142, 37);
				panel_info_doc.add(label_5);
				
				JTextField textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(139, 275, 304, 24);
				panel_info_doc.add(textField_6);
				
				JLabel label_6 = new JLabel("姓名：");
				label_6.setBounds(3, 79, 142, 37);
				panel_info_doc.add(label_6);
				
				JTextField textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(138, 85, 304, 24);
				panel_info_doc.add(textField_7);
				//endregion
				
				//region
				JLabel lblNewLabel_11 = new JLabel("医生ID：");
				lblNewLabel_11.setBounds(3, 36, 142, 37);
				panel_info_doc.add(lblNewLabel_11);
				
				JLabel label1 = new JLabel("所属科室：");
				label1.setBounds(3, 129, 142, 37);
				panel_info_doc.add(label1);
				
				JLabel label_11 = new JLabel("是否忙碌：");
				label_11.setBounds(3, 179, 142, 37);
				panel_info_doc.add(label_11);
				
				JLabel label_21 = new JLabel("当月已接诊人数：");
				label_21.setBounds(4, 223, 142, 37);
				panel_info_doc.add(label_21);
				
				JLabel label_31 = new JLabel("当月个人总收入：");
				label_31.setBounds(4, 319, 142, 37);
				panel_info_doc.add(label_31);
				
				JLabel label_41 = new JLabel("当天个人总收入：");
				label_41.setBounds(4, 362, 142, 37);
				panel_info_doc.add(label_41);
				
				JTextField textField1 = new JTextField();
				textField1.setBounds(138, 42, 304, 24);
				panel_info_doc.add(textField1);
				textField1.setColumns(10);
				
				JTextField textField_11 = new JTextField();
				textField_11.setColumns(10);
				textField_11.setBounds(139, 135, 304, 24);
				panel_info_doc.add(textField_11);
				
				JTextField textField_21 = new JTextField();
				textField_21.setColumns(10);
				textField_21.setBounds(139, 185, 304, 24);
				panel_info_doc.add(textField_21);
				
				JTextField textField_31 = new JTextField();
				textField_31.setColumns(10);
				textField_31.setBounds(139, 229, 304, 24);
				panel_info_doc.add(textField_31);
				
				JTextField textField_41 = new JTextField();
				textField_41.setColumns(10);
				textField_41.setBounds(139, 325, 304, 24);
				panel_info_doc.add(textField_41);
				
				JTextField textField_51 = new JTextField();
				textField_51.setColumns(10);
				textField_51.setBounds(139, 369, 304, 24);
				panel_info_doc.add(textField_51);
				
				JLabel label_51 = new JLabel("当天已接诊人数：");
				label_51.setBounds(4, 269, 142, 37);
				panel_info_doc.add(label_51);
				
				JTextField textField_61 = new JTextField();
				textField_61.setColumns(10);
				textField_61.setBounds(139, 275, 304, 24);
				panel_info_doc.add(textField_61);
				
				JLabel label_61 = new JLabel("姓名：");
				label_61.setBounds(3, 79, 142, 37);
				panel_info_doc.add(label_61);
				
				JTextField textField_71 = new JTextField();
				textField_71.setColumns(10);
				textField_71.setBounds(138, 85, 304, 24);
				panel_info_doc.add(textField_71);
				//endregion

				//region
				JButton btnNewButton = new JButton("查看该医生详细信息");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton.setBounds(308, 406, 182, 26);
				panel_info_doc.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("查询");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				btnNewButton_1.setBounds(628, 16, 113, 27);
				panel_1.add(btnNewButton_1);
				//endregion
				
				JButton button_4_doc = new JButton("查看所有医生");
				button_4_doc.setFont(new Font("幼圆", Font.PLAIN, 16));
				button_4_doc.setBackground(new Color(240, 240, 240));
				button_4_doc.setBounds(825, 13, 161, 30);
				panel_1.add(button_4_doc);
				button_4_doc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panel_4_doc.removeAll();
						panel_4_doc.repaint();
						
					}
				});				
				//endregion
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.setBackground(SystemColor.menu);
		button.setBounds(355, 4, 154, 30);
		panel_3.add(button);
		//endregion
		
		//region 查看收入
		JButton button_2 = new JButton("查看收入");
		button_2.setFont(new Font("宋体", Font.PLAIN, 20));
		button_2.setBackground(SystemColor.menu);
		button_2.setBounds(523, 4, 154, 30);
		panel_3.add(button_2);
		
				//endregion
			
		//region 声明顺序导致的方法调用位置不合理 panel_3.add(button_1);
		panel_3.add(button_1);
		//endregion
	}
}
