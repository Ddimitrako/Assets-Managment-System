import java.util.Date;


public class ProthesmiakhKat extends Katathesh{

	protected int mhnes;
	protected String apodoshtokwn;
	
	
	public ProthesmiakhKat() {		
		
	}
    //constructor
	public ProthesmiakhKat(String perigrafh, float cost, Date date,
			String onTrapezIdr, String nomisma,float poso, float epitokeioKat,
			int mhnes, String apodoshtokwn) {
		//klhsh constructor uperklashs
		super(perigrafh, cost, date, onTrapezIdr, nomisma, poso, epitokeioKat);
		
		this.mhnes = mhnes;
		this.apodoshtokwn = apodoshtokwn;
	}
    
	
	public void print(){
		System.out.println("");
		System.out.println("Προθεσμιακη Καταθεση");
		super.print();  //klshsh ths methodou print ths uperklashs
		System.out.println("χρονική διάρκεια καταθεσης σε μηνες:"+mhnes);
		System.out.println("απόδοσης των τόκων:"+apodoshtokwn);
	}

	//get kai set methodoi 
	public int getMhnes() {
		return mhnes;
	}


	public void setMhnes(int mhnes) {
		this.mhnes = mhnes;
	}


	public String getApodoshtokwn() {
		return apodoshtokwn;
	}


	public void setApodoshtokwn(String apodoshtokwn) {
		this.apodoshtokwn = apodoshtokwn;
	}
		
	
}
