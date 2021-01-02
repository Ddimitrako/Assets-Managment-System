
public class MetoxhItem extends Item{
	
	private Metoxh m;
	
	public MetoxhItem(Metoxh m){
		this.m=m;
	}
	
	public boolean equals(Item k) {
        if (  m.getOnoma().equals( k.key() )  )    return true;
	    return false;
				
	}
	
	public boolean less(Item k) {
		if (  m.getOnoma().compareTo( (String) k.key() )<0 )    return true;
	    return false;
		
	}
	
	public Object key() {		
		return m.getOnoma();
	}

	@Override
	public void print() {
		m.print();		
	}
	

}
