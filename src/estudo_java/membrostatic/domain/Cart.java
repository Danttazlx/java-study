package estudo_java.membrostatic.domain;

public class Cart {

    public static final String VELOCIDE_MIN = "40km"  ;
    private String nome;
    private String marca;
    private String velocidadeMax;

    public Cart(String nome, String marca,String velocidadeMax){
        this.velocidadeMax = velocidadeMax;
        this.nome = nome;
        this.marca = marca;

    }


    public  void imprime() {
        System.out.println("nome: " + nome);
        System.out.println("marca: " +marca);
        System.out.println("velocidadeMax: " + velocidadeMax);


    }




    public String getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setVelocidadeMax(String velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }




    }

