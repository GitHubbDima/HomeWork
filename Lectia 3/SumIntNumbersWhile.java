public class SumIntNumbersWhile{
	
	public static void main(String[] args){
		float[] numbers = { 20.3f, 12f, 2f, 98.76f, 10f, 1.1f, 2.2f, 3.3f, 4.4f, 5f };
		int n = 3;
		int sum = 0;
		int contor = 0;
		
		while(n > 0){
			
			if(numbers[contor] == (int)numbers[contor]){				
				sum += numbers[contor];				
				n--;
			}
			
			if(contor < 10){
				contor++;
			}
			else{
				break;
			}
		}
		System.out.println("suma: " + sum);
	}
}