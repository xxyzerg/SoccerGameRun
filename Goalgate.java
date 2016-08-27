////////////////////////////////////////////////////////////////////////////////////////////////////////
//File: Goalgate.java
//Summary: This is skills and events interface class.
//References:
//The ideal of basic rules of the game is from https://www.youtube.com/watch?v=M18UNJDspO4
//The ideals relate to foul and yellow or red card are from http://www.football-bible.com/soccer-info/soccer-red-card.html
//The basic ideal of running code after a particular time duration(or time count for showing message) is from http://stackoverflow.com/questions/2029118/run-code-for-x-seconds-in-java
//The ideal of changing color of text is from http://stackoverflow.com/questions/565252/how-to-set-a-strings-color
//The ideals of positions of the soccer players are from http://www.football-bible.com/soccer-info/soccer-positions-explained.html
///////////////////////////////////////////////////////////////////////////////////////////////////////

public class Goalgate{
	
	public Goalgate(){
		show();
		
		
	}
	
	public void show(){
		
		System.out.println();
		System.out.println("\t\tThis is the goal gate.");
		System.out.print("||");
		for (int i=0; i<=46; i++){
	    System.out.print("=");}
		
		System.out.println("||");
		for (int k=0; k<=5; k++)   
	    System.out.println("||\t\t\t\t\t\t ||");
		
		
		
	}
	
}
