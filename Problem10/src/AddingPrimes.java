import java.util.ArrayList;


public class AddingPrimes {
		//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
		//Find the sum of all the primes below two million.
		
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
			//Generates Prime numbers
		for (int i = (int) (currentPrime+2); i < 2000000; i++){
			
			double nonPrime = 0;
			for (int j = 0; j < divideBy.size(); j++){
				if (i % divideBy.get(j) == 0) {nonPrime = 1; break;}
			}
			
			if (nonPrime == 0){ //Prime number found!
				divideBy.add(i);
				//The prime number is added to divideBy in order to ensure that 
				//multiples of it are not declared as prime in furture iterations
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
