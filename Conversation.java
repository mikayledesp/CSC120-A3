import java.util.Scanner;
// import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
 Scanner sc = new Scanner(System.in);
 System.out.println("Welcome to Chatbot! How many rounds ?  :)"); 
 int round = sc.nextInt();
 sc.nextLine();
 System.out.println("Hello! Whats on your mind?");
 //Loop for conversation 
  for (int i = 0 ; i < round ; i++) {
    String input = sc.nextLine();
    if (input.contains("I"))
      System.out.println(input.replace("I", "You") + "?");

    if (input.contains("me"))
      System.out.println(input.replace("me", "You") + "?");
    if (input.contains("am"))
      System.out.println(input.replace("am", "are") + "?"); 
    if (input.contains("you"))
    System.out.println(input.replace("you", "I") + "?"); 
    if (input.contains("my"))
    System.out.println(input.replace("my", "your") + "?"); 
    if (input.contains("your"))
      System.out.println(input.replace("your", "my") + "?"); 
      
      

   
  }








  sc.close();
  }
}
