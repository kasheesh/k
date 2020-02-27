package solar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SRTPVDetailsDB {
	
	
	public static SRTPVDetailsItem getRecordById(long AccID)
	{
		SRTPVDetailsItem bean = new SRTPVDetailsItem(); 
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from srtpvdetails where AccID=?");
			ps.setLong(1, AccID);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			bean.setTypeOfMeter(rs.getString(1));
			bean.setInstallCapacity(rs.getFloat(2));
			bean.setSubsidy(rs.getString(3));
			bean.setAppRegisterDate(rs.getString(4));
			bean.setPPAEnterDate(rs.getString(5));
			bean.setPPAApprovalDate(rs.getString(6));
			bean.setCommissionDate(rs.getString(7));
			bean.setPPATariff(rs.getFloat(8));
			bean.setAPPCTariff(rs.getFloat(9));
		
			bean.setAccID(rs.getLong(10));
			
				}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		return bean;
		}
	
	public static List<SRTPVDetailsItem > getAllRecords(){
		List<SRTPVDetailsItem > list=new ArrayList<SRTPVDetailsItem >();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from ConsumerDetails");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				SRTPVDetailsItem  bean = new SRTPVDetailsItem (); 
				bean.setTypeOfMeter(rs.getString(1));
				bean.setInstallCapacity(rs.getFloat(2));
				bean.setSubsidy(rs.getString(3));
				bean.setAppRegisterDate(rs.getString(4));
				bean.setPPAEnterDate(rs.getString(5));
				bean.setPPAApprovalDate(rs.getString(6));
				bean.setCommissionDate(rs.getString(7));
				bean.setPPATariff(rs.getFloat(8));
				bean.setAPPCTariff(rs.getFloat(9));
			
				bean.setAccID(rs.getLong(10));
				
				list.add(bean);
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		return list;
	}

}
