import java.util.Date;


public class KatatheshTrexLog extends Katathesh{
	
	protected float posoYperan;
	
	public KatatheshTrexLog(){
		
	}
    //constructor
	public KatatheshTrexLog(String perigrafh, float cost, Date date,
			String onTrapezIdr, String nomisma, float poso, float epitokeioKat,
			 float posoYperan) {
		
		super(perigrafh, cost, date, onTrapezIdr, nomisma, poso, epitokeioKat);//klhsh constructor uperklashs
		
		this.posoYperan = posoYperan;
	}

	public void print(){
		System.out.println("");
		System.out.println("Καταθεση τρεχουμενου Λογαριασμου");
		super.print(); //klhsh ths print ths uperklashs
		System.out.println("δυνατοτητα χορηγησης μπλοκ επιταγων και δικαίωμα υπερανάληψης εως :"+posoYperan);
		
	}

	//get kai set methodoi
	public float getPosoYperan() {
		return posoYperan;
	}

	public void setPosoYperan(float posoYperan) {
		this.posoYperan = posoYperan;
	}

		

}
