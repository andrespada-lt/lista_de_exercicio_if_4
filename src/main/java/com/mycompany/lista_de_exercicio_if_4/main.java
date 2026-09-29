package com.mycompany.lista_de_exercicio_if_4;
import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {
        int Numero;
        Numero = Integer.parseInt(JOptionPane.showInputDialog("insira um numero: "));
        if ((Numero %2) == 0){
            JOptionPane.showMessageDialog(null,"é dividido por 2");
        }else{
            JOptionPane.showMessageDialog(null,"nao é divisivel");
        }
    }
}
