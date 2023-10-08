import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException, ClassNotFoundException {



      ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("carrinho.bytej")
        );
        Carrinho carrinho = (Carrinho) objectInputStream.readObject();

        System.out.println(carrinho.getTotal());
        System.out.println(carrinho.getProduto());




    }
}