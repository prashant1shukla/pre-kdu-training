import java.util.*;

public class JavaCollections {
    public static void main(String[] args)   
    {  
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        n=sc.nextInt();  
        String[] array = new String[10];  
        HashSet<String> set=new HashSet<String>();  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
            array[i]=sc.next(); 
            set.add(array[i]); 
        }  
        System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++)   
        {  
            System.out.println(array[i]);  
        }  

        System.out.println("Array elements are: ");  
        for (String ele : set) { 
            System.out.print(ele); 
            System.out.println(", Frequency of the Word: "+Collections.frequency(Arrays.asList(array),ele));
        } 
    }  
}
