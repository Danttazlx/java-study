package estudo_java.generics;

// declaracao da classm generica
public class Generic<T> {
    private T nome;

    public void guardar(T algo) {
        this.nome = algo;

    }

    public T getItem() {
        return nome;
    }


//     sintaxe metodo generico
//    public <T> void processa(T elemento){
//
//    }


}
