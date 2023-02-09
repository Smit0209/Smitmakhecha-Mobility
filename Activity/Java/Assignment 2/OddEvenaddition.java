import java.util.*;
public class OddEvenaddition {
    public static void main(String[] args) {
        int Even=0,Odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int n=sc.nextInt();
        int[] array = new int[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
          {  
            array[i]=sc.nextInt();  
         }  

        for(int i = 0; i < n; i++)
        {
            if(array[i] % 2 == 0)
            {
                Even = Even + array[i];
            }
            else
            {
                Odd = Odd + array[i];
            }
        } 
        System.out.println(Math.max(Odd,Even));   
}  
} 
 