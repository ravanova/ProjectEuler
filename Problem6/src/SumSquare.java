public class SumSquare {

	public static int findDifference(int number){
		//For numbers 1 to 'number', finds the difference
		//between the sum of the squares and the square of the sum.
		
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
