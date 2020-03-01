
package ipchecker;

import java.util.Arrays;
import java.util.Scanner;



public class IPchecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s; 
        String regex= "[0-9]+";
        
	//currently gets string from user
 	System.out.println("Enter a string"); 
 	s = sc.nextLine();

        //takes out the dots
        String[] x = s.split("\\.");
        
        //check for abc
        for(String str : x){
        System.out.println(str.matches(regex));
        }

        
    }
    
}
