package Calc;

public class Palindrome {
	
	public void pali (int n){
		int rev = 0;
		int temp = n;
		while(n!=0){
		rev = (rev*10) + (n%10); //0
		n = n/10;
		}
		System.out.println(rev);
		if (rev == temp){
			System.out.println("Number is palindrome "+ rev);
					}
		else {
			System.out.println("Number is NOT palindrome "+ rev);
		}
	}

}
