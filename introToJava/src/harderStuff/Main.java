package harderStuff;

public class Main {


	public static long kthFac(int n, int k) { 
		if (n == 1) return 1; 
		return n * kthFac(n-k, k); 
	}
	
	int maxSpan(int[] numbers) {
		int res = 0;
		numbers.toString();
		
		for(int i = 0; i < numbers.length; i++) {
			int fut = numbers.toString().lastIndexOf(i);	
			if(i != fut) {
				int almostRes = fut - i;
				if(almostRes > res) res = almostRes;
			}
		}
		
		return res;
	}
	
	String reverse(String arg) {
		String newArg = arg;
		int size = newArg.length();
		
		for (int i = 0; i < size; i++) {
			char oldChar = newArg.charAt(i);
			char newChar = arg.charAt(size - i - 1);
			newArg.replace(oldChar, newChar);
		}
		
		return newArg;
	}
	
	boolean isPalindrome(String arg) {
		arg.replace(" ", "");
		return arg.equals(reverse(arg));
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
