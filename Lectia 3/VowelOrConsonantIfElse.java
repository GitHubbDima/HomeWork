public class VowelOrConsonantIfElse{
	public static void main(String[] args){
		char letter = 'A';
		
		if(letter == 97 | letter == 65 | letter == 69 | letter == 73 | letter == 79 | letter == 85){
			System.out.println("vocala");
		}	
		else{ System.out.println("consoana"); }
	}
}