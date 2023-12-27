import java.util.*;

public class JavaString{
    public static void main(String[] args){
        Scanner scn= new  Scanner(System.in);
        String s=scn.nextLine();
        String s1=scn.nextLine();
        System.out.println("The length of the first string is "+s.length());
        System.out.println("The length of the second string is "+s1.length());
        if(s.length()==s1.length()){
            System.out.println("The length of the two strings is same ");
        }
        else{
            System.out.println("The length of the two strings is not same ");
        }
        if(s==s1){
            System.out.println("The two strings are same ");
        }
        else{
            System.out.println("The two strings are not same ");
        }
    }
}
