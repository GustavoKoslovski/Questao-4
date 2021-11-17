package Model;
public class Cliente {

    private Long idCliente;
    private String nome;
    private String numero;

    public Cliente(Long idCliente, String nome, String numero) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.numero = numero;
    }


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }


    public Cliente(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Cliente(){
    }

    public void menuCliente() {
    }
}
