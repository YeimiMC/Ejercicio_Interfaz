package anid;

public class ClaseMain { 
	
	//Dos atributos normales
	int numero;
	String otrodato;
	
	Anidada claseanidada; //una clase adentro de otra clase. Es una clase anidada miembro
	
	public ClaseMain(int numero, String nombre, String otrodato) {
		
		claseanidada = new Anidada(); //Objeto de la clase anidada que está definida adentro
		
		}
	
	class Anidada{
		//Dos atributos normales
		String datoClaseAnidada;
		String dato2ClaseAnidada;
		
		public void Anidada() { //tiene su constructor como cualquier clase. Sólo que es una clase anidada pero también como miembro.
			
		}
	}

}
