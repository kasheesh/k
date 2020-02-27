package solar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FetchDataservlet
 */
@WebServlet("/FetchDataservlet")
public class FetchDataservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchDataservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sAppNo=request.getParameter("AppNo");
		long AppNo=Long.parseLong(sAppNo);
		
		SolarItem bean=SolarDB.getRecordById(AppNo);
		
	  
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
		out.println("<title>Billing Details</title>");
		out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">");

		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>");
		out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>");
		out.println(" <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>");

		out.println("<style>");

		out.println(".modal.left .modal-dialog,");
		out.println(".modal.right .modal-dialog {");
		out.println(" position: fixed;margin: auto;width: 320px;");
		out.println("  -webkit-transform: translate3d(0%, 0, 0);");
		out.println("  -ms-transform: translate3d(0%, 0, 0);");
		out.println("   -o-transform: translate3d(0%, 0, 0);");
		out.println(" transform: translate3d(0%, 0, 0);}");

		out.println(".modal.left .modal-content,");
		out.println("  .modal.right .modal-content {");
		out.println("height: auto; margin-top: 185px; margin-right: 26px; overflow-y: auto; }");

		out.println(".modal.left .modal-body,");
		out.println(".modal.right .modal-body {");
		out.println(" padding: 15px 15px 80px;margin-top:23px;}");


		out.println(" .modal.right.fade .modal-dialog {");
		out.println("right: -320px;");
		out.println("-webkit-transition: opacity 0.3s linear, right 0.3s ease-out;");
		out.println("-moz-transition: opacity 0.3s linear, right 0.3s ease-out;");
		out.println("-o-transition: opacity 0.3s linear, right 0.3s ease-out;");
		out.println(" transition: opacity 0.3s linear, right 0.3s ease-out;}");


		out.println(".modal.right.fade.in .modal-dialog { right: 0; }");
		out.println(" .modal-content { border-radius: 0; border: none; }");
		out.println(".modal-header { border-bottom-color: #EEEEEE; background-color: #FAFAFA; }");
		out.println("body { background-color:white; }");

		out.println(".btn-demo { margin: 13px; padding: 10px 15px; border-radius: 0; font-size: 13px;");
		out.println(" background-color: #FFFFFF;}");

		out.println(".btn-demo:focus {outline: 0;}");
		out.println(".demo-content{ padding: 15px; font-size: 18px; min-height: 50px;");
		out.println("background: #dbdfe5;margin-bottom: 15px; background-color: #dbdfe5; }");
		out.println(".demo-content.bg-alt{ background: #dbdfe5; }");
		out.println("table, th, td { border: 1px solid black;border-collapse: collapse;}");
		out.println("th, td { padding: 15px; text-align: left; font-size: 14px }");
		out.println("table{ background-color: white; }");
		out.print(".mytable th, td { padding: 15px; text-align: left; font-size: 14px	}");
		out.println("</style>");
		out.println("</head>");
		 request.getRequestDispatcher("search.html").include(request, response); 
		out.println("<body>");
	
		
          try
          {
        	  
        	  if(bean.getAppNo()>0){



		   
		    

		    out.println("<div class=\"container mt-3\">");
		        out.println("<div class=\"row\">");
		            out.println("<div class=\"col-sm-3 col-md-4 col-lg-4\">");
		           out.println("<div class=\"demo-content\" style=\"padding-top: 30px;\">");
		                out.println("<h5 style=\"color:Red; margin-top: -21px; margin-left: 56px;\"> Consumer Details</h5>");
		                       
                      out.println("<table class=\"mytable\">");
		    out.println("<thead>");
		     out.println("<tr>");
		   out.println("<tr><th>Account ID</th><td>"+bean.getAppNo()+"</td></tr>");
		  out.println("<tr><th>Name</th><td>"+bean.getName()+"</td></tr>");
		  out.println("<tr> <th>Phone No</th><td>"+bean.getPhoneNo()+"</td></tr>");
		  out.println("<tr><th>Address</th><td>"+bean.getAddress()+"</td></tr>");
		 
		  out.println("<tr><th>Install Capacity</th><td>"+bean.getInstallCapacity()+"</td></tr></tr></table>");
		  out.println("</div>");
		  out.println("</div>");

		   
		   
		            out.println("<div class=\"col-sm-3 col-md-4 col-lg-4\">");
		                out.println("<div class=\"demo-content bg-alt\">");
		                out.println("<h5 style=\"color:red; margin-top: -8px;margin-left: 76px;\">Billing Details</h5>");
		                out.println("<form  method=\"GET\" action=\"GrossCalculation\" >");
		  out.println("<label for=\"basic-url\" style=\"font-size: 14px\"><b>IMPORT</b></label>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\">");
		out.println("<span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Present Reading</span></div>");
		 out.println("<input type=\"text\" class=\"form-control\" id=\"presRead\" aria-describedby=\"basic-addon3\" name=\"importPresent\" value=\"\" required></div>");
		
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Previous Reading</span></div>");
		out.println("<input type=\"text\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" value="+bean.getImportReading()+"  readonly=\"readonly\" name=\"imp1\" ></div>");

		out.println("<label for=\"basic-url\" style=\"font-size: 14px\"><b>EXPORT</b></label>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\" >Present Reading</span></div>");
		out.println("<input type=\"text\" class=\"form-control\" id=\"PresRead\" aria-describedby=\"basic-addon3\" name=\"exportPresent\" value=\"\" required></div>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Previous Reading</span></div>");
		out.println("<input type=\"text\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" value="+bean.getExportReading()+"  readonly=\"readonly\"  name=\"exp1\"></div>");

		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\" >MD &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> </div>");
		out.println("<input type=\"text\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"mdPresent\" value=\"\" required></div>");


		out.println("<input class=\"btn btn-success\" style=\"font-size: 14px\" type=\"button\" value=\"Confirm\" onclick=\"collect(this.form)\" / >");
		out.println("<div class=\"container demo\">");
		  
		  
		  out.println("<div class=\"text-center\" style=\"margin-top: -20px\"; >");
		  
		    out.println("<button type=\"submit\" class=\"btn btn-success\" style=\"margin-top: -30px;\" data-toggle=\"modal\" data-target=\"#myModal2\">Submit</button>");
		   
		  out.println("</div>");


		 
		  out.println("<div class=\"modal right fade\" id=\"myModal2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel2\">");
		    out.println("<div class=\"modal-dialog\" role=\"document\">");
		    out.println(" <div class=\"modal-content\" style=\"margin-left: -126px;height: 24em;width: 22em;margin-top: 85px;\">");
		    	  
		    out.println("<div class=\"modal-body\">");
		    out.println("<style type=\"text/css\">th,td{text-align: center;} </style>");



          out.println("<a href=\"GrossMeterBill.jsp\">");
		    request.getRequestDispatcher("GrossMeterBill.jsp").include(request, response);
		    out.println("</a>");

		    out.println(" </div>");
		    out.println("</form>");
		    out.println("</div>");
		    out.println("</div>");
		  out.println("</div>");
		  
		  
		out.println("</div>");



		  out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>");
		out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js'></script>");

		                out.println("</div>");
		            out.println("</div>");

		             
		        out.println("</div>");
		    out.println("</div>");
		    
		    
		    out.print("<script>function collect(frm) {");
			out.println(" var imv=frm.importPresent.value;");
	  	    out.println(" var exv=frm.exportPresent.value;");
	  	    out.println("var mdv=frm.mdPresent.value;");
	  	    
	  	    out.println("alert(\"The Import Present Reading  \"+ frm.importPresent.value+\"\\n The Export Present Reading  \"+ frm.exportPresent.value+\"\\n The Maximum Demand  \"+frm.mdPresent.value);");
			out.print("}");
		    out.print("</script>");
		    
		  
		    HttpSession session=request.getSession();
            session.setAttribute("AppNo",bean.getAppNo());
            session.setAttribute("RRNo",bean.getRRNo() );
            session.setAttribute("SubDivision",bean.getSubDivision());
            session.setAttribute("Name",bean.getName());
            session.setAttribute("PhoneNo",bean.getPhoneNo());
            session.setAttribute("Address",bean.getAddress());
            session.setAttribute("SanctionLoad",bean.getSanctionLoad());
            session.setAttribute("InstallCapacity",bean.getInstallCapacity());
            session.setAttribute("Tariff",bean.getTariff());
            session.setAttribute("PPA_ApprovalDate",bean.getPPA_ApprovedDate());
            session.setAttribute("PPA_EnterDate",bean.getPPA_EnterDate());
            session.setAttribute("Syncronised",bean.getSyncronised());
            session.setAttribute("Subsidised",bean.getSubsidised());
            session.setAttribute("PPATariff",bean.getPPATariff());
            session.setAttribute("MeterConstant",bean.getMeterConstant());
            session.setAttribute("MaximumDemand",bean.getMaximumDemand());
            session.setAttribute("ImportReading",bean.getImportReading());
            session.setAttribute("ExportReading",bean.getExportReading());

            
          
		    
		   
		    
        	  }
        	  else{
			         out.println("<script>");
					 out.println("alert(\"The Import Present Reading  \"+ AppNo");
					 out.println("</script>");
		}
		
		    
		   
		out.println("</body>");

		out.println("</html>");                            

          }
          catch (Exception e2) {e2.printStackTrace();}  
          
          finally{out.close();}
	



	
		
		
		                
		          

		             
		       
		  
		    
		   
		

		
	}



}
