import java.util.*;
public class NameCoversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Your Name:");
        String str= sc.nextLine();
        String firstword= str.split(" ")[0];
        String lastword= str.split(" ")[1];
        System.out.println(firstword+" "+lastword.toUpperCase());

    }
}
