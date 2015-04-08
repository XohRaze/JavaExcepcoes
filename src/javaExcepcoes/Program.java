package javaExcepcoes;

public class Program {

	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		double resultado = 0;
		
		try
		{
			
			resultado = x/y;
			System.out.println("resultado try: " + resultado);
			
		} catch (Exception e)
		{
			
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.toString());
			System.out.println(e.getSuppressed());
			System.out.println(e.getStackTrace());
			
		}

		//System.out.println("resultado após try-catch: " + resultado);

	}

}
