//Nome
public class ContaCorrente {
    
    //atributos
    Pessoa pessoa;
    String agencia;
    String numero;
    double saldo;

    //construtor
    ContaCorrente(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

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

    public String toString() {
        String texto = "";
        texto = "Pessoa: " + pessoa.nome + " CPF: " + pessoa.cpf + " Agência: " + agencia + " Número: " + numero
                + " Saldo: R$" + saldo;
        return texto;
    }

}
