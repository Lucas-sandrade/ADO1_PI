import entities.Leao;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Leao leaoFilhote = new Leao();
        leaoFilhote.setNome("Simba");

        Leao leaoPai = new Leao();
        leaoPai.setNome("Scar");
        leaoPai.setRaca("Asiático");
        leaoPai.setCor("Branco");
        leaoPai.setIdade(12);
        leaoPai.correr();

        JOptionPane.showMessageDialog(null, "\nNome do Primeiro Leão: " + leaoFilhote.getNome() +
                "\nNome do Segungo Leão: " + leaoPai.getNome() + "\nRaça: " + leaoPai.getRaca() +
                "\nCor: " + leaoPai.getCor());

    }
}