import java.util.Scanner;
// public static void main()
// {
// 	System.out.println("Hello\n");
// }

// A program to display a pattern
public class PatternTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		
		String s=sc.next();
		int len = s.length();
		for(int x=0;x<len;x++)
		{
		    for(int k=0;k<=x;k++) {
		    System.out.print(s.charAt(len-k-1));   
		    }
		System.out.println();
		}
	}
}
