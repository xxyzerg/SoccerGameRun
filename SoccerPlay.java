////////////////////////////////////////////////////////////////////////////////////////////////////////
//File: SoccerPlay.java
//Summary: This is parent class of Team. 
//References:
//The ideas of basic rules of the game is from https://www.youtube.com/watch?v=M18UNJDspO4
//The ideas relate to foul and yellow or red card are from http://www.football-bible.com/soccer-info/soccer-red-card.html
//The basic idea of running code after a particular time duration(or time count for showing message) is from http://stackoverflow.com/questions/2029118/run-code-for-x-seconds-in-java
//The idea of changing color of text is from http://stackoverflow.com/questions/565252/how-to-set-a-strings-color
//The idea of positions of the soccer players are from http://www.football-bible.com/soccer-info/soccer-positions-explained.html
///////////////////////////////////////////////////////////////////////////////////////////////////////



abstract public class SoccerPlay{
	
	protected int players;
    protected String teamName;
    protected String teamUniform;
	
	public SoccerPlay(int num, String name, String colors){
		players=num;
		teamName=name;
		teamUniform=colors;
	}
	
	public abstract void message();
	
	
	
}

