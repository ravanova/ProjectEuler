
public class SumMultiples {

	static int findMultiples (int number, int exception){
		int sum = 0;
		for (int i = number; i < 1000; i += number){
			if (i%exception != 0)
			{System.out.print(i + ", ");
			 sum += i;
			}
		}
	return sum;
	}
	
	private static int SumMultiply(int first, int second) {
		int multiplied = first * second;
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
