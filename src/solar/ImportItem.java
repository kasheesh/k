package solar;

public class ImportItem {
	private float from1;
	private float to1;
	private float rate;
	
	public ImportItem()
	{
		super();
	}
	
	public ImportItem(float from1,float to1,float rate)
	{
		super();
		
		this.from1=from1;
		this.setTo1(to1);
		this.setRate(rate);
	}

	public float getFrom1() {
		return from1;
	}

	public void setFrom1(float from1) {
		this.from1 = from1;
	}

	public float getTo1() {
		return to1;
	}

	public void setTo1(float to1) {
		this.to1 = to1;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

}
