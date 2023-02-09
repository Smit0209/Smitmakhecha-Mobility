import java.util.*;

public class leadermain {
   
    /**
    * @param args
    */
   public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Company Name:");
        String tname= sc.nextLine(); 
        System.out.println("Enter the Employees:");
        String cemp= sc.nextLine(); 
        
        System.out.println("Enter the Teamlead:");
        String tlead= sc.nextLine(); 
      
      if (cemp.contains(tlead))
    {
      leader newe =new leader(); 
      System.out.println("Company Details are"); 
      newe.setName(tname);  
      System.out.println("Team Name :" +newe.getName());
      newe.setemploy(cemp);  
      System.out.println("Employees :" +newe.getemploy());
      newe.setteamlead(tlead);  
      System.out.println("Team Lead :" +newe.getteamlead());
        }

        else{
         System.out.println("Invalid Input");
        }
}
}
    




