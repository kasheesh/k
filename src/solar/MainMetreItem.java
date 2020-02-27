package solar;

public class MainMetreItem {

	private String SerialNo;
	private String Make;
	private String Model;
	private String Phase;
	private float Capacity;
	private float MeterConstant;
	private float ImportReading;
	private float ImportMD;
	private float ExportReading;
	private float ExportMD;
	private long AccID;
	private String ReadingDate;
	
	public MainMetreItem(String SerialNo,String Make,String Model,String Phase,float Capacity,float MeterConstant,float ImportReading,float ImportMD,float ExportReading,float ExportMD,long AccID,String ReadingDate)
	{
		this.SerialNo = SerialNo;
		this. Make = Make;
		this.Model = Model;
		this.Phase= Phase;
		this.Capacity = Capacity;
		this.MeterConstant=MeterConstant;
		this.ImportReading = ImportReading;
		this.ImportMD = ImportMD;
		this.ExportReading = ImportMD;
		this.ExportMD = ExportMD;
		this.AccID = AccID;
		this.setReadingDate(ReadingDate);
	}
	
	public MainMetreItem()
	{
		super();
	}
	
	public String getSerialNo() {
		return SerialNo;
	}
	public void setSerialNo(String serialNo) {
		SerialNo = serialNo;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public float getImportReading() {
		return ImportReading;
	}
	public void setImportReading(float importReading) {
		ImportReading = importReading;
	}
	public float getImportMD() {
		return ImportMD;
	}
	public void setImportMD(float importMD) {
		ImportMD = importMD;
	}
	public float getExportReading() {
		return ExportReading;
	}
	public void setExportReading(float exportReading) {
		ExportReading = exportReading;
	}
	public float getExportMD() {
		return ExportMD;
	}
	public void setExportMD(float exportMD) {
		ExportMD = exportMD;
	}
	public long getAccID() {
		return AccID;
	}
	public void setAccID(long accID) {
		AccID = accID;
	}

	public String getPhase() {
		return Phase;
	}

	public void setPhase(String phase) {
		Phase = phase;
	}

	public float getCapacity() {
		return Capacity;
	}

	public void setCapacity(float capacity) {
		Capacity = capacity;
	}

	public float getMeterConstant() {
		return MeterConstant;
	}

	public void setMeterConstant(float meterConstant) {
		MeterConstant = meterConstant;
	}

	public String getReadingDate() {
		return ReadingDate;
	}

	public void setReadingDate(String readingDate) {
		ReadingDate = readingDate;
	}
	
}
