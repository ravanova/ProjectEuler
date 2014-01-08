import java.util.ArrayList;


public class AddingPrimes {

	static ArrayList<Integer> divideBy =  new ArrayList<Integer>();
	static double currentPrime = 1;
	public  AddingPrimes(){
		divideBy.add(2);
		divideBy.add(3);
		divideBy.add(5);
		divideBy.add(7);
		divideBy.add(8);
		divideBy.add(9);
	}
	
	public static double generatePrime(){
		for (int i = (int) (currentPrime+2); i < 2000000; i++){
			//System.out.println(i);
			double nonPrime = 0;
			for (int j = 0; j < divideBy.size(); j++){
				if (i % divideBy.get(j) == 0) {nonPrime = 1; break;}
			}
			
			if (nonPrime == 0){ //Prime number found!
				divideBy.add(i);
				currentPrime = i;
				return i;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args){
		
		AddingPrimes a = new AddingPrimes();
		double sumOfPrimes = 0;
		double current = generatePrime();
		
		while(current != 0){
			
			sumOfPrimes += current;
			
			current = generatePrime();
			//System.out.println(current);
		}
		System.out.println(sumOfPrimes+17);
		
	}
}
