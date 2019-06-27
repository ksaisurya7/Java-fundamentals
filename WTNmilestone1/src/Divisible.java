public class Divisible
{
	public static void main(String args[])
	{
		int j,k=0,i;
		int arr[]=new int[5];
        for(j=1;j<=1000;j++)
       {  
	if(j%2==0 && j%3==0 && j%5==0)
	{
		arr[k]=j;
		k++;
		if(k==5){
			break;
				}
	}
		
		}			
	for(i=0;i<5;i++)
	{

	System.out.println(arr[i]);
	}
	}
}