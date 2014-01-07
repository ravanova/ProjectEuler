public class SumMultiples {

	static int findMultiples (int number, int excluding){ 	//Returns the sum of all multiples of
		int sum = 0;					//a given number which are below 1000,
		for (int i = number; i < 1000; i += number){	//excluding those whioch are also multiples of 'excluding'
			if (i%excluding != 0)
			{System.out.print(i + ", ");
			 sum += i;
			}
		}
	return sum;
	}
	
	private static int SumMultiply(int first, int second) { //For two numbers, adds together the products
		int multiplied = first * second;		//which are under 1000
		int sum = 0;
		for (int i = multiplied; i < 1000; i += multiplied){
			sum += i;
		}
		return sum;
	}
	
	public static void main (String[] args){
		System.out.println(findMultiples(3,5) + findMultiples(5,3) + SumMultiply(3,5));
	}
}
