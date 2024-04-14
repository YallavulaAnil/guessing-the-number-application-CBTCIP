import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame{
    public static int MIN_RANGE = 1;
    public static int MAX_RANGE = 100;
    public static int MAX_ATTEMPTS = 10;
    public static int MAX_ROUNDS = 5;
    
    
    
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int totalscore = 0;
        
        System.out.println("Welcome to Number Game\n");
        System.out.println("Total Number of Rounds : 5");
        System.out.println("No off Attempts for each round are 10\n");
        
        for(int i=1;i<MAX_ROUNDS;i++){
            int number = random.nextInt(MAX_RANGE)+MIN_RANGE;
            int current_attempts = 0;
            System.out.printf("Current Round %d: Guess the Number between %d and %d in %d attempts.\n",i,MIN_RANGE,MAX_RANGE,MAX_ATTEMPTS);
            
            while(current_attempts < MAX_ATTEMPTS){
                System.out.println("Enter your Guess: ");
                int guess_number = sc.nextInt();
                current_attempts = current_attempts+1;
                
                if(guess_number == number){
                    int score = MAX_ATTEMPTS - current_attempts;
                    totalscore = totalscore + score;
                    System.out.printf("Congrats you successfully guessed the number. attempts: %d. Round Score : %d.",current_attempts,score);
                    break;
                }
                else if(guess_number < number){
                    System.out.printf("The number is greate than %d. Attempts left = %d ",guess_number,MAX_ATTEMPTS-current_attempts);
                    
                }
                else if(guess_number > number){
                    System.out.printf("The number is less  than %d. Attempts left = %d ",guess_number,MAX_ATTEMPTS-current_attempts);
                    
                }
            }
            if(current_attempts == MAX_ATTEMPTS){
                System.out.printf("You lost the Round  = %d. Attempts = 0.",i);
                System.out.printf("The Random number is %d",number);
                
            }
        }
        System.out.printf("Game over. Total Score = %d\n",totalscore);
        sc.close();
        
        
        
    }
}