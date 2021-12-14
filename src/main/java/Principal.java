
import com.mycompany.produto.Produto;
import com.mycompany.produto.ProdutoBuilder;
import com.mycompany.produto.Vendedor;
import java.time.LocalDate;



public class Principal {
    public static void main(String[] args) {
        Produto builder = new ProdutoBuilder()
                .setTitulo("Fogão")
                .setDescricao("Fogão 6 Bocas")
                .setPreco(569.99)
                .setDataCadastro(LocalDate.now())
                .setDataUltimaAtualizacao(LocalDate.now())
                .setCategoria("Cozinha")
                .setVendedor(new Vendedor(1,"João Vendas"))
                .createProduto();
        builder.setMarca("Arno");
        builder.setModelo("Arno 6 bocas");
        System.out.println(builder.toString());
    }
   
}