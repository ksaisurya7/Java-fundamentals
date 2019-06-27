import java.util.Scanner;

public class Gender {



	private static Scanner sc;

	public static void main(String[] args) {
		
		
		sc = new Scanner(System.in);
		String G=sc.next();
int age=sc.nextInt();

if(G.equals("Female") && age>=1 && age<=58)
{
	System.out.println("percentage of interest is 8.2%.");
}else if(G.equals("Female") && age>=59 && age<=100)
{
	System.out.println("percentage of interest is 9.2%.");
}else if(G.equals("Male")&& age>=1 && age<=58)
{
	System.out.println("percentage of interest is 8.4%.");
}else if(G.equals("Male")&& age>=59 && age<=100)
{
	System.out.println("percentage of interest is 10.5%.");
}

	}

}


