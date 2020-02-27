package solar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataInsert
 */
@WebServlet("/DataInsert")
public class DataInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String sAppNo=request.getParameter("ACCId");
		long ACCId=Long.parseLong(sAppNo);
		
		String RR_Number = request.getParameter("rr_no");
		String Name = request.getParameter("name");
		
		String Mobile1 = request.getParameter("Phone_no");
		long Mobile = Long.parseLong(Mobile1);
		
		String EmailId = request.getParameter("email_id");
		String Address = request.getParameter("address");
		String Tariff = request.getParameter("Tariff");
		String Sub_division = request.getParameter("sub_division");
		
		String Sanction_load = request.getParameter("sanction_load");
		float Sanction_Load = Float.parseFloat(Sanction_load);
		
		String BankName = request.getParameter("bank_name");
		String BranchName = request.getParameter("branch_name");
		
		String BrankAccID = request.getParameter("Baccount_id");
		String IfscCode = request.getParameter("ifsc_code");
		String UserName = request.getParameter("bankC_name");
		
		
		 
		
		try{
		
			
			
			Connection con=DB.getCon();
			PreparedStatement ps = con.prepareStatement("INSERT INTO a123 VALUES('?');");
					
					ps.setLong(1, ACCId);
				/*	ps.setString(2, RR_Number);
					ps.setString(3, Name);
					ps.setLong(4, Mobile);
					ps.setString(5, EmailId);
					ps.setString(6, Address);
					ps.setString(7, Tariff);
					ps.setString(8, Sub_division);
					ps.setFloat(9, Sanction_Load );
					ps.setString(10, BankName);
					ps.setString(11, BranchName);
					ps.setString(12, BrankAccID);
					ps.setString(13, IfscCode);
					ps.setString(14, UserName);*/
					
					   
					int result=ps.executeUpdate();  
					if(result>0)  
					out.print("You are successfully registered...");  
					      
	           
		}
		catch (Exception e2) {
			System.out.println(e2);}  
        
		out.close();  
		}
	


}
