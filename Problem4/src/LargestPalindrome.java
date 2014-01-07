
public class LargestPalindrome {

	public static int findLargest(){
		
		for (int i = 999; i > 800; i--){
			for (int j = 999; j > 800; j--){
				if(isPalindrome(i*j)){
					return i*j;
				}
			}
		}
		return 0;
	}
	
	public static boolean isPalindrome(int toCheck){
		String number = Integer.toString(toCheck);
		if (number.charAt(0) == number.charAt(5)){
			if (number.charAt(1) == number.charAt(4)){
				if (number.charAt(2) == number.charAt(3)){
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		System.out.println(findLargest());
	}
}
