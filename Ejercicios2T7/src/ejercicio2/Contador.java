package ejercicio2;

public class Contador {
	
	int cont;

	public Contador() {}

	public Contador(int cont) {
		this.cont = cont;
	}
	
	
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public void incrementar() {
		cont++;
	}
	
	public void decrementar() {
		if(cont-1<0) {
			cont=0;
		}else {
			cont--;
		}
	}
}
