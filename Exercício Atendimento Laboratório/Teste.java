package br.com.ED.ado2;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {

        Fila<Paciente> padrao = new Fila<Paciente>();
        Fila<Paciente> prioridade = new Fila<Paciente>();

        final int contPrioridade = 3;

        int resp = 0;

        JOptionPane.showMessageDialog(null, "BEM-VINDO AO LABORATÓRIO DE COLETA DE SANGUE" +
                "\n\nCadastre-se para ser atendido!" );

        do {
            Paciente paciente = new Paciente();
            paciente.setNome(JOptionPane.showInputDialog("Digite seu nome"));

            paciente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade")));

            paciente.setPCD(resp);

            if (paciente.getIdade() >= 60 || paciente.getPCD() == true) {
                prioridade.adiciona(paciente);
            } else {
                padrao.adiciona(paciente);
            }

            resp = JOptionPane.showConfirmDialog(null, "Cadastrar outra pessoa?");

        } while (resp == 0);

        while (!padrao.estaVazia() || !prioridade.estaVazia()) {

            int cont = 0;

            while (!prioridade.estaVazia() && cont < contPrioridade) {
                atendimento(prioridade);
                cont++;
            }

            if (!padrao.estaVazia()) {
                atendimento(padrao);
            }
        }
    } 

    public static void atendimento(Fila<Paciente> fila) {
        Paciente atendido = (Paciente) fila.desenfileira();
        
        System.out.println(atendido.toString() + " foi atendido(a)!");
    }
}

