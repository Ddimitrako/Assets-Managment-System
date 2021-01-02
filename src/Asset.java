import java.util.Date;


public abstract class Asset {

	protected String perigrafh;
	protected float cost;
	protected Date date ;
	
	
	public Asset() {
		
	}

	//constructor klashs Asset
	public Asset(String perigrafh, float cost, Date date) {
		
		this.perigrafh = perigrafh;
		this.cost = cost;
		this.date = date;
	}
	
	public void print() {
		System.out.println("Description:"+perigrafh);
		System.out.println("Current Price:"+cost);
		System.out.println("Date of Creation:"+date);
	}

	//get kai set methodoi
	public String getPerigrafh() {
		return perigrafh;
	}

	public void setPerigrafh(String perigrafh) {
		this.perigrafh = perigrafh;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}

