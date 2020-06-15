/**
 The VowelConsWeinstein class is a class with a constructor which accepts a string argument, this class has methods getVowels() which returns the number of vowels in the string, and getCons() which returns the number of consonants in the string. The class is demonstrated in the main() method which asks the user for a string and then gives an option menu and prompts user to select an option until quitting the program. 

 Author: David Weinstein
 Date: 5/10/2020
 Program file: VowelConsWeinstein.java

 Pseudocode:
 1. Set up class field variables for vowel count and user input.
 2. Make constructor which accepts a string object arguement
 3. Make getVowels() method which returns vowelCount
 4. Make getCons() method which returns the number of consonants
 5. Make main() method to demonstrate class
    a. Create scanner object for user input
    b. Create and populate string objects for output and option a through e
    c. Initialize empty strings for user input and option choice, and int's for getting consonant and vowel values
    d. While loop which loops until option e is chosen to quit
    e. When userinput is not e, create VowelConsWeinstein object with userinput string for constructor
    f. Depending on option chosen go to proper if statement
    G. Complete desired option and ask for another string or e to quit.
 */
import java.util.Scanner;

public class VowelConsWeinstein {
    // Class field variables for vowel count and userinput
    private int vowelCount = 0;
    private String userInput = "";

    /**
     * VowelConsWeinstein constructor which takes String s as arguement
     * @param s user input string
     */
    public VowelConsWeinstein(String s) {
        userInput = s;
    }
    /**
     * getVowels method loops through the string and counts and returns the vowels
     * @return int vowelCount which is the number of vowels in the string
     */
    public int getVowels() {
        // for loop to check string for vowels
        for(int i = 0;i<userInput.length();++i) {
            if(userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
                vowelCount += 1;
            }
        }
        return vowelCount;
    }

    /**
     * getCons method returns the number of consonants in the string
     * @return length of userinput minus the amount of vowels is the number of consonants returned
     */
    public int getCons() {
        // userinput length - number of vowels for consonants
        return userInput.length() - getVowels();
    }

    public static void main(String[] args) {
        // create scanner object and output and option strings and strings for userinput and user option
        Scanner input = new Scanner(System.in);
        String output = "Enter a string or press e to quit >> ";
        String optionA = "Count the number of vowels in the string.";
        String optionB = "Count the number of consonants in the string.";
        String optionC = "Count both the vowels and the consonants in the string.";
        String optionD = "Enter another string.";
        String optionE = "Exit the program.";
        String userInput = "";
        String option = "";
        // int for consonants and vowel count to not double count the vowels useing getters
        int cons, vows;

        System.out.print(output);
        userInput = input.nextLine();
        // while loop while userinpout != e
        while(!userInput.equals("e")) {
            // create VowelConsWeinstein object with userinput constructor
            VowelConsWeinstein str = new VowelConsWeinstein(userInput);
            // print options
            System.out.println("a. " + optionA);
            System.out.println("b. " + optionB);
            System.out.println("c. " + optionC);
            System.out.println("d. " + optionD);
            System.out.println("e. " + optionE);
            System.out.print("Enter option >> ");
            option = input.nextLine();
            // option a if
            if(option.equals("a")) {
                System.out.println("The string has " + str.getVowels() + " vowels.");
                System.out.print("Enter a string or press e to quit >> ");
                userInput = input.nextLine();
            }
            // option b if
            if(option.equals("b")){
                System.out.println("The string has " + str.getCons() + " consonants.");
                System.out.print("Enter a string or press e to quit >> ");
                userInput = input.nextLine();
            }
            // option c if
            if(option.equals("c")) {
                vows = str.getVowels();
                cons = userInput.length() - vows;
                System.out.println("The string has " + vows + " vowels and " + cons + " consonants.");
                System.out.print("Enter a string or press e to quit >> ");
                userInput = input.nextLine();
            }
            // option d if
            if(option.equals("d")) {
                System.out.print("Enter new string >> ");
                userInput = input.nextLine();
            }
            // option e if
            if(option.equals("e")) {
                userInput = "e";
            }
        }
        input.close();
    }
}