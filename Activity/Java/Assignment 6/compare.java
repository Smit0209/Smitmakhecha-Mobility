package Cill;
import java.util.ArrayList;
import java.util.*;
public class compare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> S1 = new ArrayList<String>();
	System.out.println("Enter top 5 player name for Season 14");
	S1.add(sc.nextLine());
	S1.add(sc.nextLine());
	S1.add(sc.nextLine());
	S1.add(sc.nextLine());
	S1.add(sc.nextLine());
	
	System.out.println("Season 14 Player : " + S1);

ArrayList<String> S2 = new ArrayList<String>();
System.out.println("Enter top 5 player name for Season 14");
S2.add(sc.nextLine());
S2.add(sc.nextLine());
S2.add(sc.nextLine());
S2.add(sc.nextLine());
S2.add(sc.nextLine());

System.out.println("Season 15 Player : " + S2);
 S1.retainAll(S2);

System.out.println("Consistent Scorer: "
                   + S1);

}

}