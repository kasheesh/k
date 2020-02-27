package solar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class ImportDB {

	public static ImportItem getTariffLT2aiFirst ()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2ai limit 1 offset 0;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffLT2aiSecond ()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2ai limit 1 offset 1;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffLT2aiThird()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2ai limit 1 offset 2;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffLT2aiFourth()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2ai limit 1 offset 3;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffLT2aiFifth()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2ai limit 1 offset 4;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffLT2aiSixth()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2ai  limit 1 offset 5;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	
	/* TariffLT2aii Slab wise Calculation for LT2aii functions  */
	
	public static ImportItem getTariffLT2aiiFirst ()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2aii limit 1 offset 0;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffLT2aiiSecond ()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2aii limit 1 offset 1;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffLT2aiiThird()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2aii limit 1 offset 2;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffLT2aiiFourth()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2aii limit 1 offset 3;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffLT2aiiFifth()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2aii limit 1 offset 4;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	
	/* Tariff LT-2(b)(i)  */
	
	public static ImportItem getTariffLT2bione()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2bi limit 1 offset 0;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	
	public static ImportItem getTariffLT2bitwo()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2bi limit 1 offset 1;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	/* Slab wise data for Tariff LT2(b)(ii) */
	
	public static ImportItem getTariffLT2biione()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2bii limit 1 offset 0;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffLT2biitwo()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffLT2bii limit 1 offset 1;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	/* slab wise tariff for HT2(c)(i) */
	
	public static ImportItem getTariffHT2cione()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffHT2ci limit 1 offset 0;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffHT2citwo()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffHT2ci limit 1 offset 1;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	/* slab wise data for HT-2(c)(ii) */
	
	public static ImportItem getTariffHT2ciione()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffHT2cii limit 1 offset 0;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	public static ImportItem getTariffHT2ciitwo()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffHT2cii limit 1 offset 1;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
	
	/* slab wise data for HT-4 */
	
	public static ImportItem getTariffHT4()
	{
		ImportItem one = new  ImportItem();
		
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from TariffHT4 limit 1 offset 0;" );
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			
				one.setFrom1(rs.getFloat(1));
				one.setTo1(rs.getFloat(2));
				one.setRate(rs.getFloat(3));
			
			
				
			}
			con.close();
		}catch(Exception ex){System.out.println(ex);}
		
		
	 return one;
	}
}
