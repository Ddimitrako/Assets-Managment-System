import java.util.Date;


public class KoinhMet extends Metoxh{
	
	protected float posostopshfou;
	
	public KoinhMet(){
		
	}
    //constructor koinhs metoxhs
	public KoinhMet(String perigrafh, float cost, Date date, String onoma,
			int armeridiwn, float aksiameridiou, float timhkthshs,
			float posostopshfou) {
		 //klhsh constructor uperclashs
		super(perigrafh, cost, date, onoma, armeridiwn, aksiameridiou,
				timhkthshs);
		
		this.posostopshfou = posostopshfou;
	}

	public void print(){
		System.out.println("");
		System.out.println("Κοινη Μετοχη");
		super.print(); //call method print of hyperclass
		System.out.println("δικαίωμα ψήφου του κaτοχou με ποσοστό:"+posostopshfou);
	}
	
	public float getPosostopshfou() {
		return posostopshfou;
	}

	public void setPosostopshfou(float posostopshfou) {
		this.posostopshfou = posostopshfou;
	}

	
	
	

}
