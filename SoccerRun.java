////////////////////////////////////////////////////////////////////////////////////////////////////////
//File: SoccerRun.java
//Summary: Please Run this file to run the whole program and see the result of the mini final project.
//References:
//The ideal of basic rules of the game is from https://www.youtube.com/watch?v=M18UNJDspO4
//The ideals relate to foul and yellow or red card are from http://www.football-bible.com/soccer-info/soccer-red-card.html
//The basic ideal of running code after a particular time duration(or time count for showing message) is from http://stackoverflow.com/questions/2029118/run-code-for-x-seconds-in-java
//The ideal of changing color of text is from http://stackoverflow.com/questions/565252/how-to-set-a-strings-color
//The ideals of positions of the soccer players are from http://www.football-bible.com/soccer-info/soccer-positions-explained.html
///////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

public class SoccerRun{
	 
	 static int myPlayer;

	    
	public static void main(String[] args) throws InterruptedException, Exception{
		
		int select;
		int role;
	
		Scanner input=new Scanner(System.in);
		Scanner pickUp=new Scanner(System.in);
		Thread.sleep(1000);
		System.out.println("3.........");
		Thread.sleep(1000);
		System.out.println("2......");
		Thread.sleep(1000);
		System.out.println("1...");
		Thread.sleep(1000);
		System.out.println("Welcome to our interesting soccer game.");
		System.out.println("<----------------------------Game Start----------------------------->");
		System.out.println();
		System.out.println("Please make a choice among the following teams: ");
		System.out.println();
		Thread.sleep(2000);
		System.out.println("Press \"1\" to select \"Developer's Team\" Team.");
		Thread.sleep(1000);
		System.out.println("Press \"2\" to select \"Funny Fans\" Team.");
		Thread.sleep(1000);
		System.out.println("Press \"3\" to select \"Strong Power\" Team.");
		Thread.sleep(1000);
		System.out.println("Press \"4\" to select \"Fast Goal\" Team.");
		Thread.sleep(2000);
		System.out.print("Now, please make your choice: ");
		select= input.nextInt();
	    if (select !=1 && select !=2 && select !=3 && select !=4)
		 
			System.out.print("Invalid selection, program end.");
		
		else{
		Team sam= new Team(6, "Developer's Team", "green");
		Team fun= new Team(6, "Funny fans", "blue");
		Team strong= new Team(6, "Strong Power", "red");
		Team fast=new Team(6, "Fast Goal", "white");
		
		post(select);
		Thread.sleep(3000);
		System.out.println("Now, you may make a selection between \"coach\"(more details of team members, 6 members each team) or \"player\"(more skills,  in a random team with 4 members).");
		Thread.sleep(3000);
		System.out.println();
		System.out.println("Select \"1\" if you want to be a coach or, \"2\" if you want to be a player. (Kindly reminder: as a player, you will have to obey the arrangement and you will be automatically in a random team)");
		role=pickUp.nextInt();
		if(role !=1 && role !=2)
		System.out.print("Invalid selection, program end.");	
		else if(role==1){
			
			
			selectPlayer(select, role);
			coachS(select);
			          
			
		}
		
		else if(role==2){
			
			Random selections=new Random();
			System.out.println("You are now playing as the players, there will be four members in your team.");
			asPlayer(selections.nextInt(4)+1);
			
		}
		
		}
	}
	
