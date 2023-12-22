import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter roman number:");
        String roman = sc.nextLine().toUpperCase();

        int result = romanToInteger(roman);
        System.out.println("Roman to Integer:");
        System.out.println(roman+" = " + result);
        
        sc.close();
    }

    public static int romanToInteger(String roman) {
        int result = 0;

        for (int i=0; i<roman.length();i++) {
            char currentChar = roman.charAt(i);
            int currentValue = charToValue(currentChar);

            if ((i+1) <roman.length()) {
            	
                char nextChar = roman.charAt(i + 1);
                int nextValue = charToValue(nextChar);
                
                if (currentValue<nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static int charToValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
