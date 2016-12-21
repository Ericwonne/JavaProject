import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class z_SubstituteForHiddenPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					z_SubstituteForHiddenPage frame = new z_SubstituteForHiddenPage();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public z_SubstituteForHiddenPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1007, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox dept = new JComboBox();
		dept.setBounds(289, 434, 440, 33);
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
		String[] s=new String[list.size()];
		for(int i=0;i<list.size();i++)
			s[i]=(String)list.get(i);
		dept.setModel(new DefaultComboBoxModel(s));
		contentPane.add(dept);
		
		JButton btnNewButton = new JButton("查看科室信息");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setBounds(37, 57, 177, 44);
		contentPane.add(btnNewButton);
		
		
		
		
	}
}
