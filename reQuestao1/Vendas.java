package reQuestao1;

public class Vendas implements  Observer {
    private int ultimoValor = 1;
    @Override
    

    public void atualizar(String nome, int estoque){
        if(ultimoValor != 0){
            ultimoValor = estoque;
            return;
        }
        System.out.println("Produto: " + nome + " voltou ao estoque: " + estoque);
        ultimoValor = estoque;
    }
}
