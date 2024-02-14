import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
// import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {



    // list of random phrases 
    List<String> list=new ArrayList<String>();
    list.add("Huh...");
    list.add("Wow, how cool...");
    list.add("Nice!");
    list.add("Really?");
    list.add("Awesome!");

    
    //list transcript 

    List<String> transcript=new ArrayList<String>();

    // You will start the conversation here.
 Scanner sc = new Scanner(System.in);
 System.out.println("Welcome to Chatbot! How many rounds ?  :)"); 
 int round = sc.nextInt();
 sc.nextLine();
 System.out.println("Hello! Whats on your mind?");
 //Loop for conversation 
  for (int i = 0 ; i < round ; i++) {
    String input = sc.nextLine();
    transcript.add(input);
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
      

    // else { 
    //   Random rand = new Random();
    //   int rand_int1 = rand.nextInt(5);
    //   String element = list.get(rand_int1); 
    //   System.out.println(element);


    // }
    





  }

  // transcript of convo
  System.out.println("Goodbye !");
  System.out.println("Transcript :");
  System.out.println(transcript);

  
  //Note
  //might need to seperate responses from user and chat bot into different lists then print each index list



sc.close();
  }















  }










