

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Date; 
/**
 * Servlet implementation class Commissioned
 */
@WebServlet("/Commissioned")
public class Commissioned extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Commissioned() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		 
		/* consumer Details */
		String sAppNo=request.getParameter("Account_id");
		long AccID=Long.parseLong(sAppNo);
		 
		String RRNo=request.getParameter("rr_no");  
		String Name=request.getParameter("name");  
		
		String Phone1=request.getParameter("Phone_no");
		long Phone=Long.parseLong(Phone1);
		
		String EmailId=request.getParameter("email_id");
		String Address=request.getParameter("address");  
		String Tariff=request.getParameter("Tariff");  
		String SubDiv=request.getParameter("sub_division");
		String SanLoad1=request.getParameter("sanction_load");
		float SanLoad=Float.parseFloat(SanLoad1);
		String Division = request.getParameter("division"); 
 
		
		/* Bank Details */
	   String BankName=request.getParameter("bank_name");  
		String BranchName=request.getParameter("branch_name");
		String BranchCode=request.getParameter("branch_code");  
		String AccountId=request.getParameter("Baccount_id");
		String IfscCode=request.getParameter("ifsc_code");  
		String BuserName=request.getParameter("bankC_name");
		
	
		/* SRTPV Details */
		String TypeOfMeter=request.getParameter("typeofmeter");
		String InstallCapacity1=request.getParameter("install_capacity");
		float InstallCapacity=Float.parseFloat(InstallCapacity1);
		
		String Subsidized=request.getParameter("subsidized");
		String RegisterDate=request.getParameter("register_date");
		 Date date1 = Date.valueOf(RegisterDate);
		 
		 String PPADate=request.getParameter("ppa_enterDate");
		 Date date2 = Date.valueOf(PPADate);
		 
		 String ApprovalDate=request.getParameter("ppa_approval");
		 Date date3 = Date.valueOf(ApprovalDate);
		 
		 String CommissionedDate=request.getParameter("ppa_commissioned");
		 Date date4 = Date.valueOf(CommissionedDate);
		 
		 String PPATariff1=request.getParameter("agreedTariff");
		 Float PPATariff = Float.parseFloat(PPATariff1);
		 String APPCTariff1 = request.getParameter("appcTariff");
		 Float APPCTariff = Float.parseFloat(APPCTariff1);
		
		
		 
	
		 String MainSerialNo = request.getParameter("MainSINo");
		 String MainMake = request.getParameter("MainMake");
		 String MainModel = request.getParameter("MainModel");
		 String MainPhase = request.getParameter("MainPhase");
		 String MainCapacity1 = request.getParameter("MainCapacity");
		 Float MainCapacity = Float.parseFloat(MainCapacity1);
		 String MainMeterConstant1 = request.getParameter("MainMeterConstant");
		 Float MainMeterConstant = Float.parseFloat(MainMeterConstant1);
		 String ReadingDate=request.getParameter("reding_date");
		 Date date5 = Date.valueOf(ReadingDate);
		 
		 String MainImp1 = request.getParameter("ImpMain");
		 Float MainImp = Float.parseFloat(MainImp1);
		 String MainMd1 = request.getParameter("MainImpMD");
		 Float MainMd = Float.parseFloat(MainMd1);
		 String MainExp1 = request.getParameter("ExpMain");
		 Float MainExp = Float.parseFloat(MainExp1);
		 String MainExpMd1 = request.getParameter("ExpMainMD");
		 Float MainExpMd = Float.parseFloat(MainExpMd1);
		 
			
		 String CheckSerialNo = request.getParameter("CheckSI");
		 String CheckMake = request.getParameter("CheckMake");
		 String CheckModel = request.getParameter("CheckModel");
		 String CheckPhase = request.getParameter("CheckPhase");
		 String CheckCapacity1 = request.getParameter("Checkapacity");
		 Float CheckCapacity = Float.parseFloat(CheckCapacity1);
		 String CheckMeterConstant1 = request.getParameter("CheckMeterConstant");
		 Float CheckMeterConstant = Float.parseFloat(CheckMeterConstant1);
		 
		 String CheckImp1 = request.getParameter("ImpCheck");
		 Float CheckImp = Float.parseFloat(CheckImp1);
		 String CheckMd1 = request.getParameter("ImpCheckMD");
		 Float CheckMd = Float.parseFloat(CheckMd1);
		 String CheckExp1 = request.getParameter("ExpCheck");
		 Float CheckExp = Float.parseFloat(CheckExp1);
		 String CheckExpMd1 = request.getParameter("CheckExpMD");
		 Float CheckpMd = Float.parseFloat(CheckExpMd1);
		 
		
		int i;
		Connection con=null;        
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bescom","root","12051997");  
		  
		try(PreparedStatement ps=con.prepareStatement("insert into ConsumerDetails values(?,?,?,?,?,?,?,?,?,?)"); ){ 
		  
		ps.setLong(1,AccID);  
		ps.setString(2,RRNo);  
		ps.setString(3,Name);  
		ps.setLong(4,Phone);  
		ps.setString(5,EmailId);
		ps.setString(6,Address);  
		ps.setString(7,Tariff);  
		ps.setString(8,SubDiv);  
		ps.setFloat(9,SanLoad);
		ps.setString(10, Division);
		 i=ps.executeUpdate();
		}
		
		  try (PreparedStatement ps = con.prepareStatement("insert into BankDetails values(?,?,?,?,?,?,?)");) {
			  ps.setString(1,BankName);
				ps.setString(2,BranchName);
				ps.setString(3,BranchCode);
				ps.setString(4,AccountId);
				ps.setString(5,IfscCode);
				ps.setString(6,BuserName);  
				ps.setLong(7, AccID);
				 i=ps.executeUpdate();
		    }
		  
		  try (PreparedStatement ps = con.prepareStatement("insert into SRTPVDetails values(?,?,?,?,?,?,?,?,?,?)");) {
				ps.setString(1,TypeOfMeter);
				ps.setFloat(2,InstallCapacity);
				ps.setString(3,Subsidized);
				ps.setDate(4,date1);
				ps.setDate(5,date2);
				ps.setDate(6,date3);
				ps.setDate(7,date4);
				ps.setFloat(8,PPATariff);
				ps.setFloat(9,APPCTariff);
			    ps.setLong(10, AccID);
				
				 i=ps.executeUpdate();
		    }
		  
		  try (PreparedStatement ps = con.prepareStatement("insert into MainMeter values(?,?,?,?,?,?,?,?,?,?,?,?)");) {
			  ps.setString(1,MainSerialNo);
				ps.setString(2,MainMake);
				ps.setString(3,MainModel);
				ps.setString(4,MainPhase);
				ps.setFloat(5,MainCapacity);
				ps.setFloat(6,MainMeterConstant);
				ps.setFloat(7,MainImp);
				ps.setFloat(8,MainMd);
				ps.setFloat(9,MainExp);
				ps.setFloat(10,MainExpMd);
				ps.setLong(11, AccID);
				ps.setDate(12, date5);
				
				 i=ps.executeUpdate();
		    }
		  
		  try (PreparedStatement ps = con.prepareStatement("insert into CheckMeter values(?,?,?,?,?,?,?,?,?,?,?)");) {
				ps.setString(1,CheckSerialNo);
				ps.setString(2,CheckMake);
				ps.setString(3,CheckModel);
				ps.setString(4,CheckPhase);
				ps.setFloat(5,CheckCapacity);
				ps.setFloat(6,CheckMeterConstant);
				ps.setFloat(7,CheckImp);
				ps.setFloat(8,CheckMd);
				ps.setFloat(9,CheckExp);
				ps.setFloat(10,CheckpMd);
				ps.setLong(11, AccID);
				
				
				 i=ps.executeUpdate();
		    }

		
		
	
		
		
		
	
		
		
		
			/*	
		 ps.setDate(10, date); */

	
		          
		  
		if(i>0) 
			
			out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>");
		out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<div class=\"card\" style=\"width: 18rem;margin-top: 129px;background-color:yellow;height:250px\">");
		
		out.println("<div class=\"card-body\">");
		out.println("<i class=\"fa fa-thumbs-o-up\" style=\"font-size:48px;color:red;margin-top: 42px;\"></i><br>");
		out.println(" <span style=\"font-size:20px;font-weight:bold\">Thank you be Part of BESCOM!</span><br><span style=\"font-size:20px;font-weight:bold\"> Data is stored!</span>");
		out.println("</div>");	
		out.println("</div></center>");
		out.println("</body>");
		out.println("</html>  "); 
		      
		          
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
		}  
	}



