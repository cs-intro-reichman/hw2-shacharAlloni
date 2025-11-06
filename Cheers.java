
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String cheer = args[0]; // The cheer word provided by the user.
                int repetitions = Integer.parseInt(args[1]); // Number of times to repeat the cheer.

                cheer = cheer.toUpperCase(); // Convert the cheer word to uppercase.
                int cheerLength = cheer.length(); 

                for (int i = 0; i < cheerLength; i++) { // Loop through each character in the cheer word.
                
                        if (cheer.charAt(i) == 'A' || cheer.charAt(i) == 'E' || cheer.charAt(i) == 'F' || cheer.charAt(i) == 'H'
                           || cheer.charAt(i) == 'I' || cheer.charAt(i) == 'L' || cheer.charAt(i) == 'M' || cheer.charAt(i) == 'N'
                           || cheer.charAt(i) == 'O' || cheer.charAt(i) == 'R' || cheer.charAt(i) == 'S' || cheer.charAt(i) == 'X') {

                                System.out.println("Give me an " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!");
                        }
                        else {
                                System.out.println("Give me a  " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!");
                        }
                }

                System.out.println("What does that spell?");

                for (int j = 0; j < repetitions; j++) {
                        System.out.println(cheer + "!!!");
                }

        }
}
