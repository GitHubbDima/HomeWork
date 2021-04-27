public class Variabila{
	public static void main(String[] args){
		
		int a = 5;
		1.1 a = a++ + --a + ++ a + a-- + --a;
			a = 6   +   5 +    6 + 5   +   4;
		
		1.2 a = ++ a + 2 - --a - 3 + a ++ + 4;
			a =    6 + 2 -   5 - 3 + 6 ++ + 4;
		
		1.3 a = ++ a + ++ a + ++ a + a-- -6;
			a =    6 +    7 +    8 + 7   -6;
			
		1.4 a = a ++ + a + a-- + a-- + - a + a++ - --a + a ++ - a-- + a - --a + a ++ + ++a;
			a = 6    + 6 + 5   + 4   + - 4 + 5   -   4 + 5    - 4   + 4 -   3 + 4    +   5;		
	}
}