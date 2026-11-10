package reQuestao1;

public class Main {
public static void main(String[] args) {
    
    Produto samsungs26U = new Produto("Samsung s26 ultra", 10);

    Observer vendas = new Vendas();
    Observer compras = new Compras();
    Observer auditoria = new Auditoria();

    samsungs26U.inscrever(compras);
    samsungs26U.inscrever(vendas);
    samsungs26U.inscrever(auditoria);

    samsungs26U.atualizarEstoque(4);
    samsungs26U.atualizarEstoque(0);
    samsungs26U.desinscrever(auditoria);
    samsungs26U.atualizarEstoque(10);
    samsungs26U.atualizarEstoque(3);
    samsungs26U.atualizarEstoque(2);
    samsungs26U.inscrever(auditoria);
    samsungs26U.atualizarEstoque(1);
    samsungs26U.atualizarEstoque(1);
    samsungs26U.atualizarEstoque(1);

}
}
