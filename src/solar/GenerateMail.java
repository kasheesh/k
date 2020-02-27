package solar;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenerateMail
 */
@WebServlet("/GenerateMail")
public class GenerateMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateMail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	  // String to=request.getParameter("email");
	    String to = "bescomsolarrhelpdesk@gmail.com";
	   String Amount=request.getParameter("totalAmount");
	   String name=request.getParameter("name");
	   String installCapacity=request.getParameter("installCapacity");
       String AccountID=request.getParameter("AccountID");
       
		final String user="prashanthan522@gmail.com";//change accordingly  
		final String pass="9611480742";  
		  
		//1st step) Get the session object    
		  Properties props = new Properties();
	        props.put("mail.smtp.host", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.auth", "true");  
		  
		Session session = Session.getDefaultInstance(props,  
		 new javax.mail.Authenticator() {  
		  protected PasswordAuthentication getPasswordAuthentication() {  
		   return new PasswordAuthentication(user,pass);  
		   }  
		});  
		//2nd step)compose message  
		 //2) compose message     
		  try{  
		    MimeMessage message = new MimeMessage(session);  
		    
		    message.setFrom(new InternetAddress(user));  
		    message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		    
		    message.setSubject("SRTPV BILL");  
		      
		    //3) create MimeBodyPart object and set your message text     
		 //   BodyPart messageBodyPart1 = new MimeBodyPart(); 
		    
		 //   messageBodyPart1.setText("The Total SRTPV Amount" +Amount);
		  
		      
		    //4) create new MimeBodyPart object and set DataHandler object to this object      
		    
		    Calendar ca1 = Calendar.getInstance();
		    java.util.Date d = new java.util.Date(ca1.getTimeInMillis());

		   
		     
		    //5) create Multipart object and add MimeBodyPart objects to this object      
		  //  Multipart multipart = new MimeMultipart();  
		  //  multipart.addBodyPart(messageBodyPart1);  
		   
		  
		    //6) set the multiplart object to the message object  
		    //message.setContent(multipart );  
		    StringBuilder sb = new StringBuilder();
		    sb.append("<html>");
		
		    sb.append("<head>");
		    //sb.append("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
		    sb.append("<style type=\"text/css\">");
		    sb.append("table {border-collapse: collapse;}");
		    sb.append("table, td, th {border: 1px solid black;}");
		    sb.append("</style>");
		    sb.append("</head>");
		    sb.append("<body>");
		    sb.append("<br><br>");
		    sb.append("<table  background=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRX6admcllphKV596EkRUgVDQQLhag_FvmZl8HbdT-YziOtw7Hr4w&s\" style=\" background-position: center;background-repeat: no-repeat;background-size: cover;color:white;width: 25%;margin-left:300px;min-height:300px;\" >\r\n" + 
		    		" <thead><tr>");
		    sb.append("<th colspan=\"2\" > SRTPV BILL FOR THE MONTH OF "+new SimpleDateFormat("MMMM").format(d)+"</th></tr></thead>");
		    sb.append(" <tbody>");
		    sb.append("  <tr><th>Account ID</th><th>"+AccountID+"</th></tr>");
		    sb.append("<tr><th>Name</th><th>"+name+"</th></tr>");
			sb.append("<tr><th>Install Capacity</th><th>"+installCapacity+"</th></tr>");
		    sb.append("<tr><th>Total Amount</th><th>"+Amount+"</th></tr>");
		    sb.append("  </tbody>");
		    sb.append("</table>");
		    sb.append("</body></html>");
		    message.setContent(sb.toString(), "text/html");
		   // message.setContent(
		  //            "<html><body><h1>This is actual message embedded in HTML tags</h1></body></html>",
		  //           "text/html");
		    //7) send message  
		    Transport.send(message);  
		   request.getRequestDispatcher("logout.html").include(request, response); 
		   System.out.println("message sent....");  
		   }catch (MessagingException ex) {ex.printStackTrace();}  
		 }  



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
