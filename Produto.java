public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    Produto(int codigo){
        this.codigo = codigo;
    }

    Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    Produto(int codigo, String nome, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    Produto(int codigo, String nome, int quantidade, String tipo, double valor){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void vender(int q_vender){
        if(q_vender >= quantidade){
            quantidade -= q_vender;
        }else{
            System.out.println("Estoque insuficiente");
        }
    }

    public void comprar_ajuste(int q_comprar, int valor_ajuste){
        this.quantidade += q_comprar;
        this.valor = valor_ajuste;
    }

    public void comprar(int q_comprar){
        this.quantidade += q_comprar;
    }

    public String toString(){
        return ("Cogido:" + codigo + "\nNome: " + nome + "\nQuantidade: " + quantidade + "\nTipo: " + tipo + "\nValor: " + valor);
    }

    public void inserir(String nome, int quantidade, String tipo, double valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean igual(Produto outro){
        return this.nome.equals(outro.nome) && this.tipo.equals(outro.tipo);
    }

}
