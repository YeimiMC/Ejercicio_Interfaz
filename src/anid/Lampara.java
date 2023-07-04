package anid;

public class Lampara { 
	//qué cosas pueden tener dentro una lámpara
	
	boolean encendido;
	
	public Lampara() {
		encendido = true;
	}
	
	//Creamos un método
	public void cambiarFoco() {
		
	}
	
	public class Foco{ //Creamos una clase que está anidada (pero aún no es miembro)
		//Creamos un constructor al que le vamos a pasar un dato de tipo entero 
		public Foco (int dato) {
			
		}
		
	}

}
