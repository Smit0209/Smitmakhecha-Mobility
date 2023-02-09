import java.util.*;

public class updateemployemain {
    public static void main(String[] args){
        int tempp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Your Name:");
        String ename= sc.nextLine(); 
        System.out.println("Enter the Your Address:");
        String eadd= sc.nextLine(); 
        System.out.println("Enter the Your Mobile:");
        int emob= sc.nextInt(); 
        updateemploye newe=new updateemploye(); 
        System.out.println("Employ Details are:"); 
        newe.setName(ename);  
        System.out.println("Name :" +newe.getName());
        newe.setaddress(eadd);  
        System.out.println("Address:" +newe.getaddress());
        newe.setmobile(emob);  
        System.out.println("Mobile :" +newe.getmobile());
        System.out.println("Verify the Details");
        
        while (tempp!= 4)
          {
            System.out.println("1. Update Employee Name \r\n"+
            "\r\n"+
            "2. Update Employee address \r\n" +
            "\r\n"+
            "3. Update Employee mobile \r\n"+
            "\r\n"+
            "4. All information correct/Exit \r\n"+
            "\r\n"+
            " Please Enter Your Choise \r\n");
          
          tempp = sc.nextInt();
          sc.nextLine();
             switch (tempp) {
              case 1: {
                System.out.println("Current Name is :" +newe.getName());
                System.out.println("Enter the new Name");
                ename = sc.nextLine();
                newe.setName(ename);
                break;
              }
              case 2: {
                System.out.println("Current Address is :" +newe.getaddress());
                System.out.println("Enter the new Address");
                eadd = sc.nextLine();
                newe.setaddress(eadd);
                break;
              }
              case 3: {
                System.out.println("Current Mobile is :" +newe.getmobile());
                System.out.println("Enter the Name");
                emob = sc.nextInt();
                newe.setmobile(emob);
                break;
              }
              case 4: {
                System.out.println("Information Updated Sucessfully");
                System.out.println("Name :" +newe.getName());
                System.out.println("Address:" +newe.getaddress());
                System.out.println("Mobile :" +newe.getmobile());
                break;
              }
              default:
              throw new IllegalArgumentException("Unexpected Value"+ tempp);

             }
        
            }    
}

}

