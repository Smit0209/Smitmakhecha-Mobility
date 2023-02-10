public class twowheeler extends vehicle {


       
    private boolean kickstart;
  
  
   
    public twowheeler(String make, String vehnum, String fueltype, int fuelcap, int cc, boolean kickstart) {
        super(make, vehnum, fueltype, fuelcap, cc);
        this.kickstart = kickstart;
    }



    public void twoDetails() {  //details of car
       printDetails();     //calling method from parent class
      System.out.println("Kickstart Available:" + kickstart);
     
    }
    
  }

