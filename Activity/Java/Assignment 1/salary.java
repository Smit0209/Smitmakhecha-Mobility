import java.util.*;
public class salary{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Salary:");
    int a=sc.nextInt();
    
    if (a>8000)
      {
        System.out.println("Salary is too High");
        return;
      }
    if (a<0)
    {
        System.out.println("Salary is too Low");
        return;
      }
    System.out.println("Enter the Extra Shifts:");
    int b=sc.nextInt();
    if (b<0)
    {
        System.out.println("Salary is too Low");
        return;
      }
    else 
     {
     int c=(a/2);
     int d= b*((a/100)*2);
     int e= d+c;

     System.out.println("Saving is:"+e);

     }
       
    }
}