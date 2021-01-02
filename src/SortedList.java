
public class SortedList extends myList{
	
	public myNode insert (Item a){
		                       
		myNode tmp = new myNode(a);     length++;
		myNode n1 = head, n2 = head;
			    
		 while ((n1 != null) && (n1.getValue().less(a) )) { //anazhthsh twn 2 komvwn metaksy
			      n2 = n1;   n1 = n1.getNext();              //twn opoiwn 8a ginei h eisagwgh
			      
		 }                         
			    
		 if (n1 == head) {                      //eisagwgh sthn arxh                             
			      tmp.setNext(n1); 
			      head = tmp;      
			    }
			    else {                         
			      n2.setNext(tmp);
			      tmp.setNext(n1);   
			    } 
			    return head;
			  } 

		
	

}
