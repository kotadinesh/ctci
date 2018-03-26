import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class uniqueString{
	public static void main(String args[]){
		boolean val;
		String str = new String();
		Scanner sc=new Scanner(System.in);
		str = sc.nextLine();
		val = isUniqueString(str);
		System.out.println(val);
	}
	static boolean isUniqueString(String str){
		if(str.length()>128)
			return false;
		boolean[] b = new boolean[128];
		Arrays.fill(b,true);
		
			for(int i=0;i<str.length();i++){
				int val = str.charAt(i);
				if(b[val]!=false)
					b[val]=false;
				else
					return false;

			}
			return true;
		
	}
}