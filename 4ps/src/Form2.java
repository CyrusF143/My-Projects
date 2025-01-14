import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Form2 {
	
	private static String LAST_NAME, FIRST_NAME, MIDDLE_NAME, EXTENSION_NAME, DATE, NAME_OF_SCHOOL1, SIX;
	private static JTextField LAST_NAME_TXT, FIRST_NAME_TXT, MIDDLE_NAME_TXT, EXTENSION_NAME_TXT, DATE_TXT, SEX_TXT, NAME_OF_SCHOOL_TXT, REGION11_TXT, REGION12_TXT, PROVINCE11_TXT, PROVINCE12_TXT, BARANGAY11_TXT, BARANGAY12_TXT, CITY_MUNICIPALITY11_TXT;
	private static int NB_YES_NO=3, NB_YES_NO1=3, School_att=3, edu_attend=3;
	public static JPanel NEWBRON_PANEL;
	public static boolean selected = false;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void newborn()throws Exception{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(MainForm.url,MainForm.username,MainForm.pass);

		MainForm pan = new MainForm();
		
		NEWBRON_PANEL = new JPanel();
		NEWBRON_PANEL.setBorder(new LineBorder(new Color(0, 0, 0)));
		NEWBRON_PANEL.setBounds(0, 270, 582, 188);
		NEWBRON_PANEL.setVisible(false);
		MainForm.panel_1.add(NEWBRON_PANEL);
		NEWBRON_PANEL.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setBounds(0, 0, 582, 48);
		NEWBRON_PANEL.add(panel_2_1);
		
		JLabel Grantee_name_LBL_1 = new JLabel("FULL NAME: ");
		Grantee_name_LBL_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Grantee_name_LBL_1.setBounds(0, 26, 105, 14);
		panel_2_1.add(Grantee_name_LBL_1);
		
		LAST_NAME_TXT = new JTextField();
		LAST_NAME_TXT.setColumns(10);
		LAST_NAME_TXT.setBounds(80, 23, 124, 20);
		panel_2_1.add(LAST_NAME_TXT);
		
		JLabel Lname1_LBL = new JLabel("LAST NAME");
		Lname1_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		Lname1_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Lname1_LBL.setBounds(80, 11, 124, 14);
		panel_2_1.add(Lname1_LBL);
		
		JLabel Fname1_LBL = new JLabel("FIRST NAME");
		Fname1_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		Fname1_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Fname1_LBL.setBounds(214, 11, 98, 14);
		panel_2_1.add(Fname1_LBL);
		
		FIRST_NAME_TXT = new JTextField();
		FIRST_NAME_TXT.setColumns(10);
		FIRST_NAME_TXT.setBounds(214, 23, 98, 20);
		panel_2_1.add(FIRST_NAME_TXT);
		
		JLabel Mname1_LBL = new JLabel("MIDDLE NAME");
		Mname1_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		Mname1_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Mname1_LBL.setBounds(322, 11, 98, 14);
		panel_2_1.add(Mname1_LBL);
		
		MIDDLE_NAME_TXT = new JTextField();
		MIDDLE_NAME_TXT.setColumns(10);
		MIDDLE_NAME_TXT.setBounds(322, 23, 98, 20);
		panel_2_1.add(MIDDLE_NAME_TXT);
		
		JLabel ExtenName1_LBL = new JLabel("EXTENSION NAME");
		ExtenName1_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		ExtenName1_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ExtenName1_LBL.setBounds(430, 11, 129, 14);
		panel_2_1.add(ExtenName1_LBL);
		
		EXTENSION_NAME_TXT = new JTextField();
		EXTENSION_NAME_TXT.setColumns(10);
		EXTENSION_NAME_TXT.setBounds(430, 23, 129, 20);
		panel_2_1.add(EXTENSION_NAME_TXT);
		
		JPanel panel_79 = new JPanel();
		panel_79.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_79.setBounds(0, 47, 582, 34);
		NEWBRON_PANEL.add(panel_79);
		panel_79.setLayout(null);
		
		JLabel date_LBL = new JLabel("DATE OF BIRTH:");
		date_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		date_LBL.setBounds(0, 11, 105, 14);
		panel_79.add(date_LBL);
		
		DATE_TXT = new JTextField();
		DATE_TXT.setText("YYYY/MM/DD");
		DATE_TXT.setBounds(107, 8, 97, 20);
		panel_79.add(DATE_TXT);
		DATE_TXT.setColumns(10);
		
		JLabel SEX_LBL = new JLabel("SEX:");
		SEX_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		SEX_LBL.setBounds(214, 11, 34, 14);
		panel_79.add(SEX_LBL);
		
		SEX_TXT = new JTextField();
		SEX_TXT.setBounds(249, 8, 62, 20);
		panel_79.add(SEX_TXT);
		SEX_TXT.setColumns(10);
		
		JLabel DIS_LBL = new JLabel("DISABLED?:");
		DIS_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		DIS_LBL.setBounds(332, 11, 79, 14);
		panel_79.add(DIS_LBL);
		
		JRadioButton NB_YES_radio = new JRadioButton("YES");
		NB_YES_radio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(NB_YES_radio.isSelected()) {
					NB_YES_NO = 1;
				}else {
					NB_YES_NO = 0;
				}
				
			}
		});
		NB_YES_radio.setBounds(406, 7, 53, 23);
		panel_79.add(NB_YES_radio);
		
		JRadioButton NB_NO_radio = new JRadioButton("NO");
		NB_NO_radio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(NB_NO_radio.isSelected()) {
				NB_YES_NO = 0;
				}else {
					NB_YES_NO = 1;
				}
				
			}
		});
		NB_NO_radio.setBounds(458, 7, 53, 23);
		panel_79.add(NB_NO_radio);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(NB_YES_radio);
		group1.add(NB_NO_radio);
		
		JPanel panel_81 = new JPanel();
		panel_81.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_81.setBounds(0, 80, 582, 34);
		NEWBRON_PANEL.add(panel_81);
		panel_81.setLayout(null);
		
		JLabel Attending_LBL = new JLabel("ATTENDING SCHOOL ?");
		Attending_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Attending_LBL.setBounds(0, 11, 145, 14);
		panel_81.add(Attending_LBL);
		
		JRadioButton NB_YES1_radio = new JRadioButton("YES");
		NB_YES1_radio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(NB_YES1_radio.isSelected()) {
					NB_YES_NO1 = 1;
				}else {
					NB_YES_NO1 = 0;
				}
				
			}
		});
		NB_YES1_radio.setBounds(139, 7, 53, 23);
		panel_81.add(NB_YES1_radio);
		
		JRadioButton NB_NO1_radio = new JRadioButton("NO");
		NB_NO1_radio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(NB_NO1_radio.isSelected()) {
				NB_YES_NO1 = 0;
				}else {
					NB_YES_NO1 = 1;
				}
			}
		});
		NB_NO1_radio.setBounds(191, 7, 53, 23);
		panel_81.add(NB_NO1_radio);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(NB_YES1_radio);
		group2.add(NB_NO1_radio);
		
		JPanel panel_8_11 = new JPanel();
		panel_8_11.setLayout(null);
		panel_8_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8_11.setBounds(0, 113, 582, 34);
		NEWBRON_PANEL.add(panel_8_11);
		
		JLabel NS_LBL = new JLabel("NAME OF SCHOOL: ");
		NS_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		NS_LBL.setBounds(0, 11, 125, 14);
		panel_8_11.add(NS_LBL);
		
		NAME_OF_SCHOOL_TXT = new JTextField();
		NAME_OF_SCHOOL_TXT.setBounds(124, 5, 448, 20);
		panel_8_11.add(NAME_OF_SCHOOL_TXT);
		NAME_OF_SCHOOL_TXT.setColumns(10);
			
			JButton btnNewButton = new JButton("SUBMIT");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					System.out.println("working somehow");
					try {
						
						LAST_NAME = LAST_NAME_TXT.getText().toUpperCase();
						FIRST_NAME = FIRST_NAME_TXT.getText().toUpperCase();
						MIDDLE_NAME = MIDDLE_NAME_TXT.getText().toUpperCase();
						EXTENSION_NAME = EXTENSION_NAME_TXT.getText().toUpperCase();
						DATE = DATE_TXT.getText().toUpperCase();
						SIX = SEX_TXT.getText().toUpperCase();
						NAME_OF_SCHOOL1 = NAME_OF_SCHOOL_TXT.getText().toUpperCase();
						
						if (LAST_NAME.equals("")||FIRST_NAME.equals("")||MIDDLE_NAME.equals("")||DATE.equals("")||NAME_OF_SCHOOL1.equals("")||SIX.equals("")||NB_YES_NO==3||NB_YES_NO1==3) {
							JOptionPane.showMessageDialog(null, "PLEASE FILL UP ALL ITEMS");
						}else {
							check.doublecheck();
							if (check.runn == true) {
								int ids = 0;
								String Lname1 = null;
								String Fname1 = null;
								String Mname1 = null;
								String Exten1;
								int found_applicant_numm;
								boolean Fmatch = false;
								
								Statement stm1 = con.createStatement();
								
								String sql6 = "SELECT `NB_AHM_ID`, `Lastname`, `Firstname`, `Middlename`, `Extensionname` FROM 4ps_db_fds_final.new_born_and_additional_household_member_name;";
								ResultSet rs4 = stm1.executeQuery(sql6);
								
								while(rs4.next()) {
									ids = rs4.getInt("NB_AHM_ID");
									Lname1 = rs4.getString("Lastname");
									Fname1 = rs4.getString("Firstname");
									Mname1 = rs4.getString("Middlename");
									Exten1 = rs4.getString("Extensionname");
											if(Lname1.equals(LAST_NAME)&&Fname1.equals(FIRST_NAME)&&Mname1.equals(MIDDLE_NAME)) {
												JOptionPane.showMessageDialog(null, "SAME DATA NAME FOUND");
												Fmatch =true;
												break;
											}
								}
								
								
								if (Fmatch==false) {
									String Lname = null;
									String Fname = null;
									String Mname = null;
									String Exten;
									int HN,HIN;
									int ApplicantID, ApplicantID1;
									int found_applicant_num = 0, found_applicant_num1 = 0;
									
									Statement stm = con.createStatement();
									String sql4  = "INSERT INTO `4ps_db_fds_final` . `new_born_and_additional_household_member_name` (`AHM_ID`,`Lastname`, `Firstname`, `Middlename` , `Extensionname`) VALUES ('"+check.found_applicant_num+"','"+LAST_NAME+"', '"+FIRST_NAME+"', '"+MIDDLE_NAME+"', '"+EXTENSION_NAME+"')";
									stm.executeUpdate(sql4);
									
									String sql2 = "SELECT `NB_AHM_ID` , `Lastname`, `Firstname`, `Middlename`, `Extensionname` FROM 4ps_db_fds_final.new_born_and_additional_household_member_name;";
									ResultSet rs = stm.executeQuery(sql2);
									
									while(rs.next()) {
										ApplicantID = rs.getInt("NB_AHM_ID");
										Lname = rs.getString("Lastname");
										Fname = rs.getString("Firstname");
										Mname = rs.getString("Middlename");
										Exten = rs.getString("Extensionname");
												if(Lname.equals(LAST_NAME)&&Fname.equals(FIRST_NAME)&&Mname.equals(MIDDLE_NAME)) {
													found_applicant_num = rs.getInt("NB_AHM_ID");
													System.out.println("ID Found");
													break;
												}
									}
									System.out.println(found_applicant_num + "dddddd");
									String sql5  = "INSERT INTO `4ps_db_fds_final` . `new_born_and_additional_household_member_add_info` (`NB_AHM_ID`,`Date_of_Birth`, `Sex`, `Disabled` , `Attending_School` , `Name_of_School`) VALUES ('"+found_applicant_num+"','"+DATE+"', '"+SIX+"', '"+NB_YES_NO+"', '"+NB_YES_NO1+"' , '"+NAME_OF_SCHOOL1+"')";
									stm.executeUpdate(sql5);
									
									JOptionPane.showMessageDialog(null, "Information Accepted");
								}else {
									
									int input = JOptionPane.showConfirmDialog(null, 
							                "OLD INFO FOUND AT: "+ ids +" Do you want to Update the Info?", "Select an Option...",JOptionPane.YES_NO_OPTION);
									
									if (input==0) {
										String qry = "UPDATE `4ps_db_fds_final`.`new_born_and_additional_household_member_add_info` SET `Date_of_Birth` = '"+DATE+"', `Sex` = '"+SIX+"', `Disabled` = '"+NB_YES_NO+"', `Attending_School` = '"+NB_YES_NO1+"', `Name_of_School` = '"+NAME_OF_SCHOOL1+"' WHERE (`NB_AHM_ID` = '"+ids+"');";
										PreparedStatement pst=con.prepareStatement(qry);
										pst.execute();
										
										JOptionPane.showMessageDialog(null, "Information Updated");
									}else {
										JOptionPane.showMessageDialog(null, "Opperation Stop");
									}
								}
								
								
							}
							else {
								JOptionPane.showMessageDialog(null, "ERROR");
							}
						}
		
					}catch(Exception a) {
						
					}
				
				}
			});
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
			btnNewButton.setBounds(244, 154, 89, 23);
			NEWBRON_PANEL.add(btnNewButton);

	}
}
