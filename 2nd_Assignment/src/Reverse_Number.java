// Ques. Find the reverse of a number.


public class Reverse_Number {
	public static void main(String [] args) {
		int a= 2584,n,p,N,P,sum;
		
		n=(a%1000%100%10)*1000;
		p=(a%1000%100/10)*100;
		N=(a%1000/100)*10;
		P=(a/1000)*1;
		
		sum=n+p+N+P;
	
		    System.out.print("Reverse number of given number is " + sum);
		}	
	}
