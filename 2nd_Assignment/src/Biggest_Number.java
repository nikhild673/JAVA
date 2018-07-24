// Given Three numbers a, n and p. Write a java program to find the biggest number out of the three numbers.


public class Biggest_Number {
	public static void main(String agrs[]) {
		int n=52, a=100, p=48;
		
		if(n>p&&n>a)
		{
			System.out.print(n + " is the bigger number.");
		}
		else if(p>n&&p>a)
		{
			System.out.print(p + " is the bigger number.");
		}
		else if(a>p&&a>n)
		{
			System.out.print(a + " is the bigger number.");
			
		}
		else 
			System.out.print("All Numbers are equal.");
		
	}
}
