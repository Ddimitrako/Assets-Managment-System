import java.util.Date;

public abstract class Omologo extends Asset{
	
	protected String onomaekdoth;
	protected float onomastikhaksia,timhagoras;
	protected Date dateagoras, dateekdoshs,datelhkshs;
	protected String epitokeioekdoshs;
	
	public Omologo(){
		
	}
	//constructor
	public Omologo(String perigrafh, float cost, Date date, String onomaekdoth,
			float onomastikhaksia, float timhagoras, Date dateagoras,
			Date dateekdoshs, Date datelhkshs, String epitokeioekdoshs)	{
		
		//kaleitai o constructor ths klashs Asset
		super(perigrafh, cost, date);
		
		this.onomaekdoth = onomaekdoth;
		this.onomastikhaksia = onomastikhaksia;
		this.timhagoras = timhagoras;
		this.dateagoras = dateagoras;
		this.dateekdoshs = dateekdoshs;
		this.datelhkshs = datelhkshs;
		this.epitokeioekdoshs = epitokeioekdoshs;
	}
	
	public void print(){
		super.print(); //kaleitai h print ths klashs Asset
		System.out.println("όνομα του εκδότη:"+onomaekdoth);
		System.out.println("ονομαστική αξία:"+onomastikhaksia);
		System.out.println("τιμή αγοράς:"+timhagoras);
		System.out.println("ημερομηνία αγοράς:"+dateagoras);
		System.out.println("ημερομηνία έκδοσήs:"+dateekdoshs);
		System.out.println("ημερομηνία λήξης:"+datelhkshs);
		System.out.println("επιτόκιο έκδοσης:"+epitokeioekdoshs);
	}

	
	//get kai set methodoi
	
	public String getOnomaekdoth() {
		return onomaekdoth;
	}

	public void setOnomaekdoth(String onomaekdoth) {
		this.onomaekdoth = onomaekdoth;
	}

	public float getOnomastikhaksia() {
		return onomastikhaksia;
	}

	public void setOnomastikhaksia(float onomastikhaksia) {
		this.onomastikhaksia = onomastikhaksia;
	}

	public float getTimhagoras() {
		return timhagoras;
	}

	public void setTimhagoras(float timhagoras) {
		this.timhagoras = timhagoras;
	}

	public Date getDateagoras() {
		return dateagoras;
	}

	public void setDateagoras(Date dateagoras) {
		this.dateagoras = dateagoras;
	}

	public Date getDateekdoshs() {
		return dateekdoshs;
	}

	public void setDateekdoshs(Date dateekdoshs) {
		this.dateekdoshs = dateekdoshs;
	}

	public Date getDatelhkshs() {
		return datelhkshs;
	}

	public void setDatelhkshs(Date datelhkshs) {
		this.datelhkshs = datelhkshs;
	}

	public String getEpitokeioekdoshs() {
		return epitokeioekdoshs;
	}

	public void setEpitokeioekdoshs(String epitokeioekdoshs) {
		this.epitokeioekdoshs = epitokeioekdoshs;
	}
	
	
	

}
