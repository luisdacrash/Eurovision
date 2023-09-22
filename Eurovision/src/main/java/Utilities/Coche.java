package Utilities;

public class Coche {
	String matricula;
	String marca;
	
	protected Coche(String matricula, String marca) 
	{
		this.matricula = matricula;
		this.marca = marca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [");
		builder.append(" Marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
