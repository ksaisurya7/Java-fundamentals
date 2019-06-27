import java.util.Scanner;

public class Evenodd {


	private static Scanner sc;

	public static void main(String[] args) {

sc = new Scanner(System.in);		
int input_number=sc.nextInt();
if(input_number%2==0)   //even condition
{
	System.out.println("even");
}
if(input_number%2!=0)   //odd condition
{
	System.out.println("odd");
}

	}



}
