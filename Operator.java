class Operator {



	public static void main(String[] args)

	{
	
		int a=20;
		
		int b=10;

		System.out.println("intial value of a is:" + a);
		
		System.out.println("intial value of b is:" + b);


		b=a-- - --a;
		
		System.out.println("Value of b is:" + b);

		System.out.println("changed value of a is:" + a);

		int c= a--;

		System.out.println("Value of c is:" + c);

		System.out.println("changed value of a is:" + a);

	
		int d = a>>2;

		System.out.println("Value of d is:" + d);

		System.out.println("changed value of a is:" + a);

		int e= a&b;

		System.out.println("Value of e is:" + e);

		System.out.println("Value of a is:" + a);


	}





}