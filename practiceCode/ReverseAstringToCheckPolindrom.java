package practiceCode;

import java.util.*;

public class ReverseAstringToCheckPolindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			r += s.charAt(i);
		}

		/*
		 * char [] o=s.toCharArray(); char [] r=new char[o.length]; for(int
		 * i=o.length-1;i>=0;i--) { r[i]=o[i];
		 * 
		 * } for(int j=0;j<r.length;j++) { System.out.print(r[j]); }
		 */
		if (r.equals(s))
		// if(Array.equals(o,r))
		{
			System.out.println(r + " is polindrom");
		} else {
			System.out.println(r + " is not polindrom");
		}

	}

}
