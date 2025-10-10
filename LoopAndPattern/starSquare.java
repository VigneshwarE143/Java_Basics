package LoopAndPattern;

public class starSquare {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		//decreasing space triangle
		for(int j=i;j<=n;j++) {
			System.out.print("  ");
		}
		//increasing * triangle
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		//increasing * triangle
		for(int j=2;j<=i;j++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
}
}
