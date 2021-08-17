public class App {
    public static void main(String[] args) throws Exception {
        
        //criando uma nova variavel do tipo ContaCorrente
        ContaCorrente conta, conta2;

        //instanciar
        conta = new ContaCorrente();
        conta2 = new ContaCorrente();

        System.out.println(conta);

        //inicializando a instancia
        conta.agencia = "0101-1";
        conta.numero = "897610-1";
        conta.cpf = "087.564.123-00";
        conta.saldo = 1000.0;

        //inicializando a instancia
        conta2.agencia = "2101-2";
        conta2.numero = "2897610-2";
        conta2.cpf = "287.564.123-02";
        conta2.saldo = 100.0;
        
        System.out.println(conta);
        System.out.println(conta2);

        conta.sacar(50.0);
        conta.depositar(500);
        
        conta.transferir(conta2, 600.0);

        System.out.println(conta.toString());
        System.out.println(conta2.toString());



    
    }
}
