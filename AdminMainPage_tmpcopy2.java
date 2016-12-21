import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
public class AdminMainPage_tmpcopy2 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField txtTest;


	
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AdminMainPage_tmpcopy2 frame = new AdminMainPage_tmpcopy2();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			
			});
	    }
				
	public AdminMainPage_tmpcopy2() {
		// TODO Auto-generated method stub

		setTitle("管理");
		setBounds(100,100,1000,600);
		setResizable(false);
		setBackground(Color.GRAY);
		setVisible(true);
		getContentPane().setBackground(Color.gray);
		getContentPane().setLayout(null);
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setLocation(0, 40);
		panel_1.setSize(1000, 500);
		getContentPane().add(panel_1,BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_doc = new JLabel("选择医生：");
		lblNewLabel_doc.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_doc.setBounds(0, 13, 130, 33);
		panel_1.add(lblNewLabel_doc);
		
	
		JComboBox doc = new JComboBox();
		doc.setBounds(146, 13, 433, 33);
		ArrayList<String> list = new ArrayList<String>();
		ResultSet rs=SQL.executeQuery("select id,name from Doctor");
		try {
			while(rs.next()){
				
			  list.add(rs.getString("id")+"--------"+rs.getString("name"));
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
		doc.setModel(new DefaultComboBoxModel(s));
		panel_1.add(doc);
		
		final JPanel panel_4_doc = new JPanel();
		panel_4_doc.setBounds(0, 48, 1000, 452);
		panel_1.add(panel_4_doc);
		panel_4_doc.setLayout(null);
		
		final JPanel panel_info_doc = new JPanel();
		panel_info_doc.setBounds(489, 5, 504, 445);
		panel_4_doc.add(panel_info_doc);
		panel_info_doc.setVisible(false);
		panel_info_doc.setLayout(null);
		
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
		
		JButton button_4_doc = new JButton("查看所有医生");
		button_4_doc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_4_doc.removeAll();
				panel_4_doc.repaint();
				
			}
		});
		button_4_doc.setFont(new Font("幼圆", Font.PLAIN, 16));
		button_4_doc.setBackground(new Color(240, 240, 240));
		button_4_doc.setBounds(825, 13, 161, 30);
		panel_1.add(button_4_doc);
		
		//修改备用
		//JPanel panel = new JPanel();
		//panel.setBackground(SystemColor.window);
		//panel.setBounds(175, 25, 800, 450);
		//panel_1.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 540, 1000, 60);
		getContentPane().add(panel_2,BorderLayout.SOUTH);
		panel_2.setLayout(null);
		
		JLabel lblCopyright = new JLabel("CopyRight");
		lblCopyright.setForeground(Color.WHITE);
		lblCopyright.setBounds(920, 0, 60, 30);
		panel_2.add(lblCopyright);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(0, 0, 1000, 40);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton button = new JButton("首页");
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.setBackground(SystemColor.menu);
		button.setBounds(28, 0, 142, 30);
		panel_3.add(button);
		
		JButton button_1 = new JButton("查看科室信息");
		button_1.setFont(new Font("宋体", Font.PLAIN, 20));
		button_1.setBackground(SystemColor.menu);
		button_1.setBounds(184, 0, 171, 30);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("查看医生");
		button_2.setFont(new Font("宋体", Font.PLAIN, 20));
		button_2.setBackground(SystemColor.menu);
		button_2.setBounds(369, 0, 154, 30);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("查看收入");
		button_3.setFont(new Font("宋体", Font.PLAIN, 20));
		button_3.setBackground(SystemColor.menu);
		button_3.setBounds(537, 0, 154, 30);
		panel_3.add(button_3);
		
		

	}
}
