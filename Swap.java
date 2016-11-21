class Swap


{


	public static void main (String[] args)	

	{

		 int a =1;
		
		 int b =2;

		System.out.println("Value of a before swapping is :" + a);
		
		System.out.println("value of b before swapping is :" + b);


		a = a+b; // a now holds sum total of a and b

		b = a-b; // b now holds the original value a which is 1

		a = a-b; // a now hold the original value of b which is 2


		System.out.println("value of a after swapping is:" + a);	

		System.out.println("value of b after swapping is:" + b);			



	}



}