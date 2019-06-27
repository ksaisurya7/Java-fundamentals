
public class Checkcharacter {



	public static void main(String[] args) {
		
         
		char input_character=args[0].charAt(0);
		if((input_character>='a'&& input_character<='z' )|| (input_character>='A' && input_character<='Z') )
		{
			System.out.println("Given input character is Alphabhet");
		}else if(input_character>=48&&input_character<=57)
		{
			System.out.println("Given input character is Digit");
		}else
		{
			System.out.println("Given input charcter is Special Character");
		}
		
		
	}

}


