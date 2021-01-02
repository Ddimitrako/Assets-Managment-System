import java.util.Date;


public abstract class Katathesh extends Asset {

	protected String onTrapezIdr,nomisma;
	protected float poso;
	protected float epitokeioKat;
	
	public Katathesh() {
		
	}

	public Katathesh(String perigrafh, float cost, Date date,
			String onTrapezIdr, String nomisma, float poso, float epitokeioKat) {
		
		super(perigrafh, cost, date); //klhsh constructor uperklashs
		
		this.onTrapezIdr = onTrapezIdr;
		this.nomisma = nomisma;
		this.poso = poso;
		this.epitokeioKat = epitokeioKat;
	}
	
	public void print(){
		super.print(); //klhsh ths print ths uperklashs
		System.out.println("όνομα τραπεζικού ιδρύματος:"+onTrapezIdr);
		System.out.println("Νομισμα:"+nomisma);
		System.out.println("ποσό των χρημάτων που περιέχει:"+poso);
		System.out.println("επιτόκιο κατάθεσης:"+epitokeioKat);
	}

	//get kai set methodoi
	public String getOnTrapezIdr() {
		return onTrapezIdr;
	}

	public void setOnTrapezIdr(String onTrapezIdr) {
		this.onTrapezIdr = onTrapezIdr;
	}

	public String getNomisma() {
		return nomisma;
	}

	public void setNomisma(String nomisma) {
		this.nomisma = nomisma;
	}

	public float getPoso() {
		return poso;
	}

	public void setPoso(float poso) {
		this.poso = poso;
	}

	public float getEpitokeioKat() {
		return epitokeioKat;
	}

	public void setEpitokeioKat(float epitokeioKat) {
		this.epitokeioKat = epitokeioKat;
	}
	
	

	
	
}
