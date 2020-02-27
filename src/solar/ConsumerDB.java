package solar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class ConsumerDB {


	public static ConsumerItems getRecordById(long AccID)
	{
		ConsumerItems bean = new ConsumerItems(); 
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from ConsumerDetails where AccID=?");
			ps.setLong(1, AccID);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			bean.setAccID(rs.getLong(1));
			bean.setRRNo(rs.getString(2));
			bean.setName(rs.getString(3));
			bean.setPhoneNo(rs.getLong(4));
			bean.setEmailID(rs.getString(5));
			bean.setAddress(rs.getString(6));
			bean.setTariff(rs.getString(7));
			bean.setSubDivision(rs.getString(8));
			bean.setSanctionLoad(rs.getFloat(9));
			bean.setDivision(rs.getString(10));
			
				}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		return bean;
		}
	
	public static List<ConsumerItems> getAllRecords(){
		List<ConsumerItems> list=new ArrayList<ConsumerItems>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from ConsumerDetails");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ConsumerItems bean = new ConsumerItems(); 
			    bean.setAccID(rs.getLong(1));
				bean.setRRNo(rs.getString(2));
				bean.setName(rs.getString(3));
				bean.setPhoneNo(rs.getLong(4));
				bean.setEmailID(rs.getString(5));
				bean.setAddress(rs.getString(6));
				bean.setTariff(rs.getString(7));
				bean.setSubDivision(rs.getString(8));
				bean.setSanctionLoad(rs.getFloat(9));
				bean.setDivision(rs.getString(10));
				
				list.add(bean);
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		return list;
	}
}
