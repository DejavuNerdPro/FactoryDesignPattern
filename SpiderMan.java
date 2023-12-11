public class SpiderMan implements Human{

	private String power;
	private int popularIndex;
	
	public SpiderMan() {
		
	}
	
	public SpiderMan(String power, int popularIndex) {
		super();
		this.power = power;
		this.popularIndex = popularIndex;
	}
	
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public int getPopularIndex() {
		return popularIndex;
	}
	public void setPopularIndex(int popularIndex) {
		this.popularIndex = popularIndex;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public void saveLife() {
		this.popularIndex++;
		this.popularIndex=Integer.parseInt(power)+1;
	}

	@Override
	public int power(int index) {
		this.popularIndex=index;
		return index;
	}

	@Override
	public String popular() {
		return this.power+this.popularIndex;
	}
	
	
}