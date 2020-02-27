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
 * Servlet implementation class FetchUserData
 */
@WebServlet("/FetchUserData")
public class FetchUserData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchUserData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	String sAccID=request.getParameter("AccID");
		long AccID=Long.parseLong(sAccID);
		
		ConsumerItems bean=ConsumerDB.getRecordById(AccID);
		SRTPVDetailsItem bean2=SRTPVDetailsDB.getRecordById(AccID);
		MainMetreItem bean3=MainMeterDB.getRecordById(AccID);
		CheckMeter bean4=CheckMeterDB.getRecordById(AccID);
		BankDetailsItem bean5=BankDetailsDB.getRecordById(AccID);
		
		  try
          {
			 
				 if((bean.getAccID()>0)&&(bean2.getAccID()>0)&&(bean3.getAccID()>0)&&(bean4.getAccID()>0)&&(bean5.getAccID()>0))
				 {
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1,\">");
		out.println("<title>GrossMeter Bill</title>");
		out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>");
		out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>");
		out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>");
		out.println("<style>");
		out.println(".modal.left .modal-dialog, .modal.right .modal-dialog { position: fixed; margin: auto; width: 320px;");
		out.println(" -webkit-transform: translate3d(0%, 0, 0); -ms-transform: translate3d(0%, 0, 0); -o-transform: translate3d(0%, 0, 0); transform: translate3d(0%, 0, 0); }");
		out.println(".modal.left .modal-content, .modal.right .modal-content { height: auto; margin-top: 185px; margin-right: 26px; overflow-y: auto; }");
		out.println(".modal.left .modal-body, .modal.right .modal-body { padding: 15px 15px 80px; }");
		/*Right*/
		out.println(".modal.right.fade .modal-dialog { right: -320px; -webkit-transition: opacity 0.3s linear, right 0.3s ease-out; -moz-transition: opacity 0.3s linear, right 0.3s ease-out;");
		out.println(" -o-transition: opacity 0.3s linear, right 0.3s ease-out; transition: opacity 0.3s linear, right 0.3s ease-out; }");
		out.println(".modal.right.fade.in .modal-dialog { right: 0; }");
		/* ----- MODAL STYLE ----- */
		out.println(" .modal-content { border-radius: 0; border: none; }");
		out.println(" .modal-header { border-bottom-color: #EEEEEE; background-color: #FAFAFA; }");
		out.println(".btn-demo { margin: 13px; padding: 10px 15px; border-radius: 0; font-size: 13px;  background-color: #FFFFFF; }");
		out.println(".btn-demo:focus { outline: 0;	}");
		out.println(" .demo-content{ padding: 15px; font-size: 18px;  min-height: 50px; background: #dbdfe5; margin-top: 40px; margin-bottom: 15px; background-color: #dbdfe5; }");
		out.println(".demo-content.bg-alt{ background: #dbdfe5; }");
		out.println("table, th, td { border: 1px solid black; border-collapse: collapse;	}");
		out.println("th {  padding: 15px;  text-align: left; font-size: 16px	}");
		out.println("td {  padding: 15px;  text-align: left; font-size: 15px	}");
		out.println("table{ background-color: white; margin-top: 10px;}");
		out.println("</style>");
		out.println("</head>");
		 request.getRequestDispatcher("search.html").include(request, response); 
		out.println("<body>");
		
		
		out.println("<div class=\"container mt-3\">");
		out.println("<div class=\"row\">");
		
		/*table design */
		
		out.println("<div class=\"col-sm-3 col-md-4 col-lg-4\">");
		out.println("<div class=\"demo-content\" style=\"padding-top: 5px;\">");
		out.println("<p style=\"color:red;font-weight:bold;font-size:20px;margin-top:8px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CONSUMER DETAILS</p>  ");
		out.println("<table class=\"table table-bordered \" >");
		out.println("<thead>");
		out.println("<tr>");
		out.println("<tr><th>Account ID</th><td>"+bean.getAccID()+"</td></tr>");
		out.println("<tr><th>Name</th><td>"+bean.getName()+"</td></tr>");
		out.println("<tr><th>Phone No</th><td>"+bean.getPhoneNo()+"</td></tr>");
		out.println("<tr><th>Address</th><td>"+bean.getAddress()+"</td></tr>");
		out.println("<tr><th>Install Capacity</th><td>"+bean2.getInstallCapacity()+"</td></tr>");
		out.println("</tr>");
		out.println("</thead>");
		out.println("</table>");
		out.println("</div>");
		out.println("</div>");
		
		/* Main Meter Design */
		
		out.println("<div class=\"col-sm-3 col-md-4 col-lg-4\">");
		out.println("<div class=\"demo-content bg-alt\">");
		out.println("<form  method=\"GET\" action=\"GrossCalculation\" >");
		out.println("<p style=\"color:red;font-weight:bold;font-size:20px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;MAIN METER</p>");
		out.println("<label for=\"basic-url\" style=\"font-size: 14px\"><b><i class=\"fa fa-bolt\" style=\"font-size:24px\"></i>--><i class=\"fa fa-home\" style=\"font-size:24px\"></i>&nbsp;&nbsp; IMPORT</b></label>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Present Reading</span></div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"importPresMain\" value=\"\" step=\"any\" required ></div>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Previous Reading</span></div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" value="+bean3.getImportReading()+"  readonly=\"readonly\" step=\"any\" name=\"importPrevMain\"></div>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">MD &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> </div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"mdImportMain\" step=\"any\" required></div>");
		
		out.println("<label for=\"basic-url\" style=\"font-size: 14px\"><b><i class=\"fa fa-home\" style=\"font-size:24px\"></i>--><i class=\"fa fa-bolt\" style=\"font-size:24px\"></i> &nbsp;&nbsp;EXPORT</b></label>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Present Reading</span></div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"exportPresMain\" value=\"\" step=\"any\" required ></div>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Previous Reading</span></div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" value="+bean3.getExportReading()+"  readonly=\"readonly\" step=\"any\" name=\"exportPrevMain\" ></div>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">MD &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> </div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"mdExportMain\" step=\"any\"  required></div>");
	//	out.println("<input class=\"btn btn-success\" style=\"font-size: 14px; margin-left: 100PX\"type=\"button\" value=\"Confirm\" onclick=\"collect(this.form)\" / >");
		out.println("<label for=\"basic-url\" style=\"font-size: 14px\"><b><i class=\"fa fa-calendar\" style=\"font-size:24px\"></i>&nbsp;&nbsp;DATE</b></label>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\"> Reading Date</span></div>");
		out.println("<input type=\"date\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"MainMTDate\" value=\"\" step=\"any\" required ></div>");
		out.println("<br>");
		out.println("</div>");
		out.println("</div>");
		
		/* Check Meter Design */
		
		out.println("<div class=\"col-sm-3 col-md-4 col-lg-4\">");
		out.println("<div class=\"demo-content bg-alt\">");
		out.println("<p style=\"color:red;font-weight:bold;font-size:20px\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CHECK METER</p>");
		out.println("<label for=\"basic-url\" style=\"font-size: 14px\"><b><i class=\"fa fa-bolt\" style=\"font-size:24px\"></i>--><i class=\"fa fa-home\" style=\"font-size:24px\"></i>&nbsp;&nbsp; IMPORT</b></label>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Present Reading</span></div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"importCheck\" step=\"any\" value=\"0\" required  ></div>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Previous Reading</span></div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" value="+bean4.getImportReading()+"  readonly=\"readonly\"  name=\"importPrevCheck\" step=\"any\" ></div>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">MD &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> </div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"mdImportCheck\" step=\"any\" value=\"0\" required ></div>");
		
		out.println("<label for=\"basic-url\" style=\"font-size: 14px\"><b><i class=\"fa fa-home\" style=\"font-size:24px\"></i>--><i class=\"fa fa-bolt\" style=\"font-size:24px\"></i> &nbsp;&nbsp;EXPORT</b></label>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Present Reading</span></div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"exportCheck\" step=\"any\" value=\"0\" required ></div>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">Previous Reading</span></div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" value="+bean4.getExportReading()+"  readonly=\"readonly\" step=\"any\" name=\"exportPrevCheck\" ></div>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\">MD &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> </div>");
		out.println("<input type=\"number\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"mdExportCheck\"  step=\"any\" value=\"0\" required></div>");
		out.println("<label for=\"basic-url\" style=\"font-size: 14px\"><b><i class=\"fa fa-calendar\" style=\"font-size:24px\"></i>&nbsp;&nbsp;DATE</b></label>");
		out.println("<div class=\"input-group mb-3\">");
		out.println("<div class=\"input-group-prepend\"><span class=\"input-group-text\" id=\"basic-addon3\" style=\"font-size: 14px\"> Reading Date</span></div>");
		out.println("<input type=\"date\" class=\"form-control\" id=\"basic-url\" aria-describedby=\"basic-addon3\" name=\"MainMTDate\" value=\"0\" step=\"any\"  ></div>");
		//out.println("<div class=\"container demo\">");
		//out.println("<div class=\"text-center\" style=\"margin-top: 12Px\"; >");
		out.println("<button type=\"submit\" class=\"btn btn-success\" style=\"\" data-toggle=\"modal\" > Submit</button>");
		//out.println("</div>");
		//out.println("</div><!-- container -->");
		out.println("</form>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>");
		out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js'></script>");
		
		 out.print("<script>function collect(frm) {");
			out.println(" var imv=frm.importPresMain.value;");
			 out.println("var mdv=frm.mdImportMain.value;");
	  	    out.println(" var exv=frm.exportPresMain.value;");
	  	    out.println("var mdv2=frm.mdExportMain.value;");
	  	    
	  	    out.println("alert(\"The Import Present Reading  \"+ frm.importPresMain.value+\"\\n The Export Present Reading  \"+ frm.exportPresMain.value+\"\\n The Maximum Demand of export \"+frm.mdExportMain.value);");
			out.print("}");
		    out.print("</script>");
		    
		   
		    HttpSession session=request.getSession();
            session.setAttribute("AccID",bean.getAccID());
            session.setAttribute("RRNo",bean.getRRNo());
            session.setAttribute("Name",bean.getName());
            session.setAttribute("PhoneNo",bean.getPhoneNo());
            session.setAttribute("EmailID",bean.getEmailID());
            session.setAttribute("Address",bean.getAddress());
            session.setAttribute("Tariff",bean.getTariff());
            session.setAttribute("SubDivision",bean.getSubDivision());
            session.setAttribute("SanctionLoad",bean.getSanctionLoad());
            session.setAttribute("Division", bean.getDivision());
            
            session.setAttribute("TypeOfMeter",bean2.getTypeOfMeter());
            session.setAttribute("InstallCapacity",bean2.getInstallCapacity());
            session.setAttribute("Subsidy",bean2.getSubsidy());
            session.setAttribute("AppRegisterDate",bean2.getAppRegisterDate());
            session.setAttribute("PPAEneterDate",bean2.getPPAEnterDate());
            session.setAttribute("PPAApprovalDate",bean2.getPPAApprovalDate());
            session.setAttribute("CommissionDate",bean2.getCommissionDate());
            session.setAttribute("PPATariff",bean2.getPPATariff());
            session.setAttribute("APPCTariff",bean2.getAPPCTariff());
           
            
            session.setAttribute("MainSerialNo",bean3.getSerialNo());
            session.setAttribute("MainMake",bean3.getMake());
            session.setAttribute("MainModel",bean3.getModel());
            session.setAttribute("MainMeterConstant", bean3.getMeterConstant());
            session.setAttribute("MainImpReading",bean3.getImportReading());
            session.setAttribute("MainImpMD",bean3.getImportMD());
            session.setAttribute("MainExpReading",bean3.getExportReading());
            session.setAttribute("MainExpMD",bean3.getExportMD());
            session.setAttribute("ReadingDate", bean3.getReadingDate());
            
            session.setAttribute("CheckSerialNo",bean4.getSerialNo());
            session.setAttribute("CheckMake",bean4.getMake());
            session.setAttribute("CheckModel",bean4.getModel());
            session.setAttribute("CheckMeterConstant",bean4.getMeterConstant());
            session.setAttribute("CheckImpReading",bean4.getImportReading());
            session.setAttribute("CheckImpMD",bean4.getImportMD());
            session.setAttribute("CheckExpReading",bean4.getExportReading());
            session.setAttribute("CheckExpMD",bean4.getExportMD());
            
            session.setAttribute("BankName",bean5.getBankName());
            session.setAttribute("BranchName",bean5.getBranchName());
            session.setAttribute("BranchCode",bean5.getBranchCode());
            session.setAttribute("AccountID",bean5.getAccountID());
            session.setAttribute("IfscCode",bean5.getIfscCode());
            session.setAttribute("BName",bean5.getName());
            
            
        	out.println("</body>");
    		out.println("</html> "); 

	}
		
		  else{
			  out.println("<!DOCTYPE html>");
			  out.println("<html lang=\"en\">");
		      out.println("<head>");
		      out.println("</head>");
		      out.println("<body>");
		      request.getRequestDispatcher("search.html").include(request, response); 
		      out.println("<script>");
		      out.println("  alert(\"THE ACCOUNT ID NOT MATCHED\");");
		      out.println("</script>");
		      out.println("</body>");
	    		out.println("</html> ");
			
		  
	}
	
	
          }
          catch (Exception e2) {e2.printStackTrace();}  
          
          finally{out.close();}
	
	}

}
