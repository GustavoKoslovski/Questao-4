package View;
import Controller.ClienteController;
import Controller.MensagemController;
import Model.Cliente;
import java.util.Scanner;
public class ClienteView {

    Scanner entrada = new Scanner(System.in);
    ClienteController clienteController = new ClienteController();
    MensagemView mensagemView = new MensagemView();


    public void listarClientes(){
        clienteController.listarClientes();
    }

    public void cadastrarCliente(){

        Cliente cliente = new Cliente();

        System.out.print("Digite o ID do cliente:");
        cliente.setIdCliente(entrada.nextLong());

        entrada.nextLine();

        System.out.print("Digite o nome do cliente:");
        cliente.setNome(entrada.next());

        entrada.nextLine();

        System.out.print("Numero de celular:");
        cliente.setNumero(entrada.next());

        System.out.println("Cliente cadastrado!\n" + cliente);

        clienteController.cadastrarCliente(cliente);
    }

    public void menuCliente(){

        System.out.println("1 - Listar cliente\n 2 - Cadastrar cliente\n 3 - Cadastrar mensagem");

        switch (entrada.nextInt()){

            case 1:
            this.listarClientes();
            this.menuCliente();
                break;

            case 2:

            this.cadastrarCliente();
            this.menuCliente();

                break;

            case 3:
            mensagemView.cadastrarMensagem();
            this.menuCliente();
                break;

        }
    }
}
