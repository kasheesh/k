<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/bescom";%>
<%!String user = "root";%>
<%!String psw = "12051997";%>
<%
String from1 = request.getParameter("import");
float from = Float.parseFloat(from1);
String rate1=request.getParameter("export");
float rate = Float.parseFloat(rate1);

String MainimportMD1 = request.getParameter("MainimportMD");
float MainimportMD= Float.parseFloat(MainimportMD1);
String MainexportMD1=request.getParameter("MainexportMD");
float MainexportMD = Float.parseFloat(MainexportMD1);

String MainimportDifference1 = request.getParameter("MainimportDifference");
float MainimportDifference = Float.parseFloat(MainimportDifference1);
String MainexportDifference1=request.getParameter("MainexportDifference");
float MainexportDifference= Float.parseFloat(MainexportDifference1);

String MainimportConsumption1 = request.getParameter("MainimportConsumption");
float MainimportConsumption = Float.parseFloat(MainimportConsumption1);
String MainexportConsumption1=request.getParameter("MainexportConsumption");
float MainexportConsumption= Float.parseFloat(MainexportConsumption1);

String MainExpMDConsm1 = request.getParameter("MainExpMDConsm");
float MainExpMDConsm= Float.parseFloat(MainExpMDConsm1);
String MainImpMDConsm1 = request.getParameter("MainImpMDConsm");
float MainImpMDConsm= Float.parseFloat(MainImpMDConsm1);

String TotImportUnits1 = request.getParameter("TotImportUnits");
float TotImportUnits= Float.parseFloat(TotImportUnits1);
String slabTariff1 = request.getParameter("slabTariff");
float slabTariff= Float.parseFloat(slabTariff1);
String ExportMainUnits1 = request.getParameter("ExportMainUnits");
float ExportMainUnits= Float.parseFloat(ExportMainUnits1);
String Tariff1 = request.getParameter("Tariff");
float Tariff= Float.parseFloat(Tariff1);



String sAppNo=request.getParameter("AccountID");
long AccID=Long.parseLong(sAppNo);

String TotalImportAmount1 = request.getParameter("TotalImportAmount");
float TotalImportAmount = Float.parseFloat(TotalImportAmount1);
String TotalExporAmount1=request.getParameter("TotalExporAmount");
float TotalExporAmount= Float.parseFloat(TotalExporAmount1);
String TotalAmount1=request.getParameter("TotalAmount");
float TotalAmount= Float.parseFloat(TotalAmount1);

String prevDate1=request.getParameter("prevDate");
Date date1 = Date.valueOf(prevDate1);

String PresDate=request.getParameter("PresDate");
Date date2 = Date.valueOf(PresDate);

String DueDate=request.getParameter("DueDate");
Date date3 = Date.valueOf(DueDate);


String Division=request.getParameter("Division");
String SubDivision=request.getParameter("SubDivision");
String RRNo=request.getParameter("RRNo");

String PrevExport1=request.getParameter("PrevExport");
float PrevExport= Float.parseFloat(PrevExport1);
String PrevImport1=request.getParameter("PrevImport");
float PrevImport= Float.parseFloat(PrevImport1);


int i;
Connection con = null;

if( AccID!=0)
{


try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);

try (PreparedStatement ps = con.prepareStatement("insert into MainMeterReading values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");) {
	ps.setDate(1, date1);
	ps.setDate(2,date2);
	ps.setDate(3, date3);
	ps.setFloat(4, MainexportMD);
	ps.setFloat(5, rate);
	ps.setFloat(6, MainimportMD);
	ps.setFloat(7, from);
	ps.setFloat(8, MainexportDifference);
	ps.setFloat(9, MainimportDifference);
	ps.setFloat(10,MainExpMDConsm);
	ps.setFloat(11, MainexportConsumption);
	ps.setFloat(12,MainImpMDConsm);
	ps.setFloat(13, MainimportConsumption);
	ps.setFloat(14,ExportMainUnits);
	ps.setFloat(15,Tariff);
	ps.setFloat(16,TotImportUnits);
	ps.setFloat(17,slabTariff);
	ps.setFloat(18,TotalExporAmount);
	ps.setFloat(19,TotalImportAmount);
	ps.setFloat(20,TotalAmount);

	ps.setLong(21, AccID); 
	ps.setFloat(22,PrevExport);
	ps.setFloat(23,PrevImport);
	
	 i=ps.executeUpdate();
}


try (PreparedStatement ps = con.prepareStatement("Update mainmeter set InitialImport=?,InitialExport=? where  AccID=?");) {
	ps.setFloat(1, from);
	ps.setFloat(2, rate);
	ps.setLong(3, AccID); 
	
	 i=ps.executeUpdate();
}

try (PreparedStatement ps = con.prepareStatement("insert into BillingRevenue values(?,?,?,?)");) {
    ps.setString(1, Division);
    ps.setString(2, SubDivision);
    ps.setString(3,RRNo);
	ps.setLong(4, AccID); 
	
	 i=ps.executeUpdate(); 
}

 

if(i > 0)
{
	response.sendRedirect("logout.html");
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
}
}
%>