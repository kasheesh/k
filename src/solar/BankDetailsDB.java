package solar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BankDetailsDB {

	public static BankDetailsItem getRecordById(long AccID)
	{
		BankDetailsItem bean = new BankDetailsItem(); 
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from bankdetails where AccID=?");
			ps.setLong(1, AccID);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
		  
				bean.setBankName(rs.getString(1));
				bean.setBranchName(rs.getString(2));
				bean.setBranchCode(rs.getString(3));
				bean.setAccountID(rs.getLong(4));
				bean.setIfscCode(rs.getString(5));
				bean.setName(rs.getString(6));
				bean.setAccID(rs.getLong(7));
			
				}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		return bean;
		}
	
	public static List<BankDetailsItem > getAllRecords(){
		List<BankDetailsItem> list=new ArrayList<BankDetailsItem >();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from bankdetails");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				BankDetailsItem  bean = new BankDetailsItem(); 
				bean.setBankName(rs.getString(1));
				bean.setBranchName(rs.getString(2));
				bean.setBranchCode(rs.getString(3));
				bean.setAccountID(rs.getLong(4));
				bean.setIfscCode(rs.getString(5));
				bean.setName(rs.getString(6));
				bean.setAccID(rs.getLong(7));
							
				list.add(bean);
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		return list;
	}
}
