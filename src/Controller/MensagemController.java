package Controller;
import DAO.ClienteDAO;
import DAO.MensagemDAO;
import Model.Cliente;
import Model.Mensagem;

import java.util.ArrayList;
import java.util.List;

public class MensagemController {

    List<Mensagem> mensagens = new ArrayList<>();
    MensagemDAO mensagemDao = new MensagemDAO();

    public void cadastrarMensagem(Mensagem mensagem) {

        mensagens.add(mensagem);
        mensagemDao.salvarRegistro(mensagem);

    }
}
