import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Form3 {

	private static String REGION11, REGION12, PROVINCE11, PROVINCE12, BARANGAY11, BARANGAY12, HOUSE_NO11, HOUSE_NO12, CITY_MUNICIPALITY11, CITY_MUNICIPALITY12, SPS11, SPS12;

	
	private static JTextField LAST_NAME_TXT, FIRST_NAME_TXT, MIDDLE_NAME_TXT, EXTENSION_NAME_TXT, DATE_TXT, SEX_TXT, NAME_OF_SCHOOL_TXT, REGION11_TXT, REGION12_TXT, PROVINCE11_TXT, PROVINCE12_TXT, BARANGAY11_TXT, BARANGAY12_TXT, CITY_MUNICIPALITY11_TXT;
	private static JTextField CITY_MUNICIPALITY12_TXT, SPS11_TXT, SPS12_TXT, TOF_LBL_FROM, TOF_LBL_TO, ADD_1_LBL_FROM, ADD_1_LBL_TO, NOF1_LBL_FROM;
	private static JTextField NOS1_1_TXT_TO, ADDRESS_OF_SCHOOL1_TXT, ADDRESS_OF_SCHOOL2_TXT, GRADE_LEVEL1_TXT, GRADE_LEVEL2_TXT, HOUSE_NO11_TXT, HOUSE_NO12_TXT;
	public static JPanel panel_70;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void address() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(MainForm.url,MainForm.username,MainForm.pass);
		
		MainForm pan = new MainForm();
		
		panel_70 = new JPanel();
		panel_70.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_70.setBounds(0, 270, 582, 188);
		MainForm.panel_1.add(panel_70);
		panel_70.setVisible(false);
		panel_70.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(0, 11, 582, 20);
		panel_70.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel Region_LBL_1 = new JLabel("REGION: ");
		Region_LBL_1.setBounds(0, 3, 54, 15);
		Region_LBL_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_8.add(Region_LBL_1);
		
		REGION11_TXT = new JTextField();
		REGION11_TXT.setBounds(73, 0, 236, 20);
		panel_8.add(REGION11_TXT);
		REGION11_TXT.setColumns(10);
		
		REGION12_TXT = new JTextField();
		REGION12_TXT.setColumns(10);
		REGION12_TXT.setBounds(319, 0, 253, 20);
		panel_8.add(REGION12_TXT);
		
		JLabel From_LBL = new JLabel("FROM");
		From_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		From_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		From_LBL.setBounds(218, 0, 44, 14);
		panel_70.add(From_LBL);
		
		JLabel TO_LBL = new JLabel("TO");
		TO_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		TO_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		TO_LBL.setBounds(364, 0, 44, 14);
		panel_70.add(TO_LBL);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8_1.setBounds(0, 32, 582, 20);
		panel_70.add(panel_8_1);
		
		JLabel PRO_LBL = new JLabel("PROVINCE:");
		PRO_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		PRO_LBL.setBounds(0, 3, 75, 15);
		panel_8_1.add(PRO_LBL);
		
		PROVINCE11_TXT = new JTextField();
		PROVINCE11_TXT.setColumns(10);
		PROVINCE11_TXT.setBounds(73, 0, 236, 20);
		panel_8_1.add(PROVINCE11_TXT);
		
		PROVINCE12_TXT = new JTextField();
		PROVINCE12_TXT.setColumns(10);
		PROVINCE12_TXT.setBounds(319, 0, 253, 20);
		panel_8_1.add(PROVINCE12_TXT);
		
		JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8_1_1.setBounds(0, 53, 582, 20);
		panel_70.add(panel_8_1_1);
		
		JLabel BRG_LBL1 = new JLabel("BARANGAY:");
		BRG_LBL1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BRG_LBL1.setBounds(0, 3, 75, 15);
		panel_8_1_1.add(BRG_LBL1);
		
		BARANGAY11_TXT = new JTextField();
		BARANGAY11_TXT.setColumns(10);
		BARANGAY11_TXT.setBounds(73, 0, 236, 20);
		panel_8_1_1.add(BARANGAY11_TXT);
		
		BARANGAY12_TXT = new JTextField();
		BARANGAY12_TXT.setColumns(10);
		BARANGAY12_TXT.setBounds(319, 0, 253, 20);
		panel_8_1_1.add(BARANGAY12_TXT);
		
		JPanel panel_8_1_2 = new JPanel();
		panel_8_1_2.setLayout(null);
		panel_8_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8_1_2.setBounds(0, 95, 582, 20);
		panel_70.add(panel_8_1_2);
		
		JLabel CITY_LBL = new JLabel("CITY/MUNICIPALITY:");
		CITY_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		CITY_LBL.setBounds(0, 3, 128, 15);
		panel_8_1_2.add(CITY_LBL);
		
		CITY_MUNICIPALITY11_TXT = new JTextField();
		CITY_MUNICIPALITY11_TXT.setColumns(10);
		CITY_MUNICIPALITY11_TXT.setBounds(134, 0, 175, 20);
		panel_8_1_2.add(CITY_MUNICIPALITY11_TXT);
		
		CITY_MUNICIPALITY12_TXT = new JTextField();
		CITY_MUNICIPALITY12_TXT.setColumns(10);
		CITY_MUNICIPALITY12_TXT.setBounds(319, 0, 253, 20);
		panel_8_1_2.add(CITY_MUNICIPALITY12_TXT);
		
		JPanel panel_8_1_3 = new JPanel();
		panel_8_1_3.setLayout(null);
		panel_8_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8_1_3.setBounds(0, 116, 582, 20);
		panel_70.add(panel_8_1_3);
		
		JLabel SPS_LBL1 = new JLabel("STREET/PUROK/SITIO:");
		SPS_LBL1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		SPS_LBL1.setBounds(0, 3, 137, 15);
		panel_8_1_3.add(SPS_LBL1);
		
		SPS11_TXT = new JTextField();
		SPS11_TXT.setColumns(10);
		SPS11_TXT.setBounds(135, 0, 174, 20);
		panel_8_1_3.add(SPS11_TXT);
		
		SPS12_TXT = new JTextField();
		SPS12_TXT.setColumns(10);
		SPS12_TXT.setBounds(319, 0, 253, 20);
		panel_8_1_3.add(SPS12_TXT);
		
		JPanel panel_8_1_3_1 = new JPanel();
		panel_8_1_3_1.setLayout(null);
		panel_8_1_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8_1_3_1.setBounds(0, 116, 582, 20);
		panel_70.add(panel_8_1_3_1);
		
		JPanel Hnum_panel = new JPanel();
		Hnum_panel.setLayout(null);
		Hnum_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Hnum_panel.setBounds(0, 74, 582, 20);
		panel_70.add(Hnum_panel);
		
		JLabel H_Num1_lbl = new JLabel("HOUSE NO. :");
		H_Num1_lbl.setFont(new Font("Times New Roman", Font.BOLD, 12));
		H_Num1_lbl.setBounds(0, 3, 75, 15);
		Hnum_panel.add(H_Num1_lbl);
		
		HOUSE_NO11_TXT = new JTextField();
		HOUSE_NO11_TXT.setColumns(10);
		HOUSE_NO11_TXT.setBounds(73, 0, 236, 20);
		Hnum_panel.add(HOUSE_NO11_TXT);
		
		HOUSE_NO12_TXT = new JTextField();
		HOUSE_NO12_TXT.setColumns(10);
		HOUSE_NO12_TXT.setBounds(319, 0, 253, 20);
		Hnum_panel.add(HOUSE_NO12_TXT);
		
		JButton Address_btn = new JButton("SUBMIT");
		Address_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					REGION11 = REGION11_TXT.getText().toUpperCase();
					REGION12 = REGION12_TXT.getText().toUpperCase();
					int REGION111 = Integer.parseInt(REGION11);
					int REGION1112 = Integer.parseInt(REGION11);

					PROVINCE11 = PROVINCE11_TXT.getText().toUpperCase();
					PROVINCE12 = PROVINCE12_TXT.getText().toUpperCase();

					BARANGAY11 = BARANGAY11_TXT.getText().toUpperCase();
					BARANGAY12 = BARANGAY12_TXT.getText().toUpperCase();

					HOUSE_NO11 = HOUSE_NO11_TXT.getText().toUpperCase();
					HOUSE_NO12 = HOUSE_NO12_TXT.getText().toUpperCase();

					CITY_MUNICIPALITY11 = CITY_MUNICIPALITY11_TXT.getText().toUpperCase();
					CITY_MUNICIPALITY12 = CITY_MUNICIPALITY12_TXT.getText().toUpperCase();

					SPS11 = SPS11_TXT.getText().toUpperCase();
					SPS12 = SPS12_TXT.getText().toUpperCase();
					
					if (REGION11.equals("")||REGION12.equals("")||PROVINCE11.equals("")||PROVINCE12.equals("")||BARANGAY11.equals("")||BARANGAY12.equals("")||HOUSE_NO11.equals("")||HOUSE_NO12.equals("")||CITY_MUNICIPALITY11.equals("")||CITY_MUNICIPALITY12.equals("")||SPS11.equals("")||SPS12.equals("")) {
						JOptionPane.showMessageDialog(null, "PLEASE FILL UP ALL ITEMS");
					}else {
						
						check.doublecheck();
						Statement stm = con.createStatement();
						
						String query = "SELECT `COA` FROM 4ps_db_fds_final.change_of_address_from WHERE C_ADD = "+check.HN+"";
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery(query);
						rs.next();
						String H_NO = rs.getString("COA");
						
						System.out.println("old info found at " + H_NO);
						try {
							
							String query9 = "SELECT `Region`,`Province`,`Barangay`,`City/Municipality`,`Street/Purok/Sitio`,`House No` FROM 4ps_db_fds_final.change_of_address_to WHERE COA = "+H_NO+"";
							Statement st9 = con.createStatement();
							ResultSet rs9 = st.executeQuery(query9);
							rs9.next();
							
							String RE = rs9.getString("Region");
							String PRO = rs9.getString("Province");
							String BRG = rs9.getString("Barangay");
							String C_M = rs9.getString("City/Municipality");
							String S_P_S = rs9.getString("Street/Purok/Sitio");
							String H_NO1 = rs9.getString("House No");
							
							if (H_NO1.equals(HOUSE_NO11)&&S_P_S.equals(SPS11)&&BRG.equals(BARANGAY11)&&C_M.equals(CITY_MUNICIPALITY11)&&PRO.equals(PROVINCE11)&&RE.equals(REGION11)) {

								int input = JOptionPane.showConfirmDialog(null, 
						                "OLD INFO FOUND AT: "+ H_NO1 +" Do you want to proceed?", "Select an Option...",JOptionPane.YES_NO_OPTION);
								if (input==0) {
									String sql8  = "DELETE FROM `4ps_db_fds_final`.`change_of_address_to` WHERE (`COA` = '"+H_NO+"');";
									stm.executeUpdate(sql8);
									
									String sql7  = "DELETE FROM `4ps_db_fds_final`.`change_of_address_from` WHERE (`COA` = '"+H_NO+"');";
									stm.executeUpdate(sql7);
									
									String qry = "UPDATE `4ps_db_fds_final`.`household_and_personal_data_add_info` SET `House_no` = '"+H_NO1+"', `Street/Purok/Sitio` = '"+S_P_S+"', `Barangay` = '"+BRG+"', `City/Municipality` = '"+C_M+"', `Province` = '"+PRO+"', `Region` = '"+RE+"' WHERE (`House_no` = '"+check.HN+"');";
									PreparedStatement pst=con.prepareStatement(qry);
									pst.execute();
									
									String sql6  = "INSERT INTO `4ps_db_fds_final` . `change_of_address_from` (`C_ADD`,`Region`, `Province`, `Barangay` , `City/Municipality` , `Street/Purok/Sitio` , `House No`) VALUES ('"+HOUSE_NO11+"','"+REGION11+"', '"+PROVINCE11+"', '"+BARANGAY11+"', '"+CITY_MUNICIPALITY11+"', '"+SPS11+"', '"+HOUSE_NO11+"')";
									stm.executeUpdate(sql6);
									
									String query1 = "SELECT `COA` FROM 4ps_db_fds_final.change_of_address_from WHERE C_ADD = "+HOUSE_NO11+"";
									Statement st1 = con.createStatement();
									ResultSet rs1 = st.executeQuery(query1);
									
									rs1.next();
									String COAGET = rs1.getString("COA");
									
									String sql81  = "INSERT INTO `4ps_db_fds_final` . `change_of_address_to` (`COA`,`Region`, `Province`, `Barangay` , `City/Municipality` , `Street/Purok/Sitio` , `House No`) VALUES ('"+COAGET+"','"+REGION12+"', '"+PROVINCE12+"', '"+BARANGAY12+"', '"+CITY_MUNICIPALITY12+"', '"+SPS12+"', '"+HOUSE_NO12+"')";
									stm.executeUpdate(sql81);
									
									JOptionPane.showMessageDialog(null, "Information Accepted");
								}else {
									JOptionPane.showMessageDialog(null, "Operation Stop");
								}

								
							}else {
								JOptionPane.showMessageDialog(null, "OLD ADDRESS DONT MATCH");
							}
							
							
							
						}catch(Exception s1) {
							System.out.println("this is the error" + s1);
						}
					}
					
				}catch(Exception aa) {
					try {
						Statement stm = con.createStatement();
						Statement st = con.createStatement();
						int input = JOptionPane.showConfirmDialog(null, 
				                "NO UPDATE INFO FOUND AT: "+ check.HN +" Do you want to proceed?", "Select an Option...",JOptionPane.YES_NO_OPTION);
						
						if(input==0) {
							String sql6  = "INSERT INTO `4ps_db_fds_final` . `change_of_address_from` (`C_ADD`,`Region`, `Province`, `Barangay` , `City/Municipality` , `Street/Purok/Sitio` , `House No`) VALUES ('"+HOUSE_NO11+"','"+REGION11+"', '"+PROVINCE11+"', '"+BARANGAY11+"', '"+CITY_MUNICIPALITY11+"', '"+SPS11+"', '"+HOUSE_NO11+"')";
							stm.executeUpdate(sql6);
							
							String query1 = "SELECT `COA` FROM 4ps_db_fds_final.change_of_address_from WHERE C_ADD = "+HOUSE_NO11+"";
							Statement st1 = con.createStatement();
							ResultSet rs1 = st.executeQuery(query1);
							
							rs1.next();
							String COAGET = rs1.getString("COA");
							
							String sql8  = "INSERT INTO `4ps_db_fds_final` . `change_of_address_to` (`COA`,`Region`, `Province`, `Barangay` , `City/Municipality` , `Street/Purok/Sitio` , `House No`) VALUES ('"+COAGET+"','"+REGION12+"', '"+PROVINCE12+"', '"+BARANGAY12+"', '"+CITY_MUNICIPALITY12+"', '"+SPS12+"', '"+HOUSE_NO12+"')";
							stm.executeUpdate(sql8);

							JOptionPane.showMessageDialog(null, "Information Accepted");
						}
					}catch(Exception e1) {
						
					}
					//JOptionPane.showMessageDialog(null, "ERROR " + aa);
				}
				
				
			}
		});
		Address_btn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Address_btn.setBounds(244, 154, 89, 23);
		panel_70.add(Address_btn);
	}
}
