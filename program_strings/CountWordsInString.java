package program_strings;

import java.util.Scanner;

// Write a java program to count the number of words in a string?
public class CountWordsInString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		 
        Scanner sc = new Scanner(System.in);
 
        String s=sc.nextLine();
       
        String[] words = s.split(" ");
        System.out.println(words[2]);
        
        System.out.println("Number of words in the string = "+words.length);


	}

}
