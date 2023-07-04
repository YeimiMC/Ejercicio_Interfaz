package main;

public class Main {
	
	public static void main (String[] arguments) {
		try {
			System.out.println("provocamos error");
			throw new MiExcepcion();
			
		} catch (MiExcepcion e) {
			// TODO: handle exception
			System.out.println(e.exceptionError());
		}
	}

}
