public class SmallestMultiple {

	public static int findSmallest(){ //Calculates the smallest number that is evenly divisible by all of the numbers from 1 to 20
		
		for (int i = 20; true; i+=20){
			if(i%19 == 0){
				if(i%18 == 0){
					if(i%17 == 0){
						if(i%16 == 0){
							if(i%15 == 0){
								if(i%14 == 0){
									if(i%13 == 0){
										if(i%12 == 0){
											if(i%11 == 0){
												return i;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args){
		System.out.println(findSmallest());
	}
}
