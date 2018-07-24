// Ques. Check if a number N is palindrome or not.

public class Palindrome {
	public static void main(String [] args) {
		
		int N=545,num1,num2,num3,sum;
		
		num1=(N/100)*100;
		num2=(N%100/10)*10;
		num3=(N/100)*1;
		
		sum=num1+num2+num3;
		
		if(sum==N)
		{
			System.out.print("The Number is Palindrome");
		}
		else
		{
			System.out.print("The number is not palindrome");
		}		
	}
}
