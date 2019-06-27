import java.util.Scanner;

public class Prime {



	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int count=0;
		
int input_value=sc.nextInt();
for(int divisor=2;divisor<=input_value/2;divisor=divisor+1)
{
	if(input_value%divisor==0)   //Prime number condition 
	{
	  count=count+1;
	}
}
if(count>0)
{
	System.out.println("input value is not a prime number");
}else {
	System.out.println("input value is prime number");
		
}
	}



}
