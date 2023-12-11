public class SuperMan implements Human{

	private String strength;
	private int popularIndex;
	private String title;
	
	public SuperMan() {
		
	}

	public SuperMan(String strength, int popularIndex, String title) {
		super();
		this.strength = strength;
		this.popularIndex = popularIndex;
		this.title = title;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public int getPopularIndex() {
		return popularIndex;
	}

	public void setPopularIndex(int popularIndex) {
		this.popularIndex = popularIndex;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		this.popularIndex=Integer.parseInt(strength)+1;
	}

	@Override
	public int power(int index) {
		this.popularIndex=index;
		return index;
	}

	@Override
	public String popular() {
		return this.strength+this.popularIndex;
	}
	
	
}