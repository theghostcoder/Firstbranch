package Calc;

public class ReverseString {
	
	public void revstring (String string){
		//string = "hello";
		String result = "";
		for (int i= string.length()-1;i>=0;i--){
			result = result + string.charAt(i);
					}
		System.out.println(""+ result);
	}

}
