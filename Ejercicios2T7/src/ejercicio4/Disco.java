package ejercicio4;

public class Disco {
	
	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + "]";
	}
	
	String[] discos= new String[10];
	String codigo="LIBRE";
	String autor;
	String titulo;
	String genero;
	
	
	public Disco() {
	}
	
	public Disco(String codigo, String autor, String titulo, String genero) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
	}
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
