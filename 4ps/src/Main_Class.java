import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Main_Class {

	private static JFrame frame;

	public static void main(String[] args) throws Exception {
		frame();
	}

	public static void frame() throws Exception {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 153));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,203);
		frame.getContentPane().setLayout(null);
		
		JLabel Title_LBL = new JLabel("Pantawid Pamilyang Pilipino");
		Title_LBL.setForeground(new Color(255, 140, 0));
		Title_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		Title_LBL.setFont(new Font("Footlight MT Light", Font.BOLD, 32));
		Title_LBL.setBounds(10, 11, 414, 58);
		frame.getContentPane().add(Title_LBL);
		
		JButton Start_BTN = new JButton("START FORM");
		Start_BTN.setForeground(new Color(0, 0, 0));
		Start_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				try {
					MainForm.mainframe();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		Start_BTN.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Start_BTN.setBackground(UIManager.getColor("Button.shadow"));
		Start_BTN.setBounds(177, 116, 120, 23);
		frame.getContentPane().add(Start_BTN);
		
		JButton Exit_BTN = new JButton("EXIT");
		Exit_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit_BTN.setForeground(new Color(255, 0, 0));
		Exit_BTN.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Exit_BTN.setBackground(UIManager.getColor("Button.shadow"));
		Exit_BTN.setBounds(307, 116, 89, 23);
		frame.getContentPane().add(Exit_BTN);
		
		JLabel Title_LBL_1 = new JLabel("Program");
		Title_LBL_1.setForeground(new Color(255, 140, 0));
		Title_LBL_1.setHorizontalAlignment(SwingConstants.CENTER);
		Title_LBL_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		Title_LBL_1.setFont(new Font("Footlight MT Light", Font.BOLD, 32));
		Title_LBL_1.setBounds(10, 47, 414, 58);
		frame.getContentPane().add(Title_LBL_1);
		
		JButton Info_BTN = new JButton("INFORMATION");
		Info_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Info.frame();
				
			}
		});
		Info_BTN.setSelectedIcon(null);
		Info_BTN.setForeground(new Color(0, 0, 0));
		Info_BTN.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Info_BTN.setBackground(UIManager.getColor("Button.shadow"));
		Info_BTN.setBounds(38, 116, 129, 23);
		frame.getContentPane().add(Info_BTN);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.setVisible(true);
	}
}
