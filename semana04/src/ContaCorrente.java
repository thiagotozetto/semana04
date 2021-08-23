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
        if (qtde > saldo){
            return false;
        }
        saldo = saldo - qtde;
        return true;
    }

    //depositar
    void depositar(double qtde){
        saldo = saldo + qtde;
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
