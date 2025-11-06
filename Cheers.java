
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String cheer = args[0]; // The cheer word provided by the user.
                int repetitions = Integer.parseInt(args[1]); // Number of times to repeat the cheer.

                cheer = cheer.toUpperCase(); // Convert the cheer word to uppercase.
                int cheerLength = cheer.length(); 
                String anLetters = "AEFHILMNORSX";

                for (int i = 0; i < cheerLength; i++) { // Loop through each character in the cheer word.
                
                        if (anLetters.indexOf(cheer.charAt(i)) != -1) {

                                System.out.println("Give me an " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!");
                        }
                        else { // For consonants that are not preceded by a vowel sound.
                                System.out.println("Give me a  " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!");
                        }
                }

                System.out.println("What does that spell?");

                for (int j = 0; j < repetitions; j++) { // Repeat the cheer the specified number of times.
                        System.out.println(cheer + "!!!"); 
                }

        }
}
