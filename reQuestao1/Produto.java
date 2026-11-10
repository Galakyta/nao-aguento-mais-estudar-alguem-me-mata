package reQuestao1;
import java.util.ArrayList;
import java.util.List;
public class Produto implements Subject {

    private String nome;
    private int estoque;

    public Produto(String nome, int estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    

    public int getEstoque() {
        return estoque;
    }

    private void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

 private final List<Observer> observers = new ArrayList<>();


 @Override 
 public void inscrever(Observer observer){
    observers.add(observer);
 }

 @Override
 public void desinscrever(Observer observer){
    observers.remove(observer);
 }

 @Override
 public void pingarObservers(){
    for(Observer observer : observers){
        observer.atualizar(nome, estoque);
    }
 }

 public void atualizarEstoque(int novoEstoque){
    if(novoEstoque == estoque){
        return;
    }
  setEstoque(novoEstoque);
  pingarObservers();  
 }

}
