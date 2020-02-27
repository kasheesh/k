<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="utf-8">
<title>Gross Meter Bill</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style type="text/css">
  td,th {
    text-align:center;
  }
  .table2 table, th, td{
          border: 1px solid black;
  border-collapse: collapse;
  }
</style>
</head>


<body>
<form action="search.html">
<table class="table table-bordered table-sm ">
   <tbody>
    <tr >
      <td colspan="9"><center><img src="Resource/Img/bescom.png" height="50px" width="50"><span style="text-align:center;font-weight:bold;margin-left:32px">BANGALORE ELECTRICITY SUPPLY COMPANY LIMITED  </span><br><span style="margin-left:50px">(Wholly owned Government of Karnataka Undertaking)</span> <br><span style="text-align:center;font-weight:bold;margin-left:12px">SOLAR ROOFTOP CENTRALIZED BILLING CENTER, BANGALORE</span><br><span style="text-align:center;font-weight:bold;">GROSS METERING SRTPV BILL FOR THE MONTH OF SEPTEMBER 2019</span></center></td>
    </tr>

 
    <tr>
      <th rowspan="2">RR No</th>
      <th  rowspan="2" colspan="2" >Account ID/Consumer Id</th>
      <th colspan="3" >Billing Period</th>
      <th rowspan="2">Reading Date</th>
      <th  rowspan="2">Due Date</th>
      <th rowspan="2">Sub-Division</th>
  </tr>

  <tr>
    <th colspan="2">From</th>
    <th colspan="1">To</th>
  </tr>
  <tr>
    <td >${RRNo}</td>
    <td colspan="2">${AppNo}</td>
     <td colspan="2">${PrevReadingDate}</td>
    <td colspan="1">${PresReadingDate}</td>
     <td>${PresReadingDate}</td>
    <td>${DueDate}</td>
     <td>${SubDivision}</td>
</tr>
<tr><td colspan="9"></td></tr>
<tr>
   <th colspan="5">Name & Address</th>
    <th >Tariff</th>
     <th>SL in kw/Hp</th>
    <th >Installed  Solar capacity (in KWp)</th>
     <th>Subsidized or not</th>
    
</tr>
<tr>
  <td colspan="5">${Name}<br> ${Address}</td>
   <td>${Tariff}</td>
    <td>${SanctionLoad}</td>
     <td>${InstallCapacity}</td>
      <td>${Subsidised}</td>
       
</tr>
 <tr><th colspan="9" style="text-align: center;">Bi-directional Meter Readings                  
</th></tr> 
<tr><th rowspan="3">Description</th>
    <th colspan="4">Main Meter</th>
    <th colspan="4">Check Meter</th>
</tr>  
<tr>
  <th colspan="2">Export Energy</th>
  <th colspan="2">Import Energy</th>
  <th colspan="2">Export Energy</th>
  <th colspan="2">Import Energy</th>
</tr>
<tr>
  <th>MD</th>
  <th>KWh</th>
  <th>MD</th>
  <th>KWh</th>
  <th>MD</th>
  <th>KWh</th>
  <th>MD</th>
  <th>KWh</th>
</tr>
<tr>
  <th>Present Reading</th>
  <td rowspan="3">${mdPresent}</td>
  <td>${exportPresent}</td>
  <td rowspan="3">${mdImportMain}</td>
  <td>${importPresent}</td>
  <td rowspan="3">${mdExportCheck}</td>
  <td>${exportPresCheck}</td>
  <td rowspan="3">${mdImportCheck}</td>
  <td>${importPresCheck}</td>
</tr>
<tr>
  <th>Previous Reading</th>
  <td>${ExportReading}</td>
  <td>${ImportReading}</td>
  <td>${ExportCheck}</td>
  <td>${ImportCheck}</td>
 </tr>
 <tr>
   <th>Difference</th>
  <td>${MainMeterExportDifference}</td>
  <td>${MainMeterImportDifference}</td>
  <td>${CheckMeterExportDifference}</td>
  <td>${CheckMeterImportDiffernce}</td>
 </tr>
 <tr>
   <th>Meter Constant</th>
   <td>${MainMeterConstant}</td>
    <td>${MainMeterConstant}</td>
     <td>${MainMeterConstant}</td>
      <td>${MainMeterConstant}</td>
       <td>${CheckMeterConstant}</td>
        <td>${CheckMeterConstant}</td>
         <td>${CheckMeterConstant}</td>
          <td>${CheckMeterConstant}</td>
 </tr>
  <tr>
   <th>Consumption</th>
   <td>${ExportConsumtionMainMD}</td>
    <td>${ExportMainConsumption}</td>
     <td>${ImportConsumptionMainMD}</td>
      <td>${ImportMainConsumption}</td>
       <td>${ExportConsumptionCheckMD}</td>
        <td>${ExportCheckConsumption}</td>
         <td>${ImportConsumptionCheckMD}</td>
          <td>${ImportCheckConsumption}</td>
 </tr>
 <tr><th colspan="9" style="text-align: center;">Bill For Energy Purchase                 
