package solar;

public class BankDetailsItem {

	
	private String BankName;
	private String BranchName;
	private String BranchCode;
	private long AccountID;
	private String IfscCode;
	private String Name;
	private long AccID;
	
	public BankDetailsItem()
	{
		super();
	}
	
	public BankDetailsItem(String BankName,String BranchName,String BranchCode,long AccountID,String IfscCode,String Name,long AccID)
	{
		this.BankName = BankName;
		this.BranchName = BranchName;
		this.BranchCode = BranchCode;
		this.AccountID = AccountID;
		this.IfscCode = IfscCode;
		this.Name = Name;
		this.AccID = AccID; 
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public String getBranchCode() {
		return BranchCode;
	}

	public void setBranchCode(String branchCode) {
		BranchCode = branchCode;
	}

	public long getAccountID() {
		return AccountID;
	}

	public void setAccountID(long accountID) {
		AccountID = accountID;
	}

	public String getIfscCode() {
		return IfscCode;
	}

	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getAccID() {
		return AccID;
	}

	public void setAccID(long accID) {
		AccID = accID;
	}
}
