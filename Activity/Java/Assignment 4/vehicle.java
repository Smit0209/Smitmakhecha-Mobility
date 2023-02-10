public class vehicle {
  
  

   
        private String make; 
        private String vehnum; 
        private String fueltype;      
        private int fuelcap;
        private int cc;   
      
      
    
        public vehicle(String make, String vehnum, String fueltype, int fuelcap,int cc) {
          this.make = make;
          this.vehnum = vehnum;
          this.fueltype = fueltype;  
          this.fuelcap = fuelcap; 
          this.cc = cc; 
           
        }
      
      
        public void printDetails() {
            System.out.println("*****" + make+ "*****");
          System.out.println("------Basic Information------");
          System.out.println("Vehicle Number : " + vehnum);
          System.out.println("Fuel Type :"+ fueltype );
          System.out.println("Fuel Capacity " + fuelcap);
          System.out.println("Number of CC " + cc);
        }
        
      }

        
      

