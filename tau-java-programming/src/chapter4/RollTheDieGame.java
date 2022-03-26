package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {

        //What we know
        int gameBoard = 20;
        int dieFaces = 6;
        int dieRolls = 5;
        int userSpaces = 0;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for(int count=1; count <= dieRolls; count++){
            int die = random.nextInt(dieFaces) +1;
            userSpaces = userSpaces + die;
            int spacesLeft = gameBoard - userSpaces;

            if (userSpaces == gameBoard){
                System.out.print(String.format("Roll #%d: You've rolled a %d. You are now on space %d. Congrats, you win!", count, die, userSpaces));
                break;
            }
            else if (userSpaces > gameBoard){
                System.out.print(String.format("Roll #%d: You've rolled a %d. You are past space 20. You are now on space %d. You lose!", count, die, userSpaces));
                break;
            }
            else if (count == dieRolls && userSpaces < gameBoard){
                System.out.print(String.format("Roll #%d: You've rolled a %d. You are now on space %d. You have %d spaces more to go but there is no rolls left for you. You lose!", count, die, userSpaces, spacesLeft));
                break;
            }
            else {
                System.out.print(String.format("Roll #%d: You've rolled a %d. You are now on space %d. You have %d spaces more to go.", count, die, userSpaces, spacesLeft));
            }
            System.out.println();
        }
    }
}
