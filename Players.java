////////////////////////////////////////////////////////////////////////////////////////////////////////
//File: Players.java
//Summary: This class allows player objects to be created.
//References:
//The ideas of basic rules of the game is from https://www.youtube.com/watch?v=M18UNJDspO4
//The ideas relate to foul and yellow or red card are from http://www.football-bible.com/soccer-info/soccer-red-card.html
//The basic idea of running code after a particular time duration(or time count for showing message) is from http://stackoverflow.com/questions/2029118/run-code-for-x-seconds-in-java
//The idea of changing color of text is from http://stackoverflow.com/questions/565252/how-to-set-a-strings-color
//The idea of positions of the soccer players are from http://www.football-bible.com/soccer-info/soccer-positions-explained.html
///////////////////////////////////////////////////////////////////////////////////////////////////////



public class Players extends Team{
	protected String playerName;
	protected String str;
	protected int height;
	protected int power;
	protected int speed;
	protected int goal;
	protected String playerPosition;
	public Players(int num, String name, String colors, String player, String good, int h, int p, int s, int g, String position){
		super(num, name, colors);
		playerName=player;
		str=good;
		height=h;
		power=p;
		speed=s;
		goal=g;
		playerPosition=position;
	}
	
	public void info(){
		System.out.println("<---------------------Player Information--------------------->");
		System.out.println("\tPlayer's team: "+ teamName);
		System.out.println("\tplayer's name): "+ playerName);
		System.out.println("\tPlayer's strong point: "+ str);
		System.out.println("\tPlayer's height(in cm): "+ height);
		System.out.println("\tPlayer's power: "+ power);
		System.out.println("\tPlayer's speed: "+ speed);
		System.out.println("\tPlayer's position: "+ playerPosition);
		}
		
	public int goals(){
		int x=power+speed+goal;
		return x;
			}
	public int goals(int home){
		int y=power+speed+goal+home;
		return y;
	}
	
	public int performance(){
		int m=power+speed+goal;
		return m;
	}
}