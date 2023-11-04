public class withinrangeprintnumberswithoutloop { 
	static int a=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		r();

	} 
	static void r()
	{ 
		int b=10;
		if(a<=10)
		{
			System.out.print(a+" ");
			a++;
			r();
		}
		
	}

}

OUTPUT:
1 2 3 4 5 6 7 8 9 10