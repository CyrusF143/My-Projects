import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class MainForm {

	public static JPanel panel_1;
	
	static String url = "jdbc:mysql://localhost:3306/4ps_db";
	static String username = "root";
	static String pass = "zed143";
	static boolean btn = false, editcheck;
	static JFrame frame;
	private static JTextField Lname_TXT, Fname_TXT, Mname_TXT, EXname_TXT, HOUSEHOLD_ID_NUMBER_TXT, HOUSE_NO_TXT, STREET_PUROK_SITIO_TXT, BARANGAY_TXT, CITY_MUNICIPALITY_TXT, PROVINCE_TXT, REGION_TXT;
	 static String LNAME;
	 static String FNAME;
	 static String MNAME;
	 static String EXNAME;
	 static String HOUSEHOLD_ID_NUMBER, HOUSE_NO, STREET_PUROK_SITIO, BARANGAY, CITY_MUNICIPALITY, PROVINCE, REGION;

		private static String LAST_NAME, FIRST_NAME, MIDDLE_NAME, EXTENSION_NAME, DATE, NAME_OF_SCHOOL1, SIX;
		private static JTextField LAST_NAME_TXT, FIRST_NAME_TXT, MIDDLE_NAME_TXT, EXTENSION_NAME_TXT, DATE_TXT, SEX_TXT, NAME_OF_SCHOOL_TXT, REGION11_TXT, REGION12_TXT, PROVINCE11_TXT, PROVINCE12_TXT, BARANGAY11_TXT, BARANGAY12_TXT, CITY_MUNICIPALITY11_TXT;
		private static int NB_YES_NO=3, NB_YES_NO1=3, School_att=3, edu_attend=3;
	 
		public static JRadioButton Title4_CB;
		
	
	public static void main(String[] args) throws Exception {
		mainframe();
	}

	public static void mainframe() throws Exception  {
	frame = new JFrame();
	frame.getContentPane().setBackground(SystemColor.info);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(618,254); // main state
	//frame.setSize(618,554); // final state
	frame.setLocationRelativeTo(null);
	frame.getContentPane().setLayout(null);
	codes();
	frame.setVisible(true);

}
	
	public static void codes() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,pass);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(SystemColor.info);
		panel.setBounds(10, 11, 582, 31);
		frame.getContentPane().add(panel);
		
		JLabel Title_LBL = new JLabel("Beneficiary Data Update Request Form");
		Title_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		Title_LBL.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel.add(Title_LBL);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(10, 41, 582, 169);//main state
		//panel_1.setBounds(10, 41, 582, 463);//final state
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Title2_LBL = new JLabel("A. TO BE FELLED OUT BY HOUSEHOLD GRANTEE");
		Title2_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		Title2_LBL.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Title2_LBL.setBounds(0, 7, 582, 14);
		panel_1.add(Title2_LBL);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 21, 582, 48);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel Grantee_name_LBL = new JLabel("GRANTEE NAME: ");
		Grantee_name_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Grantee_name_LBL.setBounds(0, 26, 105, 14);
		panel_2.add(Grantee_name_LBL);
		
		Lname_TXT = new JTextField();
		Lname_TXT.setColumns(10);
		Lname_TXT.setBounds(106, 23, 98, 20);
		panel_2.add(Lname_TXT);
		
		JLabel Lname_LBL = new JLabel("LAST NAME");
		Lname_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		Lname_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Lname_LBL.setBounds(106, 11, 98, 14);
		panel_2.add(Lname_LBL);
		
		JLabel Fname_LBL_1 = new JLabel("FIRST NAME");
		Fname_LBL_1.setHorizontalAlignment(SwingConstants.CENTER);
		Fname_LBL_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Fname_LBL_1.setBounds(214, 11, 98, 14);
		panel_2.add(Fname_LBL_1);
		
		Fname_TXT = new JTextField();
		Fname_TXT.setColumns(10);
		Fname_TXT.setBounds(214, 23, 98, 20);
		panel_2.add(Fname_TXT);
		
		JLabel Mname_LBL_1_1 = new JLabel("MIDDLE NAME");
		Mname_LBL_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Mname_LBL_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Mname_LBL_1_1.setBounds(322, 11, 98, 14);
		panel_2.add(Mname_LBL_1_1);
		
		Mname_TXT = new JTextField();
		Mname_TXT.setColumns(10);
		Mname_TXT.setBounds(322, 23, 98, 20);
		panel_2.add(Mname_TXT);
		
		JLabel ExtenName_LBL = new JLabel("EXTENSION NAME");
		ExtenName_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		ExtenName_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ExtenName_LBL.setBounds(430, 11, 129, 14);
		panel_2.add(ExtenName_LBL);
		
		EXname_TXT = new JTextField();
		EXname_TXT.setColumns(10);
		EXname_TXT.setBounds(430, 23, 129, 20);
		panel_2.add(EXname_TXT);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(0, 68, 582, 40);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel H_ID_Num_LBL = new JLabel("HOUSEHOLD ID NUMBER\r\n");
		H_ID_Num_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		H_ID_Num_LBL.setBounds(0, 14, 158, 14);
		panel_3.add(H_ID_Num_LBL);
		
		HOUSEHOLD_ID_NUMBER_TXT = new JTextField();
		HOUSEHOLD_ID_NUMBER_TXT.setBounds(157, 11, 115, 20);
		panel_3.add(HOUSEHOLD_ID_NUMBER_TXT);
		HOUSEHOLD_ID_NUMBER_TXT.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(284, 0, 298, 40);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel Add_LBL = new JLabel("ADDRESS");
		Add_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Add_LBL.setBounds(0, 15, 68, 14);
		panel_4.add(Add_LBL);
		
		JLabel H_Num_LBL = new JLabel("HOUSE NO.");
		H_Num_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		H_Num_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		H_Num_LBL.setBounds(61, 0, 86, 14);
		panel_4.add(H_Num_LBL);
		
		HOUSE_NO_TXT = new JTextField();
		HOUSE_NO_TXT.setBounds(61, 12, 86, 20);
		panel_4.add(HOUSE_NO_TXT);
		HOUSE_NO_TXT.setColumns(10);
		
		STREET_PUROK_SITIO_TXT = new JTextField();
		STREET_PUROK_SITIO_TXT.setColumns(10);
		STREET_PUROK_SITIO_TXT.setBounds(157, 12, 131, 20);
		panel_4.add(STREET_PUROK_SITIO_TXT);
		
		JLabel SPS_LBL = new JLabel("STREET/PUROK/SITIO");
		SPS_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		SPS_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		SPS_LBL.setBounds(145, 0, 153, 14);
		panel_4.add(SPS_LBL);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(0, 107, 582, 34);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel Add_LBL_1 = new JLabel("ADDRESS");
		Add_LBL_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Add_LBL_1.setBounds(0, 15, 68, 14);
		panel_5.add(Add_LBL_1);
		
		JLabel BRG_LBL = new JLabel("BARANGAY");
		BRG_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		BRG_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BRG_LBL.setBounds(61, 0, 156, 14);
		panel_5.add(BRG_LBL);
		
		BARANGAY_TXT = new JTextField();
		BARANGAY_TXT.setColumns(10);
		BARANGAY_TXT.setBounds(61, 12, 156, 20);
		panel_5.add(BARANGAY_TXT);
		
		JLabel City_LBL = new JLabel("CITY/MUNICIPALITY");
		City_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		City_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		City_LBL.setBounds(227, 0, 153, 14);
		panel_5.add(City_LBL);
		
		CITY_MUNICIPALITY_TXT = new JTextField();
		CITY_MUNICIPALITY_TXT.setColumns(10);
		CITY_MUNICIPALITY_TXT.setBounds(227, 12, 153, 20);
		panel_5.add(CITY_MUNICIPALITY_TXT);
		
		JLabel Pro_LBL = new JLabel("PROVINCE");
		Pro_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		Pro_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Pro_LBL.setBounds(390, 0, 86, 14);
		panel_5.add(Pro_LBL);
		
		PROVINCE_TXT = new JTextField();
		PROVINCE_TXT.setColumns(10);
		PROVINCE_TXT.setBounds(390, 12, 86, 20);
		panel_5.add(PROVINCE_TXT);
		
		JLabel Region_LBL = new JLabel("REGION");
		Region_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		Region_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Region_LBL.setBounds(486, 0, 86, 14);
		panel_5.add(Region_LBL);
		
		REGION_TXT = new JTextField();
		REGION_TXT.setColumns(10);
		REGION_TXT.setBounds(486, 12, 86, 20);
		panel_5.add(REGION_TXT);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(14, 169, 467, 101);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JCheckBox Title3_CB = new JCheckBox("B. DATA CHANGE/CORRECTION/UPDATING");
		Title3_CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					if (Title3_CB.isSelected()) {
						frame.setSize(618,385); //SECOND CUT
						panel_1.setBounds(10, 41, 582, 293); //SECOND CUT
						
					}else {
						frame.setSize(618,254); // main state
						panel_1.setBounds(10, 41, 582, 169);//main state
					}
					
				}catch(Exception BB) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		Title3_CB.setHorizontalAlignment(SwingConstants.CENTER);
		Title3_CB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Title3_CB.setBounds(10, 142, 395, 23);
		Title3_CB.setEnabled(false);
		panel_1.add(Title3_CB);
		
		JButton SUBMIT_BTN = new JButton("SUBMIT/CHECK");
		SUBMIT_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btn==false) {
					boolean F_M_name = false, F_M_name1 = false;
					
					String Lname = null;
					String Fname = null;
					String Mname = null;
					String Exten;
					int HN,HIN;
					
					try {
						LNAME = Lname_TXT.getText().toUpperCase();
						FNAME = Fname_TXT.getText().toUpperCase();
						MNAME = Mname_TXT.getText().toUpperCase();
						EXNAME = EXname_TXT.getText().toUpperCase();
						
						HOUSEHOLD_ID_NUMBER = HOUSEHOLD_ID_NUMBER_TXT.getText().toUpperCase();
						int H = Integer.parseInt(HOUSEHOLD_ID_NUMBER);
						HOUSE_NO = HOUSE_NO_TXT.getText().toUpperCase();
						int H1 = Integer.parseInt(HOUSE_NO);
						STREET_PUROK_SITIO = STREET_PUROK_SITIO_TXT.getText().toUpperCase();
						BARANGAY = BARANGAY_TXT.getText().toUpperCase();
						CITY_MUNICIPALITY = CITY_MUNICIPALITY_TXT.getText().toUpperCase();
						PROVINCE = PROVINCE_TXT.getText().toUpperCase();
						REGION = REGION_TXT.getText().toUpperCase();
						int H2 = Integer.parseInt(REGION);
						
						if(LNAME.equals("")||FNAME.equals("")||MNAME.equals("")||HOUSEHOLD_ID_NUMBER.equals("")||HOUSE_NO.equals("")||STREET_PUROK_SITIO.equals("")||
								BARANGAY.equals("")||CITY_MUNICIPALITY.equals("")||PROVINCE.equals("")||REGION.equals("")) {
							
							JOptionPane.showMessageDialog(null, "PLEASE FILL UP A.HOUSEHOLD GRANTEE");
							
						}else {
							Statement stm = con.createStatement();
							
							String sql2 = "SELECT `Applicant_ID` , `Lastname`, `Firstname`, `Middlename`, `Extensionname` FROM 4ps_db_fds_final.household_and_personal_data_name;";
							ResultSet rs = stm.executeQuery(sql2);
							
							while(rs.next()) {
								Lname = rs.getString("Lastname");
								Fname = rs.getString("Firstname");
								Mname = rs.getString("Middlename");
								Exten = rs.getString("Extensionname");
										if(Lname.equals(LNAME)&&Fname.equals(FNAME)&&Mname.equals(MNAME)) {
											JOptionPane.showMessageDialog(null, "NAME INFORMATION IS ALREADY COLLECTED ");
											F_M_name = true;
											break;
										}
							}
							
							String sql3 = "SELECT `Applicant_ID` , `House_no`, `Household_ID_Number` FROM 4ps_db_fds_final.household_and_personal_data_add_info;";
							ResultSet rs1 = stm.executeQuery(sql3);
							
							while(rs1.next()) {
								HN = rs1.getInt("House_no");
								HIN = rs1.getInt("Household_ID_Number");
								
										if(HN==Integer.parseInt(HOUSE_NO)&&HIN==Integer.parseInt(HOUSEHOLD_ID_NUMBER)) {
											JOptionPane.showMessageDialog(null, "ADDRESS INFORMATION IS ALREADY COLLECTED ");
											F_M_name1 = true;
											break;
										}
							}
							
							if (F_M_name==false&&F_M_name1==false) {
								editcheck = false;
								edit();
								Title3_CB.setEnabled(true);
								btn=true;
								
								System.out.println("Inserting values");
								
								String sql  = "INSERT INTO `4ps_db_fds_final` . `household_and_personal_data_name` (`Lastname`, `Firstname`, `Middlename` , `Extensionname`) VALUES ('"+LNAME+"', '"+FNAME+"', '"+MNAME+"', '"+EXNAME+"')";
								String sql1  = "INSERT INTO `4ps_db_fds_final` . `household_and_personal_data_add_info` (`House_no`, `Household_ID_Number`, `Street/Purok/Sitio` , `Barangay` , `City/Municipality` , `Province` , `Region`) VALUES ('"+HOUSE_NO+"', '"+HOUSEHOLD_ID_NUMBER+"', '"+STREET_PUROK_SITIO+"', '"+BARANGAY+"', '"+CITY_MUNICIPALITY+"', '"+PROVINCE+"', '"+REGION+"')";
								
								stm.executeUpdate(sql);
								stm.executeUpdate(sql1);

								JOptionPane.showMessageDialog(null, "Information Accepted");
							}
							else if(F_M_name==true&&F_M_name1==true) {
								editcheck = false;
								edit();
								Title3_CB.setEnabled(true);
								btn=true;
							}
						}
						

					}catch(Exception A ) {
						JOptionPane.showMessageDialog(null, "ERROR " + A);
					}
				}else {
					Lname_TXT.setText("");
					Fname_TXT.setText("");
					Mname_TXT.setText("");
					EXname_TXT.setText("");
					
					HOUSEHOLD_ID_NUMBER_TXT.setText("");
					HOUSE_NO_TXT.setText("");
					STREET_PUROK_SITIO_TXT.setText("");
					BARANGAY_TXT.setText("");
					CITY_MUNICIPALITY_TXT.setText("");
					PROVINCE_TXT.setText("");
					REGION_TXT.setText("");
					Title3_CB.setEnabled(false);
					SUBMIT_BTN.setText("SUBMIT/CHECK");
					btn=false;
					editcheck = true;
					Title3_CB.setSelected(false);
					frame.setSize(618,254); // main state
					panel_1.setBounds(10, 41, 582, 169);//main state
					edit();
					JOptionPane.showMessageDialog(null, "Reset Done");
				}
				
				if (btn==true) {
					SUBMIT_BTN.setText("Reset");
					editcheck = false;
				}
				
			}
		});
		SUBMIT_BTN.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		SUBMIT_BTN.setBounds(431, 142, 141, 23); //main state
		panel_1.add(SUBMIT_BTN);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		Form2.newborn();
		Form3.address();
		Form4.health ();
		Form5.edu();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		JRadioButton Title6_CB = new JRadioButton("CHANGE OF EDUCATION INFORMATION");
		Title6_CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (Title6_CB.isSelected()) {
						frame.setSize(618,554); // final state
						panel_1.setBounds(10, 41, 582, 463);//final state
						
						Form2.NEWBRON_PANEL.setVisible(false);
						Form3.panel_70.setVisible(false);
						Form4.CHF_PANEL.setVisible(false);
						Form5.CEI_PANEL.setVisible(true);
						
					}
					
				}catch(Exception cc) {
					System.out.println(cc);
				}

			}
		});
		Title6_CB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Title6_CB.setBounds(6, 81, 540, 23);
		panel_6.add(Title6_CB);
		
		JRadioButton Title5_CB = new JRadioButton("CHANGE OF HEALTH FACILITY");
		Title5_CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (Title5_CB.isSelected()) {
						
						frame.setSize(618,554); // final state
						panel_1.setBounds(10, 41, 582, 463);//final state
						
						Form5.CEI_PANEL.setVisible(false);
						Form2.NEWBRON_PANEL.setVisible(false);
						Form3.panel_70.setVisible(false);
						Form4.CHF_PANEL.setVisible(true);
					}
					
				}catch(Exception cc) {
					System.out.println(cc);
				}
				
			}
		});
		Title5_CB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Title5_CB.setBounds(6, 55, 540, 23);
		panel_6.add(Title5_CB);
		
		Title4_CB = new JRadioButton("CHANGE OF ADDRESS");
		Title4_CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setSize(618,554); // final state
				panel_1.setBounds(10, 41, 582, 463);//final state
				
				try {
					if (Title4_CB.isSelected()) {
						
						Form5.CEI_PANEL.setVisible(false);
						Form4.CHF_PANEL.setVisible(false);
						Form2.NEWBRON_PANEL.setVisible(false);
						Form3.panel_70.setVisible(true);
						
						
					}else {
						
					}
					
				}catch(Exception cc) {
					
					System.out.println(cc);
				}
			}
		});
		Title4_CB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Title4_CB.setBounds(6, 29, 429, 23);
		panel_6.add(Title4_CB);
		
		JRadioButton Title7_CB = new JRadioButton("NEWBORN AND/OR ADDITIONAL HOUSEHOLD MEMBERS");
		Title7_CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setSize(618,554); // final state
				panel_1.setBounds(10, 41, 582, 463);//final state

				if (Title7_CB.isSelected()) {
					try {
						
						Form5.CEI_PANEL.setVisible(false);
						Form2.selected = true;
						Form4.CHF_PANEL.setVisible(false);
						Form3.panel_70.setVisible(false);
						Form2.NEWBRON_PANEL.setVisible(true);

					} catch (Exception e1) {

						System.out.println(e1);
					}
				}
				
			}
		});
		Title7_CB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Title7_CB.setBounds(6, 4, 540, 23);
		panel_6.add(Title7_CB);
		
		ButtonGroup group = new ButtonGroup();
		group.add(Title6_CB);
		group.add(Title5_CB);
		group.add(Title4_CB);
		group.add(Title7_CB);
		
	}
	
	public static void edit() {
		Lname_TXT.setEditable(editcheck);
		Fname_TXT.setEditable(editcheck);
		Mname_TXT.setEditable(editcheck);
		EXname_TXT.setEditable(editcheck);
		
		HOUSEHOLD_ID_NUMBER_TXT.setEditable(editcheck);
		HOUSE_NO_TXT.setEditable(editcheck);
		STREET_PUROK_SITIO_TXT.setEditable(editcheck);
		BARANGAY_TXT.setEditable(editcheck);
		CITY_MUNICIPALITY_TXT.setEditable(editcheck);
		PROVINCE_TXT.setEditable(editcheck);
		REGION_TXT.setEditable(editcheck);
	}
	
}

