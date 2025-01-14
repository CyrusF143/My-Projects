import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class Form5 {
	
	public static JPanel CEI_PANEL;
	
	private static String Lname_LBL_11, Fname_LBL_1_11, Mname_LBL_11, ExtenName_LBL_11;
	private static String NOS1_1, NOS1_2, ADDRESS_OF_SCHOOL1, ADDRESS_OF_SCHOOL2, GRADE_LEVEL1, GRADE_LEVEL2;
	
	private static JTextField NOF1_LBL_TO, Lname_LBL_1_TXT, Fname_LBL_1_1_TXT, Mname_LBL_1_TXT, ExtenName_LBL_1_TXT, NOS1_1_TXT_FORM;
	private static JTextField NOS1_1_TXT_TO, ADDRESS_OF_SCHOOL1_TXT, ADDRESS_OF_SCHOOL2_TXT, GRADE_LEVEL1_TXT, GRADE_LEVEL2_TXT, HOUSE_NO11_TXT, HOUSE_NO12_TXT;

	private static int NB_YES_NO=3, NB_YES_NO1=3, School_att=3, edu_attend=3;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void  edu() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(MainForm.url,MainForm.username,MainForm.pass);
		
		CEI_PANEL = new JPanel();
		CEI_PANEL.setBorder(new LineBorder(new Color(0, 0, 0)));
		CEI_PANEL.setBounds(0, 270, 582, 188);
		CEI_PANEL.setVisible(false);
		MainForm.panel_1.add(CEI_PANEL);
		CEI_PANEL.setLayout(null);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_1.setBounds(0, 0, 582, 48);
		CEI_PANEL.add(panel_2_1_1);
		
		JLabel NameC_LBL = new JLabel("NAME OF CHILD:");
		NameC_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		NameC_LBL.setBounds(0, 26, 105, 14);
		panel_2_1_1.add(NameC_LBL);
		
		Lname_LBL_1_TXT = new JTextField();
		Lname_LBL_1_TXT.setColumns(10);
		Lname_LBL_1_TXT.setBounds(106, 23, 98, 20);
		panel_2_1_1.add(Lname_LBL_1_TXT);
		
		JLabel Lname_LBL_1 = new JLabel("LAST NAME");
		Lname_LBL_1.setHorizontalAlignment(SwingConstants.CENTER);
		Lname_LBL_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Lname_LBL_1.setBounds(106, 11, 98, 14);
		panel_2_1_1.add(Lname_LBL_1);
		
		JLabel Fname_LBL_1_1 = new JLabel("FIRST NAME");
		Fname_LBL_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Fname_LBL_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Fname_LBL_1_1.setBounds(214, 11, 98, 14);
		panel_2_1_1.add(Fname_LBL_1_1);
		
		Fname_LBL_1_1_TXT = new JTextField();
		Fname_LBL_1_1_TXT.setColumns(10);
		Fname_LBL_1_1_TXT.setBounds(214, 23, 98, 20);
		panel_2_1_1.add(Fname_LBL_1_1_TXT);
		
		JLabel Mname_LBL_1_1_1 = new JLabel("MIDDLE NAME");
		Mname_LBL_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Mname_LBL_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Mname_LBL_1_1_1.setBounds(322, 11, 98, 14);
		panel_2_1_1.add(Mname_LBL_1_1_1);
		
		Mname_LBL_1_TXT = new JTextField();
		Mname_LBL_1_TXT.setColumns(10);
		Mname_LBL_1_TXT.setBounds(322, 23, 98, 20);
		panel_2_1_1.add(Mname_LBL_1_TXT);
		
		JLabel ExtenName_LBL_1 = new JLabel("EXTENSION NAME");
		ExtenName_LBL_1.setHorizontalAlignment(SwingConstants.CENTER);
		ExtenName_LBL_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ExtenName_LBL_1.setBounds(430, 11, 129, 14);
		panel_2_1_1.add(ExtenName_LBL_1);
		
		ExtenName_LBL_1_TXT = new JTextField();
		ExtenName_LBL_1_TXT.setColumns(10);
		ExtenName_LBL_1_TXT.setBounds(430, 23, 129, 20);
		panel_2_1_1.add(ExtenName_LBL_1_TXT);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7_1.setBounds(0, 47, 582, 26);
		CEI_PANEL.add(panel_7_1);
		panel_7_1.setLayout(null);
		
		JLabel ATT_1_LBL_1 = new JLabel("ATTENDING SCHOOL? ");
		ATT_1_LBL_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ATT_1_LBL_1.setBounds(0, 11, 141, 14);
		panel_7_1.add(ATT_1_LBL_1);
		
		JRadioButton YES_RB11 = new JRadioButton("YES");
		YES_RB11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (YES_RB11.isSelected()) {
					edu_attend = 1;
				}
			}
		});
		YES_RB11.setBounds(150, 2, 53, 23);
		panel_7_1.add(YES_RB11);
		
		JRadioButton NO_RB11_1 = new JRadioButton("NO\r\n");
		NO_RB11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				edu_attend = 0;
				
			}
		});
		NO_RB11_1.setBounds(212, 2, 53, 23);
		panel_7_1.add(NO_RB11_1);
		
		ButtonGroup group4 = new ButtonGroup();
		group4.add(YES_RB11);
		group4.add(NO_RB11_1);
		
		JLabel FROM_111_LBL = new JLabel("FROM");
		FROM_111_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		FROM_111_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		FROM_111_LBL.setBounds(206, 72, 68, 14);
		CEI_PANEL.add(FROM_111_LBL);
		
		JLabel TO_111_LBL_1 = new JLabel("TO");
		TO_111_LBL_1.setHorizontalAlignment(SwingConstants.CENTER);
		TO_111_LBL_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		TO_111_LBL_1.setBounds(350, 72, 68, 14);
		CEI_PANEL.add(TO_111_LBL_1);
		
		JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7_1_1.setBounds(0, 84, 582, 26);
		CEI_PANEL.add(panel_7_1_1);
		panel_7_1_1.setLayout(null);
		
		JLabel NOS1_1_LBL = new JLabel("NAME OF SCHOOL:");
		NOS1_1_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		NOS1_1_LBL.setBounds(0, 11, 127, 14);
		panel_7_1_1.add(NOS1_1_LBL);
		
		NOS1_1_TXT_FORM = new JTextField();
		NOS1_1_TXT_FORM.setBounds(143, 3, 209, 20);
		panel_7_1_1.add(NOS1_1_TXT_FORM);
		NOS1_1_TXT_FORM.setColumns(10);
		
		NOS1_1_TXT_TO = new JTextField();
		NOS1_1_TXT_TO.setColumns(10);
		NOS1_1_TXT_TO.setBounds(362, 3, 210, 20);
		panel_7_1_1.add(NOS1_1_TXT_TO);
		
		JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7_1_1_1.setBounds(0, 109, 582, 26);
		CEI_PANEL.add(panel_7_1_1_1);
		
		JLabel ADD11_LBL = new JLabel("ADDRESS OF SCHOOL:");
		ADD11_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ADD11_LBL.setBounds(0, 11, 144, 14);
		panel_7_1_1_1.add(ADD11_LBL);
		
		ADDRESS_OF_SCHOOL1_TXT = new JTextField();
		ADDRESS_OF_SCHOOL1_TXT.setColumns(10);
		ADDRESS_OF_SCHOOL1_TXT.setBounds(144, 3, 208, 20);
		panel_7_1_1_1.add(ADDRESS_OF_SCHOOL1_TXT);
		
		ADDRESS_OF_SCHOOL2_TXT = new JTextField();
		ADDRESS_OF_SCHOOL2_TXT.setColumns(10);
		ADDRESS_OF_SCHOOL2_TXT.setBounds(362, 3, 210, 20);
		panel_7_1_1_1.add(ADDRESS_OF_SCHOOL2_TXT);
		
		JPanel panel_7_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7_1_1_1_1.setBounds(0, 134, 582, 26);
		CEI_PANEL.add(panel_7_1_1_1_1);
		
		JLabel GLVL_LBL = new JLabel("GRADE LEVEL:");
		GLVL_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GLVL_LBL.setBounds(0, 11, 144, 14);
		panel_7_1_1_1_1.add(GLVL_LBL);
		
		GRADE_LEVEL1_TXT = new JTextField();
		GRADE_LEVEL1_TXT.setColumns(10);
		GRADE_LEVEL1_TXT.setBounds(144, 3, 208, 20);
		panel_7_1_1_1_1.add(GRADE_LEVEL1_TXT);
		
		GRADE_LEVEL2_TXT = new JTextField();
		GRADE_LEVEL2_TXT.setColumns(10);
		GRADE_LEVEL2_TXT.setBounds(362, 3, 210, 20);
		panel_7_1_1_1_1.add(GRADE_LEVEL2_TXT);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Lname_LBL_11 = Lname_LBL_1_TXT.getText().toUpperCase();
					Fname_LBL_1_11 = Fname_LBL_1_1_TXT.getText().toUpperCase();
					Mname_LBL_11 = Mname_LBL_1_TXT.getText().toUpperCase();
					ExtenName_LBL_11 = ExtenName_LBL_1_TXT.getText().toUpperCase();
					
					NOS1_1 = NOS1_1_TXT_FORM.getText().toUpperCase();
					NOS1_2= NOS1_1_TXT_TO.getText().toUpperCase();

					ADDRESS_OF_SCHOOL1 = ADDRESS_OF_SCHOOL1_TXT.getText().toUpperCase();
					ADDRESS_OF_SCHOOL2 = ADDRESS_OF_SCHOOL2_TXT.getText().toUpperCase();

					GRADE_LEVEL1 = GRADE_LEVEL1_TXT.getText().toUpperCase();
					GRADE_LEVEL2 = GRADE_LEVEL2_TXT.getText().toUpperCase();
					
					if (Lname_LBL_11.equals("")||Fname_LBL_1_11.equals("")||Mname_LBL_11.equals("")||NOS1_1.equals("")||ADDRESS_OF_SCHOOL1.equals("")||GRADE_LEVEL1.equals("")||edu_attend==3) {
						JOptionPane.showMessageDialog(null, "PLEASE FILL UP ALL ITEMS");
					}else {
						int found_applicant_num = 0, ApplicantID = 0;
						Statement stm = con.createStatement();
						check.doublecheck();
						
						try {
							
							String sql10 = "SELECT `Edu_ID` FROM 4ps_db_fds_final.change_of_education_info_name Where Education_info_ID = '"+check.found_applicant_num+"';";
							ResultSet rs3 = stm.executeQuery(sql10);
							rs3.next();
							int id = rs3.getInt("Edu_ID");
							System.out.println("this is the iddd" + id);
							
							int input = JOptionPane.showConfirmDialog(null, 
					                "OLD INFO FOUND AT: "+ id +" Do you want to proceed?", "Select an Option...",JOptionPane.YES_NO_OPTION);
							
							if(input==0) {
								String sql2 = "SELECT `Edu_ID` , `Lastname`, `Firstname`, `Middlename` FROM 4ps_db_fds_final.change_of_education_info_name  WHERE Education_info_ID = "+check.found_applicant_num+";";
								ResultSet rs111 = stm.executeQuery(sql2);
								
								while(rs111.next()) {
									ApplicantID = rs111.getInt("Edu_ID");
									String Lname = rs111.getString("Lastname");
									String Fname = rs111.getString("Firstname");
									String Mname = rs111.getString("Middlename");
											if(Lname.equals(Lname_LBL_11)&&Fname.equals(Fname_LBL_1_11)&&Mname.equals(Mname_LBL_11)) {
												found_applicant_num = rs111.getInt("Edu_ID");
												System.out.println("ID Found");
												break;
											}
								}
								
								if (found_applicant_num==0) {
									System.out.println("name found at " + found_applicant_num);
									JOptionPane.showMessageDialog(null, "Information don't match");
								}else {
									System.out.println("name found at " + found_applicant_num);
									
									String qry1 = "UPDATE `4ps_db_fds_final`.`change_of_education_add_info_from` SET `Attending_School` = '"+edu_attend+"', `Name_of_School` = '"+NOS1_1+"', `Address_of_School` = '"+ADDRESS_OF_SCHOOL1+"', `Grade_Level` = '"+GRADE_LEVEL1+"' WHERE (`Edu_ID` = '"+found_applicant_num+"');";
									PreparedStatement pst1=con.prepareStatement(qry1);
									pst1.execute();
									
									String qry2 = "UPDATE `4ps_db_fds_final`.`change_of_education_add_info_to` SET `Attending_School` = '"+edu_attend+"', `Name_of_School` = '"+NOS1_2+"', `Address_of_School` = '"+ADDRESS_OF_SCHOOL2+"', `Grade_Level` = '"+GRADE_LEVEL2+"' WHERE (`C_EDU_ID` = '"+found_applicant_num+"');";
									PreparedStatement pst2=con.prepareStatement(qry2);
									pst2.execute();
									
									String qry3 = "UPDATE `4ps_db_fds_final`.`new_born_and_additional_household_member_add_info` SET `Name_of_School` = '"+NOS1_2+"' WHERE (`NB_AHM_ID` = '"+found_applicant_num+"');";
									PreparedStatement pst3=con.prepareStatement(qry3);
									pst3.execute();
									JOptionPane.showMessageDialog(null, "Information Updated");
								}
								
							}else {
								JOptionPane.showMessageDialog(null, "Operation Stop");
							}
							

							
						}catch(Exception aa1) {
							System.out.println("error empty" );
							String sql12  = "INSERT INTO `4ps_db_fds_final` . `change_of_education_info_name` (`Education_info_ID` , `Lastname`,`Firstname`, `Middlename`, `Extenionname`) VALUES ('"+check.found_applicant_num1+"','"+Lname_LBL_11+"', '"+Fname_LBL_1_11+"', '"+Mname_LBL_11+"', '"+ExtenName_LBL_11+"')";
							stm.executeUpdate(sql12);
							
							String sql10 = "SELECT `Edu_ID` FROM 4ps_db_fds_final.change_of_education_info_name Where Education_info_ID = '"+check.found_applicant_num+"';";
							ResultSet rs3 = stm.executeQuery(sql10);
							rs3.next();
							int id = rs3.getInt("Edu_ID");
							
							String sql14  = "INSERT INTO `4ps_db_fds_final` . `change_of_education_add_info_from` (`Edu_ID` , `Attending_School`,`Name_of_School`, `Address_of_School`, `Grade_Level`) VALUES ('"+id+"','"+edu_attend+"', '"+NOS1_1+"', '"+ADDRESS_OF_SCHOOL1+"', '"+GRADE_LEVEL1+"')";
							stm.executeUpdate(sql14);
							
							String sql15 = "SELECT `C_EDU_ID` FROM 4ps_db_fds_final.change_of_education_add_info_from Where Edu_ID = '"+id+"';";
							ResultSet rs15 = stm.executeQuery(sql15);
							rs15.next();
							int id15 = rs15.getInt("C_EDU_ID");
							
							String sql16  = "INSERT INTO `4ps_db_fds_final` . `change_of_education_add_info_to` (`C_EDU_ID` , `Attending_School`,`Name_of_School`, `Address_of_School`, `Grade_Level`) VALUES ('"+id15+"','"+edu_attend+"', '"+NOS1_2+"', '"+ADDRESS_OF_SCHOOL2+"', '"+GRADE_LEVEL2+"')";
							stm.executeUpdate(sql16);
							
							JOptionPane.showMessageDialog(null, "Information Accepted");
						}
					}
					
				}catch(Exception e1) {
					System.out.println("Error " + e1);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(244, 162, 89, 23);
		CEI_PANEL.add(btnNewButton);
		
	}

}
