
public class myList {
	
	  protected myNode head;             
	  protected int length;  
	   
	  public myNode delete (Item a) {
		    myNode n1 = head, n2 = head;

		    while ((n1 != null) && (!a.equals( n1.getValue() ) ) ) {  
		        // psaxnoume ton komvo pou theloume na diagrapsoume kaoi ton prohgoumeno tou
		        n2 = n1; n1 = n1.getNext(); }
		    if (n1 != null) {     //uparxei o komvos pou psaxnoume tha diagrapsoume ton n1
		        length--;
		        if (n2 != n1)       // n1 != head
		            n2.setNext(n1.getNext());
		        else                  // diagrafoume to prwto stoixeio alazei to head
		            head = head.getNext();     
		        n1.setNext(null);
		    }
		    return head;
	  }

	  public myList()  {  head = null;  length = 0; }    

	  public boolean isEmpty()    { return head == null; }

	  public myNode insert(Item a) {      
	      length++; //aukshsh mege8ous listas kata 1 komvo
	      head = new myNode(a, head); //dimiourgeia neou komvou me periexomeno to a
	      return head;
	  }
	  
	  public void print(){
		  
		  myNode tmp = head; 
		  Item it ;
		  while (tmp != null) {   
			  it=tmp.getValue();
			  it.print();
		      tmp = tmp.getNext(); 
		  }
	    
		    
		    
		    
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
