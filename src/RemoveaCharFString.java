import java.io.*;
import java.util.*;

public class RemoveaCharFString {
//String basic question:in this Question you have to delete a particular character from 
	//the given string.(skip a character)
	
	//eg:acbbccde  
	//character needs to remove:c
	//output:abbde
	//solving the problem recursively, ie checking every character with first character
	//of unprocessed string, if present then skip by calling recursive if not present 
	//add that char + substring of unprocessed string
	
	public static void main(String[] args) {
		//char relement='c';//the character we need to remove
		//String upstring="acbbccde";//given string
        //String pstring="";
        
       //skip("","acbbccde");
		
		System.out.println(skip("acbbccde"));
	}
	
//	public static void skip(String pstring,String upstring) {
//		if(upstring.isEmpty()) {
//			System.out.println(pstring);//the mistake i made was here, i forget to add
//			//this print statement "so checking base condition is really important"
//			return;
//		}
//		char ch=upstring.charAt(0);
//		if(ch=='c') {
//			skip(pstring,upstring.substring(1));
//		}else {
//			skip(pstring+ch,upstring.substring(1));
//		}
//		
//	}
	
	   //##The same code with return statement
	
	public static String skip(String upstring) {
		if(upstring.isEmpty()) {
			return "";
		}
		char ch=upstring.charAt(0);
		if(ch=='c') {
			return skip(upstring.substring(1));
		}else {
			return ch + skip(upstring.substring(1));
		}
		
	}
	
	
	

}
