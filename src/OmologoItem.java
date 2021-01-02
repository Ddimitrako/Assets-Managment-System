
public class OmologoItem extends Item {
	
	private Omologo o;
			
	public OmologoItem(Omologo o) {		
		this.o=o;
	}


	public boolean equals(Item k) {
		if (o.getOnomaekdoth().equals(k.key())) return true;
		return false;
	}

	
	public boolean less(Item k) {
		if (  o.getOnomaekdoth().compareTo( (String) k.key() )<0 )    return true;
		return false;
	}

	
	public Object key() {
		return o.getOnomaekdoth();		
		}


	@Override
	public void print() {
		o.print();
		
	}

	
	
}
