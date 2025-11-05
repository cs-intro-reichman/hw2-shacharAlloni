// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

	    int numOfTerms = Integer.parseInt(args[0]);

		
		double piAbsolute = Math.PI;
		double piApprox = 1.0;
		boolean addTerm = false; 
		int termCount = 1; // Variable to count number of terms added

		for (int i = 2; termCount < numOfTerms; i++) {

			if (i % 2 == 1) {
				termCount++;

				if (addTerm) {

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
