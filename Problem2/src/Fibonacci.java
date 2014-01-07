public class Fibonacci {

	static int addEvenNumbers(){ //Calculates and adds all even Fibonacci numbers below 4,000,000
		int first = 1;
		int second = 2;
		int answer;
		int evenSum = 2;
		for (answer = first + second; answer <= 4000000; answer = first + second){
			first = second;
			second = answer;
			if (answer%2 == 0){ evenSum += answer; System.out.print(answer + ", ");}
		}
		return evenSum;
	}
	
	public static void main (String[] args){
		System.out.print(addEvenNumbers());
	}
}
