import tuc.ece.cs111.util.StandardInputRead;
import java.util.Date;

public class FinancialOrganization {
	
	private String name,adress;
	
	private String perigrafh;
	private float cost;
	private Date date ;
	private String onoma;
	private int armeridiwn;
	private float aksiameridiou,timhkthshs;
	private float posostopshfou;
	
	private String onomaekdoth;
	private float onomastikhaksia,timhagoras;
	private Date dateagoras, dateekdoshs,datelhkshs;
	private String epitokeioekdoshs;
	
	private String onTrapezIdr,nomisma;
	private float poso;
	private float epitokeioKat,posoYperan;
		
	private int mhnes;
	private String apodoshtokwn;
	
	
	StandardInputRead sir = new StandardInputRead();
	
	//dimiourgia taksinomhmenwn listwn
	SortedList x1=new SortedList();
	SortedList x2=new SortedList();
	SortedList x3=new SortedList();
	
	//constructor
	public FinancialOrganization(){		
	}
	//constructor
	public FinancialOrganization(String name, String adress) {
		this.name = name;
		this.adress = adress;
		
	}
    
	//methodo gia eisagwgh periousiakwn stoixeiwn(assets)
	public void EisagwghAsset(int ap){
		
		if(ap==11){	
			perigrafh=sir.readString("perigrafh periousiakou stoixeiou:");
			cost=sir.readPositiveFloat("trexousa aksia:");
			date=sir.readDate("hmeromhnia dimiourgeias:");
			onoma=sir.readString("onoma metoxhs:");
			armeridiwn=sir.readPositiveInt("arithmos meridiwn:");
			aksiameridiou=sir.readPositiveFloat("aksiameridiou:");
			timhkthshs=sir.readPositiveFloat("timh Kthshs:");
			posostopshfou=sir.readPositiveFloat("pososto pshfou:");
			
			//dimhourgeia antikeimenou koinhs metoxhs
			KoinhMet k=new KoinhMet(perigrafh, cost, date, onoma, armeridiwn, aksiameridiou,
					timhkthshs,posostopshfou);
			//dimhourgeia antikeimenou metoxhItem
			MetoxhItem a=new MetoxhItem(k);
			//eisagwgh tou antikeimenou a sthn taksinomhmenh lista
			x1.insert(a);
				
		}
		
		if (ap==12){	
			perigrafh=sir.readString("perigrafh periousiakou stoixeiou:");
			cost=sir.readPositiveFloat("trexousa aksia:");
			date=sir.readDate("hmeromhnia dimiourgeias:");
			onoma=sir.readString("onoma metoxhs:");
			armeridiwn=sir.readPositiveInt("arithmos meridiwn:");
			aksiameridiou=sir.readPositiveFloat("aksiameridiou:");
			timhkthshs=sir.readPositiveFloat("timh Kthshs:");
			onomastikhaksia=sir.readPositiveFloat("onomastikh aksia:");
			
			PronomiouxaMet p=new PronomiouxaMet(perigrafh, cost, date, onoma, armeridiwn, aksiameridiou,
					timhkthshs,onomastikhaksia);
			MetoxhItem a=new MetoxhItem(p);
			x1.insert(a);
		}
		
		if(ap==13){		
			perigrafh=sir.readString("perigrafh periousiakou stoixeiou:");
			cost=sir.readPositiveFloat("trexousa aksia:");
			date=sir.readDate("hmeromhnia dimiourgeias:");
			onomaekdoth=sir.readString("onoma ekdoth:");
			onomastikhaksia=sir.readPositiveFloat("onomastikh aksia:");
			timhagoras=sir.readPositiveFloat("timh agoras:");
			dateagoras=sir.readDate("hmeromhnia agoras:");
			dateekdoshs=sir.readDate("hmeromhnia ekdoshs:");
			datelhkshs=sir.readDate("hmeromhnia lhkshs:");
			epitokeioekdoshs=sir.readString("epitokeio ekdoshs(stathero h kumenomeno):");
			
			KratikoOmologo k=new KratikoOmologo(perigrafh, cost, date, onomaekdoth, onomastikhaksia, timhagoras,
				dateagoras, dateekdoshs, datelhkshs, epitokeioekdoshs);
			OmologoItem o=new OmologoItem(k);
			x2.insert(o);
			
			
		}
		
		if(ap==14){
			perigrafh=sir.readString("perigrafh periousiakou stoixeiou:");
			cost=sir.readPositiveFloat("trexousa aksia:");
			date=sir.readDate("hmeromhnia dimiourgeias:");	
			onomaekdoth=sir.readString("onoma ekdoth:");
			onomastikhaksia=sir.readPositiveFloat("onomastikh aksia:");
			timhagoras=sir.readPositiveFloat("timh agoras:");
			dateagoras=sir.readDate("hmeromhnia agoras:");
			dateekdoshs=sir.readDate("hmeromhnia ekdoshs:");
			datelhkshs=sir.readDate("hmeromhnia lhkshs:");
			epitokeioekdoshs=sir.readString("epitokeio ekdoshs(stathero h kumenomeno):");
			
			EtairikoOmologo k=new EtairikoOmologo(perigrafh, cost, date, onomaekdoth, onomastikhaksia, timhagoras,
					dateagoras, dateekdoshs, datelhkshs, epitokeioekdoshs);
			OmologoItem o=new OmologoItem(k);
			x2.insert(o);
		}
		
		if(ap==15){
			perigrafh=sir.readString("perigrafh periousiakou stoixeiou:");
			cost=sir.readPositiveFloat("trexousa aksia:");
			date=sir.readDate("hmeromhnia dimiourgeias:");
			onTrapezIdr=sir.readString("onoma trapezikou idrimatos:");
			nomisma=sir.readString("nomisma ths kata8eshs:");
			poso=sir.readPositiveFloat("poso xrhmatwn pou periexei:");
			epitokeioKat=sir.readPositiveFloat("epitokeio kata8eshs:");
			mhnes=sir.readPositiveInt("xronikh diarkeia katathesewn se mhnes:");
			apodoshtokwn=sir.readString("apodosh tokwn(sth lhksh,sthn enarksh,sth diarkeia):");
			
			ProthesmiakhKat p=new ProthesmiakhKat(perigrafh, cost, date, onTrapezIdr, nomisma, poso, epitokeioKat,mhnes,apodoshtokwn);
		    KatatheshItem k=new KatatheshItem(p);
		    x3.insert(k);
		}
		
		if(ap==16){
			perigrafh=sir.readString("perigrafh periousiakou stoixeiou:");
			cost=sir.readPositiveFloat("trexousa aksia:");
			date=sir.readDate("hmeromhnia dimiourgeias:");
			onTrapezIdr=sir.readString("onoma trapezikou idrimatos:");
			nomisma=sir.readString("nomisma ths kata8eshs:");
			poso=sir.readPositiveFloat("poso xrhmatwn pou periexei:");
			epitokeioKat=sir.readPositiveFloat("epitokeio kata8eshs:");
			posoYperan=sir.readPositiveFloat("poso uperanalhpshs:");
			
			KatatheshTrexLog k=new KatatheshTrexLog(perigrafh, cost, date, onTrapezIdr, nomisma, poso, epitokeioKat,posoYperan);
			KatatheshItem kat=new KatatheshItem(k);
			x3.insert(kat);		
			
			

		}
	}
	
	public void print(int ap){
		
		System.out.println("");
		System.out.println("Onoma:"+getName());
		System.out.println("Adress:"+getAdress());
		System.out.println("");
		
		if(ap==21){
			//kaleitai h print ths taksinomhmenhs listas gia ektypwsh olwn twn metoxwn
			x1.print();		
			System.out.println("");			
		}	
		if(ap==22){
			//kaleitai h print ths taksinomhmenhs listas gia ektypwsh olwn twn omologwn
			x2.print();
			System.out.println("");
		}
		if(ap==23){
			//kaleitai h print ths taksinomhmenhs listas gia ektypwsh olwn twn katathesewn
			x3.print();
			System.out.println("");
		}
		
	}
	
	 //get kai set methodoi 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	public SortedList getX1() {
		return x1;
	}
	public void setX1(SortedList x1) {
		this.x1 = x1;
	}
	public SortedList getX2() {
		return x2;
	}
	public void setX2(SortedList x2) {
		this.x2 = x2;
	}
	public SortedList getX3() {
		return x3;
	}
	public void setX3(SortedList x3) {
		this.x3 = x3;
	}
	
	

}
