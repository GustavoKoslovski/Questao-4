package Model;

public class Mensagem {
    private Long idMensagem;
    private String mensagem;

    public Mensagem(Long idMensagem, String mensagem) {
        this.idMensagem = idMensagem;
        this.mensagem = mensagem;
    }

    public Long getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(Long idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "idMensagem=" + idMensagem +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }

    public Mensagem() {
    }
}
