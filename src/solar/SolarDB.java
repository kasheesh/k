package solar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SolarDB {

	public static SolarItem getRecordById (long AppNo)
	{
		SolarItem bean = new SolarItem(); 
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from GrossMeter where AppNo=?");
			ps.setLong(1,AppNo);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				bean.setAppNo(rs.getLong(1));
		        bean.setRRNo(rs.getString(2));
		        bean.setSubDivision(rs.getString(3));
		        bean.setName(rs.getString(4));
		        bean.setAddress(rs.getString(5));
		        bean.setPhoneNo(rs.getLong(6));
		        bean.setSanctionLoad(rs.getString(7));
		        bean.setInstallCapacity(rs.getFloat(8));
		        bean.setTariff(rs.getString(9));
		        bean.setPPA_ApprovedDate(rs.getString(10));
		        bean.setPPA_EnterDate(rs.getString(11));
		        bean.setSyncronised(rs.getString(12));
		        bean.setSubsidised(rs.getString(13));
		        bean.setPPATariff(rs.getFloat(14));
		        bean.setMeterConstant(rs.getFloat(15));
		        bean.setMaximumDemand(rs.getFloat(16));
		        bean.setImportReading(rs.getFloat(17));
		        bean.setExportReading(rs.getFloat(18));
		        bean.setImportCheck(rs.getFloat(19));
		        bean.setExportCheck(rs.getFloat(20));
		        bean.setMDCheck(rs.getFloat(21));
		        bean.setAPPCRate(rs.getFloat(22));
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return bean;
	}

	
	public static List<SolarItem> getAllRecords(){
		List<SolarItem> list=new ArrayList<SolarItem>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from GrossMeter");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				SolarItem bean=new SolarItem();
				bean.setAppNo(rs.getLong(1));
		        bean.setRRNo(rs.getString(2));
		        bean.setSubDivision(rs.getString(3));
		        bean.setName(rs.getString(4));
		        bean.setAddress(rs.getString(5));
		        bean.setPhoneNo(rs.getLong(6));
		        bean.setSanctionLoad(rs.getString(7));
		        bean.setInstallCapacity(rs.getFloat(8));
		        bean.setTariff(rs.getString(9));
		        bean.setPPA_ApprovedDate(rs.getString(10));
		        bean.setPPA_EnterDate(rs.getString(11));
		        bean.setSyncronised(rs.getString(12));
		        bean.setSubsidised(rs.getString(13));
		        bean.setPPATariff(rs.getFloat(14));
		        bean.setMeterConstant(rs.getFloat(15));
		        bean.setMaximumDemand(rs.getFloat(16));
		        bean.setImportReading(rs.getFloat(17));
		        bean.setExportReading(rs.getFloat(18));
		        bean.setImportCheck(rs.getFloat(19));
		        bean.setExportCheck(rs.getFloat(20));
		        bean.setMDCheck(rs.getFloat(21));
		        bean.setAPPCRate(rs.getFloat(22));
				
				list.add(bean);
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		return list;
	}
}
