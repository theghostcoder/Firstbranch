package Calc;

public class ReverseTwoVarWithoutUsingThirdVar {

	public void Reverse(int x, int y){
				 System.out.println("Value of x before swapping"+ x);
		 System.out.println("Value of y before swapping"+ y);
		 
		 x=x+y;
		 System.out.println("Value of updated x"+ x);
		 y= x-y;
		 
		 System.out.println("Value of new y "+ y);
		 x=x-y;
		 System.out.println("Value of new x "+ x);
		 System.out.println("Value of x after swapping" + x);
		 System.out.println("Value of y after swapping"+ y);
	}
}
