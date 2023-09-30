import java.util.Scanner; 

public class NumberGuessingGame {
     
        public static void main(String[] args) 
       {
           System.out.println("Welcome to the game ready to play?");
           System.out.println("I'll pick a random number between");
           System.out.println("1 and 100, and you try to guess it.");
           Scanner sc1 = new Scanner(System.in); 
           boolean playAgain;
           do {
              playGame();  // function call to play one game
              System.out.println("Would you like playing the game again?");
              System.out.println("Enter True to play again");
              System.out.println("otherwise false to quit the game");
              playAgain = sc1.nextBoolean();  
              } while (playAgain);
          System.out.println("Thank you very much for playing.Goodbye.");
        }         
        
        static void playGame() {
            int computersNumber; 
            int usersGuess;      
            int guessCount;      
            computersNumber = (int)(100 * Math.random()) + 1;
            guessCount = 0;
            System.out.println();
            System.out.println("Let's Start! What is your first guess?");
            Scanner sc= new Scanner(System.in);   
            while (true) {
               usersGuess = sc.nextInt();  
               guessCount++;
               if (usersGuess == computersNumber) {
                  System.out.println("You got it in " + guessCount
                          + " guesses!  My number was " + computersNumber);
                  break;  
               }
               if (guessCount == 5) {
                  System.out.println("You didn't get the number in 5 guesses.");
                  System.out.println("You lose.  My number was " + computersNumber);
                  break;  
               }
               if (usersGuess < computersNumber)
                  System.out.println("That's too low.  Try again:");
               else if (usersGuess > computersNumber)
                  System.out.println("That's too high.  Try again:");
            }
            System.out.println();
        } 
                    
     }