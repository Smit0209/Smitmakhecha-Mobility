package Exception;
import java.util.Scanner;
public class Teamname {
	

	

	    static String[] eligibleTeams = {"Chennai Super Kings", "Sun Risers", "Delhi Daredevils", 
	    		"Kings XI Punjab", "Kolkata Knight Riders", "Mumbai Indians", 
	    		"Rajasthan Royals", "Royal Challengers Bangalore"};

	       public static void main(String[] args) {
	              Scanner sc = new Scanner(System.in);
	              System.out.print("Enter the expected winner team of IPL Season 10: ");
	              String runnerTeam = sc.nextLine();
	              System.out.print("Enter the expected runner Team of IPL Season 10: ");
	              String winnerTeam = sc.nextLine();
	                try {
	                	checkExistTeam(runnerTeam);
	                	checkExistTeam(winnerTeam);
	                     System.out.println("Expected IPL Season 10 winner: " + runnerTeam);
	                     System.out.println("Expected IPL Season 10 runner: " + winnerTeam);
	               } catch (Teamnameexception e) {
	                     System.out.println("Error: " + e.getMessage());
	              }
	              }

	        public static void checkExistTeam(String team) throws Teamnameexception {
	             for (String eligibleTeam : eligibleTeams) {
	                 if (eligibleTeam.toLowerCase().equals(team.toLowerCase())) {
	                        return;
	                    }
	                }
	        throw new Teamnameexception("TeamNameNotFoundException: Entered team is not a part of IPL Season 10");
	       }
	}


