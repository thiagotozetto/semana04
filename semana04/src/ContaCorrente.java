//Nome
public class ContaCorrente {
    
    //atributos
    String agencia;
    String numero;
    String cpf;
    double saldo;

    //métodos
    
    //sacar
    boolean sacar(double qtde){
        saldo = saldo - qtde;
        return true;
    }

    //depositar
    void depositar(double qtde){
        saldo = saldo + qtde;
    }

    //transferir
    boolean transferir(ContaCorrente destino, double qtde){
        sacar(qtde);
        destino.depositar(qtde);
        return true;
    }
    
    //versaldo
    double verSaldo(){
        return saldo;
    }

    public String toString(){
        String texto="";
        texto = "Agencia: "+agencia+" Numero:"+numero+" Cpf:"+cpf+" Saldo R$:"+saldo;
        return texto;
    }

}
