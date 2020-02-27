<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <title></title>
  <style type="text/css">
  
    th,td
    {
      text-align: center;
      font-size: 13px;
      font-family: "Times New Roman";
    }

    .address{
    text-align: left;
    font-family: "Times New Roman";

}   
.payable{
	text-align: left;
	font-size: 15px;
	font-family: "Times New Roman";
}

    .address2{
    text-align: center;
    margin-top: 44px;
    font-family: "Times New Roman";

}   
 .sign{
 	 font-family: "Times New Roman";
 	 font-size: 13px;

 }


  </style>
  <script>
	function printContent(e1)
	{
		var restorepage =document.body.innerHTML;
		var printcontent=document.getElementById(e1).innerHTML;
		document.body.innerHTML=printcontent;
		window.print();
		document.body.innerHTML=restorepage;
	}
	</script>
</head>
<body>

<div id="div1">
 <b>  
<form>
<table class="table table-bordered table-sm" >
 <tr>

  <td colspan="9" >
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOLuQdsjJwLw-TX89YLL4hcTy4Wr7S7iPxga6KOxBTY3s14MN2"  width="50" height="50">
    <b>BANGALORE ELECTRICITY SUPPLY COMPANY LIMITED </b><br>
        (Wholly owned Government of Karnataka Undertaking)<br>
    <b>CORPORATE OFFICE SOLAR ROOF TOP CENTRALIZED BILLING CENTER BANGALORE</b><br>
  </td>
 </tr>

  <tr>
    <th rowspan="2" >RR No</th>
    <th rowspan="2" >Account Id/<br>Consumer Id</th>
    <th colspan ="3">Billing Period</th>
    <th rowspan="2">Reading Date</th>
    <th rowspan="2" colspan="2">Due Date</th>
    <th rowspan="2">Sub-Division</th>
  </tr>

  <tr>
    <th>From</th>
    <th colspan="2">To</th>
  </tr>

  <tr>
    <td >${RRNo}</td>
    <td >${AppNo}</td>
    <td>01-07-2019</td>
    <td colspan="2">02-08-2019</td>
    <%java.text.DateFormat df2 = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
    <td><%= df2.format(new java.util.Date()) %></td>
    <td colspan="2">31 August 2019</td>
    <td>${SubDivision}</td>
  </tr>

  <tr>
    <td colspan="9"></td>
  </tr>
  <tr>
    <th colspan="1">Name & address</th>
     <th>Tariff</th>
      <th>SL In KW/HP</th>
       <th>Installed Capacity(in KWp)</th>
        <th colspan="2">PPA approval Date</th>
         <th colspan="2">PPA enter Date</th>
          <th>PPA Period</th>
  </tr>

   <tr>
    <td rowspan="3" colspan="1" align="right">
<div class = "address">
    ${Name}<br> ${Address}
</div>