</th></tr>
<tr><th rowspan="2" colspan="3"> Amount for Exported Energy as per BDM @ PPA Rate / APPC Rate in Rs.

</th>
<th colspan="2">Exported Energy in Units</th>
<th colspan="2">PPA Rate / APPC Rate in Rs.</th>
<th colspan="2"> Amount in Rs</th>
</tr>
<tr>
  <td colspan="2">${MainConsumption}</td>
   <td colspan="2">${PPATariff}</td>
    <td colspan="2">${ExportAmount}</td>
</tr>
<tr ><th rowspan="2" colspan="3">Amount for Imported Energy as per BDM @ higher of  PPA / APPC / Retail tariff in Rs.

</th>
<th colspan="2">Imported Energy in Units    </th>
<th colspan="2">Higher of PPA Rate or Retail Tariff in Rs.</th>
<th colspan="2"> Amount in Rs</th>
</tr>
<tr>
  <td colspan="2">
  ${ TotalImpCons}</td>
   <td colspan="2"> ${PPATariff} | ${SlabTariff} | ${AppcTariff}<br>
 
   </td>
    <td colspan="2">${ImportTotalAmount}</td>
</tr>
<tr>
  <th colspan="7">Total Payable Amount to Consumer</th>
  <td colspan="2">${SumAmount}</td>
</tr>
<tr>
  <th colspan="7">Excess Energy Accounted if MD recorded is more than installed capacity in Units </th>
  <td colspan="2">${ExcessCapacity}</td>
</tr>
<tr>
    <th colspan="9">PASSED FOR PAYMENT</th>
  </tr>

  <tr>
    <th colspan="9">SRTPV CENTRALIZED BILLING CENTER,CORPORATE OFFICE, BESCOM</th>
  </tr>

  <tr>
    <td colspan="2">Bill passed for </td>
    <td colspan="2">${SumAmount}</td>
    <td colspan="5">${abc} Rupees only</td>
  </tr>

  <tr>
    <td colspan="9"> <br><br>

        
       <pre><div class="sign">BPA(CBC,DSM)        MANAGER(CBC,DSM)          AGM(CBC,DSM)          AGM(I/A)</div></pre>
        
     </td>
  </tr>

</tbody>
</table>
<input type="hidden" name="email" value="${EmailID}">
<input type="hidden" name="totalAmount" value="${SumAmount}">
<input type="hidden" name="name" value="${Name}">
<input type="hidden" name="installCapacity" value="${InstallCapacity}">
<input type="hidden" name="AccountID" value="${AppNo}">


  <a href="FetchUserData?AccID=${AppNo}" style="color:black;font-weight:bold;margin-left: 550px;"><button type="button" class="btn btn-success" style="font-size:20px;" >EDIT</button></a>
</form>
<form action="save.jsp">
<input type="hidden" name="prevDate" value="${PrevReadingDate}">
<input type="hidden" name="PresDate" value="${PresReadingDate}">
<input type="hidden" name="DueDate" value="${DueDate}">
<input type="hidden" name="import" value="${importPresent}">
<input type="hidden" name="export" value="${exportPresent}">
<input type="hidden" name="MainimportMD" value="${mdImportMain}">
<input type="hidden" name="MainexportMD" value="${mdPresent}">
<input type="hidden" name="MainimportDifference" value="${MainMeterImportDifference}">
<input type="hidden" name="MainexportDifference" value="${MainMeterExportDifference}">
<input type="hidden" name="MainimportConsumption" value="${ImportMainConsumption}">
<input type="hidden" name="MainexportConsumption" value="${ExportMainConsumption}">

<input type="hidden" name="MainExpMDConsm" value="${ExportConsumtionMainMD}">
<input type="hidden" name="MainImpMDConsm" value="${ImportConsumptionMainMD}">
<input type="hidden" name="TotImportUnits" value="${ TotalImpCons}">
<input type="hidden" name="slabTariff" value="${SlabTariff} ">
<input type="hidden" name="ExportMainUnits" value="${MainConsumption}">
<input type="hidden" name="Tariff" value="${PPATariff}">

<input type="hidden" name="TotalExporAmount" value="${ExportAmount}">
<input type="hidden" name="TotalImportAmount" value="${ImportTotalAmount}">
<input type="hidden" name="TotalAmount" value="${SumAmount}">

<input type="hidden" name="Division" value="${Division}">
<input type="hidden" name="SubDivision" value="${SubDivision}">
<input type="hidden" name="RRNo" value="${RRNo}"> 
<input type="hidden" name="AccountID" value="${AppNo}">

<input type="hidden" name="PrevExport" value="${ExportReading}">
<input type="hidden" name="PrevImport" value="${ImportReading}">

   <button type="submit" value="Submit" class="btn btn-success" style="margin-left: 650px;margin-top:-68px;font-size:20px">SAVE</button>
</form>
</body>
</html>                            