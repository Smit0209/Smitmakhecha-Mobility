import java.util.*;
public class Customermain {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Details ");
            String cust= sc.nextLine(); 
            String[] arrSplit = cust.split(",");
            String name = arrSplit[0];
            String address = arrSplit[1];
            String mobile = arrSplit[2];
            Customer newe=new Customer(); 
            System.out.println("Employ Details are:"); 
            newe.setName(name);  
            System.out.println("Name :" +newe.getName());
            newe.setaddress(address);  
            System.out.println("Address:" +newe.getaddress());
            newe.setmobile(mobile);  
            System.out.println("Mobile :" +newe.getmobile());
            
    }
    }
    

