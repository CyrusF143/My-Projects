import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Info {

	private static JFrame frame;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		
		frame();
	}
	
	public static void frame() {
	frame = new JFrame();
	frame.getContentPane().setBackground(SystemColor.info);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(450,166);
	frame.setLocationRelativeTo(null);
	frame.getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("GUI System For 4P's\r\n");
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 14));
	lblNewLabel.setBounds(10, 11, 414, 27);
	frame.getContentPane().add(lblNewLabel);
	
	JLabel lblDateCreated = new JLabel("Date Created: 15/05/2023");
	lblDateCreated.setHorizontalAlignment(SwingConstants.CENTER);
	lblDateCreated.setFont(new Font("Sylfaen", Font.PLAIN, 14));
	lblDateCreated.setBounds(10, 33, 414, 27);
	frame.getContentPane().add(lblDateCreated);
	
	JLabel lblPurposeForCase = new JLabel("Purpose: For Case Study and to Improve 4P's Data management");
	lblPurposeForCase.setHorizontalAlignment(SwingConstants.CENTER);
	lblPurposeForCase.setFont(new Font("Sylfaen", Font.PLAIN, 14));
	lblPurposeForCase.setBounds(10, 60, 414, 27);
	frame.getContentPane().add(lblPurposeForCase);
	
	JButton btnNewButton = new JButton("OK");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			try {
				Main_Class.frame();
			} catch (Exception e1) {
			}
			
		}
	});
	btnNewButton.setBounds(172, 98, 89, 23);
	frame.getContentPane().add(btnNewButton);
	
	frame.setVisible(true);

}
	
}
