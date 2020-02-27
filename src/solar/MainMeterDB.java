package solar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MainMeterDB {

	public static MainMetreItem getRecordById(long AccID)
	{
		MainMetreItem bean = new MainMetreItem(); 
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from mainmeter where AccID=?");
			ps.setLong(1, AccID);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			 bean.setSerialNo(rs.getString(1));
			 bean.setMake(rs.getString(2));
			 bean.setModel(rs.getString(3));
			 bean.setPhase(rs.getString(4));
			 bean.setCapacity(rs.getFloat(5));
			 bean.setMeterConstant(rs.getFloat(6));
			 bean.setImportReading(rs.getFloat(7));
			 bean.setImportMD(rs.getFloat(8));
			 bean.setExportReading(rs.getFloat(9));
			 bean.setExportMD(rs.getFloat(10));
			 bean.setAccID(rs.getLong(11));
			 bean.setReadingDate(rs.getString(12));
				}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		return bean;
		}
	

	public static List<MainMetreItem> getAllRecords(){
		List<MainMetreItem> list=new ArrayList<MainMetreItem>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from mainmeter;");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				MainMetreItem bean = new MainMetreItem(); 
				 bean.setSerialNo(rs.getString(1));
				 bean.setMake(rs.getString(2));
				 bean.setModel(rs.getString(3));
				 bean.setPhase(rs.getString(4));
				 bean.setCapacity(rs.getFloat(5));
				 bean.setMeterConstant(rs.getFloat(6));
				 bean.setImportReading(rs.getFloat(7));
				 bean.setImportMD(rs.getFloat(8));
				 bean.setExportReading(rs.getFloat(9));
				 bean.setExportMD(rs.getFloat(10));
				 bean.setAccID(rs.getLong(11));
				 bean.setReadingDate(rs.getString(12));
				list.add(bean);
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		return list;
	}
}
