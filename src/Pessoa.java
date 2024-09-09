public class Pessoa {

    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) throws CpfInvalidException  {
        if (cpf.length() != 14){
            throw new CpfInvalidException("Cpf nao está completo");
        }
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
