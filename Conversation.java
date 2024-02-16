import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Conversation {
  public static void main(String[] arguments) {
  
    Scanner userInput = new Scanner(System.in);
		ArrayList < String > list = new ArrayList < String > ();
        list.add("Huh...");
        list.add("Wow, how cool...");
        list.add("Nice!");
        list.add("Really?");
        list.add("Awesome!");
    ArrayList <String> transcript = new ArrayList<>();


    // Note: need to make the greeting a string variable to be able to store it in a list
    String round = "Hello, My name is Chatbot! How many rounds would you like? ";
    System.out.println(round);
    transcript.add(round); 
    int roundNum = userInput.nextInt();
    userInput.nextLine(); //clear out
    String rounds = String.valueOf(roundNum);
    transcript.add(rounds); 

    String prompt = "Hey, what's on your mind?";
  
  
    System.out.println(prompt);
    transcript.add(prompt);
    
   for (int i=0; i < roundNum; i++){
    
    String response = userInput.nextLine();
    transcript.add(response);
    
 
    String[] split = response.split(" ");
    String[] triggerWords = {"I", "me", "you", "my", "your", "am", "are"};
    String[] altWords = {"you", "you", "me", "your", "my", "are", "am"};
  
		//counter to help kick in the filler reponses 
		int counter = 0;
		//rebuilds the sentences i think??
    String input = "";

    //word traverser to find the rigger words in response
    for (int j=0; j < split.length; j++){
        String word = "";
        
      for (int k=0; k<triggerWords.length; k++){
        if (split[j].equals(triggerWords[k])){
            counter++;
            word = altWords[k];} }

        if (word.equals("")){
          input += split[j] + " ";} else {input += word + " ";}
     

    }
    if (counter > 0) {
      System.out.println(input + "?");
      transcript.add(input + "?"); 
    }
    if (counter <= 0){
       Random rand = new Random();
       int rand_int1 = rand.nextInt(5);
       String element = list.get(rand_int1);
       System.out.println(element);
       transcript.add(element);
    
  }
  
  
            
    }
    // code for closing out program 
    userInput.close();
    System.out.println("Goodbye!");
    System.out.println("*****Transcript*****" + "\n");
    System.out.println(transcript);
    System.out.println("\n"+"Done!");
  
  }
}