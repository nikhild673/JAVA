//Ques. Check if the number is leap year or not.

public class Leap_Year {
	public static void main(String args []) {
		int year= 2018;
		
		if(year%4==0)
		{
			
		if(year%100==0)
		{
			
		if(year%400==0)
		
			System.out.println("The year is leap year");
		else
		
			System.out.println("The year is not a leap year");
		}
		else
		
			System.out.print("The year is leap year");
		}
		else
		
			System.out.print("The year is not a leap year");
		
		}
		
	}

