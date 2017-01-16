package Calc;

public class FindingDuplicate {
	
	public void dup(int dupe[]){
		System.out.println(dupe.length);
     for (int i=0;i<dupe.length;i++){
    	for(int j=i+1;j<dupe.length;j++){
    		
    		if (dupe[i]==dupe[j]){
    		System.out.println("Number is duplicate "+ dupe[i]);
    	}
    }
	
	}
	}
}
