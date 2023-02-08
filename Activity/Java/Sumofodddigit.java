import java.util.*;
public class Sumofodddigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int a=sc.nextInt();
        int s=0,r;
        if (a<0 || a>32767)
        {
            System.out.println("Please enter Valid Input");   
        }
        else{
        while (a>0){
            r=a%10;
            if (r%2==1) {
              s=s+r;
        }
        a =a/10;
    }
    System.out.println("The Sum of odd Number is:"+s); 
 }
 }
}
