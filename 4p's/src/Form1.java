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
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
///////////////////Main Copy of Rush Code////////////////////////////////////////
public class Form1 {}
	/*
	static String url = "jdbc:mysql://localhost:3306/4ps_db";
	static String username = "root";
	static String pass = "zed143";
	
	private static JFrame frame;
	
	private static int found_applicant_num = 0;
	private static int found_applicant_num1 = 0;
	
	private static String LNAME,FNAME,MNAME,EXNAME;
	private static String HOUSEHOLD_ID_NUMBER, HOUSE_NO, STREET_PUROK_SITIO, BARANGAY, CITY_MUNICIPALITY, PROVINCE, REGION;
	private static String LAST_NAME, FIRST_NAME, MIDDLE_NAME, EXTENSION_NAME, DATE, NAME_OF_SCHOOL1, SIX;
	private static String NB_YES_NO_checker, NB_YES_NO_checker1;
	private static String REGION11, REGION12, PROVINCE11, PROVINCE12, BARANGAY11, BARANGAY12, HOUSE_NO11, HOUSE_NO12, CITY_MUNICIPALITY11, CITY_MUNICIPALITY12, SPS11, SPS12;
	private static String NOF1, NOF2, ADD_TXT1, ADD_TXT2, TOF1, TOF2;
	private static String Lname_LBL_11, Fname_LBL_1_11, Mname_LBL_11, ExtenName_LBL_11;
	private static String NOS1_1, NOS1_2, ADDRESS_OF_SCHOOL1, ADDRESS_OF_SCHOOL2, GRADE_LEVEL1, GRADE_LEVEL2;
	
	
	private static JTextField Lname_TXT, Fname_TXT, Mname_TXT, EXname_TXT, HOUSEHOLD_ID_NUMBER_TXT, HOUSE_NO_TXT, STREET_PUROK_SITIO_TXT, BARANGAY_TXT, CITY_MUNICIPALITY_TXT, PROVINCE_TXT, REGION_TXT;
	private static JTextField LAST_NAME_TXT, FIRST_NAME_TXT, MIDDLE_NAME_TXT, EXTENSION_NAME_TXT, DATE_TXT, SEX_TXT, NAME_OF_SCHOOL_TXT, REGION11_TXT, REGION12_TXT, PROVINCE11_TXT, PROVINCE12_TXT, BARANGAY11_TXT, BARANGAY12_TXT, CITY_MUNICIPALITY11_TXT;
	private static JTextField CITY_MUNICIPALITY12_TXT, SPS11_TXT, SPS12_TXT, TOF_LBL_FROM, TOF_LBL_TO, ADD_1_LBL_FROM, ADD_1_LBL_TO, NOF1_LBL_FROM;
	private static JTextField NOF1_LBL_TO, Lname_LBL_1_TXT, Fname_LBL_1_1_TXT, Mname_LBL_1_TXT, ExtenName_LBL_1_TXT, NOS1_1_TXT_FORM;
	private static JTextField NOS1_1_TXT_TO, ADDRESS_OF_SCHOOL1_TXT, ADDRESS_OF_SCHOOL2_TXT, GRADE_LEVEL1_TXT, GRADE_LEVEL2_TXT, HOUSE_NO11_TXT, HOUSE_NO12_TXT;

	private static boolean  up_sub;
	private static int NB_YES_NO=3, NB_YES_NO1=3, School_att=3, edu_attend=3;
	private static boolean Title7_CB_RB, change_add, health, Edu_in = false;
	
	public static void main(String[] args) throws Exception {
		System.out.println(NB_YES_NO + "boolean");
		System.out.println(NB_YES_NO1 + "boolean");
		frame();

	}
	
	public static void frame() throws Exception  {
	frame = new JFrame();
	frame.getContentPane().setBackground(SystemColor.info);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(618,254); // main state
	//frame.setSize(618,554); // final state
	frame.getContentPane().setLayout(null);
	
	primaryCodes();
	
	frame.setVisible(true);

}
	
	
	public static void primaryCodes() throws Exception  {
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(10, 41, 582, 169);//main state
		//panel_1.setBounds(10, 41, 582, 463);//final state
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
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
		
		JLabel Title2_LBL = new JLabel("A. TO BE FELLED OUT BY HOUSEHOLD GRANTEE");
		Title2_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		Title2_LBL.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Title2_LBL.setBounds(0, 7, 582, 14);
		panel_1.add(Title2_LBL);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(14, 169, 467, 101);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		JPanel CEI_PANEL = new JPanel();
		CEI_PANEL.setBorder(new LineBorder(new Color(0, 0, 0)));
		CEI_PANEL.setBounds(0, 270, 582, 162);
		CEI_PANEL.setVisible(false);
		panel_1.add(CEI_PANEL);
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
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		JPanel CHF_PANEL = new JPanel();
		CHF_PANEL.setBorder(new LineBorder(new Color(0, 0, 0)));
		CHF_PANEL.setBounds(0, 270, 582, 147);
		CHF_PANEL.setVisible(false);
		panel_1.add(CHF_PANEL);
		CHF_PANEL.setLayout(null);
		
		JLabel FROM1_LBL = new JLabel("FROM");
		FROM1_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		FROM1_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		FROM1_LBL.setBounds(200, 0, 68, 14);
		CHF_PANEL.add(FROM1_LBL);
		
		JLabel TO1_LBL_1 = new JLabel("TO");
		TO1_LBL_1.setHorizontalAlignment(SwingConstants.CENTER);
		TO1_LBL_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		TO1_LBL_1.setBounds(432, 0, 68, 14);
		CHF_PANEL.add(TO1_LBL_1);
		
		JPanel panel_76 = new JPanel();
		panel_76.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_76.setBounds(0, 11, 582, 33);
		CHF_PANEL.add(panel_76);
		panel_76.setLayout(null);
		
		JLabel att_LBL = new JLabel("ATTENDING:");
		att_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		att_LBL.setBounds(0, 11, 86, 14);
		panel_76.add(att_LBL);
		
		JRadioButton YES1_RB = new JRadioButton("YES");
		YES1_RB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (YES1_RB.isSelected()) {
					School_att = 1;
				}
				
			}
		});
		YES1_RB.setBounds(92, 7, 51, 23);
		panel_76.add(YES1_RB);
		
		JRadioButton NO1_RB_1 = new JRadioButton("NO");
		NO1_RB_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(NO1_RB_1.isSelected()) {
					School_att = 0;
				}
				
			}
		});
		NO1_RB_1.setBounds(145, 7, 51, 23);
		panel_76.add(NO1_RB_1);
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(YES1_RB);
		group3.add(NO1_RB_1);
		
		JPanel panel_7_11 = new JPanel();
		panel_7_11.setLayout(null);
		panel_7_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7_11.setBounds(0, 43, 582, 33);
		CHF_PANEL.add(panel_7_11);
		
		JLabel NOF1_LBL = new JLabel("NAME OF FACILITY:");
		NOF1_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		NOF1_LBL.setBounds(0, 11, 125, 14);
		panel_7_11.add(NOF1_LBL);
		
		NOF1_LBL_FROM = new JTextField();
		NOF1_LBL_FROM.setColumns(10);
		NOF1_LBL_FROM.setBounds(138, 5, 206, 20);
		panel_7_11.add(NOF1_LBL_FROM);
		
		NOF1_LBL_TO = new JTextField();
		NOF1_LBL_TO.setColumns(10);
		NOF1_LBL_TO.setBounds(366, 5, 206, 20);
		panel_7_11.add(NOF1_LBL_TO);
		
		JPanel panel_711 = new JPanel();
		panel_711.setLayout(null);
		panel_711.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_711.setBounds(0, 75, 582, 33);
		CHF_PANEL.add(panel_711);
		
		JLabel ADD_1_LBL = new JLabel("ADDRESS:");
		ADD_1_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ADD_1_LBL.setBounds(0, 11, 86, 14);
		panel_711.add(ADD_1_LBL);
		
		ADD_1_LBL_FROM = new JTextField();
		ADD_1_LBL_FROM.setColumns(10);
		ADD_1_LBL_FROM.setBounds(138, 5, 206, 20);
		panel_711.add(ADD_1_LBL_FROM);
		
		ADD_1_LBL_TO = new JTextField();
		ADD_1_LBL_TO.setColumns(10);
		ADD_1_LBL_TO.setBounds(366, 5, 206, 20);
		panel_711.add(ADD_1_LBL_TO);
		
		JPanel panel_7_1_2 = new JPanel();
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7_1_2.setBounds(0, 107, 582, 33);
		CHF_PANEL.add(panel_7_1_2);
		
		JLabel TOF_LBL = new JLabel("TYPE OF FACILITY:");
		TOF_LBL.setFont(new Font("Times New Roman", Font.BOLD, 12));
		TOF_LBL.setBounds(0, 11, 128, 14);
		panel_7_1_2.add(TOF_LBL);
		
		TOF_LBL_FROM = new JTextField();
		TOF_LBL_FROM.setBounds(138, 8, 206, 20);
		panel_7_1_2.add(TOF_LBL_FROM);
		TOF_LBL_FROM.setColumns(10);
		
		TOF_LBL_TO = new JTextField();
		TOF_LBL_TO.setColumns(10);
		TOF_LBL_TO.setBounds(366, 8, 206, 20);
		panel_7_1_2.add(TOF_LBL_TO);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JPanel panel_70 = new JPanel();
		panel_70.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_70.setBounds(0, 270, 582, 147);
		panel_70.setVisible(false);
		//panel_7.setBounds(0, 269, 582, 124);
		panel_1.add(panel_70);
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
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JPanel NEWBRON_PANEL = new JPanel();
		NEWBRON_PANEL.setBorder(new LineBorder(new Color(0, 0, 0)));
		NEWBRON_PANEL.setBounds(0, 270, 582, 147);
		NEWBRON_PANEL.setVisible(false);
		panel_1.add(NEWBRON_PANEL);
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
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton SUBMIT_BTN = new JButton("SUBMIT");
		SUBMIT_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
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
					
					LAST_NAME = LAST_NAME_TXT.getText().toUpperCase();
					FIRST_NAME = FIRST_NAME_TXT.getText().toUpperCase();
					MIDDLE_NAME = MIDDLE_NAME_TXT.getText().toUpperCase();
					EXTENSION_NAME = EXTENSION_NAME_TXT.getText().toUpperCase();
					DATE = DATE_TXT.getText().toUpperCase();
					SIX = SEX_TXT.getText().toUpperCase();
					NAME_OF_SCHOOL1 = NAME_OF_SCHOOL_TXT.getText().toUpperCase();
					
					REGION11 = REGION11_TXT.getText().toUpperCase();
					REGION12 = REGION12_TXT.getText().toUpperCase();
					int REGION111 = Integer.parseInt(REGION);
					int REGION1112 = Integer.parseInt(REGION);

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
					
					NOF1= NOF1_LBL_FROM.getText().toUpperCase();
					NOF2 = NOF1_LBL_TO.getText().toUpperCase();

					ADD_TXT1 = ADD_1_LBL_FROM.getText().toUpperCase();
					ADD_TXT2 = ADD_1_LBL_TO.getText().toUpperCase();

					TOF1 = TOF_LBL_FROM.getText().toUpperCase();
					TOF2 = TOF_LBL_TO.getText().toUpperCase();
					
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
					
					
					
					System.out.println(up_sub +"AAA");
					
					if (up_sub==true) {
						
						if(Title7_CB_RB==true) {
							if (LAST_NAME.equals("")||FIRST_NAME.equals("")||MIDDLE_NAME.equals("")||DATE.equals("")||NAME_OF_SCHOOL1.equals("")||SIX.equals("")||NB_YES_NO==3||NB_YES_NO1==3) {
								JOptionPane.showMessageDialog(null, "PLEASE FILL UP ALL ITEMS");
							}else {
								int applicant_Num = 0;
								int HN,HIN;
								String Lname = null;
								String Fname = null;
								String Mname = null;
								
								Statement stm = con.createStatement();
								
								String sql2 = "SELECT `Applicant_ID` , `Lastname`, `Firstname`, `Middlename` FROM 4ps_db_fds_final.household_and_personal_data_name;";
								ResultSet rs = stm.executeQuery(sql2);
								
								while(rs.next()) {
									applicant_Num = rs.getInt("Applicant_ID");
									Lname = rs.getString("Lastname");
									Fname = rs.getString("Firstname");
									Mname = rs.getString("Middlename");
											if(Lname.equals(Lname_TXT.getText().toUpperCase())&&Fname.equals(Fname_TXT.getText().toUpperCase())&&Mname.equals(Mname_TXT.getText().toUpperCase())) {
												found_applicant_num = rs.getInt("Applicant_ID");
											}
								}
								
								String sql3 = "SELECT `Applicant_ID` , `House_no`, `Household_ID_Number` FROM 4ps_db_fds_final.household_and_personal_data_add_info;";
								ResultSet rs1 = stm.executeQuery(sql3);
								
								while(rs1.next()) {
									applicant_Num = rs1.getInt("Applicant_ID");
									HN = rs1.getInt("House_no");
									HIN = rs1.getInt("Household_ID_Number");
									System.out.println(HN+"_"+HIN);
											if(HN==Integer.parseInt(HOUSE_NO_TXT.getText())&&HIN==Integer.parseInt(HOUSEHOLD_ID_NUMBER_TXT.getText())) {
												found_applicant_num1 = rs1.getInt("Applicant_ID");
											}
								}
								
								System.out.println(found_applicant_num + "_" + found_applicant_num1);
								
								
								if(found_applicant_num==found_applicant_num1) {
									
									String sql4  = "INSERT INTO `4ps_db_fds_final` . `new_born_and_additional_household_member_name` (`AHM_ID`,`Lastname`, `Firstname`, `Middlename` , `Extensionname`) VALUES ('"+found_applicant_num+"','"+LAST_NAME+"', '"+FIRST_NAME+"', '"+MIDDLE_NAME+"', '"+EXTENSION_NAME+"')";
									stm.executeUpdate(sql4);
									
									
									String sql6 = "SELECT `NB_AHM_ID` FROM 4ps_db_fds_final.new_born_and_additional_household_member_name;";
									ResultSet rs2 = stm.executeQuery(sql6);
									rs2.next();
									int id = rs2.getInt("NB_AHM_ID");
									
									String sql5  = "INSERT INTO `4ps_db_fds_final` . `new_born_and_additional_household_member_add_info` (`NB_AHM_ID`,`Date_of_Birth`, `Sex`, `Disabled` , `Attending_School` , `Name_of_School`) VALUES ('"+id+"','"+DATE+"', '"+SIX+"', '"+NB_YES_NO+"', '"+NB_YES_NO1+"' , '"+NAME_OF_SCHOOL1+"')";
									stm.executeUpdate(sql5);
									
									System.out.println(found_applicant_num + "_" + found_applicant_num1);
									found_applicant_num =0;
									found_applicant_num1=0;
									
									JOptionPane.showMessageDialog(null, "Information Accepted");
									System.out.println(found_applicant_num + "_" + found_applicant_num1);
									System.out.println("Update");
								}
								else {
									JOptionPane.showMessageDialog(null, "Information Mismatch");
								}
							}
							
							
						}

						if (change_add==true) {
							if (REGION11.equals("")||REGION12.equals("")||PROVINCE11.equals("")||PROVINCE12.equals("")||BARANGAY11.equals("")||BARANGAY12.equals("")||HOUSE_NO11.equals("")||HOUSE_NO12.equals("")||CITY_MUNICIPALITY11.equals("")||CITY_MUNICIPALITY12.equals("")||SPS11.equals("")||SPS12.equals("")) {
								JOptionPane.showMessageDialog(null, "PLEASE FILL UP ALL ITEMS");
							}else {
								Statement stm = con.createStatement();
								
								if(found_applicant_num==found_applicant_num1) {
									
									String sql6  = "INSERT INTO `4ps_db_fds_final` . `change_of_address_from` (`C_ADD`,`Region`, `Province`, `Barangay` , `City/Municipality` , `Street/Purok/Sitio` , `House No`) VALUES ('"+HOUSE_NO+"','"+REGION11+"', '"+PROVINCE11+"', '"+BARANGAY11+"', '"+CITY_MUNICIPALITY11+"', '"+SPS11+"', '"+HOUSE_NO11+"')";
									stm.executeUpdate(sql6);
									
									String sql9 = "SELECT `COA` FROM 4ps_db_fds_final.change_of_address_from Where C_ADD = '"+HOUSE_NO+"';";
									ResultSet rs3 = stm.executeQuery(sql9);
									rs3.next();
									int id = rs3.getInt("COA");
									System.out.println("this is coa" + id);
									
									String sql8  = "INSERT INTO `4ps_db_fds_final` . `change_of_address_to` (`COA`,`Region`, `Province`, `Barangay` , `City/Municipality` , `Street/Purok/Sitio` , `House No`) VALUES ('"+id+"','"+REGION12+"', '"+PROVINCE12+"', '"+BARANGAY12+"', '"+CITY_MUNICIPALITY12+"', '"+SPS12+"', '"+HOUSE_NO12+"')";
									stm.executeUpdate(sql8);
									
									JOptionPane.showMessageDialog(null, "Information Accepted");
									
								}else {
									JOptionPane.showMessageDialog(null, "Information Mismatch");
								}	
							}
						}
						
						
						if (health==true) {
							if (NOF1.equals("")||ADD_TXT1.equals("")||TOF1.equals("")||School_att==3) {
								JOptionPane.showMessageDialog(null, "PLEASE FILL UP ALL ITEMS");
							}else {
								Statement stm = con.createStatement();
								int applicant_Num = 0;
								int HN,HIN;
								String Lname = null;
								String Fname = null;
								String Mname = null;
								
								String sql2 = "SELECT `Applicant_ID` , `Lastname`, `Firstname`, `Middlename` FROM 4ps_db_fds_final.household_and_personal_data_name;";
								ResultSet rs = stm.executeQuery(sql2);
								
								while(rs.next()) {
									applicant_Num = rs.getInt("Applicant_ID");
									Lname = rs.getString("Lastname");
									Fname = rs.getString("Firstname");
									Mname = rs.getString("Middlename");
											if(Lname.equals(Lname_TXT.getText().toUpperCase())&&Fname.equals(Fname_TXT.getText().toUpperCase())&&Mname.equals(Mname_TXT.getText().toUpperCase())) {
												found_applicant_num = rs.getInt("Applicant_ID");
											}
								}
								
								String sql3 = "SELECT `Applicant_ID` , `House_no`, `Household_ID_Number` FROM 4ps_db_fds_final.household_and_personal_data_add_info;";
								ResultSet rs1 = stm.executeQuery(sql3);
								
								while(rs1.next()) {
									applicant_Num = rs1.getInt("Applicant_ID");
									HN = rs1.getInt("House_no");
									HIN = rs1.getInt("Household_ID_Number");
									System.out.println(HN+"_"+HIN);
											if(HN==Integer.parseInt(HOUSE_NO_TXT.getText())&&HIN==Integer.parseInt(HOUSEHOLD_ID_NUMBER_TXT.getText())) {
												found_applicant_num1 = rs1.getInt("Applicant_ID");
											}
								}
								
								String sql9  = "INSERT INTO `4ps_db_fds_final` . `change_of_heath_facility_from` (`Health_ID`,`Attending`, `Name_of_Facility`, `Address` , `Type_of_Facility`) VALUES ('"+found_applicant_num+"','"+School_att+"', '"+NOF1+"', '"+ADD_TXT1+"', '"+TOF1+"')";
								stm.executeUpdate(sql9);
								
								String sql10 = "SELECT `HF_ID` FROM 4ps_db_fds_final.change_of_heath_facility_from Where Health_ID = '"+found_applicant_num+"';";
								ResultSet rs3 = stm.executeQuery(sql10);
								rs3.next();
								int id = rs3.getInt("HF_ID");
								
								String sql11  = "INSERT INTO `4ps_db_fds_final` . `change_of_heath_facility_to` (`HF_ID`,`Attending`, `Name_of_Facility`, `Address` , `Type_of_Facility`) VALUES ('"+id+"','"+School_att+"', '"+NOF1+"', '"+ADD_TXT1+"', '"+TOF1+"')";
								stm.executeUpdate(sql11);
								
							}
							
						}
						
						
						if (Edu_in == true) {
							if (Lname_LBL_11.equals("")||Fname_LBL_1_11.equals("")||Mname_LBL_11.equals("")||NOS1_1.equals("")||ADDRESS_OF_SCHOOL1.equals("")||GRADE_LEVEL1.equals("")||edu_attend==3) {
								JOptionPane.showMessageDialog(null, "PLEASE FILL UP ALL ITEMS");
							}else {
								
								Statement stm = con.createStatement();
								int applicant_Num = 0;
								int HN,HIN;
								String Lname = null;
								String Fname = null;
								String Mname = null;
								
								
								String sql2 = "SELECT `Applicant_ID` , `Lastname`, `Firstname`, `Middlename` FROM 4ps_db_fds_final.household_and_personal_data_name;";
								ResultSet rs = stm.executeQuery(sql2);
								
								while(rs.next()) {
									applicant_Num = rs.getInt("Applicant_ID");
									Lname = rs.getString("Lastname");
									Fname = rs.getString("Firstname");
									Mname = rs.getString("Middlename");
											if(Lname.equals(Lname_TXT.getText().toUpperCase())&&Fname.equals(Fname_TXT.getText().toUpperCase())&&Mname.equals(Mname_TXT.getText().toUpperCase())) {
												found_applicant_num = rs.getInt("Applicant_ID");
											}
								}
								
								String sql3 = "SELECT `Applicant_ID` , `House_no`, `Household_ID_Number` FROM 4ps_db_fds_final.household_and_personal_data_add_info;";
								ResultSet rs1 = stm.executeQuery(sql3);
								
								while(rs1.next()) {
									applicant_Num = rs1.getInt("Applicant_ID");
									HN = rs1.getInt("House_no");
									HIN = rs1.getInt("Household_ID_Number");
									System.out.println(HN+"_"+HIN);
											if(HN==Integer.parseInt(HOUSE_NO_TXT.getText())&&HIN==Integer.parseInt(HOUSEHOLD_ID_NUMBER_TXT.getText())) {
												found_applicant_num1 = rs1.getInt("Applicant_ID");
											}
								}
								
								System.out.println("this is the num_ " +  found_applicant_num + found_applicant_num1);
								
								String sql12  = "INSERT INTO `4ps_db_fds_final` . `change_of_education_info_name` (`Education_info_ID` , `Lastname`,`Firstname`, `Middlename`, `Extenionname`) VALUES ('"+found_applicant_num1+"','"+Lname_LBL_11+"', '"+Fname_LBL_1_11+"', '"+Mname_LBL_11+"', '"+ExtenName_LBL_11+"')";
								stm.executeUpdate(sql12);
								
								String sql10 = "SELECT `Edu_ID` FROM 4ps_db_fds_final.change_of_education_info_name Where Education_info_ID = '"+found_applicant_num1+"';";
								ResultSet rs3 = stm.executeQuery(sql10);
								rs3.next();
								int id = rs3.getInt("Edu_ID");

								String sql13 = "SELECT `Edu_ID` FROM 4ps_db_fds_final.change_of_education_info_name Where Education_info_ID = '"+found_applicant_num+"';";
								ResultSet rs13 = stm.executeQuery(sql10);
								rs13.next();
								int id13 = rs13.getInt("Edu_ID");
								
								String sql14  = "INSERT INTO `4ps_db_fds_final` . `change_of_education_add_info_from` (`Edu_ID` , `Attending_School`,`Name_of_School`, `Address_of_School`, `Grade_Level`) VALUES ('"+id13+"','"+edu_attend+"', '"+NOS1_1+"', '"+ADDRESS_OF_SCHOOL1+"', '"+GRADE_LEVEL1+"')";
								stm.executeUpdate(sql14);
								
								String sql15 = "SELECT `C_EDU_ID` FROM 4ps_db_fds_final.change_of_education_add_info_from Where Edu_ID = '"+id13+"';";
								ResultSet rs15 = stm.executeQuery(sql15);
								rs15.next();
								int id15 = rs15.getInt("C_EDU_ID");
								
								String sql16  = "INSERT INTO `4ps_db_fds_final` . `change_of_education_add_info_to` (`C_EDU_ID` , `Attending_School`,`Name_of_School`, `Address_of_School`, `Grade_Level`) VALUES ('"+id15+"','"+edu_attend+"', '"+NOS1_2+"', '"+ADDRESS_OF_SCHOOL2+"', '"+GRADE_LEVEL2+"')";
								stm.executeUpdate(sql16);
								
								JOptionPane.showMessageDialog(null, "Information Accepted");
							
							}
						}
						

					}else {
						if(LNAME.equals("")||FNAME.equals("")||MNAME.equals("")||HOUSEHOLD_ID_NUMBER.equals("")||HOUSE_NO.equals("")||STREET_PUROK_SITIO.equals("")||
								BARANGAY.equals("")||CITY_MUNICIPALITY.equals("")||PROVINCE.equals("")||REGION.equals("")) {
							
							JOptionPane.showMessageDialog(null, "PLEASE FILL UP A.HOUSEHOLD GRANTEE");
							
						}else {
							Statement stm = con.createStatement();
							
							String sql  = "INSERT INTO `4ps_db_fds_final` . `household_and_personal_data_name` (`Lastname`, `Firstname`, `Middlename` , `Extensionname`) VALUES ('"+LNAME+"', '"+FNAME+"', '"+MNAME+"', '"+EXNAME+"')";
							String sql1  = "INSERT INTO `4ps_db_fds_final` . `household_and_personal_data_add_info` (`House_no`, `Household_ID_Number`, `Street/Purok/Sitio` , `Barangay` , `City/Municipality` , `Province` , `Region`) VALUES ('"+HOUSE_NO+"', '"+HOUSEHOLD_ID_NUMBER+"', '"+STREET_PUROK_SITIO+"', '"+BARANGAY+"', '"+CITY_MUNICIPALITY+"', '"+PROVINCE+"', '"+REGION+"')";
							
							stm.executeUpdate(sql);
							stm.executeUpdate(sql1);

							JOptionPane.showMessageDialog(null, "Information Accepted");
							System.out.println("Submit");
							
						}
					}
					

				}catch(Exception gg) {
					System.out.println(gg);
				}

			}
		});
		SUBMIT_BTN.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		SUBMIT_BTN.setBounds(483, 142, 89, 23); //main state
		panel_1.add(SUBMIT_BTN);
		
		JCheckBox Title3_CB = new JCheckBox("B. DATA CHANGE/CORRECTION/UPDATING");
		Title3_CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (Title3_CB.isSelected()) {
						
						up_sub = true;
						
						SUBMIT_BTN.setBounds(234, 436, 89, 23); //final state
						SUBMIT_BTN.setText("UPDATE");
						frame.setSize(618,385); //SECOND CUT
						panel_1.setBounds(10, 41, 582, 293); //SECOND CUT
						
					}else {
						
						up_sub = false;
						
						SUBMIT_BTN.setText("SUBMIT");
						SUBMIT_BTN.setBounds(483, 142, 89, 23); //main state
						frame.setSize(618,254); // main state
						panel_1.setBounds(10, 41, 582, 169);//main state
						NEWBRON_PANEL.setVisible(false);
						CEI_PANEL.setVisible(false);
						CHF_PANEL.setVisible(false);
						panel_70.setVisible(false);
						
					}
					
				}catch(Exception BB) {
					System.out.println();
				}
				
				

			}
		});
		Title3_CB.setHorizontalAlignment(SwingConstants.CENTER);
		Title3_CB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Title3_CB.setBounds(78, 142, 399, 23);
		panel_1.add(Title3_CB);
		
		
		
		
		JRadioButton Title6_CB = new JRadioButton("CHANGE OF EDUCATION INFORMATION");
		Title6_CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (Title6_CB.isSelected()) {
						frame.setSize(618,554); // final state
						panel_1.setBounds(10, 41, 582, 463);//final state
						
						health =  false;
						change_add = false;
						Title7_CB_RB = false;
						Edu_in = true;
						
						CEI_PANEL.setVisible(true);
						CHF_PANEL.setVisible(false);
						panel_70.setVisible(false);
						NEWBRON_PANEL.setVisible(false);
						
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
						health =  true;
						change_add = false;
						Title7_CB_RB = false;
						Edu_in = false;
						frame.setSize(618,554); // final state
						panel_1.setBounds(10, 41, 582, 463);//final state
						CHF_PANEL.setVisible(true);
						CEI_PANEL.setVisible(false);
						panel_70.setVisible(false);
						NEWBRON_PANEL.setVisible(false);
					}
					
				}catch(Exception cc) {
					System.out.println(cc);
				}
				
			}
		});
		Title5_CB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		Title5_CB.setBounds(6, 55, 540, 23);
		panel_6.add(Title5_CB);
		
		JRadioButton Title4_CB = new JRadioButton("CHANGE OF ADDRESS");
		Title4_CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (Title4_CB.isSelected()) {
						change_add = true;
						Title7_CB_RB = false;
						Edu_in = false;
						health =  false;
						frame.setSize(618,554); // final state
						panel_1.setBounds(10, 41, 582, 463);//final state
						panel_70.setVisible(true);
						CEI_PANEL.setVisible(false);
						CHF_PANEL.setVisible(false);
						NEWBRON_PANEL.setVisible(false);
					}else {
						change_add = false;
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
				
				try {
					if (Title7_CB.isSelected()) {
						
						Title7_CB_RB = true;
						change_add = false;
						health =  false;
						Edu_in = false;
						
						frame.setSize(618,554); // final state
						panel_1.setBounds(10, 41, 582, 463);//final state
						
						
						NEWBRON_PANEL.setVisible(true);
						CEI_PANEL.setVisible(false);
						CHF_PANEL.setVisible(false);
						panel_70.setVisible(false);
					}else {
						Title7_CB_RB = false;
					}
					
				}catch(Exception cc) {
					System.out.println(cc);
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
}



*/