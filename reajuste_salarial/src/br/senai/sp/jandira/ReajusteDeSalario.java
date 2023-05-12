package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class ReajusteDeSalario {
	
	
    public static void main(String[] args) {
    	
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário:");
        double salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário atual do funcionário:"));

        
        
        double percentualReajuste;
        if (salarioAtual < 1500) {
            percentualReajuste = 15;
        } else if (salarioAtual <= 3000) {
            percentualReajuste = 10;
        } else {
            percentualReajuste = 5;
        }

        
        
        double valorReajuste = salarioAtual * (percentualReajuste / 100);
        double novoSalario = salarioAtual + valorReajuste;

        
        
        JOptionPane.showMessageDialog(null, "Funcionário: " + nome
                + "\nPercentual de reajuste: " + percentualReajuste + "%"
                + "\nNovo salário com reajuste: R$" + String.format("%.2f", novoSalario));
    }
}
