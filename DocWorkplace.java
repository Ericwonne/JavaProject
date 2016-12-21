import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class DocWorkplace extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField medname1;
	private JLabel sex2;
	private JTextField itemname1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocWorkplace frame = new DocWorkplace();
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
	@SuppressWarnings("unchecked")
	public DocWorkplace() {
		setBackground(SystemColor.textHighlight);
		setTitle("医护人员后台系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 640);
		getContentPane().setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		p1.setBounds(21, 68, 219, 462);
		getContentPane().add(p1);
		p1.setLayout(null);
		
		JLabel label_1 = new JLabel("患者信息");
		label_1.setBounds(53, 20, 72, 18);
		label_1.setFont(new Font("幼圆", Font.BOLD, 15));
		p1.add(label_1);
		
		JLabel label_2 = new JLabel("就诊号");
		label_2.setBounds(22, 48, 72, 18);
		p1.add(label_2);
		
		JLabel sex1 = new JLabel("性别");
		sex1.setBounds(22, 218, 72, 18);
		p1.add(sex1);
		
		JLabel age1 = new JLabel("年龄");
		age1.setBounds(22, 274, 72, 18);
		p1.add(age1);
		
		JLabel type1 = new JLabel("类型");
		type1.setBounds(22, 330, 72, 18);
		p1.add(type1);
		
		JLabel dept1 = new JLabel("挂号科室");
		dept1.setBounds(22, 386, 72, 18);
		p1.add(dept1);
		
		JLabel id1 = new JLabel("身份证号");
		id1.setBounds(22, 106, 72, 18);
		p1.add(id1);
		
		JLabel mid2 = new JLabel("就诊号");
		mid2.setBounds(22, 78, 184, 18);
		p1.add(mid2);
		
		JLabel id2 = new JLabel("身份证号");
		id2.setBounds(22, 134, 72, 18);
		p1.add(id2);
		
		JLabel name1 = new JLabel("姓名");
		name1.setBounds(22, 162, 72, 18);
		p1.add(name1);
		
		JLabel name2 = new JLabel("姓名");
		name2.setBounds(22, 190, 72, 18);
		p1.add(name2);
		
		sex2 = new JLabel("性别");
		sex2.setBounds(22, 246, 72, 18);
		p1.add(sex2);
		
		JLabel age2 = new JLabel("年龄");
		age2.setBounds(22, 302, 72, 18);
		p1.add(age2);
		
		JLabel type2 = new JLabel("类型");
		type2.setBounds(22, 358, 72, 18);
		p1.add(type2);
		
		JLabel dept2 = new JLabel("挂号科室");
		dept2.setBounds(22, 414, 72, 18);
		p1.add(dept2);
		
		JPanel p3 = new JPanel();
		p3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		p3.setBounds(666, 68, 294, 234);
		p3.setForeground(SystemColor.desktop);
		getContentPane().add(p3);
		p3.setLayout(null);
		
		JLabel label_15 = new JLabel("添加药品");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("幼圆", Font.BOLD, 15));
		label_15.setBounds(95, 2, 106, 48);
		p3.add(label_15);
		ArrayList<String> list = new ArrayList<String>();
		
		
		medname1 = new JTextField();
		medname1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				medname1.setText("");
			}
		});
		medname1.setText("名称/拼音码");
		medname1.setBounds(23, 60, 172, 24);
		p3.add(medname1);
		medname1.setColumns(10);
		
		JButton medname2 = new JButton("查 询");
		medname2.setFont(new Font("宋体", Font.PLAIN, 12));
		medname2.setBounds(205, 59, 77, 24);
		p3.add(medname2);
		medname2.setBackground(new Color(189, 183, 107));
		
		JPanel p31 = new JPanel();
		p31.setBounds(23, 87, 259, 133);
		p3.add(p31);
		p31.setLayout(null);
		p31.setVisible(true);
		
		JLabel spec1 = new JLabel("规格");
		spec1.setBounds(0, 48, 36, 15);
		p31.add(spec1);
		
		JButton button_1 = new JButton("添 加");
		button_1.setFont(new Font("宋体", Font.PLAIN, 12));
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setBounds(113, 100, 69, 23);
		p31.add(button_1);
		button_1.setBackground(new Color(100, 149, 237));
		
		JLabel spec2 = new JLabel("规格");
		spec2.setBounds(46, 48, 69, 15);
		p31.add(spec2);
		
		JLabel select1 = new JLabel("选择");
		select1.setBounds(0, 10, 54, 24);
		p31.add(select1);
		
		JComboBox select2 = new JComboBox();
		select2.setBounds(43, 10, 214, 24);
		p31.add(select2);
		list.add("药品名");
		list.add("阿莫西林");
		String[] s=new String[list.size()];
		for(int i=0;i<list.size();i++)
			s[i]=(String)list.get(i);
		select2.setModel(new DefaultComboBoxModel(s/*new String[] {"药品名"})*/));
		
		JLabel num1 = new JLabel("数量");
		num1.setBounds(0, 78, 36, 15);
		p31.add(num1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(43, 73, 45, 24);
		p31.add(comboBox);
		
		
		
		JPanel p2 = new JPanel();
		p2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		p2.setBounds(250, 68, 406, 462);
		getContentPane().add(p2);
		p2.setLayout(null);
		
		JLabel desc1 = new JLabel("病情描述");
		desc1.setBounds(34, 33, 89, 22);
		p2.add(desc1);
		
		JLabel diag = new JLabel("诊断分析");
		diag.setBounds(34, 124, 78, 22);
		p2.add(diag);
		
		JLabel med1 = new JLabel("处方详情");
		med1.setBounds(34, 224, 62, 22);
		p2.add(med1);
		
		JLabel item1 = new JLabel("其他项目");
		item1.setBounds(34, 340, 62, 22);
		p2.add(item1);
		
		JLabel label_14 = new JLabel("就诊详情");
		label_14.setFont(new Font("幼圆", Font.BOLD, 15));
		label_14.setBounds(187, 21, 72, 18);
		p2.add(label_14);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(34, 56, 348, 58);
		textArea.setLineWrap(true);
		p2.add(textArea);
		
		JTextArea diag2 = new JTextArea();
		diag2.setLineWrap(true);
		diag2.setBounds(34, 145, 348, 69);
		p2.add(diag2);
		
		JTextArea med2 = new JTextArea();
		med2.setLineWrap(true);
		med2.setBounds(34, 245, 348, 85);
		p2.add(med2);
		
		JTextArea item2 = new JTextArea();
		item2.setLineWrap(true);
		item2.setBounds(34, 360, 348, 85);
		p2.add(item2);
		
		JButton button_2 = new JButton("提 交");
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBackground(new Color(178, 34, 34));
		button_2.setBounds(459, 558, 84, 33);
		getContentPane().add(button_2);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 984, 33);
		menuBar.setBackground(new Color(173, 216, 230));
		getContentPane().add(menuBar);
		
		JMenu mexit = new JMenu("退出登录");
		mexit.addMenuListener(new MenuListener() {
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
		
		JMenu m2 = new JMenu("当前就诊队列");
		m2.addMenuListener(new MenuListener() {
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
		
		JMenu m1 = new JMenu("基本诊断页");
		m1.addMenuListener(new MenuListener() {
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
		menuBar.add(m1);
		menuBar.add(m2);
		
		JMenu m3 = new JMenu("预约查询");
		m3.addMenuListener(new MenuListener() {
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
		menuBar.add(m3);
		
			
		
		menuBar.add(mexit);
		
		JPanel p4 = new JPanel();
		p4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		p4.setBounds(666, 312, 294, 218);
		getContentPane().add(p4);
		p4.setLayout(null);
		
		JLabel label = new JLabel("添加项目");
		label.setBounds(118, 24, 64, 18);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("幼圆", Font.BOLD, 15));
		p4.add(label);
		
		itemname1 = new JTextField();
		itemname1.setText("名称/拼音码");
		itemname1.setColumns(10);
		itemname1.setBounds(25, 61, 172, 24);
		p4.add(itemname1);
		
		JButton itemname2 = new JButton("查 询");
		itemname2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		itemname2.setFont(new Font("宋体", Font.PLAIN, 12));
		itemname2.setBackground(new Color(189, 183, 107));
		itemname2.setBounds(207, 60, 77, 24);
		p4.add(itemname2);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 95, 259, 113);
		p4.add(panel);
		panel.setLayout(null);
		
		JLabel label_3 = new JLabel("选择");
		label_3.setBounds(0, 0, 54, 24);
		panel.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(43, 0, 214, 24);
		panel.add(comboBox_1);
		
		JLabel label_4 = new JLabel("数量");
		label_4.setBounds(0, 39, 36, 15);
		panel.add(label_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(43, 34, 45, 24);
		panel.add(comboBox_2);
		
		JButton button_3 = new JButton("添 加");
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("宋体", Font.PLAIN, 12));
		button_3.setBackground(new Color(100, 149, 237));
		button_3.setBounds(113, 80, 69, 23);
		panel.add(button_3);
	}
}
