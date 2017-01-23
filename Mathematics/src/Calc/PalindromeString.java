package Calc;

public class PalindromeString {
	
	public void palinstrn (String string){
		String result = "";
		String temp = string;
		
		for (int i = string.length()-1; i>=0;i--){
			result = result + string.charAt(i);
		}
		
		System.out.println(""+ result);
				if (result.equals(temp)){
			System.out.println("String is palindrome: " +  result);
		}
		else{
			System.out.println("String is not palindrome: "+ result);
		}
	}

}
