
public class DmvSimulator {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the DMV.");
		
		int number = (int) (Math.random() * 100) + 100;
		
		System.out.println("Your number is " + number + ", please wait until your number is called.");
		
		System.out.println("You don't have the required paperwork.");
		
		for(int i = number + 1; i <= 100; i++)
		{
			
			System.out.println(i);
		}
		
		for(int i = number + 1; i <= 200; i++)
		{
			System.out.println(i);
		}
		
		for(int i = 1; i < number; i++)
		{
			
			System.out.println(i);
		}
		

		if((int)Math.random()*100 <= 98)
		{
		System.out.println("You don't have the required paperwork. Have an awful day! MUAHAHAHAHA");

		
		System.out.println("Exitting the program...");
		}
		
		else {
			
			System.out.println("You have all of the paperwork.");
		}
	}
}

