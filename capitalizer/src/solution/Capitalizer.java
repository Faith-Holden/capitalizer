package solution;

import textio.TextIO;

public class Capitalizer {

    public static void main (String[] args){
        System.out.println("Please type something to be capitalized.");
        String userInput = TextIO.getln();
        System.out.println(getCapitalization(userInput));
    }

    public static String getCapitalization (String str){
        boolean prevCharIsLetter=false;
        String stringCopy = "";

        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            if(!prevCharIsLetter){
                currentChar = Character.toUpperCase(currentChar);
            }
            stringCopy= stringCopy.concat(Character.toString(currentChar));
            prevCharIsLetter = Character.isLetter(currentChar);
        }
        return stringCopy;
    }
}
