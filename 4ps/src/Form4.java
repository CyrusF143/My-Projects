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

public class Form4 {
	
	private static String NOF1, NOF2, ADD_TXT1, ADD_TXT2, TOF1, TOF2;
	
	private static JTextField CITY_MUNICIPALITY12_TXT, SPS11_TXT, SPS12_TXT, TOF_LBL_FROM, TOF_LBL_TO, ADD_1_LBL_FROM, ADD_1_LBL_TO, NOF1_LBL_FROM;
	private static JTextField NOF1_LBL_TO, Lname_LBL_1_TXT, Fname_LBL_1_1_TXT, Mname_LBL_1_TXT, ExtenName_LBL_1_TXT, NOS1_1_TXT_FORM;

	private static int NB_YES_NO=3, NB_YES_NO1=3, School_att=3, edu_attend=3;
	
	public static JPanel CHF_PANEL;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void health () throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(MainForm.url,MainForm.username,MainForm.pass);
		
		CHF_PANEL = new JPanel();
		CHF_PANEL.setBorder(new LineBorder(new Color(0, 0, 0)));
		CHF_PANEL.setBounds(0, 270, 582, 188);
		CHF_PANEL.setVisible(false);
		MainForm.panel_1.add(CHF_PANEL);
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
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					check.doublecheck();
					
					NOF1= NOF1_LBL_FROM.getText().toUpperCase();
					NOF2 = NOF1_LBL_TO.getText().toUpperCase();

					ADD_TXT1 = ADD_1_LBL_FROM.getText().toUpperCase();
					ADD_TXT2 = ADD_1_LBL_TO.getText().toUpperCase();

					TOF1 = TOF_LBL_FROM.getText().toUpperCase();
					TOF2 = TOF_LBL_TO.getText().toUpperCase();
					
					if (NOF1.equals("")||ADD_TXT1.equals("")||TOF1.equals("")||School_att==3) {
						JOptionPane.showMessageDialog(null, "PLEASE FILL UP ALL ITEMS");
					}else {
						Statement stm = con.createStatement();
						
						try {
							
							String sql10 = "SELECT `HF_ID` FROM 4ps_db_fds_final.change_of_heath_facility_from Where Health_ID = '"+check.found_applicant_num+"';";
							ResultSet rs3 = stm.executeQuery(sql10);
							rs3.next();
							int id = rs3.getInt("HF_ID");
							
							int input = JOptionPane.showConfirmDialog(null, 
					                "OLD INFO FOUND AT: "+ id +" Do you want to proceed?", "Select an Option...",JOptionPane.YES_NO_OPTION);
							//System.out.println(input);
							if(input==0) {
								
								String query = "SELECT `Attending`, `Name_of_Facility`, `Address`, `Type_of_Facility` FROM 4ps_db_fds_final.change_of_heath_facility_to WHERE HF_ID = "+id+"";
								Statement st = con.createStatement();
								ResultSet rs = st.executeQuery(query);
								
								rs.next();
								int atten = rs.getInt("Attending");
								String NOF = rs.getString("Name_of_Facility").toUpperCase();
								String ADD = rs.getString("Address").toUpperCase();
								String TOF = rs.getString("Type_of_Facility").toUpperCase();
								
								if(atten==School_att&&NOF.equals(NOF1)&&ADD.equals(ADD_TXT1)&&TOF.equals(TOF1)) {
									String qry = "UPDATE `4ps_db_fds_final`.`change_of_heath_facility_from` SET `Attending` = '"+School_att+"', `Name_of_Facility` = '"+NOF1+"', `Address` = '"+ADD_TXT1+"', `Type_of_Facility` = '"+TOF1+"' WHERE (`HF_ID` = '"+id+"');";
									PreparedStatement pst=con.prepareStatement(qry);
									pst.execute();
									
									String qry2 = "UPDATE `4ps_db_fds_final`.`change_of_heath_facility_to` SET `Attending` = '"+School_att+"', `Name_of_Facility` = '"+NOF2+"', `Address` = '"+ADD_TXT2+"', `Type_of_Facility` = '"+TOF2+"' WHERE (`HF_ID` = '"+id+"');";
									PreparedStatement pst1=con.prepareStatement(qry2);
									pst1.execute();
									JOptionPane.showMessageDialog(null, "Information Updated");
								}else {
									JOptionPane.showMessageDialog(null, "Information don't match");
								}
								
							}else {
								NOF1_LBL_FROM.setText("");
								NOF1_LBL_TO.setText("");

								ADD_1_LBL_FROM.setText("");
								ADD_1_LBL_TO.setText("");

								TOF_LBL_FROM.setText("");
								TOF_LBL_TO.setText("");
								
								group3.clearSelection();
							}
							
						}catch(Exception a1) {
							
							String sql9  = "INSERT INTO `4ps_db_fds_final` . `change_of_heath_facility_from` (`Health_ID`,`Attending`, `Name_of_Facility`, `Address` , `Type_of_Facility`) VALUES ('"+check.found_applicant_num+"','"+School_att+"', '"+NOF1+"', '"+ADD_TXT1+"', '"+TOF1+"')";
							stm.executeUpdate(sql9);
							
							String sql10 = "SELECT `HF_ID` FROM 4ps_db_fds_final.change_of_heath_facility_from Where Health_ID = '"+check.found_applicant_num+"';";
							ResultSet rs3 = stm.executeQuery(sql10);
							rs3.next();
							int id = rs3.getInt("HF_ID");
							
							String sql11  = "INSERT INTO `4ps_db_fds_final` . `change_of_heath_facility_to` (`HF_ID`,`Attending`, `Name_of_Facility`, `Address` , `Type_of_Facility`) VALUES ('"+id+"','"+School_att+"', '"+NOF2+"', '"+ADD_TXT2+"', '"+TOF2+"')";
							stm.executeUpdate(sql11);
							
							JOptionPane.showMessageDialog(null, "Information Accepted");
							//JOptionPane.showMessageDialog(null, a1);
						}
						
					}
					
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "ERROR " + e1);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(244, 154, 89, 23);
		CHF_PANEL.add(btnNewButton);
	}
	
}

