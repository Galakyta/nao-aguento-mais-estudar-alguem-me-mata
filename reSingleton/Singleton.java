package reSingleton;

public class Singleton {

    private static Singleton gerador;

    private int contagem;

    private Singleton(){
        System.out.println("instancia criada");
    }

    public static synchronized Singleton getInstancia() {
        if(gerador == null){
           return gerador =  new Singleton();
        }
        return gerador;
    }

    public int getContagem() {
        return contagem;
    }


    public void tirarSenha(){
        contagem++;
        System.out.println("sua senha é: " + getContagem());
        
    }

    
    


}
