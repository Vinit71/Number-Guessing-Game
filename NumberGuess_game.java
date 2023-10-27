import java.util.Random;
import java.util.Scanner;

class NumberGuessing {
    public static void main(String st[]) {
        Scanner input = new Scanner(System.in); 
       
        int lowerBound = 0, upperBound = 10; //Number Range
        int randomNumb = generateRandomNumbers(upperBound, lowerBound);
        boolean guessCorretly = false;
        int attempt = 3;

        //User interactive part
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between "+ lowerBound +" & "+ upperBound);
        System.out.println("You have 3 lifes to give correct answer");
        
        //Game logic
        while(guessCorretly==false && attempt>0){
            System.out.print("Enter your guessed number: ");
            int userGuess = input.nextInt();

            if(userGuess<lowerBound || userGuess>upperBound){
                System.out.println("Enter a number between: "+lowerBound+ " & " + upperBound);
            }
            else if(userGuess<randomNumb){
                System.out.println("opps! It's Smaller number");
                attempt--;
                System.out.println("\nYou have "+attempt+" life left");
            }
            else if(userGuess>randomNumb){
                System.out.println("opps! It's Bigger number");
                attempt--;
                System.out.println("\nYou have "+attempt+" life left");
            }
            else{
                guessCorretly = true;
                System.out.println("YOU WON!");
                System.out.println("\nStill have "+ attempt + " lifes");
            }
    
        }
        while(guessCorretly == false){
            System.out.println("\nThat number was: "+ randomNumb);
            break;
        }
        input.close();
    }

//Method Defining
static int generateRandomNumbers(int lowerBound, int upperBound){
    Random rnum = new Random();
    int compNumber = rnum.nextInt(10);
    return compNumber;
}

}

