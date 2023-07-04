package pavanzada;

public abstract class ClaseAbstracta {
	
	int numero;
	
	public ClaseAbstracta() {
		
	}
	
	public void metodo() {
		
	}
	
	public abstract void correr(); //Para que el método se pueda colocar (sin implementar) debe colocarse abstract porque es una clase abstracta.
	//La clase abstracta debe tener al menos un método sin implementar
	//Son clases que no se pueden instanciar, o sea de esta clase no se puede crear un objeto. 
	//Son clases hijos - La clase abstracta no se puede instanciar (crear objetos)
}
