package reQuestao1;

public class Auditoria implements Observer {
    @Override
    

    public void atualizar(String nome, int estoque){
            System.out.println("Produto: " + nome + " alteração no estoque detectada, estoque atual: " + estoque);
        
    }
}
