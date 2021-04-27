public class UsingTernaryOperator{
	
	public static void main(String[] args){
		
		double num = 15784.65968743;
		
		String message = ( num <=0 || num >=1000000 ) ? ( message = num <= 0 ? "Small" : "Large") : "";		
		System.out.println(message);
		
	}
}