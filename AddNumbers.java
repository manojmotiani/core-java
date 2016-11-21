

  class AddNumbers

	{

	

	public static void main(String[] args)

	{
		System.out.print ("Enter the value of x:");

		int x = Integer.parseInt(System.console().readLine());

	
		System.out.print("Enter the value of y:");

		int y = Integer.parseInt(System.console().readLine());

	
		int z = Integer.sum(x,y);


		System.out.println("Sum of " + x + " and "  + y + " is: " + z);

	}



}