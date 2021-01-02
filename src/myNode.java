
public class myNode {

	  private Item info;
	  private myNode next;

	  public myNode(Item dat) { info = dat; }     
	  public myNode(Item dat, myNode b) {
	    info = dat;  next = b;
	  }

	  public Item     getValue()          { return info;  }   
	  public void     setNext(myNode a)  { next = a;     }
	  public myNode    getNext()            { return next; }

}
