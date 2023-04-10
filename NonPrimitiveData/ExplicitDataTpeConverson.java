package NonPrimitiveData;

public class ExplicitDataTpeConverson {
    public static void main(String[] args)
	{
		double a = 50.50;
		System.out.println("Double representation " +a);
		
		float f = (float)a; //type casting
		System.out.println("FLoat representation "+f);
		
		long b = (long)a; //long doesn't recognize decimal valuables
		System.out.println("Long representation" +b);
		
		int c = (int)b;
		System.out.println("Int representation "+c);
	}
}
