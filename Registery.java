import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registery extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registery frame = new Registery();
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
	public Registery() {
		setBackground(SystemColor.activeCaption);
		setTitle("挂号收费页面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		String s="数据绑定"; 
		String[][] test={{s,s,s,s,s},{s,s,s,s,s},{s,s,s,s,s},{s,s,s,s,s},{s,s,s,s,s}};
		String[] testName={"q", "w","e","r","t"};
		
		table = new JTable(test,testName);		
		table.setBackground(SystemColor.info);
		table.setBounds(112, 94, 778, 353);
		contentPane.add(table);
		
		JLabel label = new JLabel("最近预约过的人：");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(112, 36, 278, 34);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("新增挂号");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddPatient_1 p=new AddPatient_1();
				p.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton.setBounds(112, 486, 113, 27);
		contentPane.add(btnNewButton);
	}

	public Registery(String string) {
		// TODO Auto-generated constructor stub
		
	}
}
