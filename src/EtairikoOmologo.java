import java.util.Date;

//class EtairikoOmologo is subclass of class Omologo
public class EtairikoOmologo extends Omologo{

	public EtairikoOmologo() {
		super();
	}
    //constructor of etairikou omologou
	public EtairikoOmologo(String perigrafh, float cost, Date date,
			String onomaekdoth, float onomastikhaksia, float timhagoras,
			Date dateagoras, Date dateekdoshs, Date datelhkshs,
			String epitokeioekdoshs) {
		//kaleitai o kataskevasths tou omologou
		super(perigrafh, cost, date, onomaekdoth, onomastikhaksia, timhagoras,
				dateagoras, dateekdoshs, datelhkshs, epitokeioekdoshs);
		
	}
    //ektupwsh  
	public void print(){
		System.out.println("");
		System.out.println("Εταιρικο Ομολογο");
		super.print(); //print all class variables 
	}
	
	

}
