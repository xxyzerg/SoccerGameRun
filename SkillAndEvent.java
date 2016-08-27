////////////////////////////////////////////////////////////////////////////////////////////////////////
//File: SkillAndEvent.java
//Summary: This is skills and events interface class.
//References:
//The ideal of basic rules of the game is from https://www.youtube.com/watch?v=M18UNJDspO4
//The ideals relate to foul and yellow or red card are from http://www.football-bible.com/soccer-info/soccer-red-card.html
//The basic ideal of running code after a particular time duration(or time count for showing message) is from http://stackoverflow.com/questions/2029118/run-code-for-x-seconds-in-java
//The ideal of changing color of text is from http://stackoverflow.com/questions/565252/how-to-set-a-strings-color
//The ideals of positions of the soccer players are from http://www.football-bible.com/soccer-info/soccer-positions-explained.html
///////////////////////////////////////////////////////////////////////////////////////////////////////

public class SkillAndEvent implements Skills{
	int kick;
	int power;
	String PName;
	double pF;
	int powerK;
	public SkillAndEvent(String name, int k, int p){
		PName=name;
		kick=k;
		power=p;
	    
	}
	
	public double perform(){
		pF= kick*2;
		return pF;
	}
	
	public int kick(){
		return kick;
		
	}
	
	public int powerKick(){
		powerK= kick+power;
		return powerK;
	
	}
	
}
