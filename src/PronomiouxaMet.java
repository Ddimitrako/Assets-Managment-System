import java.util.Date;


public class PronomiouxaMet extends Metoxh {
	
	protected float onomastikhaksia;
 
	//constructor
	public PronomiouxaMet(){		
	}
	
	//constructor
	public PronomiouxaMet(String perigrafh, float cost, Date date,
			String onoma, int armeridiwn, float aksiameridiou,
			float timhkthshs, float onomastikhaksia) {
		
		//constructor ths Metoxhs
		super(perigrafh, cost, date, onoma, armeridiwn, aksiameridiou,
				timhkthshs);		
		this.onomastikhaksia = onomastikhaksia;
	}
	
	//ektupwsh pronomiouxas metoxhs
	public void print(){
		System.out.println("");
		System.out.println("προνομιουχα Μετοχη");
		super.print(); //kaleitai h print ths uperklashs
		System.out.println("ονομαστική αξία:"+onomastikhaksia);
	}

	//get kai set methodoi
	public float getOnomastikhaksia() {
		return onomastikhaksia;
	}

	public void setOnomastikhaksia(float onomastikhaksia) {
		this.onomastikhaksia = onomastikhaksia;
	}

	
	

}
