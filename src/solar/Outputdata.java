package solar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Outputdata
 */
@WebServlet("/Outputdata")
public class Outputdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Outputdata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String from1 = request.getParameter("import");
		float from = Float.parseFloat(from1);
		String rate1=request.getParameter("export");
		float rate = Float.parseFloat(rate1);

		String MainimportMD1=request.getParameter("MainimportMD");
		float MainimportMD = Float.parseFloat(MainimportMD1);
		String MainexportMD1=request.getParameter("MainexportMD");
		float MainexportMD = Float.parseFloat(MainexportMD1);

		String MainimportConsumption1=request.getParameter("MainimportConsumption");
		float MainimportConsumption = Float.parseFloat(MainimportConsumption1);
		String MainexportConsumption1=request.getParameter("MainexportConsumption");
		float MainexportConsumption = Float.parseFloat(MainexportConsumption1);

		String MainimportDifference1=request.getParameter("MainimportDifference");
		float MainimportDifference = Float.parseFloat(MainimportDifference1);
		String MainexportDifference1=request.getParameter("MainexportDifference");
		float MainexportDifference= Float.parseFloat(MainexportDifference1);

		String date=request.getParameter("date");
		Date date3 = Date.valueOf(date);
		String sAppNo=request.getParameter("AccountID");
		long AccID=Long.parseLong(sAppNo);




		int i;
		Connection con = null;

		if( AccID!=0)
		{


		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bescom","root","12051997");

		try (PreparedStatement ps = con.prepareStatement("insert into MainMeterReading values(?,?,?,?,?,?,?,?,?,?)");) {
			ps.setFloat(1, from);
			ps.setFloat(2, rate);
			ps.setFloat(3, MainimportMD);
			ps.setFloat(4, MainexportMD);
			ps.setFloat(5, MainimportDifference);
			ps.setFloat(6, MainexportDifference);
			ps.setFloat(7, MainimportConsumption);
			ps.setFloat(8, MainexportConsumption);
			ps.setDate(9,date3 );
			ps.setLong(10, AccID); 
			
			 i=ps.executeUpdate();
		}


		try (PreparedStatement ps = con.prepareStatement("Update mainmeter set ImpReading=?,ExpReading=? where  AccID=?");) {
			ps.setFloat(1, from);
			ps.setFloat(2, rate);
			ps.setLong(3, AccID); 
			
			 i=ps.executeUpdate();
		}


		 

		if(i > 0)
		{
			out.print("There is  updating Record.");
		}
		else
		{
		out.print("There is a problem in updating Record.");
		}
		}
		catch(SQLException sql)
		{
		request.setAttribute("error", sql);
		out.println(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

	

}
