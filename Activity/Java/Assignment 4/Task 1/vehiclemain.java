import java.util.*;
public class vehiclemain {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Select Vehicle Type \r\n"+ "1. Four Wheeler \r\n"+
        "\r\n"+
        "2. Two Wheeler \r\n" );
        int choice = sc.nextInt();

        System.out.println("Vehicle Make: ");
		String make = sc.next();
		
		System.out.println("Vehicle Number: ");
		String vehnum  = sc.next();
		
		System.out.println("Fuel Type:\r\n"
				+ "\r\n"
				+ "1.Petrol\r\n"
				+ "\r\n"
				+ "2.Diesel");
		int fuelTypeChoice = sc.nextInt();
		String fueltype = "";
		if(fuelTypeChoice==1) {
			fueltype = "Petrol";
		}
		else if(fuelTypeChoice==2) {
			fueltype = "Diesel"; 
		}
		
		System.out.println("Fuel Capacity: ");
		int fuelcap = sc.nextInt();
		
		System.out.println("Engine CC: ");
		int cc = sc.nextInt();
        

        if(choice==1) {
			System.out.println("Audio System: ");
			String audiosystem = sc.next();
			
			System.out.println("Number of Doors:");
			int numberofdoors = sc.nextInt();
			
			car fw1 = new car(make, vehnum, fueltype, fuelcap, cc , audiosystem, numberofdoors);
			
			fw1.carDetails();
			
			
			
			
		}
		else if(choice==2) {
			System.out.println("Kick Start Available(True/False): ");
			boolean kickstart = sc.nextBoolean();
			
			twowheeler tw1 = new twowheeler(make, vehnum, fueltype, fuelcap, cc , kickstart);
			
			tw1.twoDetails();
			
		}
		else {
			System.out.println("Invalid Input!");
		}

        
      }
      
    }

