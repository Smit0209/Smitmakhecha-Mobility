import java.util.*;

public class inningsmain {
   
    public static void main(String[] args){
        String s1= "First";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the team Name:");
        String tname= sc.nextLine(); 
        System.out.println("Enter the Innings:");
        String tinn= sc.nextLine(); 
        System.out.println("Enter the Runs:");
        int trun= sc.nextInt(); 
        cricketinnings newe =new cricketinnings(); 
        System.out.println("Match Details"); 
        newe.setteamname(tname);  
        System.out.println("Team Name :" +newe.getteamname());
        newe.setinningname(tinn);  
        System.out.println("Innings :" +newe.getinningname());
        newe.setruns(trun);  
        System.out.println("Run :" +newe.getruns());
        if (tinn.equals(s1))
         {
            System.out.println("Needs "+(trun+1)+ " to win.");
         }
        else
         {
            System.out.println("Match Ended");
         }
}
}


