package solar;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GrossCalculation
 * @param <A>
 */
@WebServlet("/GrossCalculation")
public class GrossCalculation<A> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GrossCalculation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();

		ImportItem one=ImportDB.getTariffLT2aiFirst();
		ImportItem two=ImportDB.getTariffLT2aiSecond();
		ImportItem third=ImportDB.getTariffLT2aiThird();
		ImportItem Fourth=ImportDB.getTariffLT2aiFourth();
		ImportItem Fifth=ImportDB.getTariffLT2aiFifth();
		ImportItem Sixth=ImportDB.getTariffLT2aiSixth();
		
		/* slab wise tariff LT2aii */
		
		ImportItem LT2aiione=ImportDB.getTariffLT2aiiFirst();
		ImportItem LT2aiitwo=ImportDB.getTariffLT2aiiSecond();
		ImportItem LT2aiithird=ImportDB.getTariffLT2aiiThird();
		ImportItem LT2aiiFourth=ImportDB.getTariffLT2aiiFourth();
		ImportItem LT2aiiFifth=ImportDB.getTariffLT2aiiFifth();
		
		/* slab wise tariff LT-2(b)(i) */
		
		ImportItem LT2bione=ImportDB.getTariffLT2bione();
		ImportItem LT2bitwo=ImportDB.getTariffLT2bitwo();
		
		/* slab wise tariff LT-2(b)(ii) */
		
		ImportItem LT2biione=ImportDB.getTariffLT2biione();
		ImportItem LT2biitwo=ImportDB.getTariffLT2biitwo();
		
		/* slab wise data for HT-2(c)(i)  */
		
		ImportItem HT2cione=ImportDB.getTariffHT2cione();
		ImportItem HT2citwo=ImportDB.getTariffHT2citwo();
		
	   /* slab wise data for HT-2(c)(ii) */
		
		ImportItem HT2ciione=ImportDB.getTariffHT2ciione();
		ImportItem HT2ciitwo=ImportDB.getTariffHT2ciitwo();
		
		/* slab wise data for HT-4 */
		
		ImportItem HT4=ImportDB.getTariffHT4();
		
