package solar;

public class CheckMeter {
	
	private String SerialNo;
	private String Make;
	private String Model;
	private String Phase;
	private float capacity;
	private float meterConstant;
	private float ImportReading;
	private float ImportMD;
	private float ExportReading;
	private float ExportMD;
	private long AccID;
	
	
	public CheckMeter(String SerialNo,String Make,String Model,String Phase,float capacityfloat,float meterConstant,float ImportReading,float ImportMD,float ExportReading,float ExportMD,long AccID)
	{
		this.setSerialNo(SerialNo);
		this.setMake(Make);
		this.setModel(Model);
		this.setPhase(Phase);
		this.setCapacity(capacity);
		this.setMeterConstant(meterConstant);
		this.setImportReading(ImportReading);
		this.setImportMD(ImportMD);
		this.setExportReading(ImportMD);
		this.setExportMD(ExportMD);
		this.setAccID(AccID);
		
		
	}
	
	public CheckMeter()
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
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public float getMeterConstant() {
		return meterConstant;
	}

	public void setMeterConstant(float meterConstant) {
		this.meterConstant = meterConstant;
	}

	
}
