import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
public class AdminMainPage_tmpcopy extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField txtTest;

	
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AdminMainPage_tmpcopy frame = new AdminMainPage_tmpcopy();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			
			});
	    }
				
	public AdminMainPage_tmpcopy() {
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
		
		JLabel lblNewLabel = new JLabel("选择科室：");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 13, 130, 33);
		panel_1.add(lblNewLabel);
		
	
		JComboBox dept = new JComboBox();
		dept.setBounds(146, 13, 433, 33);
		ArrayList<String> list = new ArrayList<String>();
		ResultSet rs=SQL.executeQuery("select id,name from Dept");
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
		dept.setModel(new DefaultComboBoxModel(s));
		panel_1.add(dept);
		
		final JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 48, 1000, 452);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		final JPanel panel_info = new JPanel();
		panel_info.setBounds(489, 5, 504, 445);
		panel_4.add(panel_info);
		panel_info.setVisible(false);
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
		
		final JTextArea txtrDiagram = new JTextArea();
		txtrDiagram.setLineWrap(true);
		txtrDiagram.setRows(10);
		txtrDiagram.setFont(new Font("Monospaced", Font.PLAIN, 28));
		txtrDiagram.setText("Pie Diagram Area ContentHolder");
		txtrDiagram.setBounds(57, 57, 350, 275);
		 txtrDiagram.setVisible(false);
		panel_4.add(txtrDiagram);
		
		JButton btnNewButton_1 = new JButton("查询");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txtrDiagram.setVisible(true);
				 panel_info.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(628, 16, 113, 27);
		panel_1.add(btnNewButton_1);
		
		JButton button_4 = new JButton("查看所有科室");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_4.removeAll();
				panel_4.repaint();
				
			}
		});
		button_4.setFont(new Font("幼圆", Font.PLAIN, 16));
		button_4.setBackground(new Color(240, 240, 240));
		button_4.setBounds(825, 13, 161, 30);
		panel_1.add(button_4);
		
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
