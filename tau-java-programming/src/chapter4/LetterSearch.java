package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */
public class LetterSearch {

    public static void main(String[] args){

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        //for (int count=0; count<text.length(); count++){
        //for (int count = text.length(); count >0;  count--){
        for (int count=0; !letterFound && count<text.length(); count++){
                char currentLetter = text.charAt(count);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                //break;
            }
        }

        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}