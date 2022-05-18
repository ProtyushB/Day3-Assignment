
public class VOWEL_AND_CONSONANT {
	public static void main(String[] args) {
		
		//check('a');
		
		VOWEL_AND_CONSONANT vc = new VOWEL_AND_CONSONANT();
		
		vc.check(Character.toLowerCase('A'));
	}
	
	void check(char data) {
		
		switch(data){
		
			case 'a': System.out.println("Charecter is Vowel");
				 	  break;
			case 'b': System.out.println("Charecter is Consonent");
		 	  break;
			case 'c': System.out.println("Charecter is Consonent");
		 	  break;
			case 'd': System.out.println("Charecter is Consonent");
		 	  break;
			case 'e': System.out.println("Charecter is Vowel");
		 	  break;
			case 'f': System.out.println("Charecter is Consonent");
		 	  break;
			case 'g': System.out.println("Charecter is Consonent");
						break;
			case 'h': System.out.println("Charecter is Consonent");
		 	  break;
			case 'i': System.out.println("Charecter is Vowel");
		 	  break;
			case 'j': System.out.println("Charecter is Consonent");
		 	  break;
			case 'k': System.out.println("Charecter is Consonent");
		 	  break;
			case 'l': System.out.println("Charecter is Consonent");
		 	  break;
			case 'm': System.out.println("Charecter is Consonent");
		 	  break;
			case 'n': System.out.println("Charecter is Consonent");
		 	  break;
			case 'o': System.out.println("Charecter is Vowel");
		 	  break;
			case 'p': System.out.println("Charecter is Consonent");
		 	  break;
			case 'q': System.out.println("Charecter is Consonent");
		 	  break;
			case 'r': System.out.println("Charecter is Consonent");
		 	  break;
			case 's': System.out.println("Charecter is Consonent");
		 	  break;
			case 't': System.out.println("Charecter is Consonent");
		 	  break;
			case 'u': System.out.println("Charecter is Vowel");
		 	  break;
			case 'v': System.out.println("Charecter is Consonent");
		 	  break;
			case 'w': System.out.println("Charecter is Consonent");
		 	  break;
			case 'x': System.out.println("Charecter is Consonent");
		 	  break;
			case 'y': System.out.println("Charecter is Consonent");
		 	  break;
			case 'z': System.out.println("Charecter is Consonent");
		 	  break;
		 	  default: System.out.println("Invalid Charecter");
		}
	}
}
