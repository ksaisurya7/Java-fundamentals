import java.util.Scanner;

public class Pattern1 {
 
	private static Scanner sc;

	public static void main(String args[])
	{
		int i,j;
		sc = new Scanner(System.in);
		int n1=sc.nextInt();
		for(i=1;i<=n1;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println("\n");
		}
	}
}
