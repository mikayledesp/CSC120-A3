import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Conversation {
  public static void main(String[] arguments) {
  
    Scanner userInput = new Scanner(System.in);
    // list filled with filler responses 
		ArrayList< String > filler = new ArrayList < String > ();

        filler.add("Huh...");
        filler.add("Wow, how cool...");
        filler.add("Nice!");
        filler.add("Really?");
        filler.add("Awesome!");
        filler.add("oh thats....");
    ArrayList <String> transcript = new ArrayList<>();
    //Note to self: in order to add to transcript list I might have to make each sout a string I can acess later i think idk

    String greeting = "Hello, My name is Chatbot! How many rounds would you like? ";
    System.out.println(greeting);
    transcript.add(greeting); 
    int round = userInput.nextInt();
    userInput.nextLine(); //clear out
    String rounds = String.valueOf(round);
    transcript.add(rounds); 

    String prompt = "Hey, what's on your mind?";
    System.out.println(prompt);
    transcript.add(prompt);
    
   for (int i=0; i < round; i++){
    
    String response = userInput.nextLine();
    transcript.add(response);
    
 
    String[] split = response.split(" ");
    String[] triggerWords = {"I", "me", "you", "my", "your", "am", "are"};
    String[] altWords = {"you", "you", "me", "your", "my", "are", "am"};
   
    
		int counter = 0;
    String input = "";
 
    for (int j=0; j < split.length; j++){
        String word = "";
        
      for (int k=0; k<  triggerWords.length; k++){
        if (split[j].equals(triggerWords[k])){
            counter++;
            word = altWords[k];

          }
        }
        if (word.equals("")){
          input += split[j] + " ";
        } else {
          input += word + " "; 
        }
     

    }
    if (counter > 0) {
      System.out.println(input);
      transcript.add(input); 
    }
    if (counter <= 0){
       Random rand = new Random();
       int rand_int1 = rand.nextInt(6);
       String element = filler.get(rand_int1);
       System.out.println(element);
       transcript.add(element);
    
  }
  
  
            
    }
    userInput.close();
    
    
  
  System.out.println("Goodbye!");
  System.out.println("*****Transcript***** \n ");
  System.out.println(transcript);}
  
   }

  

    
  









