package Calc;

public class ReverseNumber {
	
	 public void reverse(int num){
		 int rev = 0;
		 while(num!=0){
		 rev = (rev*10) + (num%10); //3
		 num = num/10;
		 }
		 
		 System.out.println("Reverse of num " +rev);		 
	 }

}
