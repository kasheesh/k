package solar;

public class SolarItem {

	private long AppNo;
	private String RRNo;
	private String SubDivision;
	private String Name;
	private String Address;
	private long PhoneNo;
	private String SanctionLoad;
	private float InstallCapacity;
	private String Tariff;
	private String PPA_ApprovedDate;
	private String PPA_EnterDate;
	private String Syncronised;
	private String Subsidised;
	private float PPATariff;
	private float MeterConstant;
	private float MaximumDemand;
	private float ImportReading;
	private float ExportReading;
	private float ImportCheck;
	private float ExportCheck;
	private float MDCheck;
	private float APPCRate;
	
	
	public SolarItem(long AppNo,String RRNo,String SubDivision,String Name,String Address,long PhoneNo,String SanctionLoad,float InstallCapacity,String Tariff,String PPA_ApprovedDate,String PPA_EnterDate,String Syncronised,String Subsidised,float PPATariff,float MeterConstant,float MaximumDemand,float ImportReading,float ExportReading,float ImportCheck,float ExportCheck,float MDCheck,float APPCRate)
	{
		this.AppNo=AppNo;
		this.RRNo=RRNo;
		this.SubDivision=SubDivision;
		this.Name=Name;
		this.Address=Address;
		this.PhoneNo=PhoneNo;
		this.SanctionLoad=SanctionLoad;
		this.InstallCapacity=InstallCapacity;
		this.Tariff=Tariff;
		this.PPA_ApprovedDate=PPA_ApprovedDate;
		this.PPA_EnterDate=PPA_EnterDate;
		this.Syncronised=Syncronised;
		this.Subsidised=Subsidised;
		this.PPATariff=PPATariff;
		this.MeterConstant=MeterConstant;
		this.MaximumDemand=MaximumDemand;
		this.ImportReading=ImportReading;
		this.ExportReading=ExportReading;
		this.ImportCheck=ImportCheck;
		this.ExportCheck=ExportCheck;
		this.MDCheck=MDCheck;
		this.APPCRate=APPCRate;
			
	}
	
	public SolarItem()
	{
		super();
	}
	
	public long getAppNo() {
		return AppNo;
	}
	public void setAppNo(long appNo) {
		AppNo = appNo;
	}
	public String getRRNo() {
		return RRNo;
	}
	public void setRRNo(String rRNo) {
		RRNo = rRNo;
	}
	public String getSubDivision() {
		return SubDivision;
	}
	public void setSubDivision(String subDivision) {
		SubDivision = subDivision;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getSanctionLoad() {
		return SanctionLoad;
	}
	public void setSanctionLoad(String sanctionLoad) {
		SanctionLoad = sanctionLoad;
	}
	public float getInstallCapacity() {
		return InstallCapacity;
	}
	public void setInstallCapacity(float installCapacity) {
		InstallCapacity = installCapacity;
	}
	public String getTariff() {
		return Tariff;
	}
	public void setTariff(String tariff) {
		Tariff = tariff;
	}
	public String getPPA_ApprovedDate() {
		return PPA_ApprovedDate;
	}
	public void setPPA_ApprovedDate(String pPA_ApprovedDate) {
		PPA_ApprovedDate = pPA_ApprovedDate;
	}
	public String getPPA_EnterDate() {
		return PPA_EnterDate;
	}
	public void setPPA_EnterDate(String pPA_EnterDate) {
		PPA_EnterDate = pPA_EnterDate;
	}
	public String getSyncronised() {
		return Syncronised;
	}
	public void setSyncronised(String syncronised) {
		Syncronised = syncronised;
	}
	public float getPPATariff() {
		return PPATariff;
	}
	public void setPPATariff(float pPATariff) {
		PPATariff = pPATariff;
	}
	public float getMeterConstant() {
		return MeterConstant;
	}
	public void setMeterConstant(float meterConstant) {
		MeterConstant = meterConstant;
	}
	public float getMaximumDemand() {
		return MaximumDemand;
	}
	public void setMaximumDemand(float maximumDemand) {
		MaximumDemand = maximumDemand;
	}
	public float getImportReading() {
		return ImportReading;
	}
	public void setImportReading(float importReading) {
		ImportReading = importReading;
	}
	public float getExportReading() {
		return ExportReading;
	}
	public void setExportReading(float exportReading) {
		ExportReading = exportReading;
	}

	public String getSubsidised() {
		return Subsidised;
	}

	public void setSubsidised(String subsidised) {
		Subsidised = subsidised;
	}

	public float getImportCheck() {
		return ImportCheck;
	}

	public void setImportCheck(float importCheck) {
		ImportCheck = importCheck;
	}

	public float getExportCheck() {
		return ExportCheck;
	}

	public void setExportCheck(float exportCheck) {
		ExportCheck = exportCheck;
	}

	public float getMDCheck() {
		return MDCheck;
	}

	public void setMDCheck(float mDCheck) {
		MDCheck = mDCheck;
	}

	public float getAPPCRate() {
		return APPCRate;
	}

	public void setAPPCRate(float aPPCRate) {
		APPCRate = aPPCRate;
	}
	

}
