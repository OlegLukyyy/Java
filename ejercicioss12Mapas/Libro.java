package ejercicioss12Mapas;

import java.util.Objects;

public class Libro {

	int isbn;
	private String titulo;
	private String autor;

	public Libro(int isbn, String titulo, String autor) {
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}

	public int getIsbn() {
		return isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Libro)) {
			return false;
		}
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}

}
