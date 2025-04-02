import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto1 = new Produto(001);
        Produto produto2 = new Produto(002,"Jogo 2");
        Produto produto3 = new Produto(003, "jogo 3", 10);
        Produto produto4 = new Produto(004, "jogo 4", 10,"jogo", 100.000);

        System.out.println("Digite quanto deseja vender do jogo 1: ");
        int produto_vender = sc.nextInt();
        produto1.vender(produto_vender);

        System.out.println("Digite quanto deseja comprar do jogo 2: ");
        int produto_comprar = sc.nextInt();
        produto2.comprar(produto_comprar);

        produto1.inserir("Jogo 1", 20, "jogo", 20.000);

        if (produto1.igual(produto2)) {
            System.out.println("Os produtos p1 e p2 são iguais.");
        } else {
            System.out.println("Os produtos p1 e p2 são diferentes.");
        }

        System.out.println("Lista de todos os produtos:");
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);

        sc.close();
    }


}
