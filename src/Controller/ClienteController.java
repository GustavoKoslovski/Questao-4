package Controller;
import DAO.ClienteDAO;
import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    List<Cliente> clientes = new ArrayList<>();
    ClienteDAO clienteDao = new ClienteDAO();

    public void cadastrarCliente(Cliente cliente){

        clientes.add(cliente);
        clienteDao.salvarRegistro(cliente);

    }
    public void listarClientes(){
        System.out.println(clientes);
    }
}
