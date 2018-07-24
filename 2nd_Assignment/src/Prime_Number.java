// Ques. Check if a number N is prime or not.


public class Prime_Number {
	public static  void  main(String [] args) {
		int i,num=47,f=0;
		for(i=2;i<num;i++)
		{
			if(num%i==0) {
				f=1;
				System.out.print(i);
			}
		}
		if(f==1)
			System.out.print("The number is not prime.");
		else
			System.out.print("The number is prime.");
	}
}	


