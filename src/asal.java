
public class asal {
	public static void main(String [] args ) {
		

			
				int number = 97;
				int remainder = number % 2 ;
				System.out.println(remainder);
				boolean isPrime = true;
				
				if(number == 1) {
					System.out.println("Sayı asal değildir ");
					return;
				}
				if(number<1) {
					System.out.println("Geçersiz sayı ");
					return;
				}
				for(int i = 2 ; i<number ; i++) {
					if(number%i ==0) {
						isPrime=false;
					}
				}
				
			  if(isPrime == true) {
				  System.out.println("Sayı asaldır. ");
				  
			  }
			  else {
				  System.out.println("Sayı asal değildir. ");
			  }
						

			}

		


	



	}

