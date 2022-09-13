import java.io.*;
import java.util.*;

public class Subsequence {

	//Q:To find the subsequence of a string, ie, to find all the subsets in a string
	//logic of the program :solving recursively :similar to skip a character problem
	//check if the unprocessed string is empty if empty then print Processed string(empty)
	//declare ch is charAt(0) first position
	//write two recursive function either add it or remove it
	public static void main(String[] args) {
		
        subsequence("","abcd");

	}
	public static void subsequence(String emptystring,String string) {
		
		if(string.isEmpty()) {
			System.out.println(emptystring);//step 1.
			return;
		}
		
		char ch=string.charAt(0);//step 2;
		
		subsequence(emptystring+ch,string.substring(1));//step 3;
		subsequence(emptystring,string.substring(1));//The mistake i made was i forgot to
		//add string .substring method 
		
		
	}

}
