import java.util.*;
public class Employeemain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Your Name:");
        String ename= sc.nextLine(); 
        System.out.println("Enter the Your Address:");
        String eadd= sc.nextLine(); 
        System.out.println("Enter the Your Mobile:");
        int emob= sc.nextInt(); 
        Employ newe=new Employ(); 
        System.out.println("Employ Details are:"); 
        newe.setName(ename);  
        System.out.println("Name :" +newe.getName());
        newe.setaddress(eadd);  
        System.out.println("Address:" +newe.getaddress());
        newe.setmobile(emob);  
        System.out.println("Mobile :" +newe.getmobile());
        
}
}
