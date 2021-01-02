import java.util.Date;

//h klash KratikoOmologo einai upoklash ths Omologo
public class KratikoOmologo extends Omologo {

	public KratikoOmologo() {
		
	}
    //kataskevasths kratikou omologou
	public KratikoOmologo(String perigrafh, float cost, Date date,
			String onomaekdoth, float onomastikhaksia, float timhagoras,
			Date dateagoras, Date dateekdoshs, Date datelhkshs,
			String epitokeioekdoshs) {
		//kaleitai o kataskevasths tou omologou
		super(perigrafh, cost, date, onomaekdoth, onomastikhaksia, timhagoras,
				dateagoras, dateekdoshs, datelhkshs, epitokeioekdoshs);
		
	}

	
	public void print(){
		System.out.println("");
		System.out.println("Κρατικο Ομολογο");
		super.print();  //print all variables of Kratiko omologo
	}	
	
	
	
}
