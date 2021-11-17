package DAO;
import Model.Mensagem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MensagemDAO {

    public void salvarRegistro(Mensagem mensagem){

        File log = new File("log.txt");

        if(!log.isFile()){

            try {
                log.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {
            FileWriter fileWriter = new FileWriter(log,true);
            PrintWriter printWriter  = new PrintWriter(fileWriter);

            printWriter.println("Nova mensagem cadastrada: " + mensagem);

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
