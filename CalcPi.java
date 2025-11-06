// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

	    int numOfTerms = Integer.parseInt(args[0]);

		
		double piAbsolute = Math.PI;
		double piApprox = 1.0;
		boolean addTerm = false; 
		int termCount = 1; // Variable to count number of terms added

		for (int i = 2; termCount < numOfTerms; i++) { // Loop that add terms to piApprox until reaches to users input.

			if (i % 2 == 1) { // Check if odd.
				termCount++;

				if (addTerm) { // Checking term statement.

					piApprox = piApprox + (1.0 / i);
					addTerm = false;
				}
				else {
					
					piApprox = piApprox - (1.0 / i);
					addTerm = true;
				}
			}

		}

		System.out.println("pi according to Java: " + piAbsolute);
		System.out.println("pi, approximated:     " + (piApprox * 4));


	}
}
