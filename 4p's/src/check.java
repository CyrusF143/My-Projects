import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class check {

	static boolean runn;
	static int found_applicant_num = 0, found_applicant_num1 = 0;
	static int HN = 0,HIN;
	public static void doublecheck() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(MainForm.url,MainForm.username,MainForm.pass);
		
		boolean F_M_name = false, F_M_name1 = false;
		
		String Lname = null;
		String Fname = null;
		String Mname = null;
		String Exten;
		
		int ApplicantID, ApplicantID1;
		
		
		Statement stm = con.createStatement();
		
		String sql2 = "SELECT `Applicant_ID` , `Lastname`, `Firstname`, `Middlename`, `Extensionname` FROM 4ps_db_fds_final.household_and_personal_data_name;";
		ResultSet rs = stm.executeQuery(sql2);
		
		while(rs.next()) {
			ApplicantID = rs.getInt("Applicant_ID");
			Lname = rs.getString("Lastname");
			Fname = rs.getString("Firstname");
			Mname = rs.getString("Middlename");
			Exten = rs.getString("Extensionname");
					if(Lname.equals(MainForm.LNAME)&&Fname.equals(MainForm.FNAME)&&Mname.equals(MainForm.MNAME)) {
						//JOptionPane.showMessageDialog(null, "NAME FOUND");
						found_applicant_num = rs.getInt("Applicant_ID");
						System.out.println("Name Found");
						F_M_name = true;
						break;
					}
		}
		
		String sql3 = "SELECT `Applicant_ID` , `House_no`, `Household_ID_Number` FROM 4ps_db_fds_final.household_and_personal_data_add_info;";
		ResultSet rs1 = stm.executeQuery(sql3);
		
		while(rs1.next()) {
			ApplicantID1 = rs1.getInt("Applicant_ID");
			HN = rs1.getInt("House_no");
			HIN = rs1.getInt("Household_ID_Number");
			
					if(HN==Integer.parseInt(MainForm.HOUSE_NO)&&HIN==Integer.parseInt(MainForm.HOUSEHOLD_ID_NUMBER)) {
						//JOptionPane.showMessageDialog(null, "ADDRESS FOUND");
						found_applicant_num1 = rs1.getInt("Applicant_ID");
						System.out.println("Address Found");
						F_M_name1 = true;
						break;
					}
		}
		
		if (F_M_name1==F_M_name) {
			if (found_applicant_num1==found_applicant_num) {
				System.out.println("Found Value " + found_applicant_num1);
				System.out.println("Found House Number " + HN);
				runn = true;
			}
		}
		else {
			runn = false;
			//JOptionPane.showMessageDialog(null, "Value Dont match");
		}
		
	}
	
}
