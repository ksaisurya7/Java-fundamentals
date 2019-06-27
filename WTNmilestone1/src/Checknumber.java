
public class Checknumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input_number=Integer.parseInt(args[0]);
    if(input_number>0)
    {
    	System.out.println("Positive");
    }
    if(input_number==0)
    {
    	System.out.println("Zero");
    }
    if(input_number<0)
    {
    	System.out.println("Negative");
    }
    
	}

}
