package Cill;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.*;

	public class Swap {

	    public static void main(String[] args) {
	        ArrayList<String> arrList = new ArrayList<String>();
	       
	        arrList.add("Gujarat Titans");
	        arrList.add("Rajasthan Royals");
	        arrList.add("Royal Challengers Bangalore");
	        arrList.add("Lucknow Super Giants");
	        arrList.add("Delhi Capitals");

	       

	        System.out.println("Elements in Arraylist before swap");
	        for (String element : arrList) {
	            System.out.println(element);
	        }

	        System.out.println("Enter the Position you want to Swap");
	        Scanner c= new Scanner(System.in);
	        int s= c.nextInt();
            
	        Collections.swap(arrList, 0, s);
	        System.out.println("Elements in Arraylist after swap");
	        for (String element : arrList) {
	            System.out.println(element);
	        }
	    }
	}

