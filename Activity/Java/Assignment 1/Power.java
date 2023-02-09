import java.util.*;
public class Power{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number:");
    int a=sc.nextInt();
    if (a<0 )
     {
        System.out.println("Number too Small");
        
     }

    else if (a>32767)
    {
        System.out.println("Number too Large");
        
     }
    
     else {
      
       while (a%2==0){
        a =a/2;
       }
        if (a ==1)
        {
        System.out.println("Yes");
    
        }
        else
        {
        System.out.println("No");
    
       }
    }
    }
}
