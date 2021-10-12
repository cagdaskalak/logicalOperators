import java.util.Scanner;
public class logicalOperatorsOR {
    public static void main(String[] args) throws Exception {
    
           // logical operators = used to connect two or more expressions
        
                 //      && = (AND) both conditions must be true
                 //      || = (OR) either condition must be true
                 //      ! = (NOT) reverses boolean value of condition


                 Scanner scanner = new Scanner(System.in);

                 System.out.println("You are playing a game! If you want to quit press q or Q");

                 String response = scanner.next();

                 if(response.equals("q") || response.equals("Q")){
                     System.out.println("You quit the game!");
                 }
                 else {
                     System.out.println("You still playing the game!");
                 }
                 scanner.close();
        

    }

}
