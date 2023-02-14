package Cill;
import java.util.*;
public class Remove {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<String> S1 = new ArrayList<String>();
	System.out.println("Enter the Player Details");
	System.out.println("Name");
	String Name = (sc.nextLine());
	S1.add(Name);
	System.out.println("Age");
	String Age = (sc.nextLine());
	S1.add(Age);
	System.out.println("Country");
	String Country = (sc.nextLine());
	S1.add(Country);
	
	System.out.println("Player Details are " + S1);
	System.out.println("Skill");
	String Skill = (sc.nextLine());
	

	System.out.println("Enter the postion where skill needs to be Inserted");
	
    int p= sc.nextInt();
    S1.add(p,Skill);
    
    for(String i :S1) {
    	System.out.println(i);
    }
    
    System.out.println("Enter the postion which you want to remove");
    int r= sc.nextInt();
    S1.remove(r);
    
    System.out.println("Details Afetr Removal");
    for(String i :S1) {
    	System.out.println(i);
    }
    
    
	
}
}