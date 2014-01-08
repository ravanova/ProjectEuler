
public class SumSquare {

	public static int findDifference(int number){
		
		int sumOfSquares = 0;
		int squareOfSums = 0;
		
		for(int i = number; i > 0; i--){
			sumOfSquares += i*i;
			squareOfSums += i;			
		}
		squareOfSums *= squareOfSums;
		
		
		return squareOfSums - sumOfSquares;
	}
	
	public static void main(String[] args){
		
		System.out.println(findDifference(100));
		
	}
}