</td>
    <td>${Tariff}</td>
    <td>${SanctionLoad}</td>
    <td>${InstallCapacity}</td>
    <td colspan="2">${PPA_ApprovalDate}</td>
    <td colspan="2">${PPA_EnterDate}</td>
    <td>${Tariff}</td>
  </tr>

   <tr>
    <th colspan="3">Synchronized Date</th>
    <th colspan="2">PPA/SPPA Tariff</th>
    <th colspan="3">Subsidized or not</th>
  </tr>

   <tr>
    <td colspan="3">${Syncronised}</td>
    <td colspan="2">${PPATariff}</td>
    <td colspan="3">${Subsidised}</td>
  </tr>

   <tr>
    <td colspan="9"></td>
  </tr>

   <tr>
    <th colspan="9">BILLING DETAILS</th>
  </tr>

   <tr>
    <th colspan="1" >Expected generation per day <br>per KWp in units</th>
    <th colspan="3">Install Capacity</th>
    <th colspan="2">No. of days</th>
    <th colspan="3">Total Expected generation</th>
  </tr>

   <tr>
    <td colspan="1" >abc</td>
    <td colspan="3">abc</td>
    <td colspan="2">abc</td>
    <td colspan="3">abc</td>
  </tr>

  <tr>
    <th rowspan="4"> <div class = "address2">Description</div></th>
    <th colspan="8">Bi-Directional Meter(BDM)</th>
  </tr>

  <tr>
    <th colspan="4">Main Meter</th>
    <th colspan="4">Check Meter</th>
  </tr>

  <tr>
    <th colspan="2">Energy Export</th>
    <th colspan="2">Energy Import</th>
    <th colspan="2">Energy Export</th>
    <th colspan="2">Energy Import</th>
  </tr>

   <tr>
    <th >MD </th>
    <th >KWH</th>
    <th >MD </th>
    <th >KWH</th>
    <th >MD</th>
    <th >KWH</th>
    <th >MD</th>
    <th >KWH</th>
  </tr>

   <tr>
    <th > <div class = "address">Present Reading</div> </th>
    <td rowspan="3" >${mdPresent}</td>
    <td>${exportPresent}</td>
    <td rowspan="3" >${mdPresent}</td>
    <td>${importPresent}</td>
    <td rowspan="3" >${mdPresent}</td>
    <td></td>
    <td rowspan="3" >${mdPresent}</td>
    <td></td>
  </tr>

  
   <tr>
    <th > <div class = "address">Previous Reading </div></th>
    <td>${ExportReading}</td>
    <td>${ImportReading}</td>
    <td>a</td>
    <td>a</td>
  </tr>

   <tr>
    <th ><div class = "address">Difference</div> </th>
    <td>${DifferenceExport}</td>
    <td>${DifferenceImport}</td>
    <td>a</td>
    <td>a</td>
  </tr>

  <tr>
    <th> <div class = "address">Meter Constant</div></th>
    <td>${MeterConstant}</td>
    <td>${MeterConstant}</td>
    <td>${MeterConstant}</td>
    <td>${MeterConstant}</td>
    <td>${MeterConstant}</td>
    <td>${MeterConstant}</td>
    <td>${MeterConstant}</td>
    <td>${MeterConstant}</td>
  </tr>

   <tr>
    <th><div class = "address">Consumption</div></th>
    <td>${MDExportConsumption}</td>
    <td>${ExportConsumption}</td>
    <td>${MDImportConsumption}</td>
    <td>${ImportConsumption}</td>
    <td>${a1}</td>
    <td>5</td>
    <td>${a1}</td>
    <td>5</td>
  </tr>

  <tr>
    <td colspan="9"></td>
  </tr>

  <tr>
    <th colspan="9"> BILL FOR ENERGY PURCHASE</th>
  </tr>

  <tr>
    <th colspan="2">
      <div class = "address">
    1. Solar Install Capacity in KWp</th></div>
    <td colspan="5"></td>
    <td colspan="2">${InstallCapacity}</td>
  </tr>

   <tr>
    <th colspan="2">
      <div class = "address">2. Solar Sanctioned Capacity in KWp</div></th>
    <td colspan="5">Least of (SL/CD*1.5-T) or SI(1)</td>
    <td colspan="2">${SanctionLoad}</td>
  </tr>

   <tr>
    <th colspan="2">
  <div class = "address">
  3. Recorded Capacity in KWp </div></th>
    <td colspan="5"></td>
    <td colspan="2">${mdPresent}</td>
  </tr>

   <tr>
    <th colspan="2"><div class = "address">  4. Excess Capacity,if any in KWp</div></th>
    
    <td colspan="5">SI(3)-SI(2)</td>
    <td colspan="2">${excessCapacity}</td>
  </tr>

   <tr>
    <th colspan="2">
      <div class = "address">5. Export Energy as per BDM in Units</div></th>
    <td colspan="5"></td>
    <td colspan="2">${ExportUnit }</td>
  </tr>

   <tr>
    <th colspan="2">
    <div class = "address"> 6. Prorata Export Energy for Solar Sanctioned Capacity in Units</div></th>
    <td colspan="5">SI(5)*SI(2)/SI(3)</td>
    <td colspan="2">${Prodata1}</td>
  </tr>

   <tr>
    <th colspan="2">
    	<div class = "address">
    7. prorata Export Energy for Excess Solar Capacity in Units</div></th>
    <td colspan="5">SI(5)*SI(4)/SI(3)</td>
    <td colspan="2">${Prodata2}</td>
  </tr>

   <tr>
    <th colspan="2">
    	<div class = "address">8. Import Energy as Per BDM units</div></th>
    <td colspan="5"></td>
    <td colspan="2">${ImportConsumption}</td>
  </tr>

   <tr>
    <th colspan="2">
   <div class = "address"> 9.Net Export Energy as per BDM in units</div></th>
    <td colspan="5"></td>
    <td colspan="2"></td>
  </tr>

  <tr>
    <td colspan="9"></td>
  </tr>

  <tr>
    <th colspan="9">BILL</th>
  </tr>

  <tr>
    <th rowspan="2" colspan="3"><div class = "address">Amount for Export as per BDM @ PPA <BR> Rate/APPC Rate in Rs</div></th>
    <th colspan="2">Export Energy In Unit</th>
    <th colspan="2"> PPA Rate /APPc Rate in Rs</th>
    <th colspan="2">Amounts</th>
  </tr>

  <tr>
    <td colspan="2"> 22</td>
    <td colspan="2">22</td>
    <td colspan="2">22 </td>
  </tr>

  <tr>
    <th rowspan="2" colspan="3"><div class = "address">Amount for Import as per BDM @ PPA<br> Rate / Higher of Bescom Rate in Rs</div></th>
    <th colspan="2">Import Energy In Unit</th>
    <th colspan="2"> PPA Rate /Higher of Bescom <br>Rate in Rs</th>
    <th colspan="2">Amounts</th>
  </tr>

  <tr>
    <td colspan="2"> ${ImportConsumption}</td>
    <td colspan="2">${ImportPPARate}</td>
    <td colspan="2">${ImportTotalAmount}</td>
  </tr>

  <tr>
    <th colspan="3"><div class = "payable">10. Total Payable</div></th>
    <td colspan="7">${TotalAmount }</td>
  </tr>

  <tr>
    <td colspan="9">NOTE: Bill is prepared based on the reading issued by the sub-division  </td>
  </tr>

  <tr>
    <th colspan="5">NET PAYABLE TO CONSUMER</th>
    <td colspan="4">0</td>
  </tr>
<tr>
    <th colspan="5">HEAD OF ACOUNT 2020</th>
    <th colspan="4">LOCATION CODE 2020</th>
  </tr>

  <tr>
    <th colspan="9">PASSED FOR PAYMENT</th>
  </tr>

  <tr>
    <th colspan="9">SRTPV CENTRALIZED BILLING CENTER,CORPORATE OFFICE, BESCOM</th>
  </tr>

  <tr>
    <td colspan="2">Bill passed for </td>
    <td colspan="2">00.0</td>
    <td colspan="5">In Words</td>
  </tr>

  <tr>
    <td colspan="9">Please Arrange RTGS transfer in flavour of  M/S V.L.S EDUCATION TTRUST bearing JANATHA SEVA CO-OPERATIVE BANK Ac No.0041401000330999 IFS <br><br><br>

	    	
	    	<pre><div class="sign">BPA(CBC,DSM)				MANAGER(CBC,DSM)					AGM(CBC,DSM)					AGM(I/A)</div></pre>
        
     </td>
  </tr>
   
   
   	 
 

  
</table>

</form>
</b>
</div>
                              
<button type="button" class="btn btn-success" onclick="printContent('div1')" style="margin-left: 600px;">PRINT</button> 



</body>
</html>

