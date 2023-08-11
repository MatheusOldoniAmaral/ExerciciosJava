package br.com.ED.ado2;


public class Fila<T> extends EstruturaEstatica {

   public Fila() {
      super();
   }

   public Fila(int capacidade) {
      super(capacidade);
   }

   public void enfileira(T elemento) {
      this.adiciona(elemento);
   }

   public T desenfileira() {
      if (this.estaVazia()) {
         return null;
      }

      final int POS = 0;

      T elementoASerRemovido = (T) this.elementos[POS];
      this.remove(POS);
      return elementoASerRemovido;
   }

   public T espiar() {
      if (this.estaVazia()) {
         return null;
      }
      return (T) this.elementos[0];
   } 
}

