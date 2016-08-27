////////////////////////////////////////////////////////////////////////////////////////////////////////
//File: Team.java
//Summary: This is parent class of Players.
//References:
//The ideas of basic rules of the game is from https://www.youtube.com/watch?v=M18UNJDspO4
//The ideas relate to foul and yellow or red card are from http://www.football-bible.com/soccer-info/soccer-red-card.html
//The basic idea of running code after a particular time duration(or time count for showing message) is from http://stackoverflow.com/questions/2029118/run-code-for-x-seconds-in-java
//The idea of changing color of text is from http://stackoverflow.com/questions/565252/how-to-set-a-strings-color
//The idea of positions of the soccer players are from http://www.football-bible.com/soccer-info/soccer-positions-explained.html
///////////////////////////////////////////////////////////////////////////////////////////////////////


public class Team extends SoccerPlay{
	public Team(int num, String name, String colors){
		super(num, name, colors);
		
		
	}
	
	public void message(){
		System.out.println("<---------------------Team Information--------------------->");
		System.out.println("\tYour selected team: "+ teamName);
		System.out.println("\tplayers in your team(including substitutes players): "+ players);
		System.out.println("\tYour team's uniform color: "+ teamUniform);
		
		
	}
	
	
	
	
	
}