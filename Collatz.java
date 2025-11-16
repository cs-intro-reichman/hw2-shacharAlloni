/*
Feedback:
Great work!
Yam
*/




// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    
		int limNum = Integer.parseInt(args[0]); 
		String mode = args[1]; // "v" for verbose, "c" for concise.

		int num;
		boolean notReachedOne = true;
		int countMoves = 1; // Counts the number of steps in the sequence.

		if (mode.equals("v")) { // Checking mode.


			for (int i = 1; i <= limNum; i++) { 

				num = i;
				notReachedOne = true;

				while (num > 1 || notReachedOne) { // Continue every step until reaching 1.

					System.out.print(num + " ");

					if (num % 2 == 0) { // Even number case.

						num = num / 2;

					} else { // Odd number case.

						num = 3 * num + 1;
					}

					if (num == 1) { // Check if reached 1.
						notReachedOne = false;
						System.out.print(num + " ");
					}

					countMoves++; // Increment step count.				
				}

				System.out.println("(" + countMoves + ")");
				countMoves = 1;

			}

			
		}

		System.out.println("Every one of the first " + limNum + " hailstone sequences reached 1."); // According to the conjecture.

	}
}

