import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Conversation {
  public static void main(String[] arguments) {

  
    Scanner userInput = new Scanner(System.in);
    //List of canned responses for when no trigger words are found in response
		ArrayList < String > list = new ArrayList < String > ();
        list.add("Huh...");
        list.add("Wow, how cool...");
        list.add("Nice!");
        list.add("Really?");
        list.add("Awesome!");
    // Empty list that holds transcript
    ArrayList <String> transcript = new ArrayList<>();


    // Note: need to make the greeting a string variable to be able to store it in a list
    String round = "Hello, My name is Chatbot! How many rounds would you like? ";
    System.out.println(round);
    transcript.add(round); 
    int roundNum = userInput.nextInt();
    userInput.nextLine(); //clear out
    String rounds = String.valueOf(roundNum);
    transcript.add(rounds); 
    // starting prompt after rounds are establisged
    String prompt = "Hey, what's on your mind?";
    System.out.println(prompt);
    transcript.add(prompt);
  //Method that controls/implements  the number of rounds that the user asks for
   for (int i=0; i < roundNum; i++){
    
    String response = userInput.nextLine();
    transcript.add(response);
    
    //splicing the words 
    String[] split = response.split(" ");
    //Lists of the trigger worlds and the alt words that the program replaces them with
    String[] triggerWords = {"I", "me", "you", "my", "your", "am", "are"};
    String[] altWords = {"you", "you", "me", "your", "my", "are", "am"};
  
		//counter to help kick in the filler reponses 
		int counter = 0;
		// builds input in order to reprint the altered response
    String input = "";

    //Word traverser to find the rigger words in response and adds to the counter if it does
    for (int j=0; j < split.length; j++){
        String word = "";
        
      for (int k=0; k<triggerWords.length; k++){
        if (split[j].equals(triggerWords[k])){
            counter++;
            word = altWords[k];} }

        if (word.equals("")){
          input += split[j] + " ";} else {input += word + " ";}
     

    }
    // Checks counter that increases when a trigger word is inside a response. If counter is less than or equal to 0 the program then prints a response from the random list
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
    //*//
    //Code for closing out program by bidding user goodbye and printing out the transcript.
    //*/
    userInput.close();
    System.out.println("Goodbye!");
    System.out.println("*****Transcript*****" + "\n");
    System.out.println(transcript);
    System.out.println("\n"+"Done!");
  
  }
}