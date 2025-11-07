package estudo_java.modificadordeacaesso.domain;

public class Pessoa_P {

    private String nome;
    private int idade;



    public void imprime(){
      setNome("dantas");
        setIdade(19);
        System.out.println("nome:  " +getNome());
        System.out.println("idade:  " + getIdade());


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
