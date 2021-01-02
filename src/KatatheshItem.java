
public class KatatheshItem extends Item{
	
	private Katathesh kat;
	
	public KatatheshItem (Katathesh kat){
		this.kat=kat;
		
	}

	
	public boolean equals(Item k) {
		if (kat.getOnTrapezIdr().equals(k.key()))		return true;
		return false;
	}

	
	public boolean less(Item k) {
		if(kat.getOnTrapezIdr().compareTo( (String) k.key() )<0)   return true ;
		return false;
	}

	
	public Object key() {
		return kat.getOnTrapezIdr();		
	}


	@Override
	public void print() {
		kat.print();
		
		
		
	}

}
