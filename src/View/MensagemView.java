package View;

import Model.Mensagem;

import java.util.Scanner;

public class MensagemView {

    Scanner entrada = new Scanner(System.in);
    public void cadastrarMensagem(){

        Mensagem mensagem = new Mensagem();

        System.out.print("Digite o ID do cliente:");
        mensagem.setIdMensagem(entrada.nextLong());

        entrada.nextLine();

        System.out.print("Digite a mensagem:");

        mensagem.setMensagem(entrada.next());

        entrada.nextLine();

        System.out.println("Mensagem enviada! \n");

    }


}
