package TrabalhoRefatoracao;

public class Jogador {
    
    private String nome;
    private String sobrenome;
    private Integer idade;
    private Time time;

    public Jogador() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer integer) {
        this.idade = integer;
    }

    public Time getTime() {
        return time;
    }
}

