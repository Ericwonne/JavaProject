import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class RegMainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegMainPage frame = new RegMainPage();
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
	public RegMainPage() {
		setTitle("挂号收费页面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(112, 67, 676, 423);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton ap = new JButton("预 约 查 询");
		ap.setBounds(383, 134, 200, 60);
		panel.add(ap);
		ap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				RegAp p=new RegAp();
				p.setVisible(true);
			}
		});
		ap.setFont(new Font("宋体", Font.BOLD, 20));
		ap.setBackground(new Color(143, 188, 143));
		
		JButton charge = new JButton("就 诊 收 费");
		charge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		charge.setBounds(240, 236, 200, 60);
		panel.add(charge);
		charge.setFont(new Font("宋体", Font.BOLD, 20));
		charge.setBackground(new Color(188, 143, 143));
		
		JButton reg = new JButton("现 场 挂 号");
		reg.setBounds(125, 134, 200, 60);
		panel.add(reg);
		reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				RegRegistery p=new RegRegistery();
				p.setVisible(true);
			}
		});
		reg.setFont(new Font("宋体", Font.BOLD, 20));
		reg.setBackground(new Color(135, 206, 250));
	}
}
