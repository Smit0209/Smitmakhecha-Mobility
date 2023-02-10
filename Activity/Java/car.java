public class car extends vehicle {


       
        private String audiosystem;
        private int numberofdoor;

        
      
       
       
      
        public car(String make, String vehnum, String fueltype, int fuelcap, int cc, String audiosystem,
                int numberofdoor) {
            super(make, vehnum, fueltype, fuelcap, cc);
            this.audiosystem = audiosystem;
            this.numberofdoor = numberofdoor;
        }






        public void carDetails() {  //details of car
            printDetails();  //calling method from parent class
            System.out.println("------Detailed Information-------");  
          System.out.println("Audio System:" + audiosystem);
          System.out.print("Number of Doors:"+numberofdoor);
        }

        
        
      }

