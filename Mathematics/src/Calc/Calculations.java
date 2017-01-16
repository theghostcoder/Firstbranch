package Calc;

public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseTwoVarWithoutUsingThirdVar rev = new ReverseTwoVarWithoutUsingThirdVar();
		rev.Reverse(20,10);
		
		ReverseNumber number = new ReverseNumber();
		number.reverse(123);
		
		Palindrome pp = new Palindrome();
		pp.pali(676);
		
		int dupe[] = {1,3,3,4};

		FindingDuplicate dupnum = new FindingDuplicate();
		dupnum.dup(dupe);
	}

}
