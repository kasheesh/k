package solar;

public class SRTPVDetailsItem {
	
	private String TypeOfMeter;
	private float InstallCapacity;
	private String subsidy;
	private String AppRegisterDate;
	private String PPAEnterDate;
	private String PPAApprovalDate;
	private String CommissionDate;
	private float PPATariff;
	private float APPCTariff;
	private long AccID;

	
	public SRTPVDetailsItem(String TypeOfMeter,float InstallCapacity,String subsidy,String AppRegisterDate,String PPAEnterDate,String PPAApprovalDate,String CommissionDate,float PPATariff,float APPCTariff,long AccID,float MeterConstant)
	{
	  this.TypeOfMeter=TypeOfMeter;
	  this.InstallCapacity = InstallCapacity;
	  this.subsidy = subsidy;
	  this.AppRegisterDate = AppRegisterDate;
	  this.PPAEnterDate = PPAEnterDate;
	  this.PPAApprovalDate = PPAApprovalDate;
	  this.CommissionDate = CommissionDate;
	  this.PPATariff = PPATariff;
	  this.APPCTariff = APPCTariff;
	  this.AccID = AccID;
	 
	  
	}

	public SRTPVDetailsItem()
	{
		super();
	}

	public String getTypeOfMeter() {
		return TypeOfMeter;
	}

	public void setTypeOfMeter(String typeOfMeter) {
		TypeOfMeter = typeOfMeter;
	}

	public float getInstallCapacity() {
		return InstallCapacity;
	}

	public void setInstallCapacity(float installCapacity) {
		InstallCapacity = installCapacity;
	}

	public String getSubsidy() {
		return subsidy;
	}

	public void setSubsidy(String subsidy) {
		this.subsidy = subsidy;
	}

	public String getAppRegisterDate() {
		return AppRegisterDate;
	}

	public void setAppRegisterDate(String appRegisterDate) {
		AppRegisterDate = appRegisterDate;
	}

	public String getPPAEnterDate() {
		return PPAEnterDate;
	}

	public void setPPAEnterDate(String pPAEnterDate) {
		PPAEnterDate = pPAEnterDate;
	}

	public String getPPAApprovalDate() {
		return PPAApprovalDate;
	}

	public void setPPAApprovalDate(String pPAApprovalDate) {
		PPAApprovalDate = pPAApprovalDate;
	}

	public String getCommissionDate() {
		return CommissionDate;
	}

	public void setCommissionDate(String commissionDate) {
		CommissionDate = commissionDate;
	}

	public float getPPATariff() {
		return PPATariff;
	}

	public void setPPATariff(float pPATariff) {
		PPATariff = pPATariff;
	}

	public float getAPPCTariff() {
		return APPCTariff;
	}

	public void setAPPCTariff(float aPPCTariff) {
		APPCTariff = aPPCTariff;
	}

	public long getAccID() {
		return AccID;
	}

	public void setAccID(long accID) {
		AccID = accID;
	}


}
