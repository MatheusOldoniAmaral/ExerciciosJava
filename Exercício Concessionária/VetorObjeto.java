package br.com.ED.ado01;

public class VetorObjeto {
	private Object[] elementos;
	private int tamanho;

	public VetorObjeto (int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	public void adiciona(Object elemento) throws Exception {
		this.aumentaCapadidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception(" O vetor já esta cheio, não é possivel adicionar novos elementos!");
		}
	}

	private void aumentaCapadidade() {
		if(this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String [this.elementos.length * 2];
			for(int i =0; i<this.elementos.length; i++) {
				elementosNovos[i] = (String) this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public void remove(int posicao) throws Exception{
		if(posicao >= 0 && posicao < tamanho ) {
			for(int i = posicao; i <this.tamanho -1; i++) {
				this.elementos[i] = this.elementos[i+1];
			}
			this.tamanho--;
		} else {
			throw new Exception("Posicao invalida");
		}
	}

	public String busca(int posicao) throws Exception{
		if(posicao >= 0 && posicao < tamanho) {
			return (String) elementos[posicao];
		} else {
			throw new Exception ("Posição Invalida!");
		}
	}

	public int busca1 (String elemento) {
		for(int i=0; i<tamanho; i++) {
			if(elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i =0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if(this.tamanho> 0) {
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");

		return s.toString();
	}

	public boolean adicionaInicio(int posicao, String elemento) throws Exception {
		this.aumentaCapadidade();
		if(posicao >=0 && posicao < tamanho) {
			for(int i=this.tamanho-1; i>posicao; i--) {
				this.elementos[i+1] = this.elementos[i];
			}
			this.elementos[posicao] = elemento;
			this.tamanho++;

		} else {
			throw new Exception("Posição Invalida!");
		}
		return true;
	}
}


