import java.io.*;
import java.util.*;

public class SkipAString {

	//IN this question we are removing or skipping an entire string from a given string
	public static void main(String[] args) {
		
		System.out.println(skip("dogcheesedoo"));

	}
	
	public static String skip(String str) {
		if(str.isEmpty()) {
			return "";
		}
		
		if(str.startsWith("cheese")) {
			
			return skip(str.substring(6));
		}else {
			return str.charAt(0)+ skip(str.substring(1));
		}
		
	}

}
