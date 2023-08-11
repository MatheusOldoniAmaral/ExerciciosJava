package br.com.ED.ado01;

public class Carro {
	
	public String marcaCar;
	public String nomeCar;
	public String corCar;
	public int anoCar;
	private boolean status;
	
	public Carro() {
		
	}
	
	public String getNomeCar() {
		return nomeCar;
	}

	public void setNomeCar(String nc) {
		this.nomeCar = nc;
	}
	
	public String getMarcaCar() {
		return marcaCar;
	}

	public void setMarcaCar(String marcaCar) {
		this.marcaCar = marcaCar;
	}

	public String getCorCar() {
		return corCar;
	}

	public void setCorCar(String corCar) {
		this.corCar = corCar;
	}


	public int getAnoCar() {
		return anoCar;
	}

	public void setAnoCar(int anoCar) {
		this.anoCar = anoCar;
	}
	
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
			this.status = status; 
	}
}