try {
			
			
	response.setContentType("text/html");
	//PrintWriter out=response.getWriter();
	
	String imp1=request.getParameter("importPresMain");
	float importPresMain=Float.parseFloat(imp1);
	
	String md1=request.getParameter("mdImportMain");
	float mdImportMain=Float.parseFloat(md1);
    
	String exp1=request.getParameter("exportPresMain");
	float exportPresMain=Float.parseFloat(exp1);
    
	String md2=request.getParameter("mdExportMain");
	float mdExportMain=Float.parseFloat(md2);	

/* check Meter Calculation */
	
	String checkimp1=request.getParameter("importCheck");
	float importPresCheck=Float.parseFloat(checkimp1);
            
	String mdcheck1=request.getParameter("mdImportCheck");
	float mdImportCheck=Float.parseFloat(mdcheck1);
	
	String checkexp1=request.getParameter("exportCheck");
	float exportPresCheck=Float.parseFloat(checkexp1);
    
	String mdcheck2=request.getParameter("mdExportCheck");
	float mdExportCheck=Float.parseFloat(mdcheck2);
	
	String MainPresReadingDate = request.getParameter("MainMTDate");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Calendar cal = Calendar.getInstance();
	try{
		  //Setting the date to the given date
		  cal.setTime(sdf.parse(MainPresReadingDate));
		}catch(ParseException e){
		e.printStackTrace();
		}
	cal.add(Calendar.DAY_OF_MONTH, 30);
	String newDate = sdf.format(cal.getTime()); 
            
	
			
			 HttpSession session=request.getSession(false);
			 
			 long AccID=(long)session.getAttribute("AccID");
			 String RRNo=(String)session.getAttribute("RRNo");
			 String Name=(String)session.getAttribute("Name");
			 long PhoneNo=(long)session.getAttribute("PhoneNo");
			 String EmailID=(String)session.getAttribute("EmailID");
			 String Address=(String)session.getAttribute("Address");
			 String Tariff=(String)session.getAttribute("Tariff");
			 String SubDivision=(String)session.getAttribute("SubDivision");
			 float SanctionLoad=(float)session.getAttribute("SanctionLoad");
			 String Division=(String)session.getAttribute("Division");
			  
			  
			 String TypeOfMeter=(String)session.getAttribute("TypeOfMeter");
			 float InstallCapacity=(float)session.getAttribute("InstallCapacity");
			 String Subsidy=(String)session.getAttribute("Subsidy");
			 String AppRegisterDate=(String)session.getAttribute("AppRegisterDate");
			 String PPAEneterDate=(String)session.getAttribute("PPAEneterDate");
			 String PPAApprovalDate=(String)session.getAttribute("PPAApprovalDate"); 
			 String CommissionDate=(String)session.getAttribute("CommissionDate"); 
			 float PPATariff=(float)session.getAttribute("PPATariff");
			 float APPCTariff=(float)session.getAttribute("APPCTariff");
			 float MainMeterConstant=(float)session.getAttribute("MainMeterConstant");
			 float CheckMeterConstant=(float)session.getAttribute("CheckMeterConstant");
			 String PrevReadingDate=(String)session.getAttribute("ReadingDate");
			 
			 
			 
			 float ImportPrevMain=(float)session.getAttribute("MainImpReading");
			 float ExportPrevMain=(float)session.getAttribute("MainExpReading");
			 float  ImportCheck=(float)session.getAttribute("CheckImpReading");
			 float  ExportCheck=(float)session.getAttribute("CheckExpReading");
			 float  MDMain=(float)session.getAttribute("MainExpMD");
			 float  MDCheck=(float)session.getAttribute("CheckExpMD");
			 
			 
			 
		
		    
		     
		     
		     /* Difference Calculation */
		     
		     float MainMeterImportDifference = importPresMain -ImportPrevMain;
		     float MainMeterExportDifference = exportPresMain - ExportPrevMain;
		     float CheckMeterImportDiffernce = importPresCheck - ImportCheck;
		     float CheckMeterExportDifference = exportPresCheck - ExportCheck; 
		     
		     
		     /* Consumption Calculation of MD */
		     float ExportConsumtionMainMD = MainMeterConstant * mdExportMain ;
		     float ImportConsumptionMainMD = MainMeterConstant * mdImportMain;  
		     
		     float ExportConsumptionCheckMD = CheckMeterConstant * mdExportCheck;
		     float ImportConsumptionCheckMD = CheckMeterConstant * mdImportCheck;
		     
		     
		     /* Consumption of Export And Import Units */
		     
		     float ImportMainConsumption = MainMeterConstant * MainMeterImportDifference ;
		     float ExportMainConsumption = MainMeterConstant * MainMeterExportDifference ;
		     
		     float ImportCheckConsumption = CheckMeterConstant * CheckMeterImportDiffernce;
		     float ExportCheckConsumption = CheckMeterConstant * CheckMeterExportDifference;
		     
		     /*Export Amount Calculation */
		     float ExportAmount=0;
		     float ProDataInstallCapacity = 0;
		     float ExcessCapacity = 0;
		     float MainConsumption = 0;
		     float Consumption = 0;
		    
		     
		     /* BOTH MAIN AND CHECK METER EXPORT CALCULATION */
		     
		     if(importPresMain!=0 && exportPresMain!=0 )
		     {
		    	 
		    /* MAIN METER CALCULATION */
		     if(mdExportMain<=InstallCapacity)
		     {
		     MainConsumption =  ExportMainConsumption;
		     ExportAmount = ExportMainConsumption * PPATariff ;
		     }
		     else
		     {
		    	 
		    	 ProDataInstallCapacity = (InstallCapacity/mdExportMain)*ExportMainConsumption;
		    	  ExcessCapacity = ((mdExportMain-InstallCapacity)/mdExportMain)*ExportMainConsumption;
		    	  MainConsumption = ProDataInstallCapacity ;
		    	 ExportAmount = ProDataInstallCapacity * PPATariff;
		     }
		   
		     }
		     else
		     {
		    	 
		    	 if(mdExportCheck<=InstallCapacity)
		    	 {
		    		 MainConsumption = ExportCheckConsumption;
		    		 ExportAmount = ExportCheckConsumption*PPATariff;  
		    	 }
		    	 else
		    	 {
		    		 ProDataInstallCapacity = (InstallCapacity/mdExportCheck)*ExportCheckConsumption;
		    		 ExcessCapacity = ((mdExportCheck-InstallCapacity)/mdExportCheck)*ExportCheckConsumption;
		    		  MainConsumption =  ProDataInstallCapacity;
		    		  ExportAmount = ProDataInstallCapacity * PPATariff;
		    		  
		    	 }
		    	 
		     }
		     
		     
		     
		     /* IMPORT CALCULATION */
		     float ImportTotalAmount=0;
		     float ImportAmount = 0;
		     float APPCAmount = ImportMainConsumption  * APPCTariff;
		     float NormalAmount = ImportMainConsumption * PPATariff;
		     float TotalImpCons = 0;
		     float SlabTariff=0;
		     /* CHECK THE ABC */
		     
		     if(importPresMain!=0&&exportPresMain!=0)
		     {
		     
		     if(Tariff.toUpperCase().equals("LT2(A)(I)") || Tariff.toUpperCase().equals("LT-2(A)(I)"))
		     {
		    	 if(ImportMainConsumption >= one.getFrom1() && ImportMainConsumption <=one.getTo1() )
		            {
		            	ImportAmount = ImportMainConsumption * one.getRate();
		            	SlabTariff = one.getRate();
		            	
		            }
		            else if(ImportMainConsumption >=two.getFrom1() && ImportMainConsumption <= two.getTo1() )
		            {
		            	ImportAmount = (30*one.getRate()+(ImportMainConsumption-30) *two.getRate());
		            	SlabTariff = two.getRate();
		            }
		            else if(ImportMainConsumption >=third.getFrom1() && ImportMainConsumption <= third.getTo1() )
		            {
		            	ImportAmount = (30*one.getRate()+70*two.getRate()+(ImportMainConsumption-30-70) *third.getRate());
		            	SlabTariff = third.getRate();
		            }
		            else if(ImportMainConsumption >= Fourth.getFrom1() && ImportMainConsumption <= Fourth.getTo1() )
		            {
		            	ImportAmount = (30*one.getRate()+70*two.getRate()+100*third.getRate()+(ImportMainConsumption-30-70-100) * Fourth.getRate());
		            	SlabTariff = Fourth.getRate();
		            }
		            else if(ImportMainConsumption >= Fifth.getFrom1() && ImportMainConsumption <= Fifth.getTo1() )
		            {
		            	ImportAmount =  (30*one.getRate()+70*two.getRate()+100*third.getRate()+100*Fourth.getRate()+(ImportMainConsumption-30-70-100-100) *Fifth.getRate());
		            	SlabTariff = Fifth.getRate();
		            }
		            else if(ImportMainConsumption >=Sixth.getFrom1())
		            {
		            	ImportAmount = (float)(30*one.getRate()+70*two.getRate()+100*third.getRate()+100*Fourth.getRate()+100*Fifth.getRate()+(ImportMainConsumption-30-70-100-100-100) * Sixth.getRate());
		            	SlabTariff = Sixth.getRate();
		            }
		     }
		     
		     else if(Tariff.toUpperCase().equals("LT2(A)(II)") || Tariff.toUpperCase().equals("LT-2(A)(II)"))
		     {
		    	 if(ImportMainConsumption >= LT2aiione.getFrom1() && ImportMainConsumption <= LT2aiione.getTo1() )
		            {
		            	ImportAmount = ImportMainConsumption * LT2aiione.getRate();
		            	SlabTariff = LT2aiione.getRate();
		            }
		            else if(ImportMainConsumption >=LT2aiitwo.getFrom1() && ImportMainConsumption <= LT2aiitwo.getTo1() )
		            {
		            	ImportAmount = (30*LT2aiione.getRate()+( ImportMainConsumption-30) *LT2aiitwo.getRate());
		            	SlabTariff = LT2aiitwo.getRate();
		            }
		            else if(ImportMainConsumption >=LT2aiithird.getFrom1() && ImportMainConsumption <= LT2aiithird.getTo1() )
		            {
		            	ImportAmount = (30*LT2aiione.getRate()+70*LT2aiitwo.getRate()+( ImportMainConsumption-30-70) *LT2aiithird.getRate());
		            	SlabTariff = LT2aiithird.getRate();
		            }
		            else if(ImportMainConsumption >= LT2aiiFourth.getFrom1() && ImportMainConsumption <= LT2aiiFourth.getTo1() )
		            {
		            	ImportAmount = (30*LT2aiione.getRate()+70*LT2aiitwo.getRate()+100*LT2aiithird.getRate()+( ImportMainConsumption-30-70-100) * LT2aiiFourth.getRate());
		            	SlabTariff = LT2aiiFourth.getRate();
		            }
		            else if(ImportMainConsumption >= LT2aiiFifth.getFrom1())
		            {
		            	ImportAmount = (float)(30*LT2aiione.getRate()+70*LT2aiitwo.getRate()+100*LT2aiithird.getRate()+100*LT2aiiFourth.getRate()+( ImportMainConsumption-30-70-100-100) *LT2aiiFifth.getRate());
		            	SlabTariff = LT2aiiFifth.getRate();
		            }
		     }
		     
		     else if(Tariff.toUpperCase().equals("LT2(B)(I)") || Tariff.toUpperCase().equals("LT-2(B)(I)"))
		     {
		    	 if(ImportMainConsumption >= LT2bione.getFrom1() && ImportMainConsumption <= LT2bione.getTo1() )
		            {
		            	ImportAmount = ImportMainConsumption * LT2bione.getRate();
		            	SlabTariff =  LT2bione.getRate();
		            }
		            else if(ImportMainConsumption >=LT2bitwo.getFrom1() )
		            {
		            	ImportAmount = (float) (200*LT2bione.getRate()+(ImportMainConsumption-200)*LT2bitwo.getRate());
		            	SlabTariff = LT2bitwo.getRate();
		            } 
		     }
		     
		     else if(Tariff.toUpperCase().equals("LT2(B)(II)") || Tariff.toUpperCase().equals("LT-2(B)(II)"))
		     {
		    	  if(ImportMainConsumption >= LT2biione.getFrom1() && ImportMainConsumption <= LT2biione.getTo1())
				     {
				    	 ImportAmount =  ImportMainConsumption * LT2biione.getRate();
				    	 SlabTariff = LT2biione.getRate();
				     }
				     else if(ImportMainConsumption>=LT2biitwo.getFrom1())
				     {
				    	 ImportAmount = (200*LT2biione.getRate()+(ImportMainConsumption-200) * LT2biitwo.getRate());
				    	 SlabTariff = LT2biitwo.getRate();
				     } 
		     }
		     
		     else if(Tariff.toUpperCase().equals("HT2(C)(I)") || Tariff.toUpperCase().equals("HT-2(C)(I)"))
		     {
		    	  if(ImportMainConsumption >= HT2cione.getFrom1() && ImportMainConsumption <= HT2cione.getTo1())
				     {
				    	 ImportAmount =  ImportMainConsumption * HT2cione.getRate();
				    	 SlabTariff = HT2cione.getRate();
				     }
				     else if(ImportMainConsumption>=HT2citwo.getFrom1())
				     {
				    	 ImportAmount =(100000*HT2cione.getRate()+ (ImportMainConsumption-100000) * HT2citwo.getRate());
				    	 SlabTariff = HT2citwo.getRate();
				     } 
		     }
		     else if(Tariff.toUpperCase().equals("HT2(C)(II)") || Tariff.toUpperCase().equals("HT-2(C)(II)"))
		     {
		    	   if(ImportMainConsumption >= HT2ciione.getFrom1() && ImportMainConsumption <= HT2ciione.getTo1())
				     {
				    	 ImportAmount =  ImportMainConsumption * HT2ciione.getRate();
				    	 SlabTariff = HT2ciione.getRate();
				     }
				     else if(ImportMainConsumption>=HT2ciitwo.getFrom1())
				     {
				    	 ImportAmount = (100000*HT2ciione.getRate()+(ImportMainConsumption-100000) * HT2ciitwo.getRate());
				    	 SlabTariff = HT2ciitwo.getRate();
				     } 
		     }  
			   
		     else if(Tariff.toUpperCase().equals("HT4") || Tariff.toUpperCase().equals("HT4"))
		     {
		    	 if(ImportMainConsumption>=HT4.getFrom1())
			     {
			    	 ImportAmount = ImportMainConsumption * HT4.getRate();
			    	 SlabTariff = HT4.getRate();
			     }  
		     }
		     
		     }/*main meter import slab wise calculation is close */
		     else
		     {  /* check meter  slab wise calculation start   */ 
		    	 if(Tariff.toUpperCase().equals("LT2(A)(I)") || Tariff.toUpperCase().equals("LT-2(A)(I)"))
			     {
			    	 if(ImportCheckConsumption >= one.getFrom1() && ImportCheckConsumption <=one.getTo1() )
			            {
			            	ImportAmount = ImportCheckConsumption* one.getRate();
			            }
			            else if(ImportCheckConsumption >=two.getFrom1() && ImportCheckConsumption<= two.getTo1() )
			            {
			            	ImportAmount = (30*one.getRate()+(ImportCheckConsumption-30) *two.getRate());
			            }
			            else if(ImportCheckConsumption >=third.getFrom1() && ImportCheckConsumption <= third.getTo1() )
			            {
			            	ImportAmount = (30*one.getRate()+70*two.getRate()+(ImportCheckConsumption-30-70) *third.getRate());
			            }
			            else if(ImportCheckConsumption >= Fourth.getFrom1() && ImportCheckConsumption <= Fourth.getTo1() )
			            {
			            	ImportAmount = (30*one.getRate()+70*two.getRate()+100*third.getRate()+(ImportCheckConsumption-30-70-100) * Fourth.getRate());
			            }
			            else if(ImportCheckConsumption >= Fifth.getFrom1() && ImportCheckConsumption <= Fifth.getTo1() )
			            {
			            	ImportAmount =  (30*one.getRate()+70*two.getRate()+100*third.getRate()+100*Fourth.getRate()+(ImportCheckConsumption-30-70-100-100) *Fifth.getRate());
			            }
			            else if(ImportCheckConsumption >=Sixth.getFrom1())
			            {
			            	ImportAmount = (float)(30*one.getRate()+70*two.getRate()+100*third.getRate()+100*Fourth.getRate()+100*Fifth.getRate()+(ImportCheckConsumption-30-70-100-100-100) * Sixth.getRate());
			            }
			     }
			     
			     else if(Tariff.toUpperCase().equals("LT2(A)(II)") || Tariff.toUpperCase().equals("LT-2(A)(II)"))
			     {
			    	 if(ImportCheckConsumption >= LT2aiione.getFrom1() && ImportCheckConsumption <= LT2aiione.getTo1() )
			            {
			            	ImportAmount = ImportCheckConsumption * LT2aiione.getRate();
			            }
			            else if(ImportCheckConsumption >=LT2aiitwo.getFrom1() && ImportCheckConsumption <= LT2aiitwo.getTo1() )
			            {
			            	ImportAmount = (30*LT2aiione.getRate()+( ImportCheckConsumption-30) *LT2aiitwo.getRate());
			            }
			            else if(ImportCheckConsumption >=LT2aiithird.getFrom1() && ImportCheckConsumption <= LT2aiithird.getTo1() )
			            {
			            	ImportAmount = (30*LT2aiione.getRate()+70*LT2aiitwo.getRate()+( ImportCheckConsumption-30-70) *LT2aiithird.getRate());
			            }
			            else if(ImportCheckConsumption >= LT2aiiFourth.getFrom1() && ImportCheckConsumption <= LT2aiiFourth.getTo1() )
			            {
			            	ImportAmount = (30*LT2aiione.getRate()+70*LT2aiitwo.getRate()+100*LT2aiithird.getRate()+( ImportCheckConsumption-30-70-100) * LT2aiiFourth.getRate());
			            }
			            else if(ImportCheckConsumption >= LT2aiiFifth.getFrom1())
			            {
			            	ImportAmount = (float)(30*LT2aiione.getRate()+70*LT2aiitwo.getRate()+100*LT2aiithird.getRate()+100*LT2aiiFourth.getRate()+( ImportCheckConsumption-30-70-100-100) *LT2aiiFifth.getRate());
			            }
			     }
			     
			     else if(Tariff.toUpperCase().equals("LT2(B)(I)") || Tariff.toUpperCase().equals("LT-2(B)(I)"))
			     {
			    	 if(ImportCheckConsumption >= LT2bione.getFrom1() && ImportCheckConsumption <= LT2bione.getTo1() )
			            {
			            	ImportAmount = ImportCheckConsumption * LT2bione.getRate();
			            }
			            else if(ImportCheckConsumption >=LT2bitwo.getFrom1() )
			            {
			            	ImportAmount = (float) (200*LT2bione.getRate()+(ImportCheckConsumption-200)*LT2bitwo.getRate());
			            } 
			     }
			     
			     else if(Tariff.toUpperCase().equals("LT2(B)(II)") || Tariff.toUpperCase().equals("LT-2(B)(II)"))
			     {
			    	  if(ImportCheckConsumption >= LT2biione.getFrom1() && ImportCheckConsumption <= LT2biione.getTo1())
					     {
					    	 ImportAmount =  ImportCheckConsumption * LT2biione.getRate();
					     }
					     else if(ImportCheckConsumption >=LT2biitwo.getFrom1())
					     {
					    	 ImportAmount = (200*LT2biione.getRate()+(ImportCheckConsumption-200) * LT2biitwo.getRate());
					     } 
			     }
			     
			     else if(Tariff.toUpperCase().equals("HT2(C)(I)") || Tariff.toUpperCase().equals("HT-2(C)(I)"))
			     {
			    	  if(ImportCheckConsumption >= HT2cione.getFrom1() && ImportCheckConsumption <= HT2cione.getTo1())
					     {
					    	 ImportAmount =  ImportCheckConsumption * HT2cione.getRate();
					     }
					     else if(ImportCheckConsumption >=HT2citwo.getFrom1())
					     {
					    	 ImportAmount =(100000*HT2cione.getRate()+ (ImportCheckConsumption-100000) * HT2citwo.getRate());
					     } 
			     }
			     else if(Tariff.toUpperCase().equals("HT2(C)(II)") || Tariff.toUpperCase().equals("HT-2(C)(II)"))
			     {
			    	   if(ImportCheckConsumption >= HT2ciione.getFrom1() && ImportCheckConsumption <= HT2ciione.getTo1())
					     {
					    	 ImportAmount =  ImportCheckConsumption * HT2ciione.getRate();
					     }
					     else if(ImportMainConsumption>=HT2ciitwo.getFrom1())
					     {
					    	 ImportAmount = (100000*HT2ciione.getRate()+(ImportCheckConsumption-100000) * HT2ciitwo.getRate());
					     } 
			     }  
				   
			     else if(Tariff.toUpperCase().equals("HT4") || Tariff.toUpperCase().equals("HT4"))
			     {
			    	 if(ImportCheckConsumption >=HT4.getFrom1())
				     {
				    	 ImportAmount = ImportCheckConsumption * HT4.getRate();
				     }  
			     }
		     }
		     
		     
		     if(importPresMain!=0&&exportPresMain!=0)
		     {
		    	 TotalImpCons = ImportMainConsumption;
		     }
		     else
		     {
		    	 TotalImpCons = ImportCheckConsumption;
		    	 
		     }
		    
		     
		     
			     /*Maximum Three import values */
		     
		     ImportTotalAmount = Math.max(ImportAmount, Math.max(APPCAmount,NormalAmount)) ;
		     
		     float SumAmount = ExportAmount-ImportTotalAmount;
		     
		     int Number = (int) SumAmount;
		     
		     String abc = NumberToWord.convert(Number);

		   
		     
		     
		     request.setAttribute("importPresent",importPresMain);
		     request.setAttribute("mdImportMain",mdImportMain);
	         request.setAttribute("exportPresent", exportPresMain);
	         request.setAttribute("mdPresent", mdExportMain);
	         
	         request.setAttribute("importPresCheck",importPresCheck);
	         request.setAttribute("mdImportCheck",mdImportCheck);
	         request.setAttribute("exportPresCheck",exportPresCheck);
	         
	         request.setAttribute("mdExportCheck",mdExportCheck);
	          
		
             request.setAttribute("PrevReadingDate",PrevReadingDate);
	         request.setAttribute("PresReadingDate",MainPresReadingDate);
	         request.setAttribute("DueDate",newDate);
			
			 
	   
	          request.setAttribute("AppNo",AccID);
	          request.setAttribute("RRNo", RRNo);
	          request.setAttribute("Name", Name);
	          request.setAttribute("PhoneNo",PhoneNo);
	          request.setAttribute("EmailID",EmailID);
	          request.setAttribute("Address", Address);
	          request.setAttribute("Tariff",Tariff);
	          request.setAttribute("Division", Division); 
	          request.setAttribute("SubDivision", SubDivision);
	          request.setAttribute("SanctionLoad",  SanctionLoad);
	          request.setAttribute("InstallCapacity",InstallCapacity);
	          
	          request.setAttribute("PPA_ApprovalDate",PPAApprovalDate);
	          request.setAttribute("PPA_EnterDate",PPAEneterDate);
	          request.setAttribute("Syncronised",CommissionDate);
	          request.setAttribute("Subsidised", Subsidy);
	          request.setAttribute("PPATariff",PPATariff);
	          request.setAttribute("MainMeterConstant",MainMeterConstant);
	          request.setAttribute("CheckMeterConstant",CheckMeterConstant);
	              
	          request.setAttribute("MaximumDemand",MDMain);
	          request.setAttribute("ImportReading",ImportPrevMain);
	          request.setAttribute("ExportReading",ExportPrevMain);      
	          request.setAttribute("ImportCheck",ImportCheck);
	          request.setAttribute("ExportCheck",ExportCheck);
	          
	          
	  
	          request.setAttribute("MainMeterImportDifference",MainMeterImportDifference);
	          request.setAttribute("MainMeterExportDifference",MainMeterExportDifference);
	          request.setAttribute("CheckMeterImportDiffernce",CheckMeterImportDiffernce);
	          request.setAttribute("CheckMeterExportDifference",CheckMeterExportDifference);
	          
	          request.setAttribute("ExportConsumtionMainMD",ExportConsumtionMainMD);
	          request.setAttribute("ImportConsumptionMainMD",ImportConsumptionMainMD);
	          request.setAttribute("ExportConsumptionCheckMD",ExportConsumptionCheckMD);
	          request.setAttribute("ImportConsumptionCheckMD",ImportConsumptionCheckMD);
	      
	          request.setAttribute("ImportMainConsumption",ImportMainConsumption);
	          request.setAttribute("ExportMainConsumption",ExportMainConsumption);
	          request.setAttribute("ImportCheckConsumption",ImportCheckConsumption);
	          request.setAttribute("ExportCheckConsumption",ExportCheckConsumption);
	          
	          request.setAttribute("ExportAmount",ExportAmount);
	          request.setAttribute("ProDataInstallCapacity",ProDataInstallCapacity );
	          request.setAttribute("ExcessCapacity",ExcessCapacity);
	          request.setAttribute("MainConsumption",MainConsumption);
	          request.setAttribute("AppcTariff",APPCTariff);
	          request.setAttribute(" Consumption", Consumption);
	          request.setAttribute("ImportTotalAmount",ImportTotalAmount);
	          request.setAttribute("SlabTariff", SlabTariff);
	          request.setAttribute("TotalImpCons",TotalImpCons);
	          request.setAttribute("SumAmount", Math.round(SumAmount));
	          
	          
	          
	          request.setAttribute("ImportAmount", ImportAmount);
	          request.setAttribute("APPCAmount",APPCAmount);
	          request.setAttribute("NormalAmount", NormalAmount);
	          request.setAttribute("abc", abc);
	        
	        
	         
	          
	          //import data to display in bill.jsp page
	          
	       /*   
	          request.setAttribute("from1", one.getFrom1());
	          request.setAttribute("to1", one.getTo1());
	          request.setAttribute("rate1",one.getRate());
	          request.setAttribute("from2", two.getFrom1());
	          request.setAttribute("to2", two.getTo1());
	          request.setAttribute("rate2",two.getRate());
	          request.setAttribute("from3", third.getFrom1());
	          request.setAttribute("to3", third.getTo1());
	          request.setAttribute("rate3",third.getRate());
	          request.setAttribute("from4",Fourth.getFrom1());
	          request.setAttribute("to4",Fourth.getTo1());
	          request.setAttribute("rate4",Fourth.getRate()); */
	          
	          
	         
	      
	          
	      /*    request.setAttribute("diff1", diff1);
	          request.setAttribute("diff2",diff2);
	          request.setAttribute("a",a);
	          request.setAttribute("b",b);
	          request.setAttribute("a1",a1);
	          request.setAttribute("from1", one.getFrom1());
	          request.setAttribute("to1", one.getTo1());
	          request.setAttribute("rate", abc);
	          request.setAttribute("amount",  amount);
	         
	          request.setAttribute("TotalAmount", TotalAmount);*/
	
	        request.getRequestDispatcher("GrossMeterBill.jsp").forward(request, response);
	    /*	out.println("the value is "+imp);
		out.println("\n the value is "+exp);
		out.println("\n the value is"+md);*/
		
		
		}catch(Exception exp){
		      System.out.println(exp);
		   }
		
		
	}



}
