package string_progs;

import java.util.Scanner;

public class Reverse_String {

	public static String rev_string(String str){
		System.out.println("The reverse of the given string is: ");
		String rev = "";
		int len = str.length();
		for(int i=len-1; i>=0; i--){
			char ch = str.charAt(i);
			rev = rev+ch;
			
		}
		
		
		
		return rev;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		System.out.println("The reverse of the given string is: "+ rev_string(str));
	}

}
