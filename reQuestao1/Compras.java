package reQuestao1;

public class Compras implements Observer {
    @Override
    

    public void atualizar(String nome, int estoque){
        if(estoque < 5 && estoque != 0){
            System.out.println("Produto: " + nome + " com estoque baixo: " + estoque);
        }
        
    }
}
