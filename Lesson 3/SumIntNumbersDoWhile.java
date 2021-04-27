public class SumIntNumbersDoWhile{
	
	public static void main(String[] args){
		float[] numbers = { 20.3f, 12f, 2f, 98.76f, 10f, 1.1f, 2.2f, 3.3f, 4.4f, 5f };
		int n = 5;
		int sum = 0;
		int contor = 0;
		
		do{			
			if(numbers[contor] == (int)numbers[contor]){				
				sum += numbers[contor];				
				n--;
			}
			
			if(contor < 9){
				contor++;
			}
			else{
				break;
			}
		} while(n > 0);
		System.out.println("suma: " + sum);
	}
}