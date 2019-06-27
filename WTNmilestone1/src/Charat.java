
public class Charat {

	public static void main(String[] args) {
		
		char input1_character=args[0].charAt(0);
		char input2_character=args[1].charAt(0);
		if(input1_character<input2_character)
		{
			System.out.println(input1_character+","+input2_character);
				
		}
if(input1_character>input2_character)
{
	System.out.println(input2_character+","+input1_character);
	
}

	}

}
