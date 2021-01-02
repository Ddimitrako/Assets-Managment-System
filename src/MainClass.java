//�� 2012030107


import tuc.ece.cs111.util.StandardInputRead;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		String name,adress;
		int ap;
		FinancialOrganization organization1;
				
		StandardInputRead sir = new StandardInputRead();
		
		name=sir.readString("Ονομα Οργανισμου:");
		adress=sir.readString("Διευθυνση Οργανισμου:");
		
		//dimiourgeia organismou
		organization1=new FinancialOrganization( name, adress);
		
		
		do{ 
			//starting menu
			System.out.println("Πατηστε");
			System.out.println("1 για εισαγωγή περιουσικών στοιχείων");
			System.out.println("2 για εκτύπωση περιουσικών στοιχείων");
			System.out.println("3 για έξοδο απο το πρόγραμμα");
		    ap=sir.readPositiveInt("->");
		    
			
			if(ap==1){
				System.out.println("Πατηστε");
				System.out.println("11 για εισαγωγή κοινής μετοχής");
				System.out.println("12 για εισαγωγή προνομιακής μετοχής");
				System.out.println("13 για εισαγωγή κρατικού ομολογου");
				System.out.println("14 για εισαγωγή εταιρικού ομολογου");
				System.out.println("15 για εισαγωγή προθεσμιακης καταθεσης ");
				System.out.println("16 για εισαγωγή καταθεσης σε τραπεζικο λογαριασμο");
				ap=sir.readPositiveInt("Παρακαλώ πληκτρολογλιστε τον επιλεγμενο αριθμο:");	
				System.out.println("");
				organization1.EisagwghAsset(ap);
		    }
			
			if(ap==2){
				System.out.println("");
				System.out.println("21 για εκτύπωση metoxwn");
				System.out.println("22 για εκτύπωση omologwn");
				System.out.println("23 για εκτύπωση katathesewn");
				ap=sir.readPositiveInt("->");
				
				organization1.print(ap);
				
				
			}
			
		}while(ap!=3);
	}

}
