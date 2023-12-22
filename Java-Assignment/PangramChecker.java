import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        boolean isPangram = isPangram(input.toLowerCase());

        if (isPangram) {
            System.out.println(input+" : is a pangram.");
        } else {
            System.out.println(input+" : is not a pangram.");
        }
        
        sc.close();
    }

    public static boolean isPangram(String input) {
    	
        boolean[] alphabetCheck = new boolean[26];

        for(int i=0;i<input.length();i++) {
            char currentChar = input.charAt(i);
            
            if ('a' <= currentChar && currentChar <= 'z') {
            	int index = currentChar - 'a';
                alphabetCheck[index] = true;
            }
        }

        for(boolean letterPresent : alphabetCheck) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}