	public static void asPlayer(int num) throws InterruptedException, Exception{
		
			System.out.print("\033[32m");
			System.out.println("Players in Developers' team: ");
			int[] n_ = {4,4,4,4};
			String[] i_={"Developer's Team","Developer's Team","Developer's Team","Developer's Team"};
			String[] t_={"green","green","green","green"};
			String[] x_={"Robert Creater", "Steve M.","Super L.","Jack Smith"};
			String[] g_={"Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y_={180, 175, 185, 170};
			int[] z_={4,3,5,2};
			int[] s_={10,9,8,6};
			int[] goals_={10,10,8,5};
			String[] p_={"Mid fielder","Forward","Defender","Defender"};
			for (int k=0; k<4; k++)
			{
			Players[] xu_=new Players[4];
			xu_[k]=new Players(n_[k], i_[k], t_[k],x_[k],g_[k], y_[k], z_[k], s_[k], goals_[k], p_[k]);
		    xu_[k].info();
			Thread.sleep(500);
			}
			
			System.out.print("\033[0m");
		     System.out.print("\033[34m");
		    System.out.println("Players in \"Funny Fans\": ");
			Thread.sleep(1000);
			int[] n1t = {4,4,4,4};
			String[] i1t={"Funny fans","Funny fans","Funny fans","Funny fans"};
			String[] t1t={"blue","blue","blue","blue"};
			String[] x1t={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young"};
			String[] g1t={"Speed very fast", "Very strong power", "Strong power",  "Over all perfect"};
			int[] y1t={176,188,192,185};
			int[] z1t={2,3,4,2};
			int[] s1t={1,5,8,2};
			int[] goals1t={2,2,8,6};
			String[] p1t={"Defender", "Goal Keeper", "Mid fielder","Forward"};
			for (int k1=0; k1<4; k1++)
			{
			Players[] fant=new Players[4];
			fant[k1]=new Players(n1t[k1], i1t[k1], t1t[k1],x1t[k1],g1t[k1], y1t[k1], z1t[k1], s1t[k1], goals1t[k1], p1t[k1]);
		    fant[k1].info();
			Thread.sleep(500);}
			System.out.print("\033[0m");
			Thread.sleep(1000);
			
			System.out.print("\033[31m");
			System.out.println("Players in \"Strong Power\": ");
			int[] n2t = {4,4,4,4};
			String[] i2t={"Strong Power","Strong Power","Strong Power","Strong Power"};
			String[] t2t={"red","red","red","red"};
			String[] x2t={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan"};
			String[] g2t={"Speed very fast", "Very strong power", "Good experiences", "Over all perfect"};
			int[] y2t={185,188,170,175};
			int[] z2t={5,4,3,1};
			int[] s2t={5,8,3,5};
			int[] goals2t={2,2,6,8};
			String[] p2t={"Defender", "Goal Keeper", "Mid fielder","Forward"};
			for (int k2=0; k2<4; k2++)
			{
			Players[] strongst=new Players[4];
			strongst[k2]=new Players(n2t[k2], i2t[k2], t2t[k2],x2t[k2],g2t[k2], y2t[k2], z2t[k2], s2t[k2], goals2t[k2], p2t[k2]);
		
			strongst[k2].info();
			Thread.sleep(500);}
			System.out.print("\033[0m");
			
			Thread.sleep(1000);
			System.out.println("Players in \"Fast Goal\": ");
			int[] n3t = {4,4,4,4};
			String[] i3t={"Fast Goal","Fast Goal","Fast Goal","Fast Goal"};
			String[] t3t={"white","white","white","white"};
			String[] x3t={"Jason H.", "Peter M.","George Star","Great Goal"};
			String[] g3t={"Speed very fast", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y3t={169,171,188,192};
			int[] z3t={4,2,3,1};
			int[] s3t={7,7,2,4};
			int[] goals3t={7,6,9,5};
			String[] p3t={"Defender", "Goal Keeper", "Mid fielder","Forward"};
			for (int k3=0; k3<4; k3++)
			{
			Players[] goalTt=new Players[4];
			goalTt[k3]=new Players(n3t[k3], i3t[k3], t3t[k3],x3t[k3],g3t[k3], y3t[k3], z3t[k3], s3t[k3], goals3t[k3], p3t[k3]);
		    goalTt[k3].info();
	
			Thread.sleep(500);}
		
		
		
		Thread.sleep(2000);
		Scanner scans=new Scanner(System.in);
		if (num==1){
			
			Random randoms= new Random();
			System.out.print("\033[32m");
			System.out.println("Your team initiated, the following are your players: ");
			int[] n = {6,6,6,6};
			String[] i={"Developer's Team","Developer's Team","Developer's Team","Developer's Team"};
			String[] t={"green","green","green","green"};
			String[] x={"Robert Creater", "Steve M.","Super L.","Jack Smith"};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details"};
			int[] y={180, 175, 185,188};
			int[] z={4,5,4,4};
			int[] s={10,9,8,9};
			int[] goals={10,10,8,5};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward"};
			for (int k=0; k<4; k++)
			{
			Players[] xu=new Players[4];
			xu[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(4)], y[k], z[k], s[randoms.nextInt(4)], goals[k], p[k]);
		    xu[k].info();
			Thread.sleep(1000);}
			System.out.print("\033[0m");
			
			Random randomsM= new Random();
			String[] m1={"Robert Creater", "Steve M.","Super L.","Jack Smith"};
			int[] m2= {10,7,8,8};
			int[] m3={9, randomsM.nextInt(10),9,8};
			double[] perf=new double[4];
			int[] kic=new int[4];
			int[] special= new int[4];
			SkillAndEvent[] xiao = new SkillAndEvent[4];
			int win=0;
			int win1=0;
			int win2=0;
			int win3=0;
			
			int tot=0;
			int tot1=0;
			int tot2=0;
			int tot3=0;
		    for (int m=0; m<4; m++){
				xiao[m]= new SkillAndEvent(m1[m],m2[m],m3[randomsM.nextInt(4)] );
				perf[m]=xiao[m].perform();
				kic[m]=xiao[m].kick();
				special[m]=xiao[m].powerKick();
				}
			Thread.sleep(2000);	
			System.out.println("You are now against the first opponent!");
			
			
			String[]m4 ={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young"};
			int[] m5= {8,6,9,randomsM.nextInt(9)};
			int[] m6={randomsM.nextInt(6), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(8)};
			double[] perf1=new double[4];
			int[] kic1=new int[4];
			int[] special1= new int[4];
			SkillAndEvent[] xiao1 = new SkillAndEvent[4];
			for (int c=0; c<4; c++){
				xiao1[c]= new SkillAndEvent(m4[c],m5[c],m6[randomsM.nextInt(4)] );
				perf1[c]=xiao1[c].perform();
				kic1[c]=xiao1[c].kick();
				special1[c]=xiao1[c].powerKick();
			}
			
			String[] m7={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan"};
			int[] m8= {12,4,4,randomsM.nextInt(9)};
			int[] m9={randomsM.nextInt(6), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(8)};
			double[] perf2=new double[4];
			int[] kic2=new int[4];
			int[] special2= new int[4];
			SkillAndEvent[] xiao2 = new SkillAndEvent[4];
			for (int c1=0; c1<4; c1++){
				xiao2[c1]= new SkillAndEvent(m7[c1],m8[c1],m9[randomsM.nextInt(4)] );
				perf2[c1]=xiao2[c1].perform();
				kic2[c1]=xiao2[c1].kick();
				special2[c1]=xiao2[c1].powerKick();
			}
			
			String[] m10={"Jason H.", "Peter M.","George Star","Great Goal"};
			int[] m11= {9,7,9,randomsM.nextInt(9)};
			int[] m12={randomsM.nextInt(20), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(3)};
			double[] perf3=new double[4];
			int[] kic3=new int[4];
			int[] special3= new int[4];
			SkillAndEvent[] xiao3 = new SkillAndEvent[4];
			for (int c2=0; c2<4; c2++){
				xiao3[c2]= new SkillAndEvent(m10[c2],m11[c2],m12[randomsM.nextInt(4)] );
				perf3[c2]=xiao3[c2].perform();
				kic3[c2]=xiao3[c2].kick();
				special3[c2]=xiao3[c2].powerKick();
			}
			
			
			
			for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special[matchi]>=special1[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special1[matchi]>special[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf[matchi]>=perf1[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic1[matchi]>kic[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic[cont]>=kic1[cont]){
					System.out.println("Defended!");
				}
				else if(perf1[cont]>perf[cont]){
					System.out.println("Nice Goal!");
					win1+=1;
					tot1+=1;
				}
				}
			if (win>=win1){	
			System.out.println("First game ended, your team won by: " +(win+1-win1));
			win=0; win1=0;
			System.out.println("Other two teams are matching.");
			Thread.sleep(1000);
			System.out.println("Matching...");
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic2[cont]>=kic3[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf3[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
				win3 += 2;
				tot3+=2;
				}
				}
			
			 if (win2>=win3){
				 System.out.println("Strong Power is the winner by: "+ (win2+1-win3));
				 win2=0; win3=0;
				 Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			 for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special[matchi]>=special2[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special2[matchi]>special[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf[matchi]>=perf2[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic2[matchi]>kic[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic[cont]>=kic2[cont]){
					System.out.println("Defended!");
				}
				else if(perf2[cont]>perf[cont]){
					System.out.println("Nice Goal!");
					win2+=1;
					tot2+=1;
				}
				}
			
			Thread.sleep(1000);	
			if (win>=win2){	
			System.out.println("Game ended, you won by: " +(win+1-win2));
			System.out.println("Our winner is Developer's Team.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and total scores are: " + tot);
						 output.println("Second place is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Sorry for Funny fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win2>win){
				 System.out.println("Game ended, you lost the game.");
				 System.out.println("Our winner is Strong Power.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Second place is \"Developer's Team\" and total scores are: " +tot);
						 output.println("Sorry for Funny fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Thomas Parker"); 
						 output.close();	
				 
				 
			 } 
			  
			 }
			
			 else if (win3>win2){
				 
				  System.out.println("Fast Goal is the winner by: "+ (win3-win2));
				  win3=0; win2=0;
				  Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			 for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special[matchi]>=special3[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special3[matchi]>special[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf[matchi]>=perf3[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic3[matchi]>kic[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic[cont]>=kic3[cont]){
					System.out.println("Defended!");
				}
				else if(perf3[cont]>perf[cont]){
					System.out.println("Nice Goal!");
					win3+=1;
					tot3+=1;
				}
				}
			
			Thread.sleep(1000);	
			if (win>=win3){	
			System.out.println("Game ended, you won by: " +(win+1-win3));
			System.out.println("Our winner is Developer's Team.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and total scores are: " + tot);
						 output.println("Second place is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Sorry for Funny fans and Strong Power, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win3>win){
				 System.out.println("Game ended, you lost the game.");
				 System.out.println("Our winner is Fast Goal.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Second place is \"Developer's Team\" and total scores are: " + tot);
						 output.println("Sorry for Funny fans and Strong Power, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
				 
				 
			 } 
			 }
			
			
			}
	       
		   
		   else if(win1>win){
		   System.out.println("First game ended, your team lost.");
		   win1=0; win=0;
		   System.out.println("Other two teams are matching.");
			Thread.sleep(1000);
			System.out.println("Matching...");
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic2[cont]>=kic3[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf3[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
				win3 += 2;
				tot3+=2;}
				}
			
			 if (win2>=win3){
				 System.out.println("Strong Power is the winner by: "+ (win2+1-win3));
				 win2=0; win3=0;
				 Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic2[cont]>=kic1[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf1[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
				win1 += 2;
				tot1+=2;}
				}
			
			Thread.sleep(1000);	
			if (win1>=win2){	
			System.out.println("Our winner is Funny Fans.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny fans\" and total scores are: " + tot1);
						 output.println("Second place is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Sorry forDeveloper's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win2>win1){
				 System.out.println("Our winner is Strong Power.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Second place is \"Funny fans\" and total scores are: " + tot1);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Thomas Parker"); 
						 output.close();	
				 
				 
			 } 
			  
			 }
			
			 else if (win3>win2){
				 
				  System.out.println("Fast Goal is the winner by: "+ (win3-win2));
				  win3=0; win2=0;
				  Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic3[cont]>=kic1[cont]){
					System.out.println("Defended!");
					win3 +=2;
					tot3+=2;
				}
				else if(perf1[cont]>perf3[cont]){
					System.out.println("Nice Goal!");
				win1 += 2;
				tot1+=2;}
				}
			
			
			Thread.sleep(1000);	
			if (win1>=win3){	
			
			System.out.println("Our winner is Funny Fans.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny fans \" and total scores are: " + tot1);
						 output.println("Second place is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win3>win1){
				 System.out.println("Our winner is Fast Goal.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Second place is \"Funny fans\" and total scores are: " + tot1);
						 output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
				 
				 
			 } 
			 }
		   
		   
		   }
			
			
			
			}
			
			if (num==2){
			
			Random randoms= new Random();
			System.out.print("\033[34m");
			System.out.println("Your team initiated, the following are your players: ");
			int[] n = {6,6,6,6};
			String[] i={"Funny Fans","Funny Fans","Funny Fans","Funny Fans"};
			String[] t={"blue","blue","blue","blue"};
			String[] x={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young"};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details"};
			int[] y={180, 175, 185,188};
			int[] z={4,5,4,4};
			int[] s={10,9,8,9};
			int[] goals={10,10,8,5};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward"};
			for (int k=0; k<4; k++)
			{
			Players[] xu=new Players[4];
			xu[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(4)], y[k], z[k], s[randoms.nextInt(4)], goals[k], p[k]);
		    xu[k].info();
			Thread.sleep(1000);}
			System.out.print("\033[0m");
			
			Random randomsM= new Random();
			String[] m1={"Robert Creater", "Steve M.","Super L.","Jack Smith"};
			int[] m2= {10,7,8,8};
			int[] m3={9, randomsM.nextInt(10),9,8};
			double[] perf=new double[4];
			int[] kic=new int[4];
			int[] special= new int[4];
			SkillAndEvent[] xiao = new SkillAndEvent[4];
			int win=0;
			int win1=0;
			int win2=0;
			int win3=0;
			
			int tot=0;
			int tot1=0;
			int tot2=0;
			int tot3=0;
		    for (int m=0; m<4; m++){
				xiao[m]= new SkillAndEvent(m1[m],m2[m],m3[randomsM.nextInt(4)] );
				perf[m]=xiao[m].perform();
				kic[m]=xiao[m].kick();
				special[m]=xiao[m].powerKick();
				}
			Thread.sleep(2000);	
			System.out.println("You are now against the first opponent!");
			
			
			String[]m4 ={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young"};
			int[] m5= {8,6,9,randomsM.nextInt(9)};
			int[] m6={randomsM.nextInt(6), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(8)};
			double[] perf1=new double[4];
			int[] kic1=new int[4];
			int[] special1= new int[4];
			SkillAndEvent[] xiao1 = new SkillAndEvent[4];
			for (int c=0; c<4; c++){
				xiao1[c]= new SkillAndEvent(m4[c],m5[c],m6[randomsM.nextInt(4)] );
				perf1[c]=xiao1[c].perform();
				kic1[c]=xiao1[c].kick();
				special1[c]=xiao1[c].powerKick();
			}
			
			String[] m7={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan"};
			int[] m8= {12,4,4,randomsM.nextInt(9)};
			int[] m9={randomsM.nextInt(6), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(8)};
			double[] perf2=new double[4];
			int[] kic2=new int[4];
			int[] special2= new int[4];
			SkillAndEvent[] xiao2 = new SkillAndEvent[4];
			for (int c1=0; c1<4; c1++){
				xiao2[c1]= new SkillAndEvent(m7[c1],m8[c1],m9[randomsM.nextInt(4)] );
				perf2[c1]=xiao2[c1].perform();
				kic2[c1]=xiao2[c1].kick();
				special2[c1]=xiao2[c1].powerKick();
			}
			
			String[] m10={"Jason H.", "Peter M.","George Star","Great Goal"};
			int[] m11= {9,7,9,randomsM.nextInt(9)};
			int[] m12={randomsM.nextInt(20), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(3)};
			double[] perf3=new double[4];
			int[] kic3=new int[4];
			int[] special3= new int[4];
			SkillAndEvent[] xiao3 = new SkillAndEvent[4];
			for (int c2=0; c2<4; c2++){
				xiao3[c2]= new SkillAndEvent(m10[c2],m11[c2],m12[randomsM.nextInt(4)] );
				perf3[c2]=xiao3[c2].perform();
				kic3[c2]=xiao3[c2].kick();
				special3[c2]=xiao3[c2].powerKick();
			}
			
			
			
			for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special1[matchi]>=special[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special[matchi]>special1[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf1[matchi]>=perf[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic[matchi]>kic1[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic1[cont]>=kic[cont]){
					System.out.println("Defended!");
				}
				else if(perf[cont]>perf1[cont]){
					System.out.println("Nice Goal!");
					win1+=1;
					tot1+=1;
				}
				}
			if (win>=win1){	
			System.out.println("First game ended, your team won by: " +(win+1-win1));
			win=0; win1=0;
			System.out.println("Other two teams are matching.");
			Thread.sleep(1000);
			System.out.println("Matching...");
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic2[cont]>=kic3[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf3[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
				win3 += 2;
				tot3+=2;
				}
				}
			
			 if (win2>=win3){
				 System.out.println("Strong Power is the winner by: "+ (win2+1-win3));
				 win2=0; win3=0;
				 Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			 for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special1[matchi]>=special2[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special2[matchi]>special1[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf1[matchi]>=perf2[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic2[matchi]>kic1[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic1[cont]>=kic2[cont]){
					System.out.println("Defended!");
				}
				else if(perf2[cont]>perf1[cont]){
					System.out.println("Nice Goal!");
					win2+=1;
					tot2+=1;
				}
				}
			
			Thread.sleep(1000);	
			if (win>=win2){	
			System.out.println("Game ended, you won by: " +(win+1-win2));
			System.out.println("Our winner is Fanny Fans.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and total scores are: " + tot);
						 output.println("Second place is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win2>win){
				 System.out.println("Game ended, you lost the game.");
				 System.out.println("Our winner is Strong Power.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Second place is \"Fanny Fans\" and total scores are: " +tot);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Thomas Parker"); 
						 output.close();	
				 
				 
			 } 
			  
			 }
			
			 else if (win3>win2){
				 
				  System.out.println("Fast Goal is the winner by: "+ (win3-win2));
				  win3=0; win2=0;
				  Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			 for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special1[matchi]>=special3[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special3[matchi]>special1[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf1[matchi]>=perf3[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic3[matchi]>kic1[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic1[cont]>=kic3[cont]){
					System.out.println("Defended!");
				}
				else if(perf3[cont]>perf1[cont]){
					System.out.println("Nice Goal!");
					win3+=1;
					tot3+=1;
				}
				}
			
			Thread.sleep(1000);	
			if (win>=win3){	
			System.out.println("Game ended, you won by: " +(win+1-win3));
			System.out.println("Our winner is Funny Fans.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and total scores are: " + tot);
						 output.println("Second place is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win3>win){
				 System.out.println("Game ended, you lost the game.");
				 System.out.println("Our winner is Fast Goal.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Second place is \"Funny Fans\" and total scores are: " + tot);
						 output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
				 
				 
			 } 
			 }
			
			
			}
	       
		   
		   else if(win1>win){
		   System.out.println("First game ended, your team lost.");
		   win1=0; win=0;
		   System.out.println("Other two teams are matching.");
			Thread.sleep(1000);
			System.out.println("Matching...");
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic2[cont]>=kic3[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf3[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
				win3 += 2;
				tot3+=2;}
				}
			
			 if (win2>=win3){
				 System.out.println("Strong Power is the winner by: "+ (win2+1-win3));
				 win2=0; win3=0;
				 Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic2[cont]>=kic[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
				win1 += 2;
				tot1+=2;}
				}
			
			Thread.sleep(1000);	
			if (win1>=win2){	
			System.out.println("Our winner is Developer's Team.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and total scores are: " + tot1);
						 output.println("Second place is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win2>win1){
				 System.out.println("Our winner is Strong Power.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Second place is \"Developer's Team\" and total scores are: " + tot1);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Thomas Parker"); 
						 output.close();	
				 
				 
			 } 
			  
			 }
			
			 else if (win3>win2){
				 
				  System.out.println("Fast Goal is the winner by: "+ (win3-win2));
				  win3=0; win2=0;
				  Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic3[cont]>=kic[cont]){
					System.out.println("Defended!");
					win3 +=2;
					tot3+=2;
				}
				else if(perf[cont]>perf3[cont]){
					System.out.println("Nice Goal!");
				win1 += 2;
				tot1+=2;}
				}
			
			
			Thread.sleep(1000);	
			if (win1>=win3){	
			
			System.out.println("Our winner is Developer's Team.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team \" and total scores are: " + tot1);
						 output.println("Second place is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Sorry for Funny Fans and Strong Power, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win3>win1){
				 System.out.println("Our winner is Fast Goal.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Second place is \"Developer's Team\" and total scores are: " + tot1);
						 output.println("Sorry for Funny Fans and Strong Power, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
				 
				 
			 } 
			 }
		   
		   
		   }
			
			
			
			}
		
		if (num==3){
			Random randoms= new Random();
			
			System.out.print("\033[31m");
			 System.out.println("Your team initiated, the following are your players: ");
			int[] n = {6,6,6,6};
			String[] i={"Strong Power","Strong Power","Strong Power","Strong Power"};
			String[] t={"red","red","red","red"};
			String[] x={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan"};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Great soccer controlling skill"};
			int[] y={185,188,170,175};
			int[] z={5,4,4,randoms.nextInt(5)};
			int[] s={1,2,randoms.nextInt(4),8};
			int[] goals={2,2,6,randoms.nextInt(8)};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward"};
			for (int k=0; k<4; k++)
			{
			Players[] strongs=new Players[4];
			strongs[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(4)], y[k], z[k], s[randoms.nextInt(4)], goals[k], p[k]);
		    strongs[k].info();
			Thread.sleep(500);}
		System.out.print("\033[0m");
		
		Random randomsM= new Random();
			String[] m1={"Robert Creater", "Steve M.","Super L.","Jack Smith"};
			int[] m2= {10,7,8,8};
			int[] m3={9, randomsM.nextInt(10),9,8};
			double[] perf=new double[4];
			int[] kic=new int[4];
			int[] special= new int[4];
			SkillAndEvent[] xiao = new SkillAndEvent[4];
			int win=0;
			int win1=0;
			int win2=0;
			int win3=0;
			
			int tot=0;
			int tot1=0;
			int tot2=0;
			int tot3=0;
		    for (int m=0; m<4; m++){
				xiao[m]= new SkillAndEvent(m1[m],m2[m],m3[randomsM.nextInt(4)] );
				perf[m]=xiao[m].perform();
				kic[m]=xiao[m].kick();
				special[m]=xiao[m].powerKick();
				}
			Thread.sleep(2000);	
			System.out.println("You are now against the first opponent!");
			
			
			String[]m4 ={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young"};
			int[] m5= {8,6,9,randomsM.nextInt(9)};
			int[] m6={randomsM.nextInt(6), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(8)};
			double[] perf1=new double[4];
			int[] kic1=new int[4];
			int[] special1= new int[4];
			SkillAndEvent[] xiao1 = new SkillAndEvent[4];
			for (int c=0; c<4; c++){
				xiao1[c]= new SkillAndEvent(m4[c],m5[c],m6[randomsM.nextInt(4)] );
				perf1[c]=xiao1[c].perform();
				kic1[c]=xiao1[c].kick();
				special1[c]=xiao1[c].powerKick();
			}
			
			String[] m7={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan"};
			int[] m8= {12,4,4,randomsM.nextInt(9)};
			int[] m9={randomsM.nextInt(6), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(8)};
			double[] perf2=new double[4];
			int[] kic2=new int[4];
			int[] special2= new int[4];
			SkillAndEvent[] xiao2 = new SkillAndEvent[4];
			for (int c1=0; c1<4; c1++){
				xiao2[c1]= new SkillAndEvent(m7[c1],m8[c1],m9[randomsM.nextInt(4)] );
				perf2[c1]=xiao2[c1].perform();
				kic2[c1]=xiao2[c1].kick();
				special2[c1]=xiao2[c1].powerKick();
			}
			
			String[] m10={"Jason H.", "Peter M.","George Star","Great Goal"};
			int[] m11= {9,7,9,randomsM.nextInt(9)};
			int[] m12={randomsM.nextInt(20), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(3)};
			double[] perf3=new double[4];
			int[] kic3=new int[4];
			int[] special3= new int[4];
			SkillAndEvent[] xiao3 = new SkillAndEvent[4];
			for (int c2=0; c2<4; c2++){
				xiao3[c2]= new SkillAndEvent(m10[c2],m11[c2],m12[randomsM.nextInt(4)] );
				perf3[c2]=xiao3[c2].perform();
				kic3[c2]=xiao3[c2].kick();
				special3[c2]=xiao3[c2].powerKick();
			}
			
			
			
			for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special2[matchi]>=special[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special[matchi]>special2[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf2[matchi]>=perf[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic[matchi]>kic2[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic2[cont]>=kic[cont]){
					System.out.println("Defended!");
				}
				else if(perf[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
					win1+=1;
					tot1+=1;
				}
				}
			if (win>=win1){	
			System.out.println("First game ended, your team won by: " +(win+1-win1));
			win=0; win1=0;
			System.out.println("Other two teams are matching.");
			Thread.sleep(1000);
			System.out.println("Matching...");
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic1[cont]>=kic3[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf3[cont]>perf1[cont]){
					System.out.println("Nice Goal!");
				win3 += 2;
				tot3+=2;
				}
				}
			
			 if (win2>=win3){
				 System.out.println("Funny Fans is the winner by: "+ (win2+1-win3));
				 win2=0; win3=0;
				 Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			 for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special2[matchi]>=special1[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special1[matchi]>special2[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf2[matchi]>=perf1[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic1[matchi]>kic2[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic2[cont]>=kic1[cont]){
					System.out.println("Defended!");
				}
				else if(perf1[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
					win2+=1;
					tot2+=1;
				}
				}
			
			Thread.sleep(1000);	
			if (win>=win2){	
			System.out.println("Game ended, you won by: " +(win+1-win2));
			System.out.println("Our winner is Strong Power.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and total scores are: " + tot);
						 output.println("Second place is \"Funny Fans\" and total scores are: " + tot2);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win2>win){
				 System.out.println("Game ended, you lost the game.");
				 System.out.println("Our winner is Funny Fans.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and total scores are: " + tot2);
						 output.println("Second place is \"Strong Power\" and total scores are: " +tot);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Thomas Parker"); 
						 output.close();	
				 
				 
			 } 
			  
			 }
			
			 else if (win3>win2){
				 
				  System.out.println("Fast Goal is the winner by: "+ (win3-win2));
				  win3=0; win2=0;
				  Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			 for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special2[matchi]>=special3[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special3[matchi]>special2[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf2[matchi]>=perf3[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic3[matchi]>kic2[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic2[cont]>=kic3[cont]){
					System.out.println("Defended!");
				}
				else if(perf3[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
					win3+=1;
					tot3+=1;
				}
				}
			
			Thread.sleep(1000);	
			if (win>=win3){	
			System.out.println("Game ended, you won by: " +(win+1-win3));
			System.out.println("Our winner is Strong Power.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and total scores are: " + tot);
						 output.println("Second place is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Sorry for Developer's Team and Funny Fans, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win3>win){
				 System.out.println("Game ended, you lost the game.");
				 System.out.println("Our winner is Fast Goal.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Second place is \"Strong Power\" and total scores are: " + tot);
						 output.println("Sorry for Developer's Team and Funny Fans, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
				 
				 
			 } 
			 }
			
			
			}
	       
		   
		   else if(win1>win){
		   System.out.println("First game ended, your team lost.");
		   win1=0; win=0;
		   System.out.println("Other two teams are matching.");
			Thread.sleep(1000);
			System.out.println("Matching...");
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic1[cont]>=kic3[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf3[cont]>perf1[cont]){
					System.out.println("Nice Goal!");
				win3 += 2;
				tot3+=2;}
				}
			
			 if (win2>=win3){
				 System.out.println("Funny Fans is the winner by: "+ (win2+1-win3));
				 win2=0; win3=0;
				 Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic1[cont]>=kic[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf[cont]>perf1[cont]){
					System.out.println("Nice Goal!");
				win1 += 2;
				tot1+=2;}
				}
			
			Thread.sleep(1000);	
			if (win1>=win2){	
			System.out.println("Our winner is Developer's Team.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and total scores are: " + tot1);
						 output.println("Second place is \"Funny Fans\" and total scores are: " + tot2);
						 output.println("Sorry for Strong Power and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win2>win1){
				 System.out.println("Our winner is Funny Fans.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and total scores are: " + tot2);
						 output.println("Second place is \"Developer's Team\" and total scores are: " + tot1);
						 output.println("Sorry for Strong Power and Fast Goal, they lost the games.");
						 output.println("Our star player is: Thomas Parker"); 
						 output.close();	
				 
				 
			 } 
			  
			 }
			
			 else if (win3>win2){
				 
				  System.out.println("Fast Goal is the winner by: "+ (win3-win2));
				  win3=0; win2=0;
				  Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic3[cont]>=kic[cont]){
					System.out.println("Defended!");
					win3 +=2;
					tot3+=2;
				}
				else if(perf[cont]>perf3[cont]){
					System.out.println("Nice Goal!");
				win1 += 2;
				tot1+=2;}
				}
			
			
			Thread.sleep(1000);	
			if (win1>=win3){	
			
			System.out.println("Our winner is Developer's Team.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team \" and total scores are: " + tot1);
						 output.println("Second place is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Sorry for Funny Fans and Strong Power, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win3>win1){
				 System.out.println("Our winner is Fast Goal.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and total scores are: " + tot3);
						 output.println("Second place is \"Developer's Team\" and total scores are: " + tot1);
						 output.println("Sorry for Funny Fans and Strong Power, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
				 
			 }
			 } 
			 }
			
			
		}
	    
		if (num==4){
			Random randoms= new Random();
			
			System.out.print("\033[0m");
			 System.out.println("Your team initiated, the following are your players: ");
			int[] n = {6,6,6,6};
			String[] i={"Fast Goal","Fast Goal","Fast Goal","Fast Goal"};
			String[] t={"White","White","White","White"};
			String[] x={"Jason H.", "Peter M.","George Star","Great Goal"};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Great soccer controlling skill"};
			int[] y={185,188,170,175};
			int[] z={5,4,4,randoms.nextInt(5)};
			int[] s={1,2,randoms.nextInt(4),8};
			int[] goals={2,2,6,randoms.nextInt(8)};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward"};
			for (int k=0; k<4; k++)
			{
			Players[] strongs=new Players[4];
			strongs[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(4)], y[k], z[k], s[randoms.nextInt(4)], goals[k], p[k]);
		    strongs[k].info();
			Thread.sleep(500);}
		System.out.print("\033[0m");
		
		Random randomsM= new Random();
			String[] m1={"Robert Creater", "Steve M.","Super L.","Jack Smith"};
			int[] m2= {10,7,8,8};
			int[] m3={9, randomsM.nextInt(10),9,8};
			double[] perf=new double[4];
			int[] kic=new int[4];
			int[] special= new int[4];
			SkillAndEvent[] xiao = new SkillAndEvent[4];
			int win=0;
			int win1=0;
			int win2=0;
			int win3=0;
			
			int tot=0;
			int tot1=0;
			int tot2=0;
			int tot3=0;
		    for (int m=0; m<4; m++){
				xiao[m]= new SkillAndEvent(m1[m],m2[m],m3[randomsM.nextInt(4)] );
				perf[m]=xiao[m].perform();
				kic[m]=xiao[m].kick();
				special[m]=xiao[m].powerKick();
				}
			Thread.sleep(2000);	
			System.out.println("You are now against the first opponent!");
			
			
			String[]m4 ={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young"};
			int[] m5= {8,6,9,randomsM.nextInt(9)};
			int[] m6={randomsM.nextInt(6), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(8)};
			double[] perf1=new double[4];
			int[] kic1=new int[4];
			int[] special1= new int[4];
			SkillAndEvent[] xiao1 = new SkillAndEvent[4];
			for (int c=0; c<4; c++){
				xiao1[c]= new SkillAndEvent(m4[c],m5[c],m6[randomsM.nextInt(4)] );
				perf1[c]=xiao1[c].perform();
				kic1[c]=xiao1[c].kick();
				special1[c]=xiao1[c].powerKick();
			}
			
			String[] m7={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan"};
			int[] m8= {12,4,4,randomsM.nextInt(9)};
			int[] m9={randomsM.nextInt(6), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(8)};
			double[] perf2=new double[4];
			int[] kic2=new int[4];
			int[] special2= new int[4];
			SkillAndEvent[] xiao2 = new SkillAndEvent[4];
			for (int c1=0; c1<4; c1++){
				xiao2[c1]= new SkillAndEvent(m7[c1],m8[c1],m9[randomsM.nextInt(4)] );
				perf2[c1]=xiao2[c1].perform();
				kic2[c1]=xiao2[c1].kick();
				special2[c1]=xiao2[c1].powerKick();
			}
			
			String[] m10={"Jason H.", "Peter M.","George Star","Great Goal"};
			int[] m11= {9,7,9,randomsM.nextInt(9)};
			int[] m12={randomsM.nextInt(20), randomsM.nextInt(10),randomsM.nextInt(10),randomsM.nextInt(3)};
			double[] perf3=new double[4];
			int[] kic3=new int[4];
			int[] special3= new int[4];
			SkillAndEvent[] xiao3 = new SkillAndEvent[4];
			for (int c2=0; c2<4; c2++){
				xiao3[c2]= new SkillAndEvent(m10[c2],m11[c2],m12[randomsM.nextInt(4)] );
				perf3[c2]=xiao3[c2].perform();
				kic3[c2]=xiao3[c2].kick();
				special3[c2]=xiao3[c2].powerKick();
			}
			
			
			
			for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special3[matchi]>=special1[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special1[matchi]>special3[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf3[matchi]>=perf1[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic1[matchi]>kic3[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic3[cont]>=kic1[cont]){
					System.out.println("Defended!");
				}
				else if(perf1[cont]>perf3[cont]){
					System.out.println("Nice Goal!");
					win1+=1;
					tot1+=1;
				}
				}
			if (win>=win1){	
			System.out.println("First game ended, your team won by: " +(win+1-win1));
			win=0; win1=0;
			System.out.println("Other two teams are matching.");
			Thread.sleep(1000);
			System.out.println("Matching...");
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic2[cont]>=kic[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
				win3 += 2;
				tot3+=2;
				}
				}
			
			 if (win2>=win3){
				 System.out.println("Developer's Team is the winner by: "+ (win2+1-win3));
				 win2=0; win3=0;
				 Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			 for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special3[matchi]>=special2[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special2[matchi]>special3[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf3[matchi]>=perf2[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic2[matchi]>kic3[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic3[cont]>=kic2[cont]){
					System.out.println("Defended!");
				}
				else if(perf2[cont]>perf3[cont]){
					System.out.println("Nice Goal!");
					win2+=1;
					tot2+=1;
				}
				}
			
			Thread.sleep(1000);	
			if (win>=win2){	
			System.out.println("Game ended, you won by: " +(win+1-win2));
			System.out.println("Our winner is Fast Goal.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and total scores are: " + tot);
						 output.println("Second place is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Sorry for Developer's Team and Funny Fans, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win2>win){
				 System.out.println("Game ended, you lost the game.");
				 System.out.println("Our winner is Strong Power.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Second place is \"Fast Goal\" and total scores are: " +tot);
						 output.println("Sorry for Developer's Team and Funny Fans, they lost the games.");
						 output.println("Our star player is: Thomas Parker"); 
						 output.close();	
				 
				 
			 } 
			  
			 }
			
			 else if (win3>win2){
				 
				  System.out.println("Developer's Team is the winner by: "+ (win3-win2));
				  win3=0; win2=0;
				  Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			 for (int matchi=0; matchi<4; matchi++){
		    Goalgate gate= new Goalgate();
			System.out.println("Press 2 for Skilled kick. Or any other number for normal kick.");
			int great=scans.nextInt();
			if (great==2){
				if (special3[matchi]>=special[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(special[matchi]>special3[matchi]){
					System.out.println("Defended!");
				}
			}
			
			else {
				if (perf3[matchi]>=perf[matchi]){
					System.out.println("Nice goal!");
					win+=1;
					tot+=1;
				}
				else if(kic[matchi]>kic3[matchi]){
					System.out.println("Defended!");
				}
				
			}
			
			}
			
			System.out.println("First half ended! Please take a relax.");
			Thread.sleep(5000);
			
			for (int cont=0; cont <4; cont++){
				Thread.sleep(1000);
				if (kic3[cont]>=kic[cont]){
					System.out.println("Defended!");
				}
				else if(perf[cont]>perf3[cont]){
					System.out.println("Nice Goal!");
					win3+=1;
					tot3+=1;
				}
				}
			
			Thread.sleep(1000);	
			if (win>=win3){	
			System.out.println("Game ended, you won by: " +(win+1-win3));
			System.out.println("Our winner is Fast Goal.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and total scores are: " + tot);
						 output.println("Second place is \"Developer's Team\" and total scores are: " + tot3);
						 output.println("Sorry for Strong Power and Funny Fans, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win3>win){
				 System.out.println("Game ended, you lost the game.");
				 System.out.println("Our winner is Developer's Team.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and total scores are: " + tot3);
						 output.println("Second place is \"Fast Goal\" and total scores are: " + tot);
						 output.println("Sorry for Strong Power and Funny Fans, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
				 
				 
			 } 
			 }
			
			
			}
	       
		   
		   else if(win1>win){
		   System.out.println("First game ended, your team lost.");
		   win1=0; win=0;
		   System.out.println("Other two teams are matching.");
			Thread.sleep(1000);
			System.out.println("Matching...");
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic2[cont]>=kic[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
				win3 += 2;
				tot3+=2;}
				}
			
			 if (win2>=win3){
				 System.out.println("Strong Power is the winner by: "+ (win2+1-win3));
				 win2=0; win3=0;
				 Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic2[cont]>=kic1[cont]){
					System.out.println("Defended!");
					win2 +=2;
					tot2+=2;
				}
				else if(perf1[cont]>perf2[cont]){
					System.out.println("Nice Goal!");
				win1 += 2;
				tot1+=2;}
				}
			
			Thread.sleep(1000);	
			if (win1>=win2){	
			System.out.println("Our winner is Funny Fans.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and total scores are: " + tot1);
						 output.println("Second place is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win2>win1){
				 System.out.println("Our winner is Strong Power.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and total scores are: " + tot2);
						 output.println("Second place is \"Funny Fans\" and total scores are: " + tot1);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Thomas Parker"); 
						 output.close();	
				 
				 
			 } 
			  
			 }
			
			 else if (win3>win2){
				 
				  System.out.println("Developer's Team is the winner by: "+ (win3-win2));
				  win3=0; win2=0;
				  Thread.sleep(3000);
				 System.out.println("Final Matching: ");
			 
			for (int cont=0; cont <4; cont++){
				Thread.sleep(200);
				if (kic[cont]>=kic1[cont]){
					System.out.println("Defended!");
					win3 +=2;
					tot3+=2;
				}
				else if(perf1[cont]>perf[cont]){
					System.out.println("Nice Goal!");
				win1 += 2;
				tot1+=2;}
				}
			
			
			Thread.sleep(1000);	
			if (win1>=win3){	
			
			System.out.println("Our winner is Funny Fans.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans \" and total scores are: " + tot1);
						 output.println("Second place is \"Developer's Team\" and total scores are: " + tot3);
						 output.println("Sorry for Fast Goal and Strong Power, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();		
			  }
			  
			 else if(win3>win1){
				 System.out.println("Our winner is Developer's Team.");
			System.out.println("Details of the matching is generated and saved in the file within this folder.");
           java.io.File files = new java.io.File("wcResult.txt");
		    java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and total scores are: " + tot3);
						 output.println("Second place is \"Funny Fans\" and total scores are: " + tot1);
						 output.println("Sorry for Fast Goal and Strong Power, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
				 
			 }
			 } 
			 }
			
			
		}
		
	}
	
	
	public static void coachS(int select) throws InterruptedException, Exception{
		
		
			

            int scores=0;
			int scores1=0;
			int scores2=0;
			int scores3=0;
			
			if (select==1){
			
			Thread.sleep(1000);
			
			System.out.print("\033[34m");
		    System.out.println("Players in \"Funny Fans\": ");
			Random randoms1= new Random();
			Thread.sleep(3000);
			int[] n1 = {6,6,6,6,6,6};
			String[] i1={"Funny fans","Funny fans","Funny fans","Funny fans","Funny fans","Funny fans"};
			String[] t1={"blue","blue","blue","blue","blue","blue"};
			String[] x1={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young", "Philips Roberts","Allen Walker"};
			String[] g1={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y1={176,188,192,185,170,182};
			int[] z1={2,3,4,2,2,3};
			int[] s1={1,5,8,2,9,10};
			int[] goals1={2,2,8,6,9,8};
			String[] p1={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k1=0; k1<6; k1++)
			{
			Players[] fan=new Players[6];
			fan[k1]=new Players(n1[k1], i1[k1], t1[k1],x1[k1],g1[randoms1.nextInt(6)], y1[k1], z1[k1], s1[randoms1.nextInt(6)], goals1[k1], p1[k1]);
		    fan[k1].info();
			scores1+=fan[k1].goals();
			Thread.sleep(1000);}
			System.out.print("\033[0m");
			Thread.sleep(3000);
			
			Random randoms2= new Random();
			Random randoms3= new Random();
			System.out.print("\033[31m");
			System.out.println("Players in \"Strong Power\": ");
			int[] n2 = {6,6,6,6,6,6};
			String[] i2={"Strong Power","Strong Power","Strong Power","Strong Power","Strong Power","Strong Power"};
			String[] t2={"red","red","red","red","red","red"};
			String[] x2={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan","James Watson","Howard Torres"};
			String[] g2={"Speed very fast", "Very strong power", "Strong power", "Great soccer controlling skill","Good experiences", "Over all perfect"};
			int[] y2={185,188,170,175,192,180};
			int[] z2={5,4,4,5,3,1};
			int[] s2={1,2,5,8,3,5};
			int[] goals2={2,2,6,8,randoms2.nextInt(8),9};
			String[] p2={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender", "Defender"};
			for (int k2=0; k2<6; k2++)
			{
			Players[] strongs=new Players[6];
			strongs[k2]=new Players(n2[k2], i2[k2], t2[k2],x2[k2],g2[randoms2.nextInt(6)], y2[k2], z2[k2], s2[randoms2.nextInt(6)], goals2[k2], p2[k2]);
		    scores2+=strongs[k2].goals();
			strongs[k2].info();
			Thread.sleep(1000);}
			System.out.print("\033[0m");
			
			Thread.sleep(3000);
			System.out.println("Players in \"Fast Goal\": ");
			int[] n3 = {6,6,6,6,6,6};
			String[] i3={"Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal"};
			String[] t3={"white","white","white","white","white","white"};
			String[] x3={"Jason H.", "Peter M.","George Star","Great Goal", "Mason Henry","Ken Simpson"};
			String[] g3={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y3={169,171,188,192,178,179};
			int[] z3={4,2,3,1,2,1};
			int[] s3={7,7,2,4,9,5};
			int[] goals3={7,randoms3.nextInt(7),9,5,4,10};
			String[] p3={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k3=0; k3<6; k3++)
			{
			Players[] goalT=new Players[6];
			goalT[k3]=new Players(n3[k3], i3[k3], t3[k3],x3[k3],g3[randoms3.nextInt(6)], y3[k3], z3[k3], s3[randoms3.nextInt(6)], goals3[k3], p3[k3]);
		    goalT[k3].info();
			scores3+=goalT[k3].goals();
			Thread.sleep(1000);}
			
			
			Thread.sleep(3000);
			
			Random randomV=new Random();
			int venu=randomV.nextInt(3);
			String[] v={"Asia","America","Europe"};
			System.out.println("Game Venue: "+v[venu]);
			Thread.sleep(3000);
			System.out.println("1st competition: \"Developer's Team\" VS \"Funny Fans\"");
			if (venu==0){
			System.out.println("Home Advantage!");
			Random randoms= new Random();
			int[] n = {6,6,6,6,6,6};
			String[] i={"Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team"};
			String[] t={"green","green","green","green","green","green"};
			String[] x={"Robert Creater", "Steve M.","Super L.","Jack Smith", "Wilson Miller","Clark C."};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y={180, 175, 185, 170, 190, 188};
			int[] z={4,3,5,2,4,4};
			int[] s={10,9,8,6,7,9};
			int[] goals={10,10,8,5,7,5};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k=0; k<6; k++)
			{
			Players[] xu=new Players[6];
			xu[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(6)], y[k], z[k], s[randoms.nextInt(6)], goals[k], p[k]);
		    scores+=xu[k].goals(5);}
			Thread.sleep(3000);
			if (scores>=scores1){
				System.out.println("Your team won the first game by "+(scores+1-scores1));
				Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
				if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Strong Power\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores2){
						System.out.println("Your team won by "+(scores+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and total scores are: " + scores);
						 output.println("Second place is \"Strong Power\" and total scores are: " + scores2);
						 output.println("Sorry for Funny fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores);
						 output.println("Sorry for Funny fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Fast Goal\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores3){
						System.out.println("Your team won by "+(scores+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Funny fans and Strong Power, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
				}
				else {
					System.out.println("Your team lost by "+(scores3-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores1);
						output.println("Sorry for Funny fans and Strong Power, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
					
					
				}
				
			}
			
			}
			else {
				System.out.println("Your team lost the first game by "+(scores1-scores));
                Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Strong Power vs Funny Fans");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores2){
						System.out.println("Funny Fans won by "+(scores1+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Fast Goal");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores3){
						System.out.println("Funny Fans won by "+(scores1+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Fast Goal\" won by "+(scores3-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
				}				
			}
			}
			else{
				
			Random randoms= new Random();
			int[] n = {6,6,6,6,6,6};
			String[] i={"Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team"};
			String[] t={"green","green","green","green","green","green"};
			String[] x={"Robert Creater", "Steve M.","Super L.","Jack Smith", "Wilson Miller","Clark C."};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y={180, 175, 185, 170, 190, 188};
			int[] z={4,3,5,2,4,4};
			int[] s={10,9,8,6,7,9};
			int[] goals={10,10,8,5,7,5};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k=0; k<6; k++)
			{
			Players[] xu=new Players[6];
			xu[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(6)], y[k], z[k], s[randoms.nextInt(6)], goals[k], p[k]);
		    scores+=xu[k].goals();}
			Thread.sleep(3000);
			if (scores>=scores1){
				System.out.println("Your team won the first game by "+(scores+1-scores1));
				Thread.sleep(3000);
				
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Strong Power\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores2){
						System.out.println("Your team won by "+(scores+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Funny fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores);
						 output.println("Sorry for Funny fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
					
					
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Fast Goal\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores3){
						System.out.println("Your team won by "+(scores+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Funny fans and Strong Power, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
				}
				else {
					System.out.println("Your team lost by "+(scores3-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores1);
						output.println("Sorry for Funny fans and Strong Power, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
					
					
				}
				}
				
				
				
			}
			else {
				System.out.println("Your team lost the first game by "+(scores1-scores));
                 Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Strong Power vs Funny Fans");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores2){
						System.out.println("Funny Fans won by "+(scores1+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Fast Goal");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores3){
						System.out.println("Funny Fans won by "+(scores1+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Fast Goal\" won by "+(scores3-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
								
			}
			
			}
			}	
				
			}
			
			if (select==2){
			
			Thread.sleep(1000);
			Random randoms= new Random();
			System.out.print("\033[32m");
			System.out.println("Players in Developer's Team: ");
			int[] n = {6,6,6,6,6,6};
			String[] i={"Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team"};
			String[] t={"green","green","green","green","green","green"};
			String[] x={"Robert Creater", "Steve M.","Super L.","Jack Smith", "Wilson Miller","Clark C."};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y={180, 175, 185, 170, 190, 188};
			int[] z={4,3,5,2,4,4};
			int[] s={10,9,8,6,7,9};
			int[] goals={10,10,8,5,7,5};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k=0; k<6; k++)
			{
			Players[] xu=new Players[6];
			xu[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(6)], y[k], z[k], s[randoms.nextInt(6)], goals[k], p[k]);
		    xu[k].info();
			scores1+=xu[k].goals();
			Thread.sleep(1000);}
			
			System.out.print("\033[0m");
			
			
			Random randoms2= new Random();
			Random randoms3= new Random();
			System.out.print("\033[31m");
			System.out.println("Players in \"Strong Power\": ");
			int[] n2 = {6,6,6,6,6,6};
			String[] i2={"Strong Power","Strong Power","Strong Power","Strong Power","Strong Power","Strong Power"};
			String[] t2={"red","red","red","red","red","red"};
			String[] x2={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan","James Watson","Howard Torres"};
			String[] g2={"Speed very fast", "Very strong power", "Strong power", "Great soccer controlling skill","Good experiences", "Over all perfect"};
			int[] y2={185,188,170,175,192,180};
			int[] z2={5,4,4,5,3,1};
			int[] s2={1,2,5,8,3,5};
			int[] goals2={2,2,6,8,randoms2.nextInt(8),9};
			String[] p2={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender", "Defender"};
			for (int k2=0; k2<6; k2++)
			{
			Players[] strongs=new Players[6];
			strongs[k2]=new Players(n2[k2], i2[k2], t2[k2],x2[k2],g2[randoms2.nextInt(6)], y2[k2], z2[k2], s2[randoms2.nextInt(6)], goals2[k2], p2[k2]);
		    scores2+=strongs[k2].goals();
			strongs[k2].info();
			Thread.sleep(1000);}
			System.out.print("\033[0m");
			
			Thread.sleep(3000);
			System.out.println("Players in \"Fast Goal\": ");
			int[] n3 = {6,6,6,6,6,6};
			String[] i3={"Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal"};
			String[] t3={"white","white","white","white","white","white"};
			String[] x3={"Jason H.", "Peter M.","George Star","Great Goal", "Mason Henry","Ken Simpson"};
			String[] g3={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y3={169,171,188,192,178,179};
			int[] z3={4,2,3,1,2,1};
			int[] s3={7,7,2,4,9,5};
			int[] goals3={7,randoms3.nextInt(7),9,5,4,10};
			String[] p3={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k3=0; k3<6; k3++)
			{
			Players[] goalT=new Players[6];
			goalT[k3]=new Players(n3[k3], i3[k3], t3[k3],x3[k3],g3[randoms3.nextInt(6)], y3[k3], z3[k3], s3[randoms3.nextInt(6)], goals3[k3], p3[k3]);
		    goalT[k3].info();
			scores3+=goalT[k3].goals();
			Thread.sleep(1000);}
			
			
			Thread.sleep(3000);
			
			Random randomV=new Random();
			int venu=randomV.nextInt(3);
			String[] v={"Asia","America","Europe"};
			System.out.println("Game Venue: "+v[venu]);
			Thread.sleep(3000);
			System.out.println("1st competition: \"Developer's Team\" VS \"Funny Fans\"");
			if (venu==1){
			System.out.println("Home Advantage!");
			Random randoms1= new Random();
			Thread.sleep(3000);
			int[] n1 = {6,6,6,6,6,6};
			String[] i1={"Funny fans","Funny fans","Funny fans","Funny fans","Funny fans","Funny fans"};
			String[] t1={"blue","blue","blue","blue","blue","blue"};
			String[] x1={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young", "Philips Roberts","Allen Walker"};
			String[] g1={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y1={176,188,192,185,170,182};
			int[] z1={2,3,4,2,2,3};
			int[] s1={1,5,8,2,9,10};
			int[] goals1={2,2,8,6,9,8};
			String[] p1={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k1=0; k1<6; k1++)
			{
			Players[] fan=new Players[6];
			fan[k1]=new Players(n1[k1], i1[k1], t1[k1],x1[k1],g1[randoms1.nextInt(6)], y1[k1], z1[k1], s1[randoms1.nextInt(6)], goals1[k1], p1[k1]);
			scores+=fan[k1].goals(5);}
			Thread.sleep(3000);
			if (scores>=scores1){
				System.out.println("Your team won the first game by "+(scores+1-scores1));
				Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
				if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Strong Power\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores2){
						System.out.println("Your team won by "+(scores+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Fast Goal\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores3){
						System.out.println("Your team won by "+(scores+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
				}
				else {
					System.out.println("Your team lost by "+(scores3-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores);
						output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
					
					
				}
				
			}
			
			}
			else {
				System.out.println("Your team lost the first game by "+(scores1-scores));
                Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Strong Power vs Developer's Team");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores2){
						System.out.println("Developer's Team won by "+(scores1+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores1);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores1);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Developer's Team vs Fast Goal");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores3){
						System.out.println("Developer's Team won by "+(scores1+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores1);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Funny Fans and Strong Power, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Fast Goal\" won by "+(scores3-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores1);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
				}				
			}
			}
			else{
				
			Random randoms5= new Random();
			Random randoms1= new Random();
			Thread.sleep(3000);
			int[] n1 = {6,6,6,6,6,6};
			String[] i1={"Funny fans","Funny fans","Funny fans","Funny fans","Funny fans","Funny fans"};
			String[] t1={"blue","blue","blue","blue","blue","blue"};
			String[] x1={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young", "Philips Roberts","Allen Walker"};
			String[] g1={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y1={176,188,192,185,170,182};
			int[] z1={2,3,4,2,2,3};
			int[] s1={1,5,8,2,9,10};
			int[] goals1={2,2,8,6,9,8};
			String[] p1={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k1=0; k1<6; k1++)
			{
			Players[] fan=new Players[6];
			fan[k1]=new Players(n1[k1], i1[k1], t1[k1],x1[k1],g1[randoms1.nextInt(6)], y1[k1], z1[k1], s1[randoms1.nextInt(6)], goals1[k1], p1[k1]);
			scores+=fan[k1].goals();}
			Thread.sleep(3000);
			if (scores>=scores1){
				System.out.println("Your team won the first game by "+(scores+1-scores1));
				Thread.sleep(3000);
				
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Strong Power\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores2){
						System.out.println("Your team won by "+(scores+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
					
					
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Fast Goal\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores3){
						System.out.println("Your team won by "+(scores+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
				}
				else {
					System.out.println("Your team lost by "+(scores3-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores);
						output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
					
					
				}
				}
				
				
				
			}
			else {
				System.out.println("Your team lost the first game by "+(scores1-scores));
                 Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Strong Power vs Developer's Team");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores2){
						System.out.println("Developer's Team won by "+(scores1+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores1);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores1);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Fast Goal");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores3){
						System.out.println("Developer's Team won by "+(scores1+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores1);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Funny Fans and Strong Power, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Fast Goal\" won by "+(scores3-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores1);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
								
			}
			
			}
			}	
				
			}
			
			
			if (select==3){
			
			Thread.sleep(1000);
			Random randoms= new Random();
			System.out.print("\033[32m");
			System.out.println("Players in Developer's Team: ");
			int[] n = {6,6,6,6,6,6};
			String[] i={"Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team"};
			String[] t={"green","green","green","green","green","green"};
			String[] x={"Robert Creater", "Steve M.","Super L.","Jack Smith", "Wilson Miller","Clark C."};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y={180, 175, 185, 170, 190, 188};
			int[] z={4,3,5,2,4,4};
			int[] s={10,9,8,6,7,9};
			int[] goals={10,10,8,5,7,5};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k=0; k<6; k++)
			{
			Players[] xu=new Players[6];
			xu[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(6)], y[k], z[k], s[randoms.nextInt(6)], goals[k], p[k]);
		    xu[k].info();
			scores2+=xu[k].goals();
			Thread.sleep(1000);}
			
			System.out.print("\033[34m");
		    System.out.println("Players in \"Funny Fans\": ");
			Random randoms1= new Random();
			Random randoms2= new Random();
			Random randoms3= new Random();
			Thread.sleep(3000);
			int[] n1 = {6,6,6,6,6,6};
			String[] i1={"Funny fans","Funny fans","Funny fans","Funny fans","Funny fans","Funny fans"};
			String[] t1={"blue","blue","blue","blue","blue","blue"};
			String[] x1={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young", "Philips Roberts","Allen Walker"};
			String[] g1={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y1={176,188,192,185,170,182};
			int[] z1={2,3,4,2,2,3};
			int[] s1={1,5,8,2,9,10};
			int[] goals1={2,2,8,6,9,8};
			String[] p1={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k1=0; k1<6; k1++)
			{
			Players[] fan=new Players[6];
			fan[k1]=new Players(n1[k1], i1[k1], t1[k1],x1[k1],g1[randoms1.nextInt(6)], y1[k1], z1[k1], s1[randoms1.nextInt(6)], goals1[k1], p1[k1]);
		    fan[k1].info();
			scores1+=fan[k1].goals();
			Thread.sleep(1000);}
			System.out.print("\033[0m");
			Thread.sleep(3000);
			
			Thread.sleep(3000);
			System.out.println("Players in \"Fast Goal\": ");
			int[] n3 = {6,6,6,6,6,6};
			String[] i3={"Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal"};
			String[] t3={"white","white","white","white","white","white"};
			String[] x3={"Jason H.", "Peter M.","George Star","Great Goal", "Mason Henry","Ken Simpson"};
			String[] g3={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y3={169,171,188,192,178,179};
			int[] z3={4,2,3,1,2,1};
			int[] s3={7,7,2,4,9,5};
			int[] goals3={7,randoms3.nextInt(7),9,5,4,10};
			String[] p3={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k3=0; k3<6; k3++)
			{
			Players[] goalT=new Players[6];
			goalT[k3]=new Players(n3[k3], i3[k3], t3[k3],x3[k3],g3[randoms3.nextInt(6)], y3[k3], z3[k3], s3[randoms3.nextInt(6)], goals3[k3], p3[k3]);
		    goalT[k3].info();
			scores3+=goalT[k3].goals();
			Thread.sleep(1000);}
			
			
			Thread.sleep(3000);
			
			Random randomV=new Random();
			int venu=randomV.nextInt(3);
			String[] v={"Asia","America","Europe"};
			System.out.println("Game Venue: "+v[venu]);
			Thread.sleep(3000);
			System.out.println("1st competition: \"Strong Power\" VS \"Funny Fans\"");
			if (venu==2){
			System.out.println("Home Advantage!");
			int[] n2 = {6,6,6,6,6,6};
			String[] i2={"Strong Power","Strong Power","Strong Power","Strong Power","Strong Power","Strong Power"};
			String[] t2={"red","red","red","red","red","red"};
			String[] x2={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan","James Watson","Howard Torres"};
			String[] g2={"Speed very fast", "Very strong power", "Strong power", "Great soccer controlling skill","Good experiences", "Over all perfect"};
			int[] y2={185,188,170,175,192,180};
			int[] z2={5,4,4,5,3,1};
			int[] s2={1,2,5,8,3,5};
			int[] goals2={2,2,6,8,randoms2.nextInt(8),9};
			String[] p2={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender", "Defender"};
			for (int k2=0; k2<6; k2++)
			{
			Players[] strongs=new Players[6];
			strongs[k2]=new Players(n2[k2], i2[k2], t2[k2],x2[k2],g2[randoms2.nextInt(6)], y2[k2], z2[k2], s2[randoms2.nextInt(6)], goals2[k2], p2[k2]);
		    scores+=strongs[k2].goals(5);
			}
			
			
			Thread.sleep(3000);
			if (scores>=scores1){
				System.out.println("Your team won the first game by "+(scores+1-scores1));
				Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
				if (scores2>=scores3){
					System.out.println("\"Developer's Team\" won by "+(scores2+1-scores3)+" points.");
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Developer's Team\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores2){
						System.out.println("Your team won by "+(scores+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores2);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Developer's Team\" won by "+(scores2-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores2);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Fast Goal\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores3){
						System.out.println("Your team won by "+(scores+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Developer's Team and Funny Fans, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
				}
				else {
					System.out.println("Your team lost by "+(scores3-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores);
						output.println("Sorry for Developer's Team and Funny Fans, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
					
					
				}
				
			}
			
			}
			else {
				System.out.println("Your team lost the first game by "+(scores1-scores));
                Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Developer's Team\" won by "+(scores2+1-scores3)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Developer's Team");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores2){
						System.out.println("Funny Fans won by "+(scores1+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores2);
						 output.println("Sorry for Strong Power and Fast Goal, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Developer's Team\" won by "+(scores2-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores2);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Strong Power and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Fast Goal");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores3){
						System.out.println("Funny Fans won by "+(scores1+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Developer's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Fast Goal\" won by "+(scores3-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
				}				
			}
			}
			else{
				
			
			System.out.println("Players in \"Strong Power\": ");
			int[] n2 = {6,6,6,6,6,6};
			String[] i2={"Strong Power","Strong Power","Strong Power","Strong Power","Strong Power","Strong Power"};
			String[] t2={"red","red","red","red","red","red"};
			String[] x2={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan","James Watson","Howard Torres"};
			String[] g2={"Speed very fast", "Very strong power", "Strong power", "Great soccer controlling skill","Good experiences", "Over all perfect"};
			int[] y2={185,188,170,175,192,180};
			int[] z2={5,4,4,5,3,1};
			int[] s2={1,2,5,8,3,5};
			int[] goals2={2,2,6,8,randoms2.nextInt(8),9};
			String[] p2={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender", "Defender"};
			for (int k2=0; k2<6; k2++)
			{
			Players[] strongs=new Players[6];
			strongs[k2]=new Players(n2[k2], i2[k2], t2[k2],x2[k2],g2[randoms2.nextInt(6)], y2[k2], z2[k2], s2[randoms2.nextInt(6)], goals2[k2], p2[k2]);
		    scores+=strongs[k2].goals();
			}
			Thread.sleep(3000);
			if (scores>=scores1){
				System.out.println("Your team won the first game by "+(scores+1-scores1));
				Thread.sleep(3000);
				
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Developer's Team\" won by "+(scores2+1-scores3)+" points.");
					
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Developer's Team\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores2){
						System.out.println("Your team won by "+(scores+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores2);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Developer's Team\" won by "+(scores2-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores2);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores);
						 output.println("Sorry for Funny Fans and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
					
					
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Fast Goal\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores3){
						System.out.println("Your team won by "+(scores+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Developer's Team and Funny Fans, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
				}
				else {
					System.out.println("Your team lost by "+(scores3-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores);
						output.println("Sorry for Developer's Team and Funny Fans, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
					
					
				}
				}
				
				
				
			}
			else {
				System.out.println("Your team lost the first game by "+(scores1-scores));
                 Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Developer's Team\" won by "+(scores2+1-scores3)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Developer's Team");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores2){
						System.out.println("Funny Fans won by "+(scores1+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores2);
						 output.println("Sorry for Strong Power and Fast Goal, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Developer's Team\" won by "+(scores2-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores2);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Strong Power and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Fast Goal");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores3){
						System.out.println("Funny Fans won by "+(scores1+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Sorry for Develop's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Fast Goal\" won by "+(scores3-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores3);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Develop's Team and Strong Power, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
								
			}
			
			}
			}	
				
			}
			
			
			if (select==4){
			
			Thread.sleep(1000);
			Random randoms= new Random();
			System.out.print("\033[32m");
			System.out.println("Players in Developer's Team: ");
			int[] n = {6,6,6,6,6,6};
			String[] i={"Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team"};
			String[] t={"green","green","green","green","green","green"};
			String[] x={"Robert Creater", "Steve M.","Super L.","Jack Smith", "Wilson Miller","Clark C."};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y={180, 175, 185, 170, 190, 188};
			int[] z={4,3,5,2,4,4};
			int[] s={10,9,8,6,7,9};
			int[] goals={10,10,8,5,7,5};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k=0; k<6; k++)
			{
			Players[] xu=new Players[6];
			xu[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(6)], y[k], z[k], s[randoms.nextInt(6)], goals[k], p[k]);
		    xu[k].info();
			scores3+=xu[k].goals();
			Thread.sleep(1000);}
			
			System.out.print("\033[34m");
		    System.out.println("Players in \"Funny Fans\": ");
			Random randoms1= new Random();
			Random randoms2= new Random();
			Random randoms3= new Random();
			Thread.sleep(3000);
			int[] n1 = {6,6,6,6,6,6};
			String[] i1={"Funny fans","Funny fans","Funny fans","Funny fans","Funny fans","Funny fans"};
			String[] t1={"blue","blue","blue","blue","blue","blue"};
			String[] x1={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young", "Philips Roberts","Allen Walker"};
			String[] g1={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y1={176,188,192,185,170,182};
			int[] z1={2,3,4,2,2,3};
			int[] s1={1,5,8,2,9,10};
			int[] goals1={2,2,8,6,9,8};
			String[] p1={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k1=0; k1<6; k1++)
			{
			Players[] fan=new Players[6];
			fan[k1]=new Players(n1[k1], i1[k1], t1[k1],x1[k1],g1[randoms1.nextInt(6)], y1[k1], z1[k1], s1[randoms1.nextInt(6)], goals1[k1], p1[k1]);
		    fan[k1].info();
			scores1+=fan[k1].goals();
			Thread.sleep(1000);}
			System.out.print("\033[0m");
			Thread.sleep(3000);
			
			Thread.sleep(3000);
			System.out.print("\033[31m");
			System.out.println("Players in \"Strong Power\": ");
			int[] n2 = {6,6,6,6,6,6};
			String[] i2={"Strong Power","Strong Power","Strong Power","Strong Power","Strong Power","Strong Power"};
			String[] t2={"red","red","red","red","red","red"};
			String[] x2={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan","James Watson","Howard Torres"};
			String[] g2={"Speed very fast", "Very strong power", "Strong power", "Great soccer controlling skill","Good experiences", "Over all perfect"};
			int[] y2={185,188,170,175,192,180};
			int[] z2={5,4,4,5,3,1};
			int[] s2={1,2,5,8,3,5};
			int[] goals2={2,2,6,8,randoms2.nextInt(8),9};
			String[] p2={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender", "Defender"};
			for (int k2=0; k2<6; k2++)
			{
			Players[] strongs=new Players[6];
			strongs[k2]=new Players(n2[k2], i2[k2], t2[k2],x2[k2],g2[randoms2.nextInt(6)], y2[k2], z2[k2], s2[randoms2.nextInt(6)], goals2[k2], p2[k2]);
		    scores2+=strongs[k2].goals();
			strongs[k2].info();
			Thread.sleep(1000);}
			System.out.print("\033[0m");
			Thread.sleep(3000);
			
			Random randomV=new Random();
			int venu=randomV.nextInt(3);
			String[] v={"Asia","America","Europe"};
			System.out.println("Game Venue: "+v[venu]);
			Thread.sleep(3000);
			System.out.println("1st competition: \"Fast Goal\" VS \"Funny Fans\"");
			if (venu==0){
			System.out.println("Home Advantage!");
			int[] n3 = {6,6,6,6,6,6};
			String[] i3={"Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal"};
			String[] t3={"white","white","white","white","white","white"};
			String[] x3={"Jason H.", "Peter M.","George Star","Great Goal", "Mason Henry","Ken Simpson"};
			String[] g3={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y3={169,171,188,192,178,179};
			int[] z3={4,2,3,1,2,1};
			int[] s3={7,7,2,4,9,5};
			int[] goals3={7,randoms3.nextInt(7),9,5,4,10};
			String[] p3={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k3=0; k3<6; k3++)
			{
			Players[] goalT=new Players[6];
			goalT[k3]=new Players(n3[k3], i3[k3], t3[k3],x3[k3],g3[randoms3.nextInt(6)], y3[k3], z3[k3], s3[randoms3.nextInt(6)], goals3[k3], p3[k3]);
			scores+=goalT[k3].goals();
			}
			
			
			Thread.sleep(3000);
			if (scores>=scores1){
				System.out.println("Your team won the first game by "+(scores+1-scores1));
				Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
				if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Strong Power\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores2){
						System.out.println("Your team won by "+(scores+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Funny Fans and Developer's Team, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores);
						 output.println("Sorry for Funny Fans and Developer's Team, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Developer's Team\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores3){
						System.out.println("Your team won by "+(scores+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores3);
						 output.println("Sorry for Strong Power and Funny Fans, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
				}
				else {
					System.out.println("Your team lost by "+(scores3-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores3);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores);
						output.println("Sorry for Strong Power and Funny Fans, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
					
					
				}
				
			}
			
			}
			else {
				System.out.println("Your team lost the first game by "+(scores1-scores));
                Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Strong Power");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores2){
						System.out.println("Funny Fans won by "+(scores1+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Robert Creater"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Fast Goal\" won by "+(scores3-scores2)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Developer's Team");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores3){
						System.out.println("Funny Fans won by "+(scores1+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores3);
						 output.println("Sorry for Fast Goal and Strong Power, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Developer's Team\" won by "+(scores3-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores3);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Strong Power and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
				}				
			}
			}
			else{
				
			
			int[] n3 = {6,6,6,6,6,6};
			String[] i3={"Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal"};
			String[] t3={"white","white","white","white","white","white"};
			String[] x3={"Jason H.", "Peter M.","George Star","Great Goal", "Mason Henry","Ken Simpson"};
			String[] g3={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y3={169,171,188,192,178,179};
			int[] z3={4,2,3,1,2,1};
			int[] s3={7,7,2,4,9,5};
			int[] goals3={7,randoms3.nextInt(7),9,5,4,10};
			String[] p3={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k3=0; k3<6; k3++)
			{
			Players[] goalT=new Players[6];
			goalT[k3]=new Players(n3[k3], i3[k3], t3[k3],x3[k3],g3[randoms3.nextInt(6)], y3[k3], z3[k3], s3[randoms3.nextInt(6)], goals3[k3], p3[k3]);
			scores+=goalT[k3].goals();
			}
			Thread.sleep(3000);
			if (scores>=scores1){
				System.out.println("Your team won the first game by "+(scores+1-scores1));
				Thread.sleep(3000);
				
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Strong Power\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores2){
						System.out.println("Your team won by "+(scores+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Funny Fans and Developer's Team, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores);
						 output.println("Sorry for Funny Fans and Developer's Team, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
					
					
					
				}
				
				else {
					System.out.println("\"Developer's Team\" won by "+(scores3-scores2)+" points.");
					
					Thread.sleep(3000);
					System.out.println("Final Match: ");
					System.out.println("Your team vs \"Developer's Team\"");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores>=scores3){
						System.out.println("Your team won by "+(scores+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Fast Goal\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Fast Goal\" and scores are: " + scores);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores3);
						 output.println("Sorry for Strong Power and Funny Fans, they lost the games.");
						 output.println("Our star player is: Robert Creater"); 
						 output.close();
				}
				else {
					System.out.println("Your team lost by "+(scores3-scores)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores3);
						 output.println("Second place is \"Fast Goal\" and scores are: " + scores);
						output.println("Sorry for Strong Power and Funny Fans, they lost the games.");
						 output.println("Our star player is: George Star"); 
						 output.close();
					
					
				}
				}
				
				
				
			}
			else {
				System.out.println("Your team lost the first game by "+(scores1-scores));
                 Thread.sleep(3000);
				System.out.println();
				System.out.println("Other two teams' match: ");
				Thread.sleep(1000);
				System.out.println("Matching...");
				Thread.sleep(3000);
				System.out.println("Matching completed.");
				Thread.sleep(1000);
					if (scores2>=scores3){
					System.out.println("\"Strong Power\" won by "+(scores2+1-scores3)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Strong Power");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores2){
						System.out.println("Funny Fans won by "+(scores1+1-scores2)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Strong Power\" and scores are: " + scores2);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Strong Power\" won by "+(scores2-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Strong Power\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Strong Power\" and scores are: " + scores2);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Developer's Team and Fast Goal, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
					
				}
				
				else {
					System.out.println("\"Developer's Team\" won by "+(scores3-scores2)+" points.");
					System.out.println("Final Match: ");
					System.out.println("Funny Fans vs Developer's Team");
					Thread.sleep(1000);
					System.out.println("Matching...");
					Thread.sleep(3000);
					if(scores1>=scores3){
						System.out.println("Funny Fans won by "+(scores1+1-scores3)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Funny Fans\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Second place is \"Developer's Team\" and scores are: " + scores3);
						 output.println("Sorry for Fast Goal and Strong Power, they lost the games.");
						 output.println("Our star player is: Allen Walker"); 
						 output.close();
						 }
						 
						 else
						 {System.out.println("\"Developer's Team\" won by "+(scores3-scores1)+" points.");
						System.out.println("Game completed, details of the matches are generated in the file, Winner is: \"Developer's Team\"");
						  java.io.File files = new java.io.File("wcResult.txt");
		                 java.io.PrintWriter output = new java.io.PrintWriter(files);
						 output.println("Winner is \"Developer's Team\" and scores are: " + scores3);
						 output.println("Second place is \"Funny Fans\" and scores are: " + scores1);
						 output.println("Sorry for Fast Goal and Strong Power, they lost the games.");
						 output.println("Our star player is: Bell Morgan"); output.close();
						 }
								
			}
			
			}
			}	
				
			}
			
		
	}
	
	
	public static void post(int num){
		if (num==1){
			Team sam= new Team(6, "Developer's Team", "green");
			System.out.print("\033[32m");
		sam.message();
		System.out.print("\033[0m");
		}
		
		else if (num==2){
			Team fun= new Team(6, "Funny fans", "blue");
			System.out.print("\033[34m");
		fun.message();
		System.out.print("\033[0m");
		}
			
		else if (num==3){
			Team strong= new Team(6, "Strong Power", "red");
			System.out.print("\033[31m");
		strong.message();
		System.out.print("\033[0m");
		}
		
		else if (num==4){
			Team fast=new Team(6, "Fast Goal", "white");
			System.out.print("\033[0m");
		fast.message();
		System.out.print("\033[0m");
		}
		
	
	}
	
	public static void selectPlayer(int num, int role){
		if (num==1 && role==1){
			Random randoms= new Random();
			System.out.print("\033[32m");
			System.out.println("Your team initiated, the following are your players: ");
			int[] n = {6,6,6,6,6,6};
			String[] i={"Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team","Developer's Team"};
			String[] t={"green","green","green","green","green","green"};
			String[] x={"Robert Creater", "Steve M.","Super L.","Jack Smith", "Wilson Miller","Clark C."};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y={180, 175, 185, 170, 190, 188};
			int[] z={4,3,5,2,4,4};
			int[] s={10,9,8,6,7,9};
			int[] goals={10,10,8,5,7,5};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k=0; k<6; k++)
			{
			Players[] xu=new Players[6];
			xu[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(6)], y[k], z[k], s[randoms.nextInt(6)], goals[k], p[k]);
		    xu[k].info();}
			
			System.out.print("\033[0m");
		}
		else if (num==2 && role==1){
			Random randoms= new Random();
			System.out.print("\033[34m");
		    System.out.println("Your team initiated, the following are your players: ");
			int[] n = {6,6,6,6,6,6};
			String[] i={"Funny fans","Funny fans","Funny fans","Funny fans","Funny fans","Funny fans"};
			String[] t={"blue","blue","blue","blue","blue","blue"};
			String[] x={"Garcia Rodrigues", "Thomas Perez","Bob Turner","Jacky Young", "Philips Roberts","Allen Walker"};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y={176,188,192,185,170,182};
			int[] z={2,3,4,randoms.nextInt(5),2,3};
			int[] s={1,5,8,2,randoms.nextInt(7),randoms.nextInt(7)};
			int[] goals={2,2,8,6,9,8};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k=0; k<6; k++)
			{
			Players[] fan=new Players[6];
			fan[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(6)], y[k], z[k], s[randoms.nextInt(6)], goals[k], p[k]);
		    fan[k].info();}
		System.out.print("\033[0m");
		}
			
		else if (num==3 && role==1){
			Random randoms= new Random();
			
			System.out.print("\033[31m");
			 System.out.println("Your team initiated, the following are your players: ");
			int[] n = {6,6,6,6,6,6};
			String[] i={"Strong Power","Strong Power","Strong Power","Strong Power","Strong Power","Strong Power"};
			String[] t={"red","red","red","red","red","red"};
			String[] x={"Cox Cooper", "Thomas Parker","George Reed","Bell Morgan","James Watson","Howard Torres"};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Great soccer controlling skill","Good experiences", "Over all perfect"};
			int[] y={185,188,170,175,192,180};
			int[] z={5,4,4,randoms.nextInt(5),3,1};
			int[] s={1,2,randoms.nextInt(4),8,3,5};
			int[] goals={2,2,6,8,randoms.nextInt(8),9};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender", "Defender"};
			for (int k=0; k<6; k++)
			{
			Players[] strongs=new Players[6];
			strongs[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(6)], y[k], z[k], s[randoms.nextInt(6)], goals[k], p[k]);
		    strongs[k].info();}
		System.out.print("\033[0m");
		}
		
		else if (num==4 && role==1){
			Random randoms= new Random();
		
			System.out.print("\033[0m");
		System.out.println("Your team initiated, the following are your players: ");
			int[] n = {6,6,6,6,6,6};
			String[] i={"Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal","Fast Goal"};
			String[] t={"white","white","white","white","white","white"};
			String[] x={"Jason H.", "Peter M.","George Star","Great Goal", "Mason Henry","Ken Simpson"};
			String[] g={"Speed very fast", "Very strong power", "Strong power", "Attention-to-details", "Good experiences", "Over all perfect"};
			int[] y={169,171,188,192,178,179};
			int[] z={4,2,randoms.nextInt(5),randoms.nextInt(7),2,1};
			int[] s={7,7,2,4,randoms.nextInt(10),5};
			int[] goals={7,randoms.nextInt(7),randoms.nextInt(9),5,4,10};
			String[] p={"Defender", "Goal Keeper", "Mid fielder","Forward","Defender","Defender"};
			for (int k=0; k<6; k++)
			{
			Players[] goalT=new Players[6];
			goalT[k]=new Players(n[k], i[k], t[k],x[k],g[randoms.nextInt(6)], y[k], z[k], s[randoms.nextInt(6)], goals[k], p[k]);
		    goalT[k].info();}
		System.out.print("\033[0m");
		}
		
		
		
		
	}
	
}
