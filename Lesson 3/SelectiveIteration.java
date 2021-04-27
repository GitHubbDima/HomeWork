public class SelectiveIteration{
	
	public static void main(String[] args){
		
		int num = 1500; //numar intre 1000 si 2000
		int iterator = -1;
		
		while(iterator < num){
			
			iterator++;		
			if(iterator%3 == 0 || (iterator + 5)%7 == 0 || iterator%10 == 0){
				continue;
			}
			else{
				System.out.println(iterator);
			}
		}	
	}
}