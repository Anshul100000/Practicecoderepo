package practice;

public class Factorialnum {
	public static void main(String args[]) {
		
		int i;
		int Factorial=1;
		int Num = 4;
		
		for(i=1;i<=Num;i++) {
			Factorial=Factorial*i;
			
		}
		System.out.println("Factorial num is "+Factorial);
	}

}
