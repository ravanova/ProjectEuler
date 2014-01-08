public class PythagoreanTriplet {

	public static long calculate(){
		//There exists exactly one Pythagorean triplet for which a + b + c = 1000
		//This method finds the product abc
		
		long aAndB = 0;
		long cSquared = 0;
		for(int a = 0; a < 1000; a++){
			for(int b = a+1; b < 1000; b++){
				for(int c = b+1; c < 1000; c++){
					
					aAndB = (a*a) + (b*b);
					cSquared = (c*c);
					if (aAndB == cSquared){
						if ((a+b+c) == 1000){
							return (a*b*c);
						}
					}
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args){
		System.out.println(calculate());
	}
}
