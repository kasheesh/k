package solar;

public class ConsumerItems {
	
	private long AccID;
	private String RRNo;
    private String Name;
    private long PhoneNo;
	private String EmailID;
	private String Address;
	private String Tariff;
	private String SubDivision;
	private float SanctionLoad;
	private String Division;
	
	public ConsumerItems()
	{
		super();
	}
	public ConsumerItems(long AccID,String RRNo,String Name,long PhoneNo,String EmailID,String Address,String Tariff,String SubDivision, float SanctionLoad,String Division)
	{
		this.AccID=AccID;
		this.RRNo = RRNo;
		this.Name = Name;
		this.PhoneNo= PhoneNo;
		this.EmailID = EmailID;
		this.Address = Address;
		this.Tariff = Tariff;
		this.SubDivision = SubDivision;
		this.setSanctionLoad(SanctionLoad);
		this.setDivision(Division);
	}
	
	public long getAccID() {
		return AccID;
	}
	public void setAccID(long accID) {
		AccID = accID;
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
	
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getTariff() {
		return Tariff;
	}
	public void setTariff(String tariff) {
		Tariff = tariff;
	}
	public float getSanctionLoad() {
		return SanctionLoad;
	}
	public void setSanctionLoad(float sanctionLoad) {
		SanctionLoad = sanctionLoad;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		Division = division;
	}
	


}
